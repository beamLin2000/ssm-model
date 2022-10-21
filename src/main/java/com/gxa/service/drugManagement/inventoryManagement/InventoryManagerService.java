package com.gxa.service.drugManagement.inventoryManagement;

import com.gxa.entity.drugManagement.inboundManagement.IOboundInfoAddArray;
import com.gxa.entity.drugManagement.inventoryManagement.InventoryInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/17 15:51
 */
public interface InventoryManagerService {
    InventoryInfo queryIOboundInfoAddArrayById(Integer ioboundInfoId,String code);
    //搜索
    List<InventoryInfo> search(String drugType, String rules);

}
