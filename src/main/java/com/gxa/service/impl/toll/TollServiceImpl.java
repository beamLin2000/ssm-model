package com.gxa.service.impl.toll;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gxa.entity.tolls.Toll;
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
    public List<Toll> queryByTollState(Integer tollState) {
        QueryWrapper<Toll> wrapper = new QueryWrapper<>();
        wrapper.eq("toll_state",tollState);
        List<Toll> tolls = this.tollMapper.selectList(wrapper);
        return tolls;
    }

    @Override
    public List<Toll> queryByTollName(String tollName) {
        QueryWrapper<Toll> wrapper = new QueryWrapper<>();
        wrapper.eq("toll_name",tollName);
        List<Toll> tolls = this.tollMapper.selectList(wrapper);
        return tolls;
    }

    @Override
    public void delete(Integer tollId) {
        QueryWrapper<Toll> wrapper = new QueryWrapper<>();
        wrapper.eq("toll_id",tollId);
        this.tollMapper.delete(wrapper);
    }

    @Override
    public List<Toll> queryByTollNumberName(String tollNumberName,Integer tollState) {
        List<Toll> tolls = this.tollMapper.queryByTollNumberName(tollNumberName,tollState);
        return tolls;
    }

    @Override
    public List<Toll> queryByDateTime(Date firstTime, Date lastTime) {
        List<Toll> tolls = this.tollMapper.queryByDateTime(firstTime,lastTime);
        return tolls;
    }
}
