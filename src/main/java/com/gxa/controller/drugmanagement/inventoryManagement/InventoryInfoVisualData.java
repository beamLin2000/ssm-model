package com.gxa.controller.drugmanagement.inventoryManagement;

import com.gxa.entity.drugManagement.inventoryManagement.InventoryDetails;
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
  private ViewInventoryDetails viewInventoryDetails;
  {
    //创建查看库存明细
    viewInventoryDetails = new ViewInventoryDetails("100001","甲校3的撒大","西/成药","100g*20支/盒","口服","上海医药公司",99);

    //创建库存明细
    inventoryDetails.add(new InventoryDetails(1,"sp202202020","2022/11/8","处方",5,"29482152",12.0,16.0));
    inventoryDetails.add(new InventoryDetails(2,"sp202202020","2022/11/8","处方",5,"29482152",12.0,16.0));
    inventoryDetails.add(new InventoryDetails(3,"sp202202020","2022/11/8","处方",5,"29482152",12.0,16.0));

  }
}

