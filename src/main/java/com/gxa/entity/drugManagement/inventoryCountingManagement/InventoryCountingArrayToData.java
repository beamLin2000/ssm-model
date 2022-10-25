package com.gxa.entity.drugManagement.inventoryCountingManagement;

import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :林溪
 * @date : 2022/10/20 8:29
 */
//存储array
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
public class InventoryCountingArrayToData {
    private Integer id;
    private Integer countingInfoId;
    private Integer drugInfoId;
    private Integer countingStock;
    private Integer profitLoss;
    private String remarks;
}
