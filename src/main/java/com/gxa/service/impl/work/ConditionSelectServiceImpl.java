package com.gxa.service.impl.work;

import com.gxa.dto.work.PatientDto;
import com.gxa.mapper.work.ConditionSelectMapper;
import com.gxa.service.work.ConditionSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Service
@Transactional
public class ConditionSelectServiceImpl implements ConditionSelectService {
    @Autowired
    private ConditionSelectMapper selectMapper;
    @Override
    public List<PatientDto> queryPatientByCondition(Date startTime, Date endTime, String status, String patientName) {

        List<PatientDto> patientDtos = this.selectMapper.selectByCondition(startTime,endTime,status,patientName);

        return patientDtos;
    }
}
