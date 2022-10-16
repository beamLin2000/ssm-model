package com.gxa.service.drugManagement.drugInformationTenance.impl;

import com.gxa.entity.drugManagement.drugInformationTenance.AfficacyDescription;
import com.gxa.entity.drugManagement.drugInformationTenance.DrugBasicInformation;
import com.gxa.entity.drugManagement.drugInformationTenance.DrugOtherInformation;
import com.gxa.entity.drugManagement.drugInformationTenance.DrugPackageInformation;
import com.gxa.mapper.drugManagement.drugInformationTenance.DrugInformationMapper;
import com.gxa.service.drugManagement.drugInformationTenance.DrugInformationService;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/15 10:00
 */
@Service
public class DrugInformationServiceImpl implements DrugInformationService {
    @Autowired
    private DrugInformationMapper drugInformationMapper;
    @Override
    public List<DrugBasicInformation> list() {
        return drugInformationMapper.queryList();
    }

    @Override
    public List<DrugBasicInformation> search(String prescriptionCategory,String status,String createTime,String rules) {
        //将前端获取到的字符串数据拆分
        String []createTimeArray = createTime.split(",");
        String start = createTimeArray[0].trim();
        String end = createTimeArray[1].trim();
        return drugInformationMapper.search(prescriptionCategory,status,start,end,rules);
    }

    @Override
    public void editStatus(Integer id) {
        //根据id查询到需要修改的状态
        DrugBasicInformation drugBasicInformations = drugInformationMapper.queryStatusById(id);
        //状态取反,进行更新
        drugInformationMapper.updateStatus(id,drugBasicInformations.getStatus()==1?0:1);
    }

    @Override
    public DrugBasicInformation editPre(Integer id) {
        DrugBasicInformation drugBasicInformation = drugInformationMapper.queryDrugBasicInformationById(id);
        AfficacyDescription afficacyDescription = drugInformationMapper.queryAfficacyDescription(id);
        DrugOtherInformation drugOtherInformation = drugInformationMapper.queryDrugOtherInformationById(id);
        DrugPackageInformation drugPackageInformation = drugInformationMapper.queryDrugPackageInformationById(id);
        drugBasicInformation.setAfficacyDescription(afficacyDescription);
        drugBasicInformation.setDrugOtherInformation(drugOtherInformation);
        drugBasicInformation.setDrugPackageInformation(drugPackageInformation);
        return drugBasicInformation;
    }

    @Override
    public void save(DrugBasicInformation drugBasicInformation) {
        List<DrugBasicInformation> drugBasicInformations = drugInformationMapper.queryList();
        //获取条数
        int size = drugBasicInformations.size();
        //获取到最后一条数据
        DrugBasicInformation drugBasicInformation1 = drugBasicInformations.get(size - 1);
        Integer id = drugBasicInformation1.getId();
        //获取添加后的主键id
        int lastId = id + 1;


        //设置三个小表的外键id，并调用mapper方法
        DrugPackageInformation drugPackageInformation = drugBasicInformation.getDrugPackageInformation();
        drugPackageInformation.setDrugInfoId(lastId);
        drugInformationMapper.saveDrugPackageInformation(drugPackageInformation);
        DrugOtherInformation drugOtherInformation = drugBasicInformation.getDrugOtherInformation();
        drugOtherInformation.setDrugInfoId(lastId);
        drugInformationMapper.saveDrugOtherInformation(drugOtherInformation);
        AfficacyDescription afficacyDescription = drugBasicInformation.getAfficacyDescription();
        afficacyDescription.setDrugInfoId(lastId);
        drugInformationMapper.saveAfficacyDescription(afficacyDescription);

        //将大表进行添加
        drugInformationMapper.save(drugBasicInformation);
    }
}
