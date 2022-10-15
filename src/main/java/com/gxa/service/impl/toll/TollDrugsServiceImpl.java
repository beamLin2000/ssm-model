package com.gxa.service.impl.toll;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gxa.entity.tolls.TollDrugs;
import com.gxa.mapper.toll.TollDrugsMapper;
import com.gxa.service.toll.TollDrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TollDrugsServiceImpl implements TollDrugsService {

    @Autowired
    private TollDrugsMapper tollDrugsMapper;

    @Override
    public TollDrugs queryByTollId(Integer tollId) {
        QueryWrapper<TollDrugs> wrapper = new QueryWrapper<>();
        wrapper.eq("toll_id",tollId);
        TollDrugs tollDrugs = this.tollDrugsMapper.selectOne(wrapper);
        return tollDrugs;
    }
}
