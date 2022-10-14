package com.gxa.service.register;

import com.gxa.entity.registration.Register;
import com.gxa.entity.registration.RegisterMsg;
import com.gxa.entity.registration.RegisterMsgUpdate;
import com.gxa.entity.registration.RegisterQueryCondition;

public interface RegisterService {
    void add(Register register);

    RegisterMsgUpdate toUpdate(String registrationForm);
    void update(RegisterMsgUpdate registerMsgUpdate);

    void delete(String registrationForm);
    RegisterMsg query(RegisterQueryCondition registerQueryCondition);
    Integer count(RegisterQueryCondition registerQueryCondition);
}
