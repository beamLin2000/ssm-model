package com.gxa.mapper.register;

import com.gxa.entity.registration.Register;
import com.gxa.entity.registration.RegisterMsg;
import com.gxa.entity.registration.RegisterQueryCondition;

public interface RegisterMapper {
    void save(Register register);
    RegisterMsg query(RegisterQueryCondition registerQueryCondition);
}
