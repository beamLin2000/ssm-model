package com.gxa.service.drugManagement.drugInformationTenance.impl;

import com.gxa.entity.drugManagement.drugInformationTenance.DrugBasicInformation;
import com.gxa.mapper.drugManagement.drugInformationTenance.DrugInformationMapper;
import com.gxa.service.drugManagement.drugInformationTenance.DrugInformationService;
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
        String start = "";
        String end = "";
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
    public List<DrugBasicInformation> editPre(Integer id) {
        return null;
    }

    @Override
    public void save(DrugBasicInformation drugBasicInformation) {

    }
}
