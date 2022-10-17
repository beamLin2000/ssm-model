package com.gxa.entity.systemSettings;


import com.fasterxml.jackson.annotation.JsonFormat;
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
    private Integer supplierNo;//供应商编号
    private String supplierName;//供应商名称
    private String contacts;//联系人
    private Integer phone;//联系人电话
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date timeing;//创建时间
    private String foundPerson;//创建人员
    private String supplierState;//供应商状态
    private String remarks;//备注



}
