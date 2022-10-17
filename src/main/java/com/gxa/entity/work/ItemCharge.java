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
@ApiModel("接收的检查项目")
public class ItemCharge {
    @ApiModelProperty(value = "项目检查",required = true)
    private String type;
    @ApiModelProperty(value = "名字",required = true)
    private String name;
    @ApiModelProperty(value = "备注",required = true)
    private String notes;
    @ApiModelProperty(value = "数量",required = true)
    private Integer num;
    @ApiModelProperty(value = "单价",required = true)
    private Double univalent;
    @ApiModelProperty(value = "总金额",required = true)
    private Double totalUnivalent;
    @ApiModelProperty(value = "身份证号",required = true)
    private String idCard;
    @ApiModelProperty(value = "病人名字",required = true)
    private String personName;
    @ApiModelProperty(value = "创建时间",required = true)
    private Date createTime;
}
