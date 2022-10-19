package com.gxa.mapper.toll;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.tolls.Toll;
import com.gxa.entity.tolls.TollInquire;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

import java.util.Date;
import java.util.List;
@Mapper
public interface TollMapper extends BaseMapper<Toll> {

    List<Toll>queryByInquire(@Param("firstTime") Date firstTime, @Param("lastTime") Date lastTime,
                             @Param("tollType")String tollType,@Param("tollState")Integer tollState,
                             @Param("tollDateTime")String tollDateTime,@Param("tollNameCard")String tollNameCard);
    List<Toll> queryByInquires(@Param("tollType")String tollType,@Param("tollState")Integer tollState,
                               @Param("tollNameCard")String tollNameCard);
    void updateByState(@Param("tollNumber")String tollNumber);
    void add(@Param("tollNumber")String tollNumber,@Param("tollFinishManner")String tollFinishManner);

    void updateRefunds(String tollNumber);
}
