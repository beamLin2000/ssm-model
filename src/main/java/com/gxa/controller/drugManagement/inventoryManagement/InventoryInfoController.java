package com.gxa.controller.drugManagement.inventoryManagement;
import com.gxa.entity.drugManagement.inboundManagement.IOboundInfoAddArray;
import com.gxa.entity.drugManagement.inventoryManagement.InventoryInfo;
import com.gxa.result.Result;
import com.gxa.result.ResultUtils;
import com.gxa.service.drugManagement.inventoryManagement.InventoryManagerService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author LXD
 * @Date 2022/10/12 16:26
 * @Version 1.0
 */
@RestController
@RequestMapping("/inventory")
@Api(tags = {"库存管理接口"})
public class InventoryInfoController {
//  @Autowired
//  private InventoryInfoVisualData inventoryInfoVisualData;

  @Autowired
  private InventoryManagerService inventoryManagerService;

  @GetMapping("/list")
  @ApiOperation(value = "list",notes = "库存管理列表")
  @ApiResponses({
          @ApiResponse(code = 200,message = "ok",response = InventoryInfo.class)//,
  })
  public Result list(){
    System.out.println("list");
    List<InventoryInfo> search = inventoryManagerService.search(null, null);
    return ResultUtils.buildFail(200,"查询所有",Long.valueOf(search.size()),search);
  }

  @GetMapping("/search")
  @ApiOperation(value = "search",notes = "搜索功能")
  @ApiResponses({
          @ApiResponse(code = 200,message = "ok",response = InventoryInfo.class)//,
  })
  public Result search(@ApiParam("处方类别")String drugType,@ApiParam("药品名称/编码/生产厂家")String rules){
    System.out.println(drugType+","+rules);
    List<InventoryInfo> search = inventoryManagerService.search(drugType, rules);
    return ResultUtils.buildFail(200,"查询所有",Long.valueOf(search.size()),search);
  }

  @GetMapping("/queryDetails")
  @ApiOperation(value = "queryDetails",notes = "查看明细")
  @ApiResponses({
          @ApiResponse(code = 200,message = "ok",response = InventoryInfo.class)//,
  })
  public Result queryDetails(@ApiParam("根据id查看单条数据明细")Integer id,String code){
    System.out.println(id+","+code);
    InventoryInfo inventoryInfo = inventoryManagerService.queryIOboundInfoAddArrayById(id, code);
    return ResultUtils.buildFail(200,"ok",0L,inventoryInfo);
  }
}
