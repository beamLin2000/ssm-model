package com.gxa.service.impl.patient;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.gxa.entity.patients.Patients;
import com.gxa.mapper.patients.PatientsMapper;
import com.gxa.service.patient.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientsMapper patientsMapper;
    @Override
    public List<Patients> queryAll() {
//        List<Patients> patients = this.patientsMapper.queryAll();
//        return patients;


        List<Patients> patients = this.patientsMapper.selectList(null);
        return patients;
    }

    @Override
    public List<Patients> queryByPhone(String patientPhone) {
//        Patients patients = this.patientsMapper.queryByPhone(patientPhone);

        List<Patients> patients = this.patientsMapper.queryByPhone(patientPhone);


        return patients;
    }

    @Override

    public void add(Patients patients) {
        patientsMapper.insert(patients);
    }

    @Override
    public Patients queryById(String patientCard) {
        QueryWrapper<Patients> wrapper = new QueryWrapper<>();
        wrapper.eq("patient_card",patientCard);
        Patients patients = this.patientsMapper.selectOne(wrapper);
        return patients;
    }

    @Override
    public void update(Patients patients) {
        UpdateWrapper<Patients> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("patient_id",patients.getPatientId());
        patientsMapper.update(patients,updateWrapper);
    }

    @Override
    public void delete(String patientCard) {
        QueryWrapper<Patients> wrapper = new QueryWrapper<>();
        wrapper.eq("patient_card",patientCard);
        patientsMapper.delete(wrapper);
    }

    @Override
    public List<Patients> queryByDateTime(Date firstTime, Date lastTime) {
        List<Patients> patients = this.patientsMapper.queryByDateTime(firstTime,lastTime);
        return patients;
    }

    @Override
    public List<Patients> queryByDateTimePhone(Date firstTime, Date lastTime, String patientPhone) {
        List<Patients> patients = this.patientsMapper.queryByDateTimePhone(firstTime,lastTime,patientPhone);
        return patients;
    }


}
