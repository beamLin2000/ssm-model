package com.gxa.service.impl.toll;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gxa.entity.tolls.TollDrugs;
import com.gxa.mapper.toll.TollDrugsMapper;
import com.gxa.service.toll.TollDrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TollDrugsServiceImpl implements TollDrugsService {

    @Autowired
    private TollDrugsMapper tollDrugsMapper;

    @Override
    public List<TollDrugs> queryByTollId(String tollNumber) {
        QueryWrapper<TollDrugs> wrapper = new QueryWrapper<>();
        wrapper.eq("toll_number",tollNumber);
        List<TollDrugs> tollDrugs = this.tollDrugsMapper.selectList(wrapper);
        return tollDrugs;
    }

    @Override
    public List<TollDrugs> queryByTollVer(String tollDrugsVer,String tollNumber) {
        List<TollDrugs> tollDrugs = this.tollDrugsMapper.queryByTollVer(tollDrugsVer,tollNumber);
        return tollDrugs;
    }
}
