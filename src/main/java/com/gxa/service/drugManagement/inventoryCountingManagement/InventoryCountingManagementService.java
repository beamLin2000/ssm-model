package com.gxa.service.drugManagement.inventoryCountingManagement;

import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfo;

import java.util.List;

public interface InventoryCountingManagementService {
    List<InventoryCountingInfo>queryAll();
    List<InventoryCountingInfo>queryByCondition(String time, String countSheetNo);
    InventoryCountingInfo queryById(Integer id);
    //保存
    void saveAllData(InventoryCountingInfo inventoryCountingInfo);
    void deleteById(Integer id);

}
