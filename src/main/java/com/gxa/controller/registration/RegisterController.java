package com.gxa.controller.registration;

import com.gxa.entity.registration.Register;
import com.gxa.entity.registration.RegisterMsg;
import com.gxa.entity.registration.RegisterMsgUpdate;
import com.gxa.entity.registration.RegisterQueryCondition;
import com.gxa.service.register.RegisterService;
import com.gxa.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.*;

@RestController
@Api(tags = {"挂号的接口"})
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @PostMapping("/register/add")
    @ApiOperation(value = "添加接口",notes = "挂号添加",httpMethod = "POST")
    public R add(@ApiParam(name = "register", value = "挂号添加信息")Register register){
        R r = new R();
        this.registerService.add(register);
        return r.ok("success");
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
        map.put("alRegisterMsg",list);
        R r = new R();
        return r.ok(map);
    }
    @GetMapping("/register/update/{registrationForm}")
    @ApiOperation(value = "数据回显接口",notes = "挂号信息回显",httpMethod = "GET")
    public R toUpdate(@ApiParam(name = "registrationForm", value = "订单编号") @PathVariable("registrationForm") String registrationForm){
        R r = new R();
        RegisterMsgUpdate register = this.registerService.toUpdate(registrationForm);
        Map map = new HashMap();
        map.put("registerMsg",register);
        return r.ok(map);
    }
    @PutMapping("/register/update")
    @ApiOperation(value = "编辑接口",notes = "挂号信息编辑",httpMethod = "PUT")
    public R update(@ApiParam(name = "register", value = "挂号编辑信息")RegisterMsgUpdate register){
        R r = new R();
        this.registerService.update(register);
        return r.ok("success");
    }
    @DeleteMapping("/register/delete/{registrationForm}")
    @ApiOperation(value = "删除接口",notes = "删除订单",httpMethod = "DELETE")
    public R delete(@ApiParam(name = "registrationForm", value = "订单编号") @PathVariable("registrationForm") String registrationForm){
        R r = new R();
        this.registerService.delete(registrationForm);
        return r.ok("success");
    }
}
