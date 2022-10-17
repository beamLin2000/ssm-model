package com.gxa.service.systemSettings;

import com.gxa.entity.systemSettings.SupplierAdministration;


import java.util.List;


public interface SupplierService {
    List<SupplierAdministration>selectSupplier();
    List<SupplierAdministration>selectBySuppliername(String supplierName);
    void addSupplier(SupplierAdministration supplierAdministration);
    SupplierAdministration selectBySupplierNo(Integer supplierNo);
    void updateSupplier(SupplierAdministration supplierAdministration);
    void deleteBySupplierId(Integer id);
}
