package com.gxa.controller.drugRetail;

import com.gxa.entity.drugRetail.*;
import com.gxa.service.drugRetail.DrugRetailService;
import com.gxa.utils.OrderNo;
import com.gxa.utils.R;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@Api(tags = {"药品零售接口"})
public class DrugRetailController {
    @Autowired
    private DrugRetailService drugRetailService;

    @PostMapping("/drugRetail/add")
    @ApiOperation(value = "保存接口",notes = "药品零售页保存",httpMethod = "POST")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = String.class)
    })
    public R add(@ApiParam(name = "drugRetail", value = "药品零售添加信息")@RequestBody DrugRetail drugRetail){
        System.out.println(drugRetail);
        R r = new R();
        drugRetail.setTollNum(OrderNo.orderNum());
//        drugRetail.setTollType("药品零售");
//        drugRetail.setTollState(1);
        Date date = new Date();
        long time = date.getTime();
        date.setTime(time);
        drugRetail.setCreatTime(date);
        this.drugRetailService.add(drugRetail);
        List<String> list = new ArrayList<>();
        list.add(drugRetail.getTollNum());
        Map map = new HashMap();
        map.put("tollNum", list);
        return r.ok(map);
    }
    @PostMapping ("/drugRetail/query")
    @ApiOperation(value = "查询药品接口",notes = "查询药品",httpMethod = "POST")
    public R queryAllDrug(@ApiParam(name = "drugQueryCondition",value = "药品查询条件")@RequestBody DrugQueryCondition drugQueryCondition){
        System.out.println(drugQueryCondition);
        R r = new R();
        Map map = new HashMap();
        if (!drugQueryCondition.getDrugCodeOrName().equals(null) && !drugQueryCondition.getDrugCodeOrName().equals("")){
            Pattern pattern = Pattern.compile("[0-9].*");//一定记住加“.”
            Matcher isNum = pattern.matcher(drugQueryCondition.getDrugCodeOrName().charAt(0)+"");
            if (isNum.matches()) {//判断是以药品编码查询
                List<DrugChooseMsg> drugChooseMsgs = this.drugRetailService.queryByCode(drugQueryCondition);
                map.put("drugMsg", drugChooseMsgs);
                return r.ok(map);
            }else {//药品名称查询
                List<DrugChooseMsg> drugChooseMsgs = this.drugRetailService.queryByName(drugQueryCondition);
                map.put("drugMsg", drugChooseMsgs);
                return r.ok(map);
            }
        }else {
            List<DrugChooseMsg> drugChooseMsgs = this.drugRetailService.queryByName(drugQueryCondition);
            map.put("drugMsg", drugChooseMsgs);
            return r.ok(map);
        }
    }
//    @GetMapping("/drugRetail/queryDetailed")
//    @ApiOperation(value = "查询接口",notes = "项目明细",httpMethod = "GET")
//    @ApiResponses({
//            @ApiResponse(code = 0,message = "ok",response = DrugDetailed.class)
//    })
//    public R queryByName(@ApiParam(name = "name", value = "姓名查找项目明细") String name){
//        System.out.println(name);
//        R r = new R();
//        DrugDetailed drugDetailed = new DrugDetailed("肾宝糖浆",15.00,2,"瓶",30.00);
//        DrugDetailed drugDetailed1 = new DrugDetailed("阿莫西林分散片",25.00,12,"盒",25.00);
//        DrugDetailed drugDetailed2 = new DrugDetailed("肾宝糖浆",20.00,1,"盒",20.00);
//        List<DrugDetailed> list = new ArrayList<>();
//        list.add(drugDetailed);
//        list.add(drugDetailed1);
//        list.add(drugDetailed2);
//        Map map = new HashMap();
//        map.put("drugDetailed",list);
//        return r.ok(map);
//    }
}
