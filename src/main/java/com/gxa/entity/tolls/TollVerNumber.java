package com.gxa.entity.tolls;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TollVerNumber {
    @ApiModelProperty(name = "tollDrugsVer",value = "项目明细(西药,中药,检查项目)")
    private String tollDrugsVer;
    @ApiModelProperty(name = "tollNumber",value = "订单编号")
    private String tollNumber;
}
