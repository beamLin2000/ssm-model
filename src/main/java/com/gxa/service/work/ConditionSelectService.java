package com.gxa.service.work;

import com.gxa.dto.work.PatientDto;

import java.util.Date;
import java.util.List;

public interface ConditionSelectService {
    List<PatientDto> queryPatientByCondition(Date startTime,Date endTime,String status,String patientName);
}
