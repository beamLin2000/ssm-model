package com.gxa.mapper.business;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.business.Business;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface BusinessMapper extends BaseMapper<Business> {
    void queryCountByToday(Date date);
    Integer queryCountByToday(@Param("date") Date date,@Param("status") String status);
}
