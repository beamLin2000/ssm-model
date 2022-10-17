package com.gxa.mapper.work;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.work.MedicalRecordDto;

public interface MedicalRecordDtoMapper extends BaseMapper<MedicalRecordDto> {
    MedicalRecordDto queryMedicalRecordDtoByIdCard(String idCard);
}
