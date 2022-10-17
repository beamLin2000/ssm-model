package com.gxa.service.impl.DrugRetail;

import com.gxa.entity.drugRetail.DrugMsg;
import com.gxa.entity.drugRetail.DrugQueryCondition;
import com.gxa.entity.drugRetail.DrugRetail;
import com.gxa.mapper.drugRetail.DrugRetailMapper;
import com.gxa.service.drugRetail.DrugRetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugRetailServiceImpl implements DrugRetailService {
    @Autowired
    private DrugRetailMapper drugRetailMapper;
    @Override
    public void add(DrugRetail drugRetail) {
      this.drugRetailMapper.save(drugRetail);
    }
    @Override
    public List<DrugMsg> queryByCode(DrugQueryCondition drugQueryCondition) {
        return this.drugRetailMapper.queryByCode(drugQueryCondition);
    }

    @Override
    public List<DrugMsg> queryByName(DrugQueryCondition drugQueryCondition) {
        return this.drugRetailMapper.queryByName(drugQueryCondition);
    }
}
