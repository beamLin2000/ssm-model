package com.gxa.service.impl.systemSettings;

import com.gxa.entity.systemSettings.TreatmentFee;
import com.gxa.mapper.systemSettings.TreatmentFeeMapper;
import com.gxa.service.systemSettings.TreatmentFeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreatmentFeeServiceImpl implements TreatmentFeeService {

    @Autowired
    private TreatmentFeeMapper treatmentFeeMapper;

    @Override
    public List<TreatmentFee> queryAll() {
        List<TreatmentFee> treatmentFees = this.treatmentFeeMapper.queryAll();
        return treatmentFees;
    }

    @Override
    public List<TreatmentFee> queryByTreatment(String treatment) {
        List<TreatmentFee> treatmentFees = this.treatmentFeeMapper.queryByTreatment(treatment);
        return treatmentFees;
    }

    @Override
    public void addTreatmentFee(TreatmentFee treatmentFee) {
        this.treatmentFeeMapper.addTreatmentFee(treatmentFee);
    }

    @Override
    public void updateTreatmentFee(TreatmentFee treatmentFee) {
        this.treatmentFeeMapper.updateTreatmentFee(treatmentFee);
    }

    @Override
    public void deleteTreatmentFee(Integer id) {
        this.treatmentFeeMapper.deleteTreatmentFee(id);
    }
}
