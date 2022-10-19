package com.gxa.mapper.drugRetail;

import com.gxa.entity.drugRetail.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrugRetailMapper{
    void saveDrugMsg(@Param("drugRetail") DrugRetail drugRetail,@Param("drugMsg")DrugMsg drugMsgs);
    void savePatientMsg(DrugRetail drugRetail);
    void saveSurchargeMsg(@Param("drugRetail") DrugRetail drugRetail,@Param("surChargeFee")SurChargeFee surChargeFees);
    void updateStock(DrugMsg drugMsgs);
    List<DrugChooseMsg> queryByCode(DrugQueryCondition drugQueryCondition);
    List<DrugChooseMsg> queryByName(DrugQueryCondition drugQueryCondition);
}
