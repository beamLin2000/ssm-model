package com.gxa.controller.drugManagement.drugPriceAdjustment;

import com.gxa.entity.drugManagement.drugPriceAdjustment.DrugPriceAdjustInfo;
import com.gxa.result.Result;
import com.gxa.result.ResultUtils;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :林溪
 * @date : 2022/10/12 16:24
 */
@RestController
@RequestMapping("/drugPriceAdjustment")
@Api(tags = {"药品调价接口"})
public class DrugPriceAdjustmentController {

    @Autowired
    private DrugPriceAdjustmentVisualData drugPriceAdjustmentVisualData;
    //搜索
    @GetMapping("/search")
    @ApiOperation(value = "search",notes = "药品调价搜素")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = DrugPriceAdjustInfo.class )
    })
    public Result search(@ApiParam(value = "处方类别")String drugType,
                         @ApiParam(value = "药品名称/编码/生产厂家")String rules){
        System.out.println(drugType+","+rules);
        return ResultUtils.buildFail(200,"drugPriceAdjustment",0L,drugPriceAdjustmentVisualData.getDrugPriceAdjustInfos());
    }
    //调价pre
    @PostMapping("/queryById")
    @ApiOperation(value = "queryById",notes = "药品调价前,根据id搜素")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = DrugPriceAdjustInfo.class )
    })
    public Result queryById(@ApiParam(value = "需要调价信息的id")Integer id){
        System.out.println(id);
        return ResultUtils.buildFail(200,"updatePre",0L,drugPriceAdjustmentVisualData.getDrugPriceAdjustInfos());
    }
    //调价保存
    @PostMapping("/save")
    @ApiOperation(value = "save",notes = "药品调价完毕进行保存(适用于新增与修改)")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result save(@ApiParam(value = "调价保存的数据") DrugPriceAdjustInfo drugPriceAdjustInfo){
        System.out.println(drugPriceAdjustInfo);
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
        return ResultUtils.buildFail(200,"list",0L,drugPriceAdjustmentVisualData.getDrugPriceAdjustInfos());
    }
    //调价记录=查看详情
    @GetMapping("/detail")
    @ApiOperation(value = "detail",notes = "调价记录列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = DrugPriceAdjustInfo.class )
    })
    public Result detail(@ApiParam(value="调价记录查看详情")Integer id){
        System.out.println(id);
        return ResultUtils.buildFail(200,"updatePre",0L,drugPriceAdjustmentVisualData.getDrugPriceAdjustInfos());
    }

}
