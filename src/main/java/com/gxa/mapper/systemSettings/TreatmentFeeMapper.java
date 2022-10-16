package com.gxa.mapper.systemSettings;

import com.gxa.entity.systemSettings.TreatmentFee;

import java.util.List;

public interface TreatmentFeeMapper {
    List<TreatmentFee>queryAll();
    List<TreatmentFee>queryByTreatment(String treatment);
    void addTreatmentFee(TreatmentFee treatmentFee);
    void updateTreatmentFee(TreatmentFee treatmentFee);
    void deleteTreatmentFee(Integer id);
}
