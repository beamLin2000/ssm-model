package com.gxa.entity.work;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("接收的中西药信息")
public class MedicalCharge {
    @ApiModelProperty(value = "是中药处方还是西药处方",required = true)
    private String type;
    @ApiModelProperty(value = "药品名字",required = true)
    private String name;
    @ApiModelProperty(value = "单次用量",required = true)
    private String singleDose;
    @ApiModelProperty(value = "用法",required = true)
    private String usage;
    @ApiModelProperty(value = "频度",required = true)
    private String frequency;
    @ApiModelProperty(value = "天数",required = true)
    private String days;
    @ApiModelProperty(value = "总量",required = true)
    private String total;
    @ApiModelProperty(value = "单价",required = true)
    private Double price;
    @ApiModelProperty(value = "总价",required = true)
    private Double totalPrice;
    @ApiModelProperty(value = "身份证号",required = true)
    private String idCard;
    @ApiModelProperty(value = "病人名字",required = true)
    private String personName;
    @ApiModelProperty(value = "创建时间",required = true)
    private Date createTime;
    @ApiModelProperty(value = "附加费用",required = true)
    private List<Surcharges> surcharges;
}
