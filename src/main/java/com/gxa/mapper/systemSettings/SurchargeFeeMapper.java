package com.gxa.mapper.systemSettings;

import com.gxa.entity.systemSettings.PrescriptionTable;
import com.gxa.entity.systemSettings.SupplierAdministration;
import com.gxa.entity.systemSettings.SurchargeFee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SurchargeFeeMapper {
    List<SurchargeFee>queryAll();
    void addSurchargeFee(SurchargeFee surchargeFee);
    void deleteById(Integer id);
    void updateSurchargeFee(SurchargeFee surchargeFee);
    List<SurchargeFee>queryByTj(@Param("surchargeName") String surchargename, @Param("prescription") String prescription);
//    List<SurchargeFee>queryByTj01(@Param("surchargeName") String surchargename, @Param("perscrip_id") Integer perscrip_id);

}
