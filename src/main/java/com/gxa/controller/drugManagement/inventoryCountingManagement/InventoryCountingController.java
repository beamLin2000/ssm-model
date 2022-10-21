package com.gxa.controller.drugManagement.inventoryCountingManagement;

import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfo;
import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfoArray;
import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfoArrayAll;
import com.gxa.result.Result;
import com.gxa.result.ResultUtils;
import com.gxa.service.drugManagement.inventoryCountingManagement.InventoryCountingInfoArrayAllService;
import com.gxa.service.drugManagement.inventoryCountingManagement.InventoryCountingManagementService;
import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/12 20:03
 */
@RestController
@RequestMapping("/InventoryCounting")
@Api(tags = {"库存盘点接口"})
public class InventoryCountingController {

    @Autowired
    private InventoryCountingManagementService inventoryCountingManagementService;

    @Autowired
    private InventoryCountingInfoArrayAllService inventoryCountingInfoArrayAllService;

    @GetMapping("/list")
    @ApiOperation(value = "list",notes = "库存盘点table表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = InventoryCountingInfo.class)//
    })
    public Result list(){
        List<InventoryCountingInfo> inventoryCountingInfos = this.inventoryCountingManagementService.queryAll();
        System.out.println("list");
        return ResultUtils.buildFail(200,"ok",0L,inventoryCountingInfos);
    }

    @GetMapping("/search")
    @ApiOperation(value = "search",notes = "库存盘点搜索功能")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = InventoryCountingInfo.class )//,response = InventoryCountingInfo.class
    })
    public Result search(@ApiParam("创建时间")String createTime,@ApiParam("盘点单号")String countSheetNo){
        List<InventoryCountingInfo> inventoryCountingInfos = this.inventoryCountingManagementService.queryByCondition(createTime,countSheetNo);
        return ResultUtils.buildFail(200,"ok",0L,inventoryCountingInfos);
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "delete",notes = "库存盘点删除功能")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")//,response = InventoryCountingInfo.class
    })
    public Result delete(@ApiParam("需要被删除的数据id")@Param("id")Integer id){
        this.inventoryCountingManagementService.deleteById(id);
        return ResultUtils.buildFail(200,"ok",0L,null);
    }

    @GetMapping("/queryById")
    @ApiOperation(value = "queryById",notes = "库存盘点查看功能")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = InventoryCountingInfo.class)//,
    })
    public Result queryById(@ApiParam("需要查看记录的id")@Param("id") Integer id){
        List<InventoryCountingInfoArrayAll> inventoryCountingInfoArrayAlls = this.inventoryCountingInfoArrayAllService.queryAll(id);
        return ResultUtils.buildFail(200,"ok",0L,inventoryCountingInfoArrayAlls);
    }

    @PostMapping("/save")
    @ApiOperation(value = "save",notes = "保存与完成盘点功能")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")//,
    })
    public Result save(@ApiParam("提交需要被保存的数据")@RequestBody InventoryCountingInfo inventoryCountingInfo){
        System.out.println(inventoryCountingInfo);
        this.inventoryCountingManagementService.saveAllData(inventoryCountingInfo);
        return ResultUtils.buildFail(200,"ok",0L,null);
    }
    @PostMapping("/savePre")
    @ApiOperation(value = "save",notes = "新增前对药品信息的所有查询")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")//,
    })
    public Result savePre(){
        List<InventoryCountingInfoArray> inventoryCountingInfoArrays = inventoryCountingInfoArrayAllService.queryAllDrugInfo();
        return ResultUtils.buildFail(200,"ok",Long.valueOf(inventoryCountingInfoArrays.size()),inventoryCountingInfoArrays);
    }
}
