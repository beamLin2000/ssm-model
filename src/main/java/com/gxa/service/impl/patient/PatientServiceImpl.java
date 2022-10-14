package com.gxa.service.impl.patient;

import com.gxa.entity.patients.Patients;
import com.gxa.mapper.patients.PatientsMapper;
import com.gxa.service.patient.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientsMapper patientsMapper;
    @Override
    public List<Patients> queryAll() {
        List<Patients> patients = this.patientsMapper.queryAll();
        return patients;
    }

    @Override
    public void patientAdd(Patients patients) {

    }

    @Override
    public void tpPatientUpdate(Integer patient_id) {

    }

    @Override
    public void patientUpdate(Patients patients) {

    }
}
