package com.gxa.service.systemSettings;

import com.gxa.entity.systemSettings.ClinicInformation;

import java.util.List;

public interface ClinicInformationPlusService {
    List<ClinicInformation>queryAll();
    ClinicInformation queryById(Integer id);
    List<ClinicInformation>queryByClinicName(String clinicName);
    void updateById(ClinicInformation clinicInformation);
    void deleteById(Integer id);
}
