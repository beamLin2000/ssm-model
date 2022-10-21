package com.gxa.controller.drugManagement.outboundManagement;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.entity.drugManagement.outboundManagement.OutboundInfo;
import com.gxa.entity.drugManagement.outboundManagement.OutboundInfoAddArray;
import com.gxa.result.Result;
import com.gxa.result.ResultUtils;
import com.gxa.service.drugManagement.inventoryManagement.InventoryManagerService;
import com.gxa.service.drugManagement.outboundManagement.OutboundManagerOtherService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :林溪
 * @date : 2022/10/12 14:16
 */
@RestController
@RequestMapping("/outboundManagementOther")
@Api(tags = {"出库管理新增功能中的增删改查接口"})
public class OutboundManagementOtherController {
    @Autowired
    private OutboundManagerOtherService outboundManagerOtherService;

    @Autowired
    private InventoryManagerService inventoryManagerService;

    private final Integer OUTBOUND_TYPE = 14;
    //出库人员
    @GetMapping("/outboundPerson")
    @ApiOperation(value = "outboundPerson",notes = "出库人员下拉框查询")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result outboundPerson(){
        System.out.println("outboundPerson");
        return ResultUtils.buildFail(200,"outboundPerson",0L,outboundManagerOtherService);
    }
    //出库类型
    @GetMapping("/outboundType")
    @ApiOperation(value = "outboundType",notes = "出库类型下拉框查询")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result outboundType(){
        System.out.println("outboundType");
        return ResultUtils.buildFail(200,"outboundType",0L,outboundManagerOtherService.queryAllOutboundType(OUTBOUND_TYPE));
    }
    //添加药品Pre
    @GetMapping("/addPre")
    @ApiOperation(value = "addPre",notes = "添加前选择药品的列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = OutboundInfoAddArray.class)
    })
    public Result addPre(){
        System.out.println("addPre");
        return ResultUtils.buildFail(200,"addPre",0L,inventoryManagerService.search(null,null));
    }
    //搜索药品
    @GetMapping("/search")
    @ApiOperation(value = "search",notes = "搜索药品")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = OutboundInfo.class)
    })
    public Result search(@ApiParam(name = "drugType",value = "处方类别") String drugType,
                         @ApiParam(name = "rule",value = "药品编码/药品名称") String rule){
        System.out.println("search");
        return ResultUtils.buildFail(200,"search",0L,inventoryManagerService.search(drugType,rule));
    }

}
