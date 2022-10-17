package com.gxa.mapper.work;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.WorkPatientDto;
import com.gxa.entity.work.*;
import com.gxa.dto.work.WorkPatientDto;
import org.apache.ibatis.annotations.Param;

public interface WorkPatientDtoMapper extends BaseMapper<WorkPatientDto> {
    WorkPatientDto queryWorkPatientDtoByPhoneNum(@Param("phoneNum") String phoneNum, @Param("status") String status);
    void updataPatientIncfo(@Param("patient1")WorkPatient patient1);
    void addPatientPhyInfo(@Param("medicalRecordPhysical") MedicalRecordPhysical medicalRecordPhysical);

    void addPatientMedicalChargeInfo(@Param("medicalCharge") MedicalCharge medicalCharge);
    void addPatientItemInfo(@Param("itemCharge") ItemCharge itemCharge);
    void addprescriptionsInfo(@Param("prescriptions") Prescriptions prescriptions);
    void addSurcharges(@Param("surcharges") Surcharges surcharges);


    WorkPatientDto queryWorkPatientDtoByPhoneNum(@Param("idCard") String idCard);

    void updateStatus(String idCard);
}
