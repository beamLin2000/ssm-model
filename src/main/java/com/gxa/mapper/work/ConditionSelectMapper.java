package com.gxa.mapper.work;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.work.PatientDto;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ConditionSelectMapper extends BaseMapper<PatientDto> {

    List<PatientDto> selectByCondition(@Param("startDate") Date startDate,@Param("endDate") Date endDate, @Param("status") String status, @Param("patientName") String patientName);
}
