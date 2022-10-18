package com.gxa.service.impl.toll;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gxa.entity.tolls.TollFinish;
import com.gxa.mapper.toll.TollFinshMapper;
import com.gxa.mapper.toll.TollMapper;
import com.gxa.service.toll.TollFinshService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TollFinshServiceImpl implements TollFinshService {
    @Autowired
    private TollFinshMapper tollFinshMapper;
    @Autowired
    private TollMapper tollMapper;

    @Override
    public void addFinish(TollFinish tollFinish) {

        String  tollNumber = tollFinish.getRegistrationForm();
        String tollFinishManner = tollFinish.getPayMethod();
        this.tollFinshMapper.insert(tollFinish);
        this.tollMapper.add(tollNumber,tollFinishManner);
        this.tollMapper.updateByState(tollNumber);
    }

    @Override
    public TollFinish queryByTollId(String tollNumber) {
        QueryWrapper<TollFinish> wrapper = new QueryWrapper<>();
        wrapper.eq("registration_form",tollNumber);
        TollFinish tollFinish = this.tollFinshMapper.selectOne(wrapper);
        return tollFinish;
    }
}
