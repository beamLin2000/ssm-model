package com.gxa.controller;

import com.gxa.entity.User;
import com.gxa.service.UserService;
import io.swagger.annotations.*;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户接口")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("用户登录")
    @PostMapping("/user/login")
    public User  login(@ApiParam("111111111111") User user){
        val u = new User();
        u.setId(10);
        u.setUserName("zs");
        u.setPwd("123");
        u.setSalt("abc");

        return u;
    }
    @ApiOperation("用户登录2")
    @PostMapping("/user/login02")
    public User  login02(@ApiParam("111111111111") String username){
        val u = new User();
        u.setId(10);
        u.setUserName("zs");
        u.setPwd("123");
        u.setSalt("abc");

        return u;
    }

    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "Authorization", value = "令牌", paramType = "header", required = true),
            @ApiImplicitParam(name = "username", value = "当前登录用户的账号，由后台从令牌中解析取得", required = true),
            @ApiImplicitParam(name = "planId", value = "考试计划编号", paramType = "path", required = true),
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "返回考卷详细信息"),
            @ApiResponse(code = 306, message = "登录已超时，请重新登录"),
            @ApiResponse(code = 307, message = "令牌格式不正确"),
            @ApiResponse(code = 401, message = "没有权限"),
            @ApiResponse(code = 403, message = "无效请求，本系统只支持AJAX请求"),
            @ApiResponse(code = 500, message = "服务器内部错误")
    })
    @PostMapping("/user/login01/{planId}")
    public User  login01(String Authorization,String username,@PathVariable("planId") Integer planId){
        val u = new User();
        u.setId(10);
        u.setUserName("zs");
        u.setPwd("123");
        u.setSalt("abc");

        return u;
    }




}
