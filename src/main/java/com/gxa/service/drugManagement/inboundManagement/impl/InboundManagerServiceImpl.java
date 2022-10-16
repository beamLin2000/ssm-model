package com.gxa.service.drugManagement.inboundManagement.impl;

import com.gxa.entity.drugManagement.inboundManagement.InboundInfo;
import com.gxa.service.drugManagement.inboundManagement.InboundManagerService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/16 16:54
 */
@Service
public class InboundManagerServiceImpl implements InboundManagerService {
    @Override
    public List<InboundInfo> queryAll() {
        return null;
    }

    @Override
    public InboundInfo queryById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public List<InboundInfo> search(String auditStatus, String receiptType, String rules) {
        return null;
    }

    @Override
    public void save(InboundInfo inboundInfo) {

    }
}
