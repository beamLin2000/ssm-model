package com.gxa.entity.work;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("附加费用")
public class Surcharges {
    @ApiModelProperty(value = "附加费用名字",required = true)
    private String name;
    @ApiModelProperty(value = "价格",required = true)
    private Double price;
    @ApiModelProperty(value = "身份证号",required = true)
    private String idCard;
    @ApiModelProperty(value = "病人名字",required = true)
    private String personName;
    @ApiModelProperty(value = "创建时间",required = true)
    private Date createTime;
}
