package com.gxa.controller.user;

import com.gxa.dto.user.UserUpdateDto;
import com.gxa.entity.login.User;
import com.gxa.service.user.UserService;
import com.gxa.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = {"登录"})
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/userUpdatePwd")
    @ApiOperation(value = "更改密码接口",notes = "账户密码",httpMethod = "POST")
    public R userData(@RequestBody UserUpdateDto userUpdateDto){

        String userName = userUpdateDto.getUserName();
        String oldPwd = userUpdateDto.getOldPwd();
        String salt = this.userService.querySaltByUserName(userName);

        Object pwdObj = new SimpleHash("MD5",userUpdateDto.getOldPwd(),salt,1024);
        User user = this.userService.queryByUserName(userName);
        if (pwdObj.toString().equals(user.getPwd())){
            Object newPwdObj = new SimpleHash("MD5",userUpdateDto.getNewPwd(),salt,1024);
            String newPwd = newPwdObj.toString();
            if (newPwd.equals(user.getPwd())){
                return R.error(2,"新密码与旧密码相同");
            }
            this.userService.updatePwd(userName,newPwd);
            return R.ok("success");
        }
        //原密码错误
            return R.error(1,"旧密码输入错误");
        }

}
