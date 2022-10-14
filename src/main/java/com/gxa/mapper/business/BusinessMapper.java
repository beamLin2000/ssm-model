package com.gxa.mapper.business;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.business.Business;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface BusinessMapper extends BaseMapper<Business> {
    Integer queryCountByToday(Date date);
    Integer queryCountByToday(@Param("date") Date date,@Param("status") String status);

    Double queryTodayRevenue (Date date);
}
