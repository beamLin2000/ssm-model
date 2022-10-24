package com.gxa.mapper.drugManagement.drugPriceAdjustment;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.entity.drugManagement.drugInformationTenance.DrugBasicInformation;
import com.gxa.entity.drugManagement.drugPriceAdjustment.DrugPriceAdjustInfo;
import com.gxa.entity.drugManagement.drugPriceAdjustment.DrugPriceAdjustInfoList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author LXD
 * @Date 2022/10/20 19:05
 * @Version 1.0
 */
public interface DrugPriceAdjustmentMapper {
    //搜索药品调价
    List<DrugPriceAdjustInfo> search(@Param("drugType") String drugType,
                                     @Param("rules") String rules);

    //查询新增调价中的数据
    List<DrugPriceAdjustInfoList> queryByCode(String code);

    //保存新增调价的数据
    void saveDrugPriceAdjustInfoList(@Param("drugPriceAdjustInfoList") List<DrugPriceAdjustInfoList> drugPriceAdjustInfoList,
                                     @Param("operationTime") String operationTime,
                                     @Param("operator") String operator);

    //搜索调价记录
    List<DrugBasicInformation> searchDrugPriceAdjust(@Param("drugType") String drugType,
                                      @Param("rules") String rules);

    //搜索条数
    List<BasicInfo> queryCount();

    List<DrugPriceAdjustInfoList> queryById(Integer id);

    void deleteByCode(@Param("code") String code);

}
