package com.gxa.service.drugRetail;

import com.gxa.entity.drugRetail.DrugChooseMsg;
import com.gxa.entity.drugRetail.DrugQueryCondition;
import com.gxa.entity.drugRetail.DrugRetail;

import java.util.List;

public interface DrugRetailService {
    void add(DrugRetail drugRetail);
    List<DrugChooseMsg> queryByCode(DrugQueryCondition drugQueryCondition);
    List<DrugChooseMsg> queryByName(DrugQueryCondition drugQueryCondition);
}
