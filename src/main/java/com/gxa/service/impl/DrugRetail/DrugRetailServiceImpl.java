package com.gxa.service.impl.DrugRetail;

import com.gxa.entity.drugRetail.*;
import com.gxa.mapper.drugRetail.DrugRetailMapper;
import com.gxa.service.drugRetail.DrugRetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DrugRetailServiceImpl implements DrugRetailService {
    @Autowired
    private DrugRetailMapper drugRetailMapper;
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void add(DrugRetail drugRetail) {
            List<DrugMsg> drugMsgs = drugRetail.getDrugMsg();
            for (int i = 0; i < drugMsgs.size(); i++) {
                this.drugRetailMapper.saveDrugMsg(drugRetail,drugMsgs.get(i));
                this.drugRetailMapper.updateStock(drugMsgs.get(i));
            }
            this.drugRetailMapper.savePatientMsg(drugRetail);
            this.drugRetailMapper.saveToll(drugRetail);
        if (drugRetail.getSurChargeFee().size() > 0 &&  drugRetail.getSurChargeFee().get(0).getNum() != 0){
            List<SurChargeFee> surChargeFees = drugRetail.getSurChargeFee();
            for (int i = 0; i < drugRetail.getSurChargeFee().size(); i++) {
                this.drugRetailMapper.saveSurchargeMsg(drugRetail,surChargeFees.get(i));
            }
        }
    }
    @Override
    public List<DrugChooseMsg> queryByCode(DrugQueryCondition drugQueryCondition) {
        return this.drugRetailMapper.queryByCode(drugQueryCondition);
    }
    @Override
    public List<DrugChooseMsg> queryByName(DrugQueryCondition drugQueryCondition) {
        return this.drugRetailMapper.queryByName(drugQueryCondition);
    }
}
