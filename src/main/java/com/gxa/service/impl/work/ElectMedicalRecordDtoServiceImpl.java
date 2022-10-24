package com.gxa.service.impl.work;

import com.gxa.dto.work.ElectMedicalRecordDto;
import com.gxa.mapper.work.ElectMedicalRecordDtoMapper;
import com.gxa.service.work.ElectMedicalRecordDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Service
@Transactional
public class ElectMedicalRecordDtoServiceImpl implements ElectMedicalRecordDtoService {
    @Autowired
    private ElectMedicalRecordDtoMapper electMedicalRecordDtoMapper;

    @Override
    public List<ElectMedicalRecordDto> queryAllMedicalRecord(String idCard) {
        List<ElectMedicalRecordDto> electMedicalRecordDtos = this.electMedicalRecordDtoMapper.queryAllMedicalRecord(idCard);
        System.out.println(electMedicalRecordDtos);
        return electMedicalRecordDtos;
    }
}
