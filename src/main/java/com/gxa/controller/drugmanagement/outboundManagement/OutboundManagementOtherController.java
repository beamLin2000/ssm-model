package com.gxa.controller.drugmanagement.outboundManagement;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.entity.drugManagement.outboundManagement.OutboundInfo;
import com.gxa.entity.drugManagement.outboundManagement.OutboundInfoAddArray;
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
 * @date : 2022/10/12 14:16
 */
@RestController
@RequestMapping("/outboundManagementOther")
@Api(value = "OutboundManagementOtherController",description = "新增出库管理中下拉框和添加药品")
public class OutboundManagementOtherController {

    @Autowired
    private OutboundManagerVisualData outboundManagerVisualData;
    //出库人员
    @GetMapping("/outboundPerson")
    @ApiOperation(value = "outboundPerson",notes = "出库人员下拉框查询")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result outboundPerson(){
        System.out.println("outboundPerson");
        return ResultUtils.buildFail(200,"outboundPerson",0L,outboundManagerVisualData.getWarehouseOutPersonnel());
    }
    //出库类型
    @GetMapping("/outboundType")
    @ApiOperation(value = "outboundType",notes = "出库类型下拉框查询")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result outboundType(){
        System.out.println("outboundType");
        return ResultUtils.buildFail(200,"outboundType",0L,outboundManagerVisualData.getDeliveryType());
    }
    //添加药品Pre
    @GetMapping("/addPre")
    @ApiOperation(value = "addPre",notes = "添加前选择药品的列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = OutboundInfoAddArray.class)
    })
    public Result addPre(){
        System.out.println("addPre");
        return ResultUtils.buildFail(200,"addPre",0L,outboundManagerVisualData.getLoArray());
    }
    //添加药品
    @PostMapping("/add")
    @ApiOperation(value = "add",notes = "添加药品")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result add(){
        System.out.println("add");
        return ResultUtils.buildFail(200,"add",0L,null);
    }
    //搜索药品
    @GetMapping("/search")
    @ApiOperation(value = "search",notes = "搜索药品")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = OutboundInfo.class)
    })
    public Result search(){
        System.out.println("search");
        return ResultUtils.buildFail(200,"search",0L,outboundManagerVisualData.getLoArray().get(0));
    }
}
