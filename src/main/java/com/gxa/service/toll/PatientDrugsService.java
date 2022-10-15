package com.gxa.service.toll;

import com.gxa.entity.tolls.PatientDrugs;

public interface PatientDrugsService {
    PatientDrugs queryByTollId(Integer tollId);
}
