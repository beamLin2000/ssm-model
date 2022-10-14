package com.gxa.service.impl.systemSettings;

import com.gxa.entity.systemSettings.TreatmentFee;
import com.gxa.mapper.systemSettings.TreatmentFeeMapper;
import com.gxa.service.systemSettings.TreatmentFeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreatmentFeeServiceImpl implements TreatmentFeeService {

    private TreatmentFeeMapper treatmentFeeMapper;

    @Override
    public List<TreatmentFee> queryAll() {
        List<TreatmentFee> treatmentFees = this.treatmentFeeMapper.queryAll();
        return treatmentFees;
    }
}
