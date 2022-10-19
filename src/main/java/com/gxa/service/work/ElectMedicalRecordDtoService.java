package com.gxa.service.work;

import com.gxa.dto.work.ElectMedicalRecordDto;

import java.util.Date;
import java.util.List;

public interface ElectMedicalRecordDtoService {
    List<ElectMedicalRecordDto> queryAllMedicalRecord(String idCard);
}
