package com.gxa.mapper.work;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.tolls.Toll;
import com.gxa.entity.tolls.TollDrugs;
import com.gxa.entity.work.*;
import com.gxa.dto.work.WorkPatientDto;
import org.apache.ibatis.annotations.Param;

public interface WorkPatientDtoMapper extends BaseMapper<WorkPatientDto> {
    WorkPatientDto queryWorkPatientDtoByPhoneNum(@Param("phoneNum") String phoneNum, @Param("status") String status);
    void updataPatientIncfo(@Param("patient1")WorkPatient patient1);
    void addPatientPhyInfo(@Param("medicalRecordPhysical") MedicalRecordPhysical medicalRecordPhysical,@Param("relation") Relation relation);

    void addPatientMedicalChargeInfo(@Param("medicalCharge") MedicalCharge medicalCharge,@Param("relation") Relation relation);
    void addPatientItemInfo(@Param("itemCharge") ItemCharge itemCharge,@Param("relation") Relation relation);
    void addprescriptionsInfo(@Param("prescriptions") Prescriptions prescriptions,@Param("relation") Relation relation);
    void addSurcharges(@Param("surcharges") Surcharges surcharges,@Param("relation") Relation relation,@Param("orderNum") String orderNum);


    WorkPatientDto queryWorkPatientDtoByPhoneNum(@Param("idCard") String idCard);
    WorkPatientDto queryWorkPatientDtoByForm(@Param("registrationForm") String registrationForm);
    void updateStatus(String idCard);
    void updateStatusIfReturn(@Param("idCard")String idCard);
    void addToll(@Param("toll")Toll toll,@Param("relation") Relation relation);
    void addTollDurgs(@Param("tollDrugs")TollDrugs tollDrugs,@Param("relation") Relation relation);
    void addCharge(@Param("charge") Charge charge,@Param("relation") Relation relation);
}
