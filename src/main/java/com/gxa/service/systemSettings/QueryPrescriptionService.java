package com.gxa.service.systemSettings;

import com.gxa.entity.systemSettings.PrescriptionTable;

import java.util.List;

public interface QueryPrescriptionService {
    List<PrescriptionTable> queryPrescription();
    List<PrescriptionTable> queryPrescriptionBy(String prescription);

}
