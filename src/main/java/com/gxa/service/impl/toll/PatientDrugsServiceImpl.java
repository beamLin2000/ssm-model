package com.gxa.service.impl.toll;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gxa.entity.tolls.PatientDrugs;
import com.gxa.mapper.toll.PatientDrugsMapper;
import com.gxa.service.toll.PatientDrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientDrugsServiceImpl implements PatientDrugsService {
    @Autowired
    private PatientDrugsMapper patientDrugsMapper;

    @Override
    public PatientDrugs queryByTollId(Integer tollId) {
        QueryWrapper<PatientDrugs> wrapper = new QueryWrapper<>();
        wrapper.eq("toll_id",tollId);
        PatientDrugs patientDrugs = this.patientDrugsMapper.selectOne(wrapper);
        return patientDrugs;
    }
}
