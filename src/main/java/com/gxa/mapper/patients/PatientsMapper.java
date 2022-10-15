package com.gxa.mapper.patients;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.patients.Patients;

import java.util.Date;
import java.util.List;

public interface PatientsMapper extends BaseMapper<Patients> {
//    List<Patients> queryAll();
//    Patients queryByPhone(String patientPhone);
      List<Patients> queryByPhone(String patientPhone);
      List<Patients> queryByDateTime(Date firstTime, Date lastTime);
}
