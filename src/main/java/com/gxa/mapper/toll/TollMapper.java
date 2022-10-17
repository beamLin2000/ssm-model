package com.gxa.mapper.toll;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.tolls.Toll;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

import java.util.Date;
import java.util.List;
@Mapper
public interface TollMapper extends BaseMapper<Toll> {
    List<Toll> queryByTollNumberName(@Param("tollNumberName") String tollNumberName, @Param("tollState") Integer tollState);
    List<Toll> queryByDateTime(@Param("firstTime") Date firstTime, @Param("lastTime") Date lastTime);
}
