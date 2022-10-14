package com.gxa.mapper.systemSettings;

import com.gxa.entity.systemSettings.ClinicInformation;

import java.util.List;

public interface ClinicInformationMapper {
    List<ClinicInformation> queryAll();
    void updateClinic(ClinicInformation clinicInformation);

}
