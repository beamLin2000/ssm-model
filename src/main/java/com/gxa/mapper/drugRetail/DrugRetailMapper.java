package com.gxa.mapper.drugRetail;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.drugRetail.DrugMsg;
import com.gxa.entity.drugRetail.DrugQueryCondition;
import com.gxa.entity.drugRetail.DrugRetail;

import java.util.List;

public interface DrugRetailMapper{
    void saveDrugMsg(DrugRetail drugRetail);
    void savePatientMsg(DrugRetail drugRetail);
    void saveSurchargeMsg(DrugRetail drugRetail);
    List<DrugMsg> queryByCode(DrugQueryCondition drugQueryCondition);
    List<DrugMsg> queryByName(DrugQueryCondition drugQueryCondition);
}
