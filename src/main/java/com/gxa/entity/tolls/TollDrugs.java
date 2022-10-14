package com.gxa.entity.tolls;

import io.swagger.annotations.ApiModelProperty;

public class TollDrugs {
    @ApiModelProperty(name = "tollDrugsId",value = "序号")
    private Integer tollDrugsId;
    @ApiModelProperty(name = "tollDrugsName",value = "收费名称")
    private String tollDrugsName;
    @ApiModelProperty(name = "tollDrugsMoney",value = "单价")
    private Double tollDrugsMoney;
    @ApiModelProperty(name = "tollDrugsQuantity",value = "总量")
    private Integer tollDrugsQuantity;
    @ApiModelProperty(name = "tollDrugsUnit",value = "单位")
    private String tollDrugsUnit;
    @ApiModelProperty(name = "tollDrugsRetail",value = "销售额度")
    private Double tollDrugsRetail;
    @ApiModelProperty(name = "tollDrugsDiscount",value = "折扣")
    private Double tollDrugsDiscount;
    @ApiModelProperty(name = "tollDrugsAllMoney",value = "折扣金额")
    private Double tollDrugsAllMoney;
    @ApiModelProperty(name = "patientId",value = "患者ID")
    private Integer patientId;
}
