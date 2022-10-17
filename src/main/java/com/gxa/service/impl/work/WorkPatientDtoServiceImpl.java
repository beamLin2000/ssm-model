package com.gxa.service.impl.work;

import com.gxa.dto.work.WorkPatientDto;
import com.gxa.mapper.work.WorkPatientDtoMapper;
import com.gxa.service.work.WorkPatientDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkPatientDtoServiceImpl implements WorkPatientDtoService {
    @Autowired
    private WorkPatientDtoMapper workPatientDtoMapper;

    @Override
    public WorkPatientDto queryWorkPatientDtoByPhoneNum(String idCard) {
        WorkPatientDto workPatientDto = this.workPatientDtoMapper.queryWorkPatientDtoByPhoneNum(idCard);
        return workPatientDto;
    }

    @Override
    public void updateStatus(String idCard) {
        this.workPatientDtoMapper.updateStatus(idCard);
    }
}
