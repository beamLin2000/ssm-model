package com.gxa.service.impl.businessImpl;

import com.gxa.entity.business.OutpatientRecordToday;
import com.gxa.mapper.business.BusinessMapper;
import com.gxa.service.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.*;

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
            Map<String, Object> map = this.businessMapper.queryTotal(date, days);
            System.out.println(map);
            if (map==null){
                Map<String, Object> map1 = new HashMap<>();
                map1.put("date",date);
                map1.put("money",0);
                list.add(map1);
            }else {
                list.add(map);
            }
            long time = date.getTime();
            long time1 = time-24*60*60*1000;
            date.setTime(time1);
        }

        return list;
    }

    @Override
    public List<OutpatientRecordToday> queryByToday(Date date) {
        List<OutpatientRecordToday> list = this.businessMapper.queryByToday(date);
        return list;
    }
}
