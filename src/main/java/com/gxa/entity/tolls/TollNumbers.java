package com.gxa.entity.tolls;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TollNumbers {
    @ApiModelProperty(name = "tollNumber",value = "订单编号")
    private String tollNumber;
}
