package com.gxa.controller.drugRetail;

import com.gxa.entity.drugRetail.DrugRetail;
import com.gxa.service.drugRetail.DrugRetailService;
import com.gxa.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public R queryAllDrug(){
        R r = new R();
        this.drugRetailService.queryAll();
        return r.ok("success");
    }

}
