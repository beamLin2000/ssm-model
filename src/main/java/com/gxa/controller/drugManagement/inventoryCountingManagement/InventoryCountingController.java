package com.gxa.controller.drugManagement.inventoryCountingManagement;

import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfo;
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
 * @date : 2022/10/12 20:03
 */
@RestController
@RequestMapping("/InventoryCounting")
@Api(tags = {"库存盘点接口"})
public class InventoryCountingController {

    @Autowired
    private InventoryCountingVisualData inventoryCountingVisualData;

    @GetMapping("/list")
    @ApiOperation(value = "list",notes = "库存盘点table表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = InventoryCountingInfo.class)//
    })
    public Result list(){
        System.out.println("list");
        return ResultUtils.buildFail(200,"ok",0L,inventoryCountingVisualData.getInventoryCountingInfo());
    }

    @GetMapping("/search")
    @ApiOperation(value = "search",notes = "库存盘点搜索功能")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = InventoryCountingInfo.class )//,response = InventoryCountingInfo.class
    })
    public Result search(){
        System.out.println("search");
        return ResultUtils.buildFail(200,"ok",0L,inventoryCountingVisualData.getInventoryCountingInfo().get(2));
    }

    @RequestMapping("/delete")
    @ApiOperation(value = "delete",notes = "库存盘点删除功能")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")//,response = InventoryCountingInfo.class
    })
    public Result delete(){
        System.out.println("delete");
        return ResultUtils.buildFail(200,"ok",0L,null);
    }

    @GetMapping("/queryById")
    @ApiOperation(value = "queryById",notes = "库存盘点查看功能")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = InventoryCountingInfo.class)//,
    })
    public Result queryById(){
        System.out.println("delete");
        return ResultUtils.buildFail(200,"ok",0L,inventoryCountingVisualData.getInventoryCountingInfo().get(1));
    }

    @PostMapping("/save")
    @ApiOperation(value = "save",notes = "保存与完成盘点功能")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")//,
    })
    public Result save(){
        System.out.println("save");
        return ResultUtils.buildFail(200,"ok",0L,null);
    }
}
