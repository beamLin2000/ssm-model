package com.gxa.controller.user;

import com.gxa.entity.login.User;
import com.gxa.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


public class UserController {
    @Controller
    @Api(tags = {"登录"})
    public class LoginController {

        @ResponseBody
        @PostMapping("/userData")
        @ApiOperation(value = "账户资料接口",notes = "账户资料",httpMethod = "POST")
        public R userData(@RequestBody User user){

            return R.ok("fail");
        }
    }
}
