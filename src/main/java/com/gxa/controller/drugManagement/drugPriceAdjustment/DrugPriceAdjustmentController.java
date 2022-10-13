package com.gxa.controller.drugManagement.drugPriceAdjustment;

import com.gxa.entity.drugManagement.drugPriceAdjustment.DrugPriceAdjustInfo;
import com.gxa.result.Result;
import com.gxa.result.ResultUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Result search(){
        System.out.println("drugPriceAdjustment");
        return ResultUtils.buildFail(200,"drugPriceAdjustment",0L,drugPriceAdjustmentVisualData.getDrugPriceAdjustInfos().get(0));
    }
    //调价pre
    @PostMapping("/queryById")
    @ApiOperation(value = "queryById",notes = "药品调价前,根据id搜素")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = DrugPriceAdjustInfo.class )
    })
    public Result updatePre(){
        System.out.println("updatePre");
        return ResultUtils.buildFail(200,"updatePre",0L,drugPriceAdjustmentVisualData.getDrugPriceAdjustInfos().get(1));
    }
    //调价保存
    @PostMapping("/save")
    @ApiOperation(value = "save",notes = "药品调价完毕进行保存")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result update(){
        System.out.println("update");
        return ResultUtils.buildFail(200,"update",0L,null);
    }
    //list
    @GetMapping("/list")
    @ApiOperation(value = "list",notes = "药品调价信息")
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
    public Result detail(){
        System.out.println("detail");
        return ResultUtils.buildFail(200,"updatePre",0L,drugPriceAdjustmentVisualData.getDrugPriceAdjustInfos().get(1));
    }

}
