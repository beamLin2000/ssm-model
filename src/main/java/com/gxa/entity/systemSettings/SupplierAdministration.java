package com.gxa.entity.systemSettings;


import lombok.Data;

import java.util.Date;


@Data

//供应商管理
public class SupplierAdministration {
    private Integer id ;
    private Integer supplierno;
    private String suppliername;
    private String contacts;
    private Integer phone;
    private Date time;
    private String foundperson;
    private String supplierstate;



}
