package com.gxa.controller.registration;

import com.gxa.entity.registration.Register;
import com.gxa.entity.registration.RegisterQueryCondition;
import com.gxa.service.register.RegisterService;
import com.gxa.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = {"挂号的接口"})
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @PostMapping("/register")
    @ApiOperation(value = "添加接口",notes = "挂号添加",httpMethod = "POST")
    public R add(@ApiParam(name = "register", value = "挂号添加信息")Register register){
        R r = new R();
        this.registerService.add(register);
        R.ok("success");
        return r;
    }
    @GetMapping("/register/byCondition")
    @ApiOperation(value = "查找接口",notes = "查找挂号记录",httpMethod = "GET")
    public R queryByCondition(@ApiParam(name = "registerQueryCondition",value = "挂号记录查询条件") RegisterQueryCondition registerQueryCondition){
        R r = new R();
        return r;
    }
}
