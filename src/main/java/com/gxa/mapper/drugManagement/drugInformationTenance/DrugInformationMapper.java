package com.gxa.mapper.drugManagement.drugInformationTenance;

import com.gxa.entity.drugManagement.drugInformationTenance.AfficacyDescription;
import com.gxa.entity.drugManagement.drugInformationTenance.DrugBasicInformation;
import com.gxa.entity.drugManagement.drugInformationTenance.DrugOtherInformation;
import com.gxa.entity.drugManagement.drugInformationTenance.DrugPackageInformation;
import com.gxa.entity.drugManagement.inventoryManagement.InventoryInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/15 9:52
 */
public interface DrugInformationMapper {
    //查询所有
    List<DrugBasicInformation> queryList();
    //根据id查询status
    DrugBasicInformation queryStatusById(@Param("id")Integer id);
    //更新status操作
    void updateStatus(@Param("id")Integer id,@Param("status")Integer status);
    //搜索功能
    List<DrugBasicInformation> search(@Param("prescriptionCategory") String prescriptionCategory,
                                      @Param("status") Integer status,
                                      @Param("start") String start,
                                      @Param("end") String end,
                                      @Param("rules") String rules);
    //根据id查询基本信息
    DrugBasicInformation queryDrugBasicInformationById(Integer id);
    //根据id查询包装信息
    DrugPackageInformation queryDrugPackageInformationById(Integer id);
    //根据id查询功效说明
    AfficacyDescription queryAfficacyDescription(Integer id);
    //根据id查询其他信息
    DrugOtherInformation queryDrugOtherInformationById(Integer id);

    //新增每一个药品应当为其初始化库存
    void saveInventoryInfo(InventoryInfo inventoryInfo);

    //保存所有
    void save(DrugBasicInformation drugBasicInformation);
    //保存包装信息
    void saveDrugPackageInformation(DrugPackageInformation drugPackageInformation);
    //保存功效信息
    void saveAfficacyDescription(AfficacyDescription afficacyDescription);
    //保存其他信息
    void saveDrugOtherInformation(DrugOtherInformation drugOtherInformation);

    //更新基础信息
    void update(DrugBasicInformation drugBasicInformation);
    //更新包装信息
    void updateDrugPackageInformation(DrugPackageInformation drugPackageInformation);
    //更新功效信息
    void updateAfficacyDescription(AfficacyDescription afficacyDescription);
    //更新其他信息
    void updateDrugOtherInformation(DrugOtherInformation drugOtherInformation);

}
