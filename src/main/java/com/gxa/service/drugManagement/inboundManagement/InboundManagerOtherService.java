package com.gxa.service.drugManagement.inboundManagement;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.entity.drugManagement.inventoryManagement.InventoryInfo;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/16 17:44
 */
public interface InboundManagerOtherService {
    //入库类型查询
    List<BasicInfo> queryAllInboundType(Integer typeId);
    //入库人员
    List<BasicInfo> queryAllWarehousingPersonnel();
    //供应商
    List<BasicInfo> queryAllManufacture();

    //添加药品前查询列表
//    List<InventoryInfo> queryAddPre();
    //搜索药品/查询所有
    List<InventoryInfo> search(String drugType,String rules);

}
