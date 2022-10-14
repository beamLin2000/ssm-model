package com.gxa.service.impl.register;

import com.gxa.entity.registration.Register;
import com.gxa.mapper.register.RegisterMapper;
import com.gxa.service.register.ChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChargerServiceImpl implements ChargeService{
    @Autowired
    private RegisterMapper registerMapper;

    @Override
    public void add(Register register) {
        this.registerMapper.saveCharge(register);
    }
}
