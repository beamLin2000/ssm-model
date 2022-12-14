package com.gxa.service.impl.work;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gxa.entity.tolls.Toll;
import com.gxa.entity.tolls.TollDrugs;
import com.gxa.entity.work.*;
import com.gxa.dto.work.WorkPatientDto;
import com.gxa.mapper.work.ChargeInfoMapper;
import com.gxa.mapper.work.WorkPatientDtoMapper;
import com.gxa.service.work.WorkPatientDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WorkPatientDtoServiceImpl implements WorkPatientDtoService {
    @Autowired
    private WorkPatientDtoMapper workPatientDtoMapper;
    @Autowired
    private ChargeInfoMapper chargeInfoMapper;
    @Override
    public WorkPatientDto queryWorkPatientDtoByPhoneNum(String phoneNum,String status) {
        WorkPatientDto workPatientDto = this.workPatientDtoMapper.queryWorkPatientDtoByPhoneNum(phoneNum,status);
        return workPatientDto;
    }

    @Override
    public List<Charge> queryChargeList(Relation relation) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("person_idcard",relation.getIdCard());
        List list = this.chargeInfoMapper.selectList(wrapper);
        return list;
    }

    @Override
    public void updataPatientIncfo(WorkPatient patient1) {
        this.workPatientDtoMapper.updataPatientIncfo(patient1);
    }

    @Override
    public void addPatientPhyInfo(MedicalRecordPhysical medicalRecordPhysical,Relation relation) {
        this.workPatientDtoMapper.addPatientPhyInfo(medicalRecordPhysical,relation);
    }


    @Override
    public void addPatientMedicalChargeInfo(List<MedicalCharge> medicalCharges,Relation relation) {
        for (MedicalCharge medicalCharge:
             medicalCharges) {
            List<Surcharges> surcharges = medicalCharge.getSurcharges();
            if (surcharges!=null){
                for (Surcharges surcharge:
                        surcharges) {
                    this.workPatientDtoMapper.addSurcharges(surcharge,relation,medicalCharge.getOrderNum());
                }
            }

            this.workPatientDtoMapper.addPatientMedicalChargeInfo(medicalCharge,relation);
        }
    }

    @Override
    public void addPatientItemInfo(ItemCharge itemCharge,Relation relation) {
        this.workPatientDtoMapper.addPatientItemInfo(itemCharge,relation);
    }

    @Override
    public void addprescriptionsInfo(Prescriptions prescriptions,Relation relation) {
        this.workPatientDtoMapper.addprescriptionsInfo(prescriptions,relation);
    }

    @Override
    public WorkPatientDto queryWorkPatientDtoByPhoneNum(String idCard) {
        WorkPatientDto workPatientDto = this.workPatientDtoMapper.queryWorkPatientDtoByPhoneNum(idCard);
        return workPatientDto;
    }

    @Override
    public WorkPatientDto queryWorkPatientDtoByForm(String registrationForm) {
        WorkPatientDto workPatientDto = this.workPatientDtoMapper.queryWorkPatientDtoByForm(registrationForm);
        return workPatientDto;
    }

    @Override
    public void updateStatus(String idCard) {
        this.workPatientDtoMapper.updateStatus(idCard);
    }

    @Override
    public void updateStatus01(String idCard) {
        this.workPatientDtoMapper.updateStatus01(idCard);
    }

    @Override
    public void updateStatusIfReturn(String idCard) {
        this.workPatientDtoMapper.updateStatusIfReturn(idCard);
    }

    @Override
    public void addToll(Toll toll,Relation relation) {
        this.workPatientDtoMapper.addToll(toll,relation);
    }

    @Override
    public void addTollDurgs(TollDrugs tollDrugs,Relation relation) {
        this.workPatientDtoMapper.addTollDurgs(tollDrugs,relation);
    }

    @Override
    public void addCharge(Charge charge,Relation relation) {
        this.workPatientDtoMapper.addCharge(charge,relation);
    }
}
