package com.gxa.mapper.drugManagement.inventoryCountingManagement;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingArrayToData;
import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfo;
import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfoArray;
import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfoArrayAll;
import org.apache.ibatis.annotations.Param;

import java.util.List;
//查看中的查询
public interface InventoryCountingInfoArrayAllMapper {
    List<InventoryCountingInfoArray> queryAll(@Param("countingInfoId") Integer countingInfoId);
    List<InventoryCountingInfoArrayAll> queryByruls(@Param("drugType") String drugType, @Param("rules") String rules);
    List<InventoryCountingInfoArray> queryAllDrugInfo();
    void saveAllArray(@Param("inventoryCountingArrayToData") List<InventoryCountingArrayToData> inventoryCountingArrayToData);

}
