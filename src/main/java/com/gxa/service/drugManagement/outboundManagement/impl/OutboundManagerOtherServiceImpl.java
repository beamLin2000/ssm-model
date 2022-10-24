package com.gxa.service.drugManagement.outboundManagement.impl;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.entity.drugManagement.inboundManagement.IOboundInfoAddArray;
import com.gxa.entity.drugManagement.inventoryManagement.InventoryInfo;
import com.gxa.mapper.drugManagement.outboundManagement.OutboundManagerOtherMapper;
import com.gxa.service.drugManagement.outboundManagement.OutboundManagerOtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/16 17:44
 */
@Service
public class OutboundManagerOtherServiceImpl implements OutboundManagerOtherService {

    @Autowired
    private OutboundManagerOtherMapper outboundManagerOtherMapper;
    @Override
    public List<BasicInfo> queryAllOutboundType(Integer id) {
        List<BasicInfo> basicInfos = outboundManagerOtherMapper.queryAllOutboundType(id);
        return basicInfos;
    }

    @Override
    public List<BasicInfo> queryAllWarehousingPersonnel() {
        List<BasicInfo> basicInfos = outboundManagerOtherMapper.queryAllWarehousingPersonnel();
        return basicInfos;
    }


    @Override
    public List<IOboundInfoAddArray> search(String drugType, String rules) {
        return null;
    }


}
