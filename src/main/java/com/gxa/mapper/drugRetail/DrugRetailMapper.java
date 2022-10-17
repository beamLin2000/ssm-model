package com.gxa.mapper.drugRetail;

import com.gxa.entity.drugRetail.DrugMsg;
import com.gxa.entity.drugRetail.DrugQueryCondition;
import com.gxa.entity.drugRetail.DrugRetail;

import java.util.List;

public interface DrugRetailMapper {
    void save(DrugRetail drugRetail);
    List<DrugMsg> queryByCode(DrugQueryCondition drugQueryCondition);
    List<DrugMsg> queryByName(DrugQueryCondition drugQueryCondition);
}
