package com.gxa.controller.login;

import com.alibaba.fastjson.JSON;
import com.gxa.dto.user.Data;
import com.gxa.dto.user.Menu;
import com.gxa.entity.login.User;
import com.gxa.service.impl.user.UserServiceImpl;
import com.gxa.utils.DBMenu;
import com.gxa.utils.JwtUtil;
import com.gxa.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Api(tags = {"登录"})
public class LoginController {

    @Autowired
    private UserServiceImpl userService;

    @ResponseBody
    @PostMapping("/login")
    @ApiOperation(value = "登录接口",notes = "登录",httpMethod = "POST")
    public R login(@RequestBody User user){
        String userName = user.getUserName();
        Map map = new HashMap();
        User user2 = this.userService.queryByUserName(userName);
        if (user2.getPwd().equals(user.getPwd())){
            map.put("user",user2);
            return R.ok(map);
        }
        try {
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(),user.getPwd());
            subject.login(token);
            String menu = this.userService.queryMenuByUserName(userName);
            List<Menu> menus = JSON.parseArray(menu,Menu.class);

            String jwtToken = JwtUtil.getJwtToken(userName,user.getPwd());
            map.put("menu",menus);
            User user1 = this.userService.queryByUserName(userName);
            map.put("user",user1);
            this.userService.updateTokenByUser(jwtToken,user);
            map.put("token",jwtToken);
            return R.ok(map);

        } catch (AuthenticationException e) {
            R.error();
            e.printStackTrace();
        }

        return R.ok("fail");
    }

}
