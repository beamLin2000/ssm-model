package com.gxa.service.drugManagement.inventoryCountingManagement;

import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingArrayToData;
import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfoArray;
import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfoArrayAll;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InventoryCountingInfoArrayAllService {
//    List<InventoryCountingInfoArrayAll> queryAll(Integer id);
    List<InventoryCountingInfoArrayAll> queryByruls(String drugType, String rules);
    //新增前的查询
    List<InventoryCountingInfoArray> queryAllDrugInfo();

}
