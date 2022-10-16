package com.gxa.service.drugManagement.inboundManagement.impl;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.entity.drugManagement.inboundManagement.InboundInfoAddArray;
import com.gxa.service.drugManagement.inboundManagement.InboundManagerOtherService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/16 17:44
 */
@Service
public class InboundManagerOtherServiceImpl implements InboundManagerOtherService {

    @Override
    public List<BasicInfo> queryAllInboundType() {
        return null;
    }

    @Override
    public List<BasicInfo> queryAllWarehousingPersonnel() {
        return null;
    }

    @Override
    public List<InboundInfoAddArray> queryAddPre() {
        return null;
    }

    @Override
    public List<InboundInfoAddArray> search(String drugType, String rules) {
        return null;
    }

    @Override
    public List<BasicInfo> queryAllManufacture() {
        return null;
    }
}
