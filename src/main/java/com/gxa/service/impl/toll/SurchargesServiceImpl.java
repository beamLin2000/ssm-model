package com.gxa.service.impl.toll;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.gxa.entity.tolls.Surcharges;
import com.gxa.mapper.toll.SurchargesMapper;
import com.gxa.service.toll.SurchargesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SurchargesServiceImpl implements SurchargesService {
    @Autowired
    private SurchargesMapper surchargesMapper;
    @Override
    public List<Surcharges> queryByTollId(String tollNumber) {
        QueryWrapper<Surcharges> wrapper = new QueryWrapper<>();
        wrapper.eq("toll_number",tollNumber);
        List<Surcharges> surcharges = this.surchargesMapper.selectList(wrapper);
        return surcharges;
    }
}
