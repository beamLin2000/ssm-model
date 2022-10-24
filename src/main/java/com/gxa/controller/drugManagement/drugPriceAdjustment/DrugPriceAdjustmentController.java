package com.gxa.controller.drugManagement.drugPriceAdjustment;

import com.gxa.entity.drugManagement.basicInfo.SearchCondition;
import com.gxa.entity.drugManagement.drugPriceAdjustment.DrugPriceAdjustInfo;
import com.gxa.entity.drugManagement.drugPriceAdjustment.DrugPriceAdjustInfoList;
import com.gxa.result.Result;
import com.gxa.result.ResultUtils;
import com.gxa.service.drugManagement.drugPriceAdjustment.DrugPriceAdjustmentService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/12 16:24
 */
@RestController
@RequestMapping("/drugPriceAdjustment")
@Api(tags = {"药品调价接口"})
public class DrugPriceAdjustmentController {

    @Autowired
    private DrugPriceAdjustmentService drugPriceAdjustmentService;
    //搜索
    @PostMapping("/search")
    @ApiOperation(value = "search",notes = "药品调价搜素")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = DrugPriceAdjustInfo.class )
    })
    public Result search(@ApiParam(value = "搜搜类里面的条件") @RequestBody SearchCondition searchCondition){
        System.out.println(searchCondition.getDrugType()+","+searchCondition.getRules());
        return ResultUtils.buildFail(200,"drugPriceAdjustment",0L,drugPriceAdjustmentService.search(searchCondition.getDrugType(), searchCondition.getRules()));
    }
    //调价pre
    @PostMapping("/queryById")
    @ApiOperation(value = "queryById",notes = "药品调价前,根据code搜素")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = DrugPriceAdjustInfo.class )
    })
    public Result queryById(@ApiParam(value = "需要调价信息的id") @RequestBody SearchCondition searchCondition){
        return ResultUtils.buildFail(200,"updatePre",0L,drugPriceAdjustmentService.queryByCode(searchCondition.getCode()));
    }
    //调价保存
    @PostMapping("/save")
    @ApiOperation(value = "save",notes = "药品调价完毕进行保存(适用于新增与修改)")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result save(@ApiParam(value = "调价保存的数据") @RequestBody List<DrugPriceAdjustInfoList> drugPriceAdjustInfoList){
        System.out.println("DrugPriceAdjustInfoList123=" + drugPriceAdjustInfoList);
        drugPriceAdjustmentService.saveDrugPriceAdjustInfoList(drugPriceAdjustInfoList,null,null);
        return ResultUtils.buildFail(200,"update",0L,null);
    }
    //list
    @GetMapping("/list")
    @ApiOperation(value = "list",notes = "药品调价 信息")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = DrugPriceAdjustInfo.class )
    })
    public Result list(){
        System.out.println("list");
        return ResultUtils.buildFail(200,"list",0L,drugPriceAdjustmentService.search(null,null));
    }
    //调价记录=查看详情
    @GetMapping("/detail")
    @ApiOperation(value = "detail",notes = "调价记录列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = DrugPriceAdjustInfo.class )
    })
    public Result detail(@ApiParam(value="调价记录查看详情")Integer id){
        System.out.println(id);
        return ResultUtils.buildFail(200,"updatePre",0L,drugPriceAdjustmentService.queryById(id));
    }

}
