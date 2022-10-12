package com.gxa.service.impl.register;

import com.gxa.entity.registration.Register;
import com.gxa.entity.registration.RegisterMsgUpdate;
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
        this.registerMapper.save(register);
    }

    @Override
    public RegisterMsgUpdate toUpdate(String registrationForm) {
        return this.registerMapper.toUpdate(registrationForm);
    }

    @Override
    public void update(RegisterMsgUpdate registerMsgUpdate) {
        this.registerMapper.update(registerMsgUpdate);
    }

    @Override
    public void delete(String registrationForm) {
        this.registerMapper.delete(registrationForm);
    }
}
