package com.gxa.mapper.work;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.WorkPatientDto;
import org.apache.ibatis.annotations.Param;

public interface WorkPatientDtoMapper extends BaseMapper<WorkPatientDto> {
    WorkPatientDto queryWorkPatientDtoByPhoneNum(@Param("phoneNum") String phoneNum, @Param("status") String status);
}
