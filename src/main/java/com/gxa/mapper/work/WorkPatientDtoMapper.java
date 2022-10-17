package com.gxa.mapper.work;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.work.WorkPatientDto;
import org.apache.ibatis.annotations.Param;

public interface WorkPatientDtoMapper extends BaseMapper<WorkPatientDto> {
    WorkPatientDto queryWorkPatientDtoByPhoneNum(@Param("idCard") String idCard);

    void updateStatus(String idCard);
}
