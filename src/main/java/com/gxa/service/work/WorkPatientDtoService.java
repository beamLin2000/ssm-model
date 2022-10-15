package com.gxa.service.work;

import com.gxa.dto.WorkPatientDto;

public interface WorkPatientDtoService {
    WorkPatientDto queryWorkPatientDtoByPhoneNum(String phoneNum, String status);

    void addPatientInfo();
    void addPatientPhyInfo();
    void addPatientMedInfo();
    void addPatientInsInfo();
    void addPatientDrugInfo();
    void addPatientCDrugInfo();
}
