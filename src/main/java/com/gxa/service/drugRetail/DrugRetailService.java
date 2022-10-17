package com.gxa.service.drugRetail;

import com.gxa.entity.drugRetail.DrugMsg;
import com.gxa.entity.drugRetail.DrugQueryCondition;
import com.gxa.entity.drugRetail.DrugRetail;

public interface DrugRetailService {
    void add(DrugRetail drugRetail);
    DrugMsg query(DrugQueryCondition drugQueryCondition);
}
