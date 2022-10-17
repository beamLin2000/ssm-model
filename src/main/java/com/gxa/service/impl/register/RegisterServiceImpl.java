package com.gxa.service.impl.register;

import com.gxa.entity.registration.*;
import com.gxa.mapper.register.RegisterMapper;
import com.gxa.service.register.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterMapper registerMapper;
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
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
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void update(RegisterUpdate registerUpdate) {
        this.registerMapper.updateRegister(registerUpdate);
        this.registerMapper.updatePatient(registerUpdate);
    }
    @Override
    public void delete(String registrationForm) {
        this.registerMapper.updateRegisterStatus(registrationForm);
    }
    @Override
    public List<RegisterMsg> query(RegisterQueryCondition registerQueryCondition) {
       return this.registerMapper.query(registerQueryCondition);
    }
    @Override
    public Integer count(RegisterQueryCondition registerQueryCondition) {
        return this.registerMapper.count(registerQueryCondition);
    }
}
