package com.gxa.service.work;

import com.gxa.entity.tolls.Toll;
import com.gxa.entity.tolls.TollDrugs;
import com.gxa.entity.work.*;

import java.util.List;
import com.gxa.dto.work.WorkPatientDto;

public interface WorkPatientDtoService {
    WorkPatientDto queryWorkPatientDtoByPhoneNum(String phoneNum, String status);

    void updataPatientIncfo(WorkPatient patient1);
    void addPatientPhyInfo(MedicalRecordPhysical medicalRecordPhysical);

    void addPatientMedicalChargeInfo(List<MedicalCharge> medicalCharge);
    void addPatientItemInfo(ItemCharge itemCharge);
    void addprescriptionsInfo(Prescriptions prescriptions);

    WorkPatientDto queryWorkPatientDtoByPhoneNum(String idCard);
    void updateStatus(String idCard);

    void addToll(Toll toll,String idCard);
    void addTollDurgs(TollDrugs tollDrugs);
}
