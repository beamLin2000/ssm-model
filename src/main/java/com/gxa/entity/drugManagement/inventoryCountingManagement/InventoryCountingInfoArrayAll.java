package com.gxa.entity.drugManagement.inventoryCountingManagement;

import com.gxa.entity.drugManagement.drugInformationTenance.DrugBasicInformation;
import com.gxa.entity.drugManagement.inventoryManagement.InventoryInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryCountingInfoArrayAll {

    private Integer id;
    private Integer countingInfoId;
    private Integer inventoryId;
    private Integer countingStock;
    private Integer profitLoss;
    private String  remarks;
    private InventoryCountingInfo inventoryCountingInfo;
    private InventoryInfo inventoryInfo ;
    private DrugBasicInformation drugBasicInformation;
}
