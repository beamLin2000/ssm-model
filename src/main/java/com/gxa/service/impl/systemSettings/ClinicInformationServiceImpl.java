package com.gxa.service.impl.systemSettings;

import com.gxa.entity.systemSettings.ClinicInformation;
import com.gxa.mapper.systemSettings.ClinicInformationMapper;
import com.gxa.service.systemSettings.ClinicInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ClinicInformationServiceImpl implements ClinicInformationService {

    @Autowired
    private ClinicInformationMapper clinicInformationMapper;

    @Override
    @Transactional
    public List<ClinicInformation> queryAll() {
        List<ClinicInformation> clinicInformations = this.clinicInformationMapper.queryAll();

        return clinicInformations;
    }

    @Override
    public void updateClinic(ClinicInformation clinicInformation) {
        this.clinicInformationMapper.updateClinic(clinicInformation);
    }
}
