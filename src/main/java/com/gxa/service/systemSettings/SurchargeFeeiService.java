package com.gxa.service.systemSettings;

import com.gxa.entity.systemSettings.PrescriptionTable;
import com.gxa.entity.systemSettings.SurchargeFee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SurchargeFeeiService {
    List<SurchargeFee>queryAll();
    void addSurchargeFee(SurchargeFee surchargeFee);
    void deleteById(Integer id);
    void updateSurchargeFee(SurchargeFee surchargeFee);
    List<SurchargeFee>queryByTj(@Param("surchargeName")String surchargename,@Param("prescription")String prescription);

}
