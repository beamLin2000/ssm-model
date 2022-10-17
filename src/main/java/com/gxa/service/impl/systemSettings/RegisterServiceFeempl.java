package com.gxa.service.impl.systemSettings;

import com.gxa.entity.systemSettings.RegisterFee;
import com.gxa.mapper.systemSettings.RegisterFeeMapper;
import com.gxa.service.systemSettings.RegisterFeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterServiceFeempl implements RegisterFeeService {
    @Autowired
    private RegisterFeeMapper registerFeeMapper;


    @Override
    public List<RegisterFee> queryAll() {
        List<RegisterFee> registerFees = this.registerFeeMapper.qeryAll();
        return registerFees;
    }

    @Override
    public List<RegisterFee> queryByRegisterName(String registerName) {
        List<RegisterFee> registerFees = this.registerFeeMapper.queryByRegisterName(registerName);
        return registerFees;
    }

    @Override
    public void addRegisterFee(RegisterFee registerFee) {
        this.registerFeeMapper.addRegisterFee(registerFee);
    }

    @Override
    public void updateRegisterFee(RegisterFee registerFee) {
        this.registerFeeMapper.updateRegisterFee(registerFee);
    }

    @Override
    public void deleteRegisterFee(Integer id) {
        this.registerFeeMapper.deleteRegisterFee(id);
    }
}
