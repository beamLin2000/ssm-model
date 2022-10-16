package com.gxa.service.drugManagement.drugInformationTenance;

import com.gxa.entity.drugManagement.drugInformationTenance.DrugBasicInformation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/15 9:59
 */
public interface DrugInformationService {
    List<DrugBasicInformation> list();
    List<DrugBasicInformation> search(String prescriptionCategory,String status,String createTime,String rules);
    void editStatus(Integer id);
    DrugBasicInformation editPre(Integer id);
    void save(DrugBasicInformation drugBasicInformation);
}
