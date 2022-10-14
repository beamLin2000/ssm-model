package com.gxa.service.impl.register;

import com.gxa.entity.registration.Register;
import com.gxa.entity.registration.RegisterMsg;
import com.gxa.entity.registration.RegisterMsgUpdate;
import com.gxa.entity.registration.RegisterQueryCondition;
import com.gxa.mapper.register.RegisterMapper;
import com.gxa.service.register.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterMapper registerMapper;
    @Override
    public void add(Register register) {
        this.registerMapper.saveRegister(register);
        this.registerMapper.savePatient(register);
        this.registerMapper.saveCharge(register);
    }

    @Override
    public RegisterMsgUpdate toUpdate(String registrationForm) {
        return this.registerMapper.toUpdate(registrationForm);
    }

    @Override
    public void update(RegisterMsgUpdate registerMsgUpdate) {
        this.registerMapper.updateRegister(registerMsgUpdate);
        this.registerMapper.updatePatient(registerMsgUpdate);
    }

    @Override
    public void delete(String registrationForm) {
        this.registerMapper.deletePatient(registrationForm);
        this.registerMapper.deleteCharge(registrationForm);
        this.registerMapper.deleteRegister(registrationForm);
    }

    @Override
    public RegisterMsg query(RegisterQueryCondition registerQueryCondition) {
        return this.registerMapper.query(registerQueryCondition);
    }

    @Override
    public Integer count(RegisterQueryCondition registerQueryCondition) {
        return this.registerMapper.count(registerQueryCondition);
    }

}
