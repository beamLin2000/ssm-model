package com.gxa.entity.drugRetail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("选择药品信息实体")
public class DrugMsg {
    @ApiModelProperty(name = "drugCode",value = "药品编码")
    private String drugCode;
    @ApiModelProperty(name = "drugName",value = "药品名称")
    private String drugName;
    @ApiModelProperty(name = "chargeCategory",value = "收费类别")
    private String drugType;//收费类别
    @ApiModelProperty(name = "drugSpecifications",value = "规格")
    private String specs;//规格
    @ApiModelProperty(name = "manuFactor",value = "厂家")
    private String manuFactor;//厂家
    @ApiModelProperty(name = "stock",value = "库存")
    private String stock;//库存
    @ApiModelProperty(name = "price",value = "零售价格")
    private Double salesPrice;//零售价格
}
