package com.gxa.service.drugManagement.inboundManagement.impl;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.entity.drugManagement.inventoryManagement.InventoryInfo;
import com.gxa.mapper.drugManagement.inboundManagement.InboundManagerOtherMapper;
import com.gxa.mapper.drugManagement.inventoryManagement.InventoryManagerMapper;
import com.gxa.service.drugManagement.inboundManagement.InboundManagerOtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/16 17:44
 */
@Service
public class InboundManagerOtherServiceImpl implements InboundManagerOtherService {

    @Autowired
    private InventoryManagerMapper inventoryManagerMapper;
    @Autowired
    private InboundManagerOtherMapper inboundManagerOtherMapper;
    @Override//类型
    public List<BasicInfo> queryAllInboundType(Integer typeId) {
        return inboundManagerOtherMapper.queryAllInboundType(typeId);
    }

    @Override
    public List<BasicInfo> queryAllWarehousingPersonnel() {
        List<BasicInfo> basicInfos = inboundManagerOtherMapper.queryAllWarehousingPersonnel();
        return basicInfos;
    }

    @Override
    public List<BasicInfo> queryAllManufacture() {
        return inboundManagerOtherMapper.queryAllManufacture();
    }


    @Override
    public List<InventoryInfo> search(String drugType, String rules) {
        return inventoryManagerMapper.search(drugType,rules);
    }


}
