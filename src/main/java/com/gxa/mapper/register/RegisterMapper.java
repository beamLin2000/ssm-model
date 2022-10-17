package com.gxa.mapper.register;

import com.gxa.entity.registration.*;

import java.util.List;

public interface RegisterMapper{
    void saveRegister(Register register);
    void saveCharge(Register register);
    void savePatient(Register register);
    RegisterMsgUpdate toUpdate(String registrationForm);
    void updateRegister(RegisterUpdate registerUpdate);
    void updatePatient(RegisterUpdate registerUpdate);
    List<RegisterMsg> query(RegisterQueryCondition registerQueryCondition);
    void updateRegisterStatus(String registrationForm);
    Integer count(RegisterQueryCondition registerQueryCondition);
}
