package com.gxa.controller.drugRetail;

import com.gxa.entity.drugRetail.*;
import com.gxa.service.drugRetail.DrugRetailService;
import com.gxa.utils.R;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(tags = {"药品零售接口"})
public class DrugRetailController {
    @Autowired
    private DrugRetailService drugRetailService;

    @PostMapping("/drugRetail/add")
    @ApiOperation(value = "保存接口",notes = "药品零售页保存",httpMethod = "POST")
    public R add(@ApiParam(name = "drugRetail", value = "药品零售添加信息")@RequestBody DrugRetail drugRetail){
        R r = new R();
//        this.drugRetailService.add(drugRetail);
        return r.ok("success");
    }
    @GetMapping("/drugRetail/queryDrug")
    @ApiOperation(value = "查询药品接口",notes = "查询药品",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = DrugMsg.class)
    })
    public R queryAllDrug(@ApiParam(name = "drugQueryCondition",value = "药品查询条件")@RequestBody DrugQueryCondition drugQueryCondition){
        R r = new R();
        DrugMsg drugMsg = new DrugMsg("1000001","阿莫西林","西/成药","\n" +
                "6g*14袋/盒","山东罗欣药业股份有限公司","112盒",5.00);
        DrugMsg drugMsg1 = new DrugMsg("1000002","氯化钠0.9%","西/成药","\n" +
                "6g*14袋/盒","山东罗欣药业股份有限公司","110盒",5.00);
        DrugMsg drugMsg2 = new DrugMsg("1000003","\n" +
                "青霉素针注射用","中药","\n" +
                "6g*14袋/盒","山东罗欣药业股份有限公司","112盒",5.00);
        List<DrugMsg> list = new ArrayList<>();
        list.add(drugMsg);
        list.add(drugMsg1);
        list.add(drugMsg2);
        Map map = new HashMap();
        map.put("drugMsg",list);
        return r.ok(map);
    }
    @GetMapping("/drugRetail/query")
    @ApiOperation(value = "查询接口",notes = "项目明细",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = DrugDetailed.class)
    })
    public R queryByName(@ApiParam(name = "name", value = "姓名查找项目明细")String name){
        R r = new R();
        DrugDetailed drugDetailed = new DrugDetailed("肾宝糖浆",15.00,2,"瓶",new BigDecimal(30.00));
        DrugDetailed drugDetailed1 = new DrugDetailed("阿莫西林分散片",25.00,12,"盒",new BigDecimal(25.00));
        DrugDetailed drugDetailed2 = new DrugDetailed("肾宝糖浆",20.00,1,"盒",new BigDecimal(20.00));
        List<DrugDetailed> list = new ArrayList<>();
        list.add(drugDetailed);
        list.add(drugDetailed1);
        list.add(drugDetailed2);
        Map map = new HashMap();
        map.put("drugDetailed",list);
        return r.ok(map);
    }
    @GetMapping("/drugRetail/querySurCharge")
    @ApiOperation(value = "查询接口",notes = "附加费用",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = SurChargeFee.class)
    })
    public R querySurChargeFee(){
        R r = new R();
        SurChargeFee surChargeFee = new SurChargeFee("材料费",20.00);
        SurChargeFee surChargeFee1 = new SurChargeFee("注射药",20.00);
        SurChargeFee surChargeFee2= new SurChargeFee("煎药费",15.00);
        SurChargeFee surChargeFee3 = new SurChargeFee("皮试",30.00);
        List<SurChargeFee> list = new ArrayList<>();
        list.add(surChargeFee);
        list.add(surChargeFee1);
        list.add(surChargeFee2);
        list.add(surChargeFee3);
        Map map = new HashMap();
        map.put("surChargeFee",list);
        return r.ok(map);
    }
}
