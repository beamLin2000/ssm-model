package com.gxa.mapper.toll;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.tolls.TollDrugs;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public interface TollDrugsMapper extends BaseMapper<TollDrugs> {
   List<TollDrugs>queryByTollVer(@Param("tollDrugsVer")String tollDrugsVer,@Param("tollNumber")String tollNumber);
}
