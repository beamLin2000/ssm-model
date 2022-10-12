package com.gxa.controller.drugRetail;

import com.gxa.entity.drugRetail.DrugMsg;
import com.gxa.entity.drugRetail.DrugQueryCondition;
import com.gxa.entity.drugRetail.DrugRetail;
import com.gxa.entity.registration.RegisterMsg;
import com.gxa.service.drugRetail.DrugRetailService;
import com.gxa.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public R add(@ApiParam(name = "drugRetail", value = "药品零售添加信息")DrugRetail drugRetail){
        R r = new R();
        this.drugRetailService.add(drugRetail);
        return r.ok("success");
    }
    @GetMapping("/drugRetail/query")
    @ApiOperation(value = "查询药品接口",notes = "查询药品",httpMethod = "GET")
    public R queryAllDrug(@ApiParam(name = "drugQueryCondition",value = "药品查询条件")DrugQueryCondition drugQueryCondition){
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
}
