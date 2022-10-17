package com.gxa.entity.tolls;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class TollInquire {
    @ApiModelProperty(name = "tollType",value = "订单类型")
    private String tollType;
    @ApiModelProperty(name = "tollState",value = "收费状态")
    private Integer tollState;
    @ApiModelProperty(name = "tollCreatTime",value = "创建时间")
    private String tollDateTime;
    @ApiModelProperty(name = "tollNameCard",value = "姓名/编号")
    private String tollNameCard;
}
