package com.gxa.controller.registration;

import com.gxa.entity.registration.Register;
import com.gxa.entity.registration.RegisterMsg;
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

import java.math.BigDecimal;
import java.util.*;

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
    @GetMapping("/register/query")
    @ApiOperation(value = "查找接口",notes = "查找挂号记录",httpMethod = "GET")
    public R queryByCondition(@ApiParam(name = "registerQueryCondition",value = "挂号记录查询条件") RegisterQueryCondition registerQueryCondition){
        Date date = new Date();
        long time = date.getTime();
        date.setTime(time);
        RegisterMsg registerMsg = new RegisterMsg("2022099280001","张三","男",12,"17754138769",
                "儿科","王冕",date,new BigDecimal(20.00),new BigDecimal(20.00),"已就诊");
        RegisterMsg registerMsg1 = new RegisterMsg("2022099280002","李四","男",20,"17754138769",
                "内科","王冕",date,new BigDecimal(20.00),new BigDecimal(20.00),"未就诊");
        RegisterMsg registerMsg2 = new RegisterMsg("2022099280003","张三","男",12,"17754138769",
                "全科","林鹤",date,new BigDecimal(20.00),new BigDecimal(20.00),"已退号");

        List<RegisterMsg> list = new ArrayList<>();
        list.add(registerMsg);
        list.add(registerMsg1);
        list.add(registerMsg2);
        Map map = new HashMap();

        map.put("registerMsg",list);
        R r = new R();
        r.ok(map);
        return r;
    }
}
