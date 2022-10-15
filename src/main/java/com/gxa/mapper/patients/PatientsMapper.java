package com.gxa.mapper.patients;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.patients.Patients;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface PatientsMapper extends BaseMapper<Patients> {
//    List<Patients> queryAll();
//    Patients queryByPhone(String patientPhone);
      List<Patients> queryByPhone(String patientPhone);
      List<Patients> queryByDateTime(@Param("firstTime") Date firstTime,@Param("lastTime") Date lastTime);
}
