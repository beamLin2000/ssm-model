package com.gxa.mapper.drugManagement.inventoryCountingManagement;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InventoryCountingManagementMapper extends BaseMapper<InventoryCountingInfo> {
    List<InventoryCountingInfo>queryByCondition(@Param("startTime") String startTime, @Param("endTime") String EndTime, @Param("countSheetNo") String countSheetNo);
    void saveAll(InventoryCountingInfo inventoryCountingInfo);

}
