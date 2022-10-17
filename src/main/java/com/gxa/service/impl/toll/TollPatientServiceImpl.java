package com.gxa.service.impl.toll;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gxa.entity.tolls.TollPatient;
import com.gxa.mapper.toll.TollPatientMapper;
import com.gxa.service.toll.TollPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TollPatientServiceImpl implements TollPatientService {

    @Autowired
    private TollPatientMapper tollPatientMapper;

    @Override
    public TollPatient queryByTollId(String tollNumber) {
        QueryWrapper<TollPatient> wrapper = new  QueryWrapper<>();
        wrapper.eq("toll_number",tollNumber);

        TollPatient tollPatient = this.tollPatientMapper.selectOne(wrapper);
        return tollPatient;
    }
}
