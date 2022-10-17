package com.gxa.mapper.systemSettings;

import com.gxa.entity.systemSettings.RegisterFee;

import java.util.List;

public interface RegisterFeeMapper {
    List<RegisterFee>qeryAll();
    List<RegisterFee>queryByRegisterName(String registerName);
    void addRegisterFee(RegisterFee registerFee);
    void updateRegisterFee(RegisterFee registerFee);
    void deleteRegisterFee(Integer id);

}
