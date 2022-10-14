package com.gxa.service.business;

import com.gxa.entity.business.Business;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface BusinessService {
    List<Business> queryAll();
    Integer queryCountByToday(Date date);
    Integer queryCountByToday(@Param("date") Date date, @Param("status") String status);
}
