package com.gxa.service.impl.systemSettings;

import com.gxa.entity.systemSettings.PrescriptionTable;
import com.gxa.entity.systemSettings.SurchargeFee;
import com.gxa.mapper.systemSettings.SurchargeFeeMapper;
import com.gxa.service.systemSettings.SurchargeFeeiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurchargeFeeiServiceImpl implements SurchargeFeeiService {

    @Autowired
    private SurchargeFeeMapper surchargeFeeMapper;


    @Override
    public List<SurchargeFee> queryAll() {
        List<SurchargeFee>surchargeFees = this.surchargeFeeMapper.queryAll();
        return surchargeFees;
    }

    @Override
    public void addSurchargeFee(SurchargeFee surchargeFee) {
        this.surchargeFeeMapper.addSurchargeFee(surchargeFee);
    }

    @Override
    public void deleteById(Integer id) {
        this.surchargeFeeMapper.deleteById(id);
    }

    @Override
    public void updateSurchargeFee(SurchargeFee surchargeFee) {
        this.surchargeFeeMapper.updateSurchargeFee(surchargeFee);
    }



    @Override
    public List<SurchargeFee> queryByTj(String surchargename, String prescription) {
        List<SurchargeFee> surchargeFees = this.surchargeFeeMapper.queryByTj(surchargename,prescription);
        return surchargeFees;
    }




}
