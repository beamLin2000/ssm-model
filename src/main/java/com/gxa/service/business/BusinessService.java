package com.gxa.service.business;

import com.gxa.entity.business.DayAndMoney;
import com.gxa.entity.business.OutpatientRecordToday;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface BusinessService {
    Integer queryCountByToday(@Param("date") Date date, @Param("status") String status);
    Double queryTodayRevenue (Date date);
    List<DayAndMoney> queryTotal(@Param("date") Date date, @Param("days") Integer days);
    List<OutpatientRecordToday> queryByToday(Date date);
}
