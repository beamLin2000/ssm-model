package com.gxa.controller.registration;

import com.gxa.entity.registration.*;
import com.gxa.service.register.RegisterService;
import com.gxa.utils.R;
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
    @PostMapping ("/register/query")
    @ApiOperation(value = "查找接口",notes = "查找挂号记录",httpMethod = "POST")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = RegisterMsg.class)
    })
    public R queryByCondition(@ApiParam(name = "registerQueryCondition",value = "挂号记录查询条件") @RequestBody RegisterQueryCondition registerQueryCondition){
        System.out.println(registerQueryCondition);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (registerQueryCondition.getStartTime() !=null && registerQueryCondition.getStartTime() != ""){
            Date startDate=new Date(Long.parseLong(registerQueryCondition.getStartTime()));
            registerQueryCondition.setStartTime(simpleDateFormat.format(startDate));
            System.out.println("start"+simpleDateFormat.format(startDate));
            Date endDate=new Date(Long.parseLong(registerQueryCondition.getEndTime()));
            registerQueryCondition.setEndTime(simpleDateFormat.format(endDate));
            System.out.println("end"+simpleDateFormat.format(endDate));

        }
        List<RegisterMsg> query = this.registerService.query(registerQueryCondition);
        Date receptionTime = query.get(0).getReceptionTime();
        Integer count = this.registerService.count(registerQueryCondition);
        Map map = new HashMap();
        map.put("allRegisterMsg",query);
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
    }
    @PutMapping("/register/update")
    @ApiOperation(value = "编辑接口",notes = "挂号信息编辑",httpMethod = "PUT")
    public R update(@ApiParam(name = "register", value = "挂号编辑信息")@RequestBody RegisterUpdate registerUpdate){
        System.out.println(registerUpdate);
        R r = new R();
        this.registerService.update(registerUpdate);
        return r.ok("success");
    }
    @DeleteMapping("/register/delete")
    @ApiOperation(value = "删除接口",notes = "退号",httpMethod = "DELETE")
    public R delete(@ApiParam(name = "registrationForm", value = "订单编号") String registrationForm){
        System.out.println(registrationForm);
        R r = new R();
        this.registerService.delete(registrationForm);
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
        int ranNum = (int) (random.nextDouble() * (9999 - 1000 + 1)) + 1000;
        String generateNo = str + ranNum;
        List<String> list = new ArrayList<>();
        list.add(generateNo);
        Map map = new HashMap();
        map.put("generateNo", list);
        return r.ok(map);
    }
}
