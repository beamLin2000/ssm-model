package com.gxa.service.work;

import com.gxa.dto.work.MedicalRecordDto;

public interface MedicalRecordDtoService {
    MedicalRecordDto queryMedicalRecordDtoByIdCard(String idCard);
}
