package com.gxa.service.toll;

import com.gxa.entity.tolls.TollPatient;

public interface TollPatientService {
    TollPatient queryByTollId(Integer tollId);
}
