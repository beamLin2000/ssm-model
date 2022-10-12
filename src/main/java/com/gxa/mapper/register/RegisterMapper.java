package com.gxa.mapper.register;

import com.gxa.entity.registration.Register;
import com.gxa.entity.registration.RegisterMsg;
import com.gxa.entity.registration.RegisterMsgUpdate;
import com.gxa.entity.registration.RegisterQueryCondition;

public interface RegisterMapper {
    void saveRegister(Register register);
    void saveCharge(Register register);
    void savePatient(Register register);
    RegisterMsgUpdate toUpdate(String registrationForm);
    void update(RegisterMsgUpdate registerMsgUpdate);
    RegisterMsg query(RegisterQueryCondition registerQueryCondition);
    void delete(String registrationForm);
}
