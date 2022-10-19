package com.gxa.service.impl.businessImpl;

import com.gxa.entity.business.DayAndMoney;
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
    public List<DayAndMoney> queryTotal(Date date, Integer days) {
        List<DayAndMoney> list = new ArrayList<>();
        long time1 = 0;
        for (int i=0;i<days;i++){
            Date date1 = new Date();
            long time = date.getTime();

            if(i==0){
                time1 = time;
            }else {
                time1= time-24*60*60*1000;
            }
            date.setTime(time1);
            date1.setTime(time1);
            Double aDouble = this.businessMapper.queryTotal(date, days);
            if (aDouble==null){
               aDouble=0.0;
            }
            DayAndMoney dayAndMoney = new DayAndMoney(date1,aDouble);
            list.add(i,dayAndMoney);

            System.out.println(date);
        }
        System.out.println(list.get(3).getDate());

        return list;
    }

    @Override
    public List<OutpatientRecordToday> queryByToday(Date date) {
        List<OutpatientRecordToday> list = this.businessMapper.queryByToday(date);
        return list;
    }
}
