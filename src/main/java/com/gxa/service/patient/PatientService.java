package com.gxa.service.patient;

import com.gxa.entity.patients.Patients;

public interface PatientService {
    void patientAdd(Patients patients);
    void tpPatientUpdate(Integer patient_id);
    void patientUpdate(Patients patients);
}
