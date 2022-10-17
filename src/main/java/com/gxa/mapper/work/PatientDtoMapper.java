package com.gxa.mapper.work;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.work.PatientDto;

import java.util.List;

public interface PatientDtoMapper extends BaseMapper<PatientDto> {

    List<PatientDto> queryAllPatientDto();
}
