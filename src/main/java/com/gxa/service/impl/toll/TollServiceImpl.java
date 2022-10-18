package com.gxa.service.impl.toll;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gxa.entity.tolls.Toll;
import com.gxa.entity.tolls.TollInquire;
import com.gxa.mapper.toll.TollMapper;
import com.gxa.service.toll.TollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;

@Service
public class TollServiceImpl implements TollService {
    @Autowired
    private TollMapper tollMapper;

    @Override
    public List<Toll> queryByInquire(Date firstTime, Date lastTime,TollInquire tollInquire) {
        String tollType = tollInquire.getTollType();
        Integer tollState = tollInquire.getTollState();
        String tollDateTime = tollInquire.getTollDateTime();
        String tollNameCard = tollInquire.getTollNameCard();
        List<Toll> tolls = this.tollMapper.queryByInquire(firstTime,lastTime,tollType,tollState,tollDateTime,tollNameCard);
        return tolls;
    }

    @Override
    public List<Toll> queryByInquires(TollInquire tollInquire) {
        String tollType = tollInquire.getTollType();
        Integer tollState = tollInquire.getTollState();
        String tollNameCard = tollInquire.getTollNameCard();
        List<Toll> tolls = this.tollMapper.queryByInquires(tollType,tollState,tollNameCard);
        return tolls;
    }



    @Override
    public void delete(String tollNumber) {
        QueryWrapper<Toll> wrapper = new QueryWrapper<>();
        wrapper.eq("toll_number",tollNumber);
        this.tollMapper.delete(wrapper);
    }

    @Override
    public void updateRefunds(String tollNumber) {
        this.tollMapper.updateRefunds(tollNumber);
    }


}

