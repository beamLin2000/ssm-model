package com.gxa.service.impl.work;

import com.gxa.dto.work.PatientDto;
import com.gxa.mapper.work.PatientDtoMapper;
import com.gxa.service.work.PatientDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientDtoServiceImpl implements PatientDtoService {

    @Autowired
    private PatientDtoMapper patientDtoMapper;
    @Override
    public List<PatientDto> queryAllPatientDto() {
        List<PatientDto> patientDtos = this.patientDtoMapper.queryAllPatientDto();
        return patientDtos;
    }
}
