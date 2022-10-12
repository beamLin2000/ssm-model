package com.gxa.entity.drugRetail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel("药品零售实体")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrugRetail {
    @ApiModelProperty(name = "name",value = "患者姓名")
    private String name;
    @ApiModelProperty(name = "cardId",value = "患者卡号")
    private String cardId;
    @ApiModelProperty(name = "age",value = "患者年龄")
    private Integer age;
    @ApiModelProperty(name = "birthday",value = "出生日期")
    private Date birthday;
    @ApiModelProperty(name = "gender",value = "性别")
    private String gender;
    @ApiModelProperty(name = "phoneNo",value = "手机号码")
    private String phoneNo;
    @ApiModelProperty(name = "idNo",value = "证件号码")
    private String idNo;
    @ApiModelProperty(name = "drugCode",value = "药品编码")
    private String drugCode;
    @ApiModelProperty(name = "drugName",value = "药品名称")
    private String drugName;
    @ApiModelProperty(name = "drugSpecifications",value = "药品规格")
    private String drugSpecifications;
    @ApiModelProperty(name = "num",value = "数量")
    private String num;
    @ApiModelProperty(name = "company",value = "单位")
    private String company;
    @ApiModelProperty(name = "price",value = "单价")
    private BigDecimal price;
    @ApiModelProperty(name = "totalPrice",value = "总价")
    private BigDecimal totalPrice;
    @ApiModelProperty(name = "operator",value = "操作员")
    private String operator;
}
