package com.gxa.mapper.systemSettings;

import com.gxa.entity.systemSettings.SurchargeFee;

import java.util.List;

public interface SurchargeFeeMapper {
    List<SurchargeFee>queryAll();
    List<SurchargeFee>queryBySurchargeName(String surchargeName);
    List<SurchargeFee>queryByPrescription(String prescription);
    void addSurchargeFee(SurchargeFee surchargeFee);
    void deleteById(Integer id);
    void updateSurchargeFee(SurchargeFee surchargeFee);
}
