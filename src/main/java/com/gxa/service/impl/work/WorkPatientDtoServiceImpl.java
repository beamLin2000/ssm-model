package com.gxa.service.impl.work;

import com.gxa.dto.WorkPatientDto;
import com.gxa.entity.work.*;
import com.gxa.mapper.work.WorkPatientDtoMapper;
import com.gxa.service.work.WorkPatientDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkPatientDtoServiceImpl implements WorkPatientDtoService {
    @Autowired
    private WorkPatientDtoMapper workPatientDtoMapper;

    @Override
    public WorkPatientDto queryWorkPatientDtoByPhoneNum(String phoneNum,String status) {
        WorkPatientDto workPatientDto = this.workPatientDtoMapper.queryWorkPatientDtoByPhoneNum(phoneNum,status);
        return workPatientDto;
    }

    @Override
    public void updataPatientIncfo(WorkPatient patient1) {
        this.workPatientDtoMapper.updataPatientIncfo(patient1);
    }

    @Override
    public void addPatientPhyInfo(MedicalRecordPhysical medicalRecordPhysical) {
        this.workPatientDtoMapper.addPatientPhyInfo(medicalRecordPhysical);
    }


    @Override
    public void addPatientMedicalChargeInfo(List<MedicalCharge> medicalCharges) {
        for (MedicalCharge medicalCharge:
             medicalCharges) {
            List<Surcharges> surcharges = medicalCharge.getSurcharges();
            for (Surcharges surcharge:
                 surcharges) {
                this.workPatientDtoMapper.addSurcharges(surcharge);
            }
            this.workPatientDtoMapper.addPatientMedicalChargeInfo(medicalCharge);
        }
    }

    @Override
    public void addPatientItemInfo(ItemCharge itemCharge) {
        this.workPatientDtoMapper.addPatientItemInfo(itemCharge);
    }

    @Override
    public void addprescriptionsInfo(Prescriptions prescriptions) {
        this.workPatientDtoMapper.addprescriptionsInfo(prescriptions);
    }

}
