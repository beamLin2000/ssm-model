package com.gxa.mapper.drugManagement.inventoryManagement;

import com.gxa.entity.drugManagement.inboundManagement.IOboundInfoAddArray;
import com.gxa.entity.drugManagement.inboundManagement.InboundInfo;
import com.gxa.entity.drugManagement.inventoryManagement.InventoryInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/17 15:54
 */
public interface InventoryManagerMapper {
    //库存管理显示列表
//    List<InventoryInfo> queryAll();

    //搜索功能以及主页显示列表
    List<InventoryInfo> search(@Param("drugType") String drugType,
                               @Param("rules") String rules);

    //
    List<IOboundInfoAddArray>queryReceiptNo(@Param("code") String code);
    //查询单号明细main
    InventoryInfo queryMainHead(@Param("code") String code);
    //查询数量明细
    List<InboundInfo> queryDetailNumber(@Param("code") String code);
}
