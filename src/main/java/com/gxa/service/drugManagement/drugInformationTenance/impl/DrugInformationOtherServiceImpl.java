package com.gxa.service.drugManagement.drugInformationTenance.impl;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.mapper.drugManagement.drugInformationTenance.DrugInformationOtherMapper;
import com.gxa.service.drugManagement.drugInformationTenance.DrugInformationOtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/15 11:57
 */
@Service
public class DrugInformationOtherServiceImpl implements DrugInformationOtherService {
    @Autowired
    private DrugInformationOtherMapper drugInformationOtherMapper;
    @Override
    public List<BasicInfo> queryAllType(Integer id) {
        return drugInformationOtherMapper.queryAllType(id);
    }

    @Override
    public void addOneType(BasicInfo basicInfo) {
        drugInformationOtherMapper.addOneType(basicInfo);
    }
}
