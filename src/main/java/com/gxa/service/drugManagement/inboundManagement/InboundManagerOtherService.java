package com.gxa.service.drugManagement.inboundManagement;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.entity.drugManagement.inboundManagement.InboundInfoAddArray;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/16 17:44
 */
public interface InboundManagerOtherService {
    //入库类型查询
    List<BasicInfo> queryAllInboundType();
    //入库人员
    List<BasicInfo> queryAllWarehousingPersonnel();
    //添加药品前查询列表
    List<InboundInfoAddArray> queryAddPre();
    //搜索药品
    List<InboundInfoAddArray> search(String drugType,String rules);
    //供应商
    List<BasicInfo> queryAllManufacture();
}
