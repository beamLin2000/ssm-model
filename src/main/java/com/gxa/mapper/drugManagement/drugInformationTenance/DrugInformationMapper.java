package com.gxa.mapper.drugManagement.drugInformationTenance;

import com.gxa.entity.drugManagement.drugInformationTenance.DrugBasicInformation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/15 9:52
 */
public interface DrugInformationMapper {
    //查询所有
    List<DrugBasicInformation> queryList();
    //根据id查询status
    DrugBasicInformation queryStatusById(@Param("id")Integer id);
    //更新status操作
    void updateStatus(@Param("id")Integer id,@Param("status")Integer status);
    //搜索功能
    List<DrugBasicInformation> search(@Param("prescriptionCategory") String prescriptionCategory,
                                      @Param("status") String status,
                                      @Param("start") String start,
                                      @Param("end") String end,
                                      @Param("rules") String rules);
}
