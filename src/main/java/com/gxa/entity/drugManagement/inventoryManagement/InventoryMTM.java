package com.gxa.entity.drugManagement.inventoryManagement;

import com.gxa.entity.drugManagement.inboundManagement.IOboundInfoAddArray;
import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfoArray;
import lombok.Data;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/18 0:01
 */
@Data
public class InventoryMTM {
    private Integer id;
    //库存单号集合
    private List<InventoryInfo> inventoryInfos;
    //库存数量集合
    private List<IOboundInfoAddArray> inventoryInfoArrays;
}
