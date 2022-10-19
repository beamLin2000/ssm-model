package com.gxa.mapper.work;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.work.ElectMedicalRecordDto;

import java.util.List;

public interface ElectMedicalRecordDtoMapper extends BaseMapper<ElectMedicalRecordDto> {
        List<ElectMedicalRecordDto> queryAllMedicalRecord(String idCard);
}
