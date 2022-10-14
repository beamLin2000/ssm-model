package com.gxa.controller.registration;

import com.gxa.entity.registration.Register;
import com.gxa.entity.registration.RegisterMsg;
import com.gxa.entity.registration.RegisterMsgUpdate;
import com.gxa.entity.registration.RegisterQueryCondition;
import com.gxa.service.register.RegisterService;
import com.gxa.utils.R;
import com.hazelcast.util.JsonUtil;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@Api(tags = {"挂号的接口"})
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @PostMapping("/register/add")
    @ApiOperation(value = "添加接口",notes = "挂号添加",httpMethod = "POST")
    public R add(@ApiParam(name = "register", value = "挂号添加信息")@RequestBody Register register){
        System.out.println(register);
        R r = new R();
        Date date = new Date();
        long time = date.getTime();
        date.setTime(time);
        register.setRegistrationDateTime(date);
        register.setRegistrationDate(date);
        register.setStatus("未就诊");
        this.registerService.add(register);
        return r.ok("success");
    }
    @GetMapping("/register/query")
    @ApiOperation(value = "查找接口",notes = "查找挂号记录",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = RegisterMsg.class)
    })
    public R queryByCondition(){
//        System.out.println(registerQueryCondition);
//        @ApiParam(name = "registerQueryCondition",value = "挂号记录查询条件") @RequestBody RegisterQueryCondition registerQueryCondition)
//        RegisterMsg query = this.registerService.query(registerQueryCondition);
//        Integer count = this.registerService.count(registerQueryCondition);

        Date date = new Date();
        long time = date.getTime();
        date.setTime(time);
        RegisterMsg registerMsg = new RegisterMsg("2022099280001","张三","男",12,
                "17754138769","王冕",date,20.00,20.00,"已就诊");
        RegisterMsg registerMsg1 = new RegisterMsg("2022099280002","李四","男",20,"17754138769"
                ,"王冕",date,20.00,20.00,"未就诊");
        RegisterMsg registerMsg2 = new RegisterMsg("2022099280003","张三","男",12,"17754138769"
                ,"林鹤",date,20.00,20.00,"已退号");
        List<RegisterMsg> list = new ArrayList<>();
        list.add(registerMsg);
        list.add(registerMsg1);
        list.add(registerMsg2);
        int count = 3;
        Map map = new HashMap();
        map.put("allRegisterMsg",list);
        map.put("count",count);
        R r = new R();
        return r.ok(map);
    }
    @GetMapping("/register/toUpdate")
    @ApiOperation(value = "数据回显接口",notes = "挂号信息回显",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = RegisterMsgUpdate.class)
    })
    public R toUpdate(@ApiParam(name = "registrationForm",value = "挂号单号")String registrationForm){
        System.out.println(registrationForm);
        R r = new R();
        RegisterMsgUpdate register = this.registerService.toUpdate(registrationForm);
        System.out.println(register);
        List<RegisterMsgUpdate> list = new ArrayList<>();
        list.add(register);
        Map map = new HashMap();
        map.put("registerMsg",list);
        return r.ok(map);
//       RegisterMsgUpdate msgUpdate = new RegisterMsgUpdate("202210130001","王蒙","男",null,
//               "5105111515156151","成都市高新区","备注",null,20,"1008611","林鹤",new BigDecimal(60),new BigDecimal(30),new BigDecimal(30),"微信",new BigDecimal(0),null,"林鹤","初诊",10.00,50.00);
//        List<RegisterMsgUpdate> list = new ArrayList<>();
//        list.add(msgUpdate);
//        Map map = new HashMap();
//        map.put("registerMsg",list);
//        return r.ok(map);
    }
    @PutMapping("/register/update")
    @ApiOperation(value = "编辑接口",notes = "挂号信息编辑",httpMethod = "PUT")
    public R update(@ApiParam(name = "register", value = "挂号编辑信息")@RequestBody RegisterMsgUpdate register){
        System.out.println(register);
        R r = new R();
//        this.registerService.update(register);
        return r.ok("success");
    }
    @DeleteMapping("/register/delete")
    @ApiOperation(value = "删除接口",notes = "删除订单",httpMethod = "DELETE")
    public R delete(@ApiParam(name = "registrationForm", value = "订单编号") String registrationForm){
        System.out.println(registrationForm);
        R r = new R();
//        this.registerService.delete(registrationForm);
        return r.ok("success");
    }
    @GetMapping("/register/generateNo")
    @ApiOperation(value = "挂号单号接口",notes = "挂号单号回显",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = String.class)
    })
    public R generateNo() {
        R r = new R();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        String str =simpleDateFormat.format(date);
        Random random = new Random();
        int ranNum = (int) (random.nextDouble() * (9999 - 1000 + 1)) + 1000;// 获取4位随机数
        String generateNo = str + ranNum;
        List<String> list = new ArrayList<>();
        list.add(generateNo);
        Map map = new HashMap();
        map.put("generateNo", list);
        return r.ok(map);
    }
}
