package com.gxa.service.impl.work;

import com.gxa.dto.WorkPatientDto;
import com.gxa.mapper.work.WorkPatientDtoMapper;
import com.gxa.service.work.WorkPatientDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkPatientDtoServiceImpl implements WorkPatientDtoService {
    @Autowired
    private WorkPatientDtoMapper workPatientDtoMapper;

    @Override
    public WorkPatientDto queryWorkPatientDtoByPhoneNum(String phoneNum,String status) {
        WorkPatientDto workPatientDto = this.workPatientDtoMapper.queryWorkPatientDtoByPhoneNum(phoneNum,status);
        return workPatientDto;
    }

    @Override
    public void addPatientInfo() {

    }

    @Override
    public void addPatientPhyInfo() {

    }

    @Override
    public void addPatientMedInfo() {

    }

    @Override
    public void addPatientInsInfo() {

    }

    @Override
    public void addPatientDrugInfo() {

    }

    @Override
    public void addPatientCDrugInfo() {

    }
}
