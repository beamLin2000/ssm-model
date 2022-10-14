package com.gxa.service.work;

import com.gxa.dto.PatientDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PatientDtoService {
    List<PatientDto> queryAllPatientDto();
}
