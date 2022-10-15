package com.gxa.mapper.drugManagement.drugInformationTenance;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/15 11:36
 */
public interface DrugInformationOtherMapper {
    List<BasicInfo> queryAllType(@Param("drugTypeId")Integer id);
    void addOneType(BasicInfo basicInfo);
}
