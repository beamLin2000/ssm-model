package com.gxa.service.work;

import com.gxa.dto.WorkPatientDto;
import com.gxa.entity.work.*;

import java.util.List;

public interface WorkPatientDtoService {
    WorkPatientDto queryWorkPatientDtoByPhoneNum(String phoneNum, String status);

    void updataPatientIncfo(WorkPatient patient1);
    void addPatientPhyInfo(MedicalRecordPhysical medicalRecordPhysical);

    void addPatientMedicalChargeInfo(List<MedicalCharge> medicalCharge);
    void addPatientItemInfo(ItemCharge itemCharge);
    void addprescriptionsInfo(Prescriptions prescriptions);

}
