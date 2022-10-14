package com.gxa.form.supplier;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("供应商管理实体类")

//供应商管理
public class SupplierForm {
    @ApiModelProperty(value = "id",name = "id",required = false)
    private Integer id;
    @ApiModelProperty(value = "供应商编号",name = "supplierNo",required = false)
    private Integer supplierNo;//供应商编号
    @ApiModelProperty(value = "供应商名字",name = "supplierName",required = false)
    private String supplierName;//供应商名字
    @ApiModelProperty(value = "联系人",name = "contacts",required = false)
    private String contacts;//联系人
    @ApiModelProperty(value = "联系电话",name = "phone",required = false)
    private Integer phone;//联系电话
    @ApiModelProperty(value = "创建时间",name = "time",required = false)
    private Date time;//创建时间
    @ApiModelProperty(value = "创建人员",name = "foundPerson",required = false)
    private String foundPerson;//创建人员
    @ApiModelProperty(value = "供应商状态",name = "supplierState",required = false)
    private String supplierState;//供应商状态

    public SupplierForm(Integer id, Integer supplierNo, String supplierName, String contacts, Integer phone, Date time, String foundPerson, String supplierState) {
        this.id = id;
        this.supplierNo = supplierNo;
        this.supplierName = supplierName;
        this.contacts = contacts;
        this.phone = phone;
        this.time = time;
        this.foundPerson = foundPerson;
        this.supplierState = supplierState;
    }

    public SupplierForm() {
    }

    @Override
    public String toString() {
        return "SupplierForm{" +
                "id=" + id +
                ", supplierNo=" + supplierNo +
                ", supplierName='" + supplierName + '\'' +
                ", contacts='" + contacts + '\'' +
                ", phone=" + phone +
                ", time=" + time +
                ", foundPerson='" + foundPerson + '\'' +
                ", supplierState='" + supplierState + '\'' +
                '}';
    }
}
