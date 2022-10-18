package com.gxa.service.work;

import com.gxa.entity.tolls.Toll;
import com.gxa.entity.tolls.TollDrugs;
import com.gxa.entity.work.*;

import java.util.List;
import com.gxa.dto.work.WorkPatientDto;

public interface WorkPatientDtoService {
    WorkPatientDto queryWorkPatientDtoByPhoneNum(String phoneNum, String status);
    List<Charge> queryChargeList(Relation relation);
    void updataPatientIncfo(WorkPatient patient1);
    void addPatientPhyInfo(MedicalRecordPhysical medicalRecordPhysical,Relation relation);

    void addPatientMedicalChargeInfo(List<MedicalCharge> medicalCharge,Relation relation);
    void addPatientItemInfo(ItemCharge itemCharge,Relation relation);
    void addprescriptionsInfo(Prescriptions prescriptions,Relation relation);

    WorkPatientDto queryWorkPatientDtoByPhoneNum(String idCard);
    void updateStatus(String idCard);

    void addToll(Toll toll,Relation relation);
    void addTollDurgs(TollDrugs tollDrugs,Relation relation);
    void addCharge(Charge charge,Relation relation);
}
