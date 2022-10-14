package com.gxa.service.impl.register;

import com.gxa.entity.registration.Register;
import com.gxa.mapper.register.RegisterMapper;
import com.gxa.service.register.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private RegisterMapper registerMapper;
    @Override
    public void add(Register register) {
        this.registerMapper.savePatient(register);
    }
}
