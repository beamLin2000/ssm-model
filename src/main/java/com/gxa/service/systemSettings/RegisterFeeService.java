package com.gxa.service.systemSettings;

import com.gxa.entity.systemSettings.RegisterFee;

import java.util.List;

public interface RegisterFeeService {
    List<RegisterFee>queryAll();
    List<RegisterFee>queryByRegisterName(String registerName);
    void addRegisterFee(RegisterFee registerFee);
    void updateRegisterFee(RegisterFee registerFee);
    void deleteRegisterFee(Integer id);
}
