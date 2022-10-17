package com.gxa.mapper.systemSettings;

import com.gxa.entity.systemSettings.PrescriptionTable;

import java.util.List;

public interface QueryPrescriptionMapper {
    List<PrescriptionTable> queryPrescription();
    List<PrescriptionTable> queryPrescriptionBy(String prescription);
}
