package com.gxa.controller.drugManagement.inboundManagement;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.entity.drugManagement.inboundManagement.InboundInfo;
import com.gxa.entity.drugManagement.inventoryManagement.InventoryInfo;
import com.gxa.mapper.drugManagement.inventoryManagement.InventoryManagerMapper;
import com.gxa.result.Result;
import com.gxa.result.ResultUtils;
import com.gxa.service.drugManagement.inboundManagement.InboundManagerOtherService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author :林溪
 * @date : 2022/10/12 11:51
 */
@RestController
@RequestMapping("/inboundManagerOther")
@Api(tags = {"入库管理新增功能中的小功能"})
public class InboundManagerOtherController {
    @Autowired
    private InboundManagerOtherService inboundManagerOtherService;
    @Autowired
    private InventoryManagerMapper inventoryManagerMapper;
    private final Integer INBOUND_TYPE = 13;

    //入库类型
    @GetMapping("/inboundType")
    @ApiOperation(value = "inboundType",notes = "入库类型下拉框查询")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class )
    })
    public Result inboundType(){
        System.out.println("inboundType");
        return ResultUtils.buildFail(200,"inboundType",0L,inboundManagerOtherService.queryAllInboundType(INBOUND_TYPE));
    }

    //入库人员
    @GetMapping("/warehousingPersonnel")
    @ApiOperation(value = "warehousingPersonnel",notes = "入库人员下拉框查询")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class )
    })
    public Result warehousingPersonnel(){
        System.out.println("inboundType");
        return ResultUtils.buildFail(200,"ok",Long.valueOf(inboundManagerOtherService.queryAllWarehousingPersonnel().size()),inboundManagerOtherService.queryAllWarehousingPersonnel());
    }

    //添加药品pre
    @GetMapping("/addPre")
    @ApiOperation(value = "addPre",notes = "添加药品前的查询列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = InboundInfo.class )
    })
    public Result addPre(){
        System.out.println("addPre");
        return ResultUtils.buildFail(200,"addPre",0L,inventoryManagerMapper.search(null,null));
    }
    //搜索药品
    @GetMapping("/search")
    @ApiOperation(value = "search",notes = "添加药品中的搜索功能")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = InventoryInfo.class )
    })
    public Result search(@ApiParam("处方类别")String drugType,
                         @ApiParam("编码/药品名称")String rules){
        System.out.println(drugType+","+rules);
        return ResultUtils.buildFail(200,"search",0L,inboundManagerOtherService.search(drugType,rules));
    }

    //供应商
    @GetMapping("/manufacture")
    @ApiOperation(value = "manufacture",notes = "供应商下拉框")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class )
    })
    public Result manufacture(){
        System.out.println("manufacture");
        return ResultUtils.buildFail(200,"ok",0L,inboundManagerOtherService.queryAllManufacture());
    }
}
