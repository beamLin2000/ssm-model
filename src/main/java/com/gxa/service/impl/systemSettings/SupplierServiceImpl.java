package com.gxa.service.impl.systemSettings;

import com.gxa.entity.systemSettings.SupplierAdministration;
import com.gxa.mapper.systemSettings.SupplierMapper;
import com.gxa.service.systemSettings.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierMapper supplierMapper;

    @Override
    public List<SupplierAdministration> selectSupplier() {
        List<SupplierAdministration> supplierAdministrations = this.supplierMapper.selectSupplier();
        return supplierAdministrations;
    }

    @Override
    public List<SupplierAdministration> selectBySuppliername(String supplierName) {
        List<SupplierAdministration> supplierAdministrations = this.supplierMapper.selectBySuppliername(supplierName);
        return supplierAdministrations;
    }

    @Override
    public void addSupplier(SupplierAdministration supplierAdministration) {
        this.supplierMapper.addSupplier(supplierAdministration);
    }

    @Override
    public SupplierAdministration selectBySupplierNo(Integer supplierNo) {
        SupplierAdministration supplierAdministration = this.supplierMapper.selectBySupplierNo(supplierNo);
        return supplierAdministration;
    }

    @Override
    public void updateSupplier(SupplierAdministration supplierAdministration) {
        this.supplierMapper.updateSupplier(supplierAdministration);
    }

    @Override
    public void deleteBySupplierNo(Integer supplierNo) {
        this.supplierMapper.deleteBySupplierNo(supplierNo);
    }
}
