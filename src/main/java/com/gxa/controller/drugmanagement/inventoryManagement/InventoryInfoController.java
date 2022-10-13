package com.gxa.controller.drugmanagement.inventoryManagement;
import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfoArray;
import com.gxa.entity.drugManagement.inventoryManagement.InventoryInfo;
import com.gxa.result.Result;
import com.gxa.result.ResultUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javafx.scene.chart.ValueAxis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @Author LXD
 * @Date 2022/10/12 16:26
 * @Version 1.0
 */
@RestController
@RequestMapping("/inventory")
@Api(value = "InventoryInfoController",description ="库存管理" )
public class InventoryInfoController {
  @Autowired
  private InventoryInfoVisualData inventoryInfoVisualData;

  @GetMapping("/list")
  @ApiOperation(value = "list",notes = "库存管理列表")
  @ApiResponses({
          @ApiResponse(code = 200,message = "ok",response = InventoryInfo.class)//,
  })
  public Result list(){
    System.out.println("list");
    ArrayList<InventoryInfo> inventoryInfos = new ArrayList<>();
    inventoryInfos.add(new InventoryInfo(1,"1000001","1001","超敏","6g*10袋/盒","口服","上海医药集团",110,27000.0,270000.0,inventoryInfoVisualData.getViewInventoryDetails(),inventoryInfoVisualData.getInventoryDetails()));
    return ResultUtils.buildFail(200,"查询所有",2L,inventoryInfos);
  }

  @GetMapping("/search")
  @ApiOperation(value = "search",notes = "搜索功能")
  @ApiResponses({
          @ApiResponse(code = 200,message = "ok",response = InventoryInfo.class)//,
  })
  public Result search(){
    System.out.println("search");
    ArrayList<InventoryInfo> inventoryInfos = new ArrayList<>();
    inventoryInfos.add(new InventoryInfo(1,"1000001","1001","超敏","6g*10袋/盒","口服","上海医药集团",110,27000.0,270000.0,inventoryInfoVisualData.getViewInventoryDetails(),inventoryInfoVisualData.getInventoryDetails()));
    return ResultUtils.buildFail(200,"查询所有",2L,inventoryInfos);
  }

  @GetMapping("/queryDetails")
  @ApiOperation(value = "queryDetails",notes = "查看明细")
  @ApiResponses({
          @ApiResponse(code = 200,message = "ok",response = InventoryInfo.class)//,
  })
  public Result queryDetails(){
    System.out.println("queryDetails");
    ArrayList<InventoryInfo> inventoryInfos = new ArrayList<>();
    inventoryInfos.add(new InventoryInfo(1,"1000001","1001","超敏","6g*10袋/盒","口服","上海医药集团",110,27000.0,270000.0,inventoryInfoVisualData.getViewInventoryDetails(),inventoryInfoVisualData.getInventoryDetails()));
    return ResultUtils.buildFail(200,"查询明细",2L,inventoryInfos);
  }
}
