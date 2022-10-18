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
    @ApiModelProperty(name = "drugType",value = "类别")
    private String drugType;
    @ApiModelProperty(name = "drugCodeOrName",value = "药品编码或名称")
    private String drugCodeOrName;
}
