package com.gxa.entity.tolls;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName(value = "surcharges")
public class Surcharges {
    @ApiModelProperty(name = "name",value = "额外费用名")
    private String name;
    @ApiModelProperty(name = "price",value = "额外费用")
    private Double price;
    @ApiModelProperty(name = "tollNumber",value = "订单编号")
    private String tollNumber;

}
