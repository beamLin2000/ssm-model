package com.gxa.service.impl.businessImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gxa.entity.business.Business;
import com.gxa.mapper.business.BusinessMapper;
import com.gxa.service.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.Date;
import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {
    @Autowired
    private BusinessMapper businessMapper;
    @Override
    @Transient
    public List<Business> queryAll(){
        List<Business> businesses = this.businessMapper.selectList(null);
        return businesses;
    }

    @Override
    public Integer queryCountByToday(Date date) {
        Integer integer = this.businessMapper.queryCountByToday(date);
        return integer;
    }

    @Override
    public Integer queryCountByToday(Date date, String status) {
        Integer integer = this.businessMapper.queryCountByToday(date, status);
        return integer;
    }
}
