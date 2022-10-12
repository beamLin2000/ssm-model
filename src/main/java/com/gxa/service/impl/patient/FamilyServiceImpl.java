package com.gxa.service.impl.patient;

import com.gxa.entity.patients.FamilyAdd;
import com.gxa.mapper.family.FamilyMapper;
import com.gxa.service.patient.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyServiceImpl implements FamilyService {
    @Autowired
    private FamilyMapper familyMapper;
    @Override
    public void add(FamilyAdd familyAdd) {
        this.familyMapper.save(familyAdd);
    }

    @Override
    public void tpFamilyUpdate(Integer family_id) {

    }

    @Override
    public void familyAddUpdate(FamilyAdd familyAdd) {

    }


}
