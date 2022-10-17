package com.gxa.service.drugRetail;

import com.gxa.entity.drugRetail.DrugMsg;
import com.gxa.entity.drugRetail.DrugQueryCondition;
import com.gxa.entity.drugRetail.DrugRetail;

import java.util.List;

public interface DrugRetailService {
    void add(DrugRetail drugRetail);
    List<DrugMsg> queryByCode(DrugQueryCondition drugQueryCondition);
    List<DrugMsg> queryByName(DrugQueryCondition drugQueryCondition);
}
