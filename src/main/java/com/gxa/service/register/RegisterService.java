package com.gxa.service.register;

import com.gxa.entity.registration.Register;
import com.gxa.entity.registration.RegisterMsgUpdate;

public interface RegisterService {
    void add(Register register);

    RegisterMsgUpdate toUpdate(String registrationForm);
    void update(RegisterMsgUpdate registerMsgUpdate);

    void delete(String registrationForm);
}
