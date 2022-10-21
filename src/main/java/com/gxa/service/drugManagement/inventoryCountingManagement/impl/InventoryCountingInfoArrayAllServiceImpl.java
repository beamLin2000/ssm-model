package com.gxa.service.drugManagement.inventoryCountingManagement.impl;

import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfoArray;
import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfoArrayAll;
import com.gxa.mapper.drugManagement.inventoryCountingManagement.InventoryCountingInfoArrayAllMapper;
import com.gxa.service.drugManagement.inventoryCountingManagement.InventoryCountingInfoArrayAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryCountingInfoArrayAllServiceImpl implements InventoryCountingInfoArrayAllService {
    @Autowired
    private InventoryCountingInfoArrayAllMapper inventoryCountingInfoArrayAllMapper;

    @Override
    public List<InventoryCountingInfoArrayAll> queryAll(Integer id) {
        List<InventoryCountingInfoArrayAll> inventoryCountingInfoArrayAlls = this.inventoryCountingInfoArrayAllMapper.queryAll(id);
        return inventoryCountingInfoArrayAlls;
    }

    @Override
    public List<InventoryCountingInfoArrayAll> queryByruls(String drugType, String rules) {
        List<InventoryCountingInfoArrayAll> inventoryCountingInfoArrayAlls = this.inventoryCountingInfoArrayAllMapper.queryByruls(drugType, rules);
        return inventoryCountingInfoArrayAlls;
    }

    @Override
    public List<InventoryCountingInfoArray> queryAllDrugInfo() {

        return inventoryCountingInfoArrayAllMapper.queryAllDrugInfo();
    }

}
