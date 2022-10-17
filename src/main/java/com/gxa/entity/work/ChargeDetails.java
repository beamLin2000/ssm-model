package com.gxa.entity.work;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("返回收费对象实体")
public class ChargeDetails {
    @ApiModelProperty(name = "chargeName",value ="收费名称",required = true)
    private String chargeName;
    @ApiModelProperty(name = "chargeType",value ="收费类型",required = true)
    private String chargeType;
    @ApiModelProperty(name = "price",value ="单价",required = true)
    private String price;
    @ApiModelProperty(name = "total",value ="总量",required = true)
    private String total;
    @ApiModelProperty(name = "util",value ="单位",required = true)
    private String util;
    @ApiModelProperty(name = "retailAmount",value ="零售金额",required = true)
    private String retailAmount;

}
