package com.gxa.controller.login;


import com.gxa.entity.login.User;
import com.gxa.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = {"登录"})
public class LoginController {

    @ResponseBody
    @PostMapping("/login")
    @ApiOperation(value = "登录接口",notes = "登录",httpMethod = "POST")
    public R login(@RequestBody User user){

        System.out.println(user);

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(),user.getPwd());

        try {
            subject.login(token);

        } catch (AuthenticationException e) {
            R.error();
            e.printStackTrace();
        }

        return R.ok("suc");
    }
}
