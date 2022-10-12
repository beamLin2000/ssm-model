package com.gxa.mapper.drugRetail;

import com.gxa.entity.drugRetail.DrugMsg;
import com.gxa.entity.drugRetail.DrugRetail;

public interface DrugRetailMapper {
    void save(DrugRetail drugRetail);

    DrugMsg queryAll();
}
