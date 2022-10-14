package com.gxa.service.business;

import com.gxa.entity.business.Business;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface BusinessService {
    List<Business> queryAll();
    void queryCountByToday(Date date);
    void queryCountByToday(@Param("date") Date date, @Param("status") String status);
}
