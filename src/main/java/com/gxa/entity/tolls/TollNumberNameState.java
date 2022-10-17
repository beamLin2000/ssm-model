package com.gxa.entity.tolls;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TollNumberNameState {
    @ApiModelProperty(name = "tollNumberName",value = "订单编号/姓名")
    private String tollNumberName;
    @ApiModelProperty(name = "tollState",value = "收费状态")
    private Integer tollState;
}
