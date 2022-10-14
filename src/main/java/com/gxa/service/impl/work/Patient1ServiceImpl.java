package com.gxa.service.impl.work;

import com.gxa.entity.patients.Patients;
import com.gxa.mapper.work.Patient1Mapper;
import com.gxa.service.work.Patient1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Patient1ServiceImpl implements Patient1Service {

    @Autowired
    private Patient1Mapper patient1Mapper;
    @Override
    public List<Patients> queryAllPatient1() {

        List<Patients> patient1s = this.patient1Mapper.selectList(null);

        return patient1s;
    }
}
