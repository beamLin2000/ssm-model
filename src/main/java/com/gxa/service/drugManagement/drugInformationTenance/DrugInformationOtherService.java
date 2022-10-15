package com.gxa.service.drugManagement.drugInformationTenance;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/15 11:57
 */
public interface DrugInformationOtherService {
    List<BasicInfo> queryAllType(Integer id);
    void addOneType(BasicInfo basicInfo);
}
