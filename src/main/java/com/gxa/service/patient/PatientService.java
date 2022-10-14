package com.gxa.service.patient;

import com.gxa.entity.patients.Patients;
import com.gxa.utils.R;

import java.util.List;

public interface PatientService {
    List<Patients> queryAll();
    List<Patients> queryByPhone(String patientPhone);
    void add(Patients patients);
    Patients queryById(Integer patientId);
    void update(Patients patients);
    void delete(Integer patientId);


}
