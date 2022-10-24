package com.gxa.service.impl.work;

import com.gxa.dto.work.PhysicalDto;
import com.gxa.mapper.work.PhysicalDtoMapper;
import com.gxa.service.work.PhysicalDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PhysicalDtoServiceImpl implements PhysicalDtoService {

    @Autowired
    private PhysicalDtoMapper physicalDtoMapper;

    @Override
    public PhysicalDto queryPhysicalDtoByIdCard(String idCard) {
        PhysicalDto physicalDto = this.physicalDtoMapper.queryPhysicalDtoByIdCard(idCard);
        return physicalDto;
    }
}
