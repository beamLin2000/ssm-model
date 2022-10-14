package com.gxa.entity.drugRetail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("附加费用实体")
public class SurChargeFee {
    @ApiModelProperty(name = "surChargeName",value = "附加费名称")
    private String surChargeName;
    @ApiModelProperty(name = "num",value = "数量")
    private Integer num;
    @ApiModelProperty(name = "price",value = "单价")
    private Double price;
    public SurChargeFee(String surChargeName,Double price){
        this.surChargeName = surChargeName;
        this.price = price;
    }
}
