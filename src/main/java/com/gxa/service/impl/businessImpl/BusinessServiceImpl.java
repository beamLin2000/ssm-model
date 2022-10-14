package com.gxa.service.impl.businessImpl;

import com.gxa.entity.business.OutpatientRecordToday;
import com.gxa.mapper.business.BusinessMapper;
import com.gxa.service.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class BusinessServiceImpl implements BusinessService {
    @Autowired
    private BusinessMapper businessMapper;

    @Override
    public Double queryTodayRevenue(Date date) {
        Double aDouble = this.businessMapper.queryTodayRevenue(date);
        return aDouble;
    }

    @Override
    public Integer queryCountByToday(Date date, String status) {
        Integer integer = this.businessMapper.queryCountByToday(date, status);
        return integer;
    }

    @Override
    public List<Map> queryTotal(Date date, Integer days) {
        List<Map> list = new ArrayList<>();
        for (int i=0;i<days;i++){
            long time = date.getTime();
            long time1 = time-24*60*60*1000;
            date.setTime(time1);
            Map<String, Object> map = this.businessMapper.queryTotal(date, days);
            list.add(map);
        }

        return list;
    }

    @Override
    public List<OutpatientRecordToday> queryByToday(Date date) {
        List<OutpatientRecordToday> list = this.businessMapper.queryByToday(date);
        return list;
    }
}
