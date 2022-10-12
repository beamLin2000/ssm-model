package com.gxa.service.impl.systemSettings;

import com.gxa.entity.systemSettings.ClinicInformation;
import com.gxa.mapper.systemSettings.ClinicInformationMapper;
import com.gxa.service.systemSettings.ClinicInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicInformationServiceImpl implements ClinicInformationService {

    @Autowired
    private ClinicInformationMapper clinicInformationMapper;

    @Override
    public List<ClinicInformation> queryAll() {
        List<ClinicInformation> clinicInformations = this.clinicInformationMapper.queryAll();

        return clinicInformations;
    }
}
