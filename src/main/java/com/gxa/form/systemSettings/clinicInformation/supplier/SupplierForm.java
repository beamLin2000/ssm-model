package com.gxa.form.systemSettings.clinicInformation.supplier;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel
public class SupplierForm {
    @ApiModelProperty(value = "id",name = "id",required = false)
    private Integer id;
    @ApiModelProperty(value = "供应商编号",name = "供应商编号",required = false)
    private Integer supplierNo;//供应商编号
    @ApiModelProperty(value = "供应商名字",name = "供应商名字",required = false)
    private String supplierName;//供应商名字
    @ApiModelProperty(value = "联系人",name = "联系人",required = false)
    private String contacts;//联系人
    @ApiModelProperty(value = "联系电话",name = "联系电话",required = false)
    private Integer phone;//联系电话
    @ApiModelProperty(value = "创建时间",name = "创建时间",required = false)
    private Date time;//创建时间
    @ApiModelProperty(value = "创建人员",name = "创建人员",required = false)
    private String foundPerson;//创建人员
    @ApiModelProperty(value = "供应商状态",name = "供应商状态",required = false)
    private String supplierState;//供应商状态



}
