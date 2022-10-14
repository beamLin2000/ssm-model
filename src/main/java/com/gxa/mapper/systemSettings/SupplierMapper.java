package com.gxa.mapper.systemSettings;

import com.gxa.entity.systemSettings.SupplierAdministration;

import java.util.List;

public interface SupplierMapper {
    List<SupplierAdministration> selectSupplier();
    List<SupplierAdministration>selectBySuppliername(String supplierName);
    void addSupplier(SupplierAdministration supplierAdministration);
    void updateSupplier(SupplierAdministration supplierAdministration);
    SupplierAdministration selectBySupplierNo(Integer supplierNo);
    void deleteBySupplierNo(Integer supplierNo);
}
