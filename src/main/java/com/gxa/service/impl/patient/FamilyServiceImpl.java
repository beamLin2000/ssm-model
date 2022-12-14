package com.gxa.service.impl.patient;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.gxa.entity.patients.Family;
import com.gxa.entity.patients.FamilyAdd;
import com.gxa.entity.patients.Patients;
import com.gxa.mapper.family.FamilyMapper;
import com.gxa.service.patient.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyServiceImpl implements FamilyService {
    @Autowired
    private FamilyMapper familyMapper;

    @Override
    public List<Family> queryByFamilyId(String patientCard) {
        QueryWrapper<Family> wrapper = new QueryWrapper<>();
        wrapper.eq("patient_card",patientCard);
        List<Family> families = this.familyMapper.selectList(wrapper);
        return families;
    }

    @Override
    public Family queryById(String familyName) {
        QueryWrapper<Family> wrapper = new QueryWrapper<>();
        wrapper.eq("family_name",familyName);
        Family family = this.familyMapper.selectOne(wrapper);
        return family;
    }

    @Override
    public void add(Family family) {
        familyMapper.insert(family);
    }

    @Override
    public void update(Family family) {
        UpdateWrapper<Family> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("family_id",family.getFamilyId());
        familyMapper.update(family,updateWrapper);
    }

    @Override
    public void delete(String familyName) {
        QueryWrapper<Family> wrapper = new QueryWrapper<>();
        wrapper.eq("family_name",familyName);
        familyMapper.delete(wrapper);
    }



}
