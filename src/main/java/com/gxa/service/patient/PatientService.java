package com.gxa.service.patient;

import com.gxa.entity.patients.Patients;


import java.util.Date;
import java.util.List;

public interface PatientService {
    List<Patients> queryAll();
    List<Patients> queryByPhone(String patientPhone);
    void add(Patients patients);
    Patients queryById(String patientCard);
    void update(Patients patients);
    void delete(String patientCard);
    List<Patients> queryByDateTime(Date firstTime,Date lastTime);
    List<Patients> queryByDateTimePhone(Date firstTime,Date lastTime,String patientPhone);


}
