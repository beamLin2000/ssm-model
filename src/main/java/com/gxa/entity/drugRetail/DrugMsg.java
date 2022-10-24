package com.gxa.entity.drugRetail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("药品信息实体")
public class DrugMsg {
    @ApiModelProperty(name = "drugName",value = "药品名称")
    private String drugName;
    @ApiModelProperty(name = "drugType",value = "药品类型")
    private String drugType;
    @ApiModelProperty(name = "num",value = "数量")
    private Integer num;
    @ApiModelProperty(name = "company",value = "单位")
    private String company;
    @ApiModelProperty(name = "salesPrice",value = "单价")
    private Double salesPrice;
    @ApiModelProperty(name = "totalPrice",value = "总价")
    private Double totalPrice;
}
