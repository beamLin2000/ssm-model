package com.gxa.service.drugManagement.drugPriceAdjustment;

import com.gxa.entity.drugManagement.drugPriceAdjustment.DrugPriceAdjustInfo;
import com.gxa.entity.drugManagement.drugPriceAdjustment.DrugPriceAdjustInfoList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author LXD
 * @Date 2022/10/20 19:29
 * @Version 1.0
 */
public interface DrugPriceAdjustmentService {
    List<DrugPriceAdjustInfo> search(@Param("drugType") String drugType,
                                     @Param("rules") String rules);

    List<DrugPriceAdjustInfoList> queryByCode(String code);

    void saveDrugPriceAdjustInfoList(List<DrugPriceAdjustInfoList> drugPriceAdjustInfoList, String operationTime, String operator);

    List<DrugPriceAdjustInfoList> queryById(Integer id);
}
