package com.gxa.service.impl.systemSettings;

import com.gxa.entity.systemSettings.PrescriptionTable;
import com.gxa.mapper.systemSettings.QueryPrescriptionMapper;
import com.gxa.service.systemSettings.QueryPrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryPrescriptionServiceImpl implements QueryPrescriptionService {

    @Autowired
    private QueryPrescriptionMapper queryPrescriptionMapper;
    @Override
    public List<PrescriptionTable> queryPrescription() {
        List<PrescriptionTable> prescriptionTables = this.queryPrescriptionMapper.queryPrescription();
        return prescriptionTables;
    }

    @Override
    public List<PrescriptionTable> queryPrescriptionBy(String prescription) {
        List<PrescriptionTable> prescriptionTables = this.queryPrescriptionMapper.queryPrescriptionBy(prescription);
        return prescriptionTables;
    }
}
