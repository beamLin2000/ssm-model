package com.gxa.entity.systemSettings;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor

//供应商管理
public class SupplierAdministration {
    private  Integer id;
    private Integer supplierno;//供应商编号
    private String suppliername;//供应商名称
    private String contacts;//联系人
    private Integer phone;//联系人电话
    private Date timeing;//创建时间
    private String foundperson;//创建人员
    private String supplierstate;//供应商状态

    @Override
    public String toString() {
        return "SupplierAdministration{" +
                "supplierno=" + supplierno +
                ", suppliername='" + suppliername + '\'' +
                ", contacts='" + contacts + '\'' +
                ", phone=" + phone +
                ", time=" + timeing +
                ", foundperson='" + foundperson + '\'' +
                ", supplierstate='" + supplierstate + '\'' +
                '}';
    }

    public SupplierAdministration(Integer supplierno, String suppliername, String contacts, Integer phone, Date timeing, String foundperson, String supplierstate) {
        this.supplierno = supplierno;
        this.suppliername = suppliername;
        this.contacts = contacts;
        this.phone = phone;
        this.timeing = timeing;
        this.foundperson = foundperson;
        this.supplierstate = supplierstate;
    }
}
