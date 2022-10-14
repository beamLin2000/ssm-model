package com.gxa.entity.drugRetail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("项目明细实体")
public class DrugDetailed {
    @ApiModelProperty(name = "drugName",value = "收费名称")
    private String drugName;//收费名称
    @ApiModelProperty(name = "price",value = "单价")
    private Double price;
    @ApiModelProperty(name = "num",value = "总量")
    private Integer num;
    @ApiModelProperty(name = "company",value = "单位")
    private String company;//单位
    @ApiModelProperty(name = "totalPrice",value = "零售金额")
    private Double totalPrice;//零售金额
}
