package com.gxa.service.register;

import com.gxa.entity.registration.*;

import java.util.List;

public interface RegisterService {
    void add(Register register);
    RegisterMsgUpdate toUpdate(String registrationForm);
    void update(RegisterUpdate registerUpdate);
    void delete(String registrationForm);
    List<RegisterMsg> query(RegisterQueryCondition registerQueryCondition);
    Integer count(RegisterQueryCondition registerQueryCondition);
}
