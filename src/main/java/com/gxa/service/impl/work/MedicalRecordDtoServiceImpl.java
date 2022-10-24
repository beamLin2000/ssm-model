package com.gxa.service.impl.work;

import com.gxa.dto.work.MedicalRecordDto;
import com.gxa.mapper.work.MedicalRecordDtoMapper;
import com.gxa.service.work.MedicalRecordDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class MedicalRecordDtoServiceImpl implements MedicalRecordDtoService {

    @Autowired
    private MedicalRecordDtoMapper medicalRecordDtoMapper;

    @Override
    public MedicalRecordDto queryMedicalRecordDtoByIdCard(String idCard) {
        MedicalRecordDto medicalRecordDto = this.medicalRecordDtoMapper.queryMedicalRecordDtoByIdCard(idCard);
        return medicalRecordDto;
    }
}
