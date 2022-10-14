package com.gxa.mapper.business;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.business.OutpatientRecordToday;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface BusinessMapper {
    Integer queryCountByToday(@Param("date") Date date,@Param("status") String status);

    Double queryTodayRevenue (Date date);

    Map<String,Object> queryTotal(@Param("date") Date date, @Param("days") Integer days);
    List<OutpatientRecordToday> queryByToday(Date date);
}
