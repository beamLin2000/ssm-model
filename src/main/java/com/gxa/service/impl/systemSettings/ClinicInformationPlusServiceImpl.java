package com.gxa.service.impl.systemSettings;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.gxa.entity.systemSettings.ClinicInformation;
import com.gxa.mapper.systemSettings.ClinicInformationPlusMapper;
import com.gxa.service.systemSettings.ClinicInformationPlusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicInformationPlusServiceImpl implements ClinicInformationPlusService {

    @Autowired
    private ClinicInformationPlusMapper clinicInformationPlusMapper;

    @Override
    public List<ClinicInformation> queryAll() {
        List<ClinicInformation> list = this.clinicInformationPlusMapper.selectList(null);
        return list;
    }

    @Override
    public ClinicInformation queryById(Integer id) {
        ClinicInformation clinicInformation = this.clinicInformationPlusMapper.selectById(id);
        return clinicInformation;
    }

    @Override
    public List<ClinicInformation> queryByClinicName(String clinicName) {
        QueryWrapper<ClinicInformation>wrapper=new QueryWrapper<>();
        wrapper.eq("clinic_name",clinicName);
        List<ClinicInformation> list = this.clinicInformationPlusMapper.selectList(wrapper);
        System.out.println("list"+list+"clinicName"+clinicName);
        return list;
    }

    @Override
    public void updateById(ClinicInformation clinicInformation) {
        UpdateWrapper<ClinicInformation>wrapper=new UpdateWrapper<>();
        wrapper.eq("id_no",clinicInformation.getClinicId()).set(null,clinicInformation);
        this.clinicInformationPlusMapper.updateById(clinicInformation);
    }

    @Override
    public void deleteById(Integer id) {
        this.clinicInformationPlusMapper.deleteById(id);
    }


}
