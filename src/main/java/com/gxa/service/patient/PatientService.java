package com.gxa.service.patient;

import com.gxa.entity.patients.Patients;

import java.util.List;

public interface PatientService {
    List<Patients> queryAll();
    void patientAdd(Patients patients);
    void tpPatientUpdate(Integer patient_id);
    void patientUpdate(Patients patients);
}
