package com.gxa.mapper.register;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.registration.Register;
import com.gxa.entity.registration.RegisterMsg;
import com.gxa.entity.registration.RegisterMsgUpdate;
import com.gxa.entity.registration.RegisterQueryCondition;

public interface RegisterMapper{
    void saveRegister(Register register);
    void saveCharge(Register register);
    void savePatient(Register register);
    RegisterMsgUpdate toUpdate(String registrationForm);
    void updateRegister(RegisterMsgUpdate registerMsgUpdate);
    void updatePatient(RegisterMsgUpdate registerMsgUpdate);
    RegisterMsg query(RegisterQueryCondition registerQueryCondition);
    void deleteCharge(String registrationForm);
    void deletePatient(String registrationForm);
    void deleteRegister(String registrationForm);
    Integer count(RegisterQueryCondition registerQueryCondition);
}
