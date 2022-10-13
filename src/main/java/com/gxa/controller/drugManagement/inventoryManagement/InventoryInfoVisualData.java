package com.gxa.controller.drugManagement.inventoryManagement;

import com.gxa.entity.drugManagement.inventoryManagement.InventoryDetails;
import com.gxa.entity.drugManagement.inventoryManagement.InventoryInfo;
import com.gxa.entity.drugManagement.inventoryManagement.ViewInventoryDetails;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author LXD
 * @Date 2022/10/12 14:46
 * @Version 1.0
 */
@Getter
@Setter
@Component
public class InventoryInfoVisualData {
  private List<InventoryDetails> inventoryDetails = new ArrayList<>();
  private List<InventoryInfo> inventoryInfos = new ArrayList<>();
  {
    //创建库存列表
    inventoryDetails.add(new InventoryDetails(1,"sp202202020","2022/11/8","处方",5,"29482152",12.0,16.0));
    inventoryDetails.add(new InventoryDetails(2,"sp202202020","2022/11/8","处方",5,"29482152",12.0,16.0));
    inventoryDetails.add(new InventoryDetails(3,"sp202202020","2022/11/8","处方",5,"29482152",12.0,16.0));

    //库存管理明细
    List<InventoryDetails> inventoryDetails1 = new ArrayList<>();
    inventoryDetails1.add(inventoryDetails.get(0));
    inventoryDetails1.add(inventoryDetails.get(1));
    inventoryInfos.add(new InventoryInfo(1,"1000001","12-1001","超敏","中/成药","6g*10袋/盒","口服","上海医药集团",110,27000.0,270000.0,"账单",210,inventoryDetails1));

    List<InventoryDetails> inventoryDetails2 = new ArrayList<>();
    inventoryDetails2.add(inventoryDetails.get(2));
    inventoryDetails2.add(inventoryDetails.get(1));
    inventoryInfos.add(new InventoryInfo(2,"1000001","12-1001","超敏","中/成药","6g*10袋/盒","口服","上海医药集团",110,27000.0,270000.0,"账单",210,inventoryDetails2));

    List<InventoryDetails> inventoryDetails3 = new ArrayList<>();
    inventoryDetails3.add(inventoryDetails.get(0));
    inventoryInfos.add(new InventoryInfo(3,"1000001","12-1001","超敏","中/成药","6g*10袋/盒","口服","上海医药集团",110,27000.0,270000.0,"账单",210,inventoryDetails3));

    List<InventoryDetails> inventoryDetails4 = new ArrayList<>();
    inventoryDetails4.add(inventoryDetails.get(2));
    inventoryDetails4.add(inventoryDetails.get(1));
    inventoryInfos.add(new InventoryInfo(4,"1000001","12-1001","超敏","中/成药","6g*10袋/盒","口服","上海医药集团",110,27000.0,270000.0,"账单",210,inventoryDetails4));
    //创建查看库存明细


  }
}

