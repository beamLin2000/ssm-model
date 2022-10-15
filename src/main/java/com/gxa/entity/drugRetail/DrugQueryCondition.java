package com.gxa.entity.drugRetail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("药品查询条件实体")
public class DrugQueryCondition {
    @ApiModelProperty(name = "chargeCategory",value = "类别")
    private String chargeCategory;
    @ApiModelProperty(name = "drugCode",value = "药品编码")
    private String drugCode;
    @ApiModelProperty(name = "drugName",value = "药品名称")
    private String drugName;
}