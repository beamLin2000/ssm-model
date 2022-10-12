package com.gxa.entity.registration;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@ApiModel("患者实体")
@AllArgsConstructor
@NoArgsConstructor
public class PatientMsg {
    @ApiModelProperty(name = "name",value = "患者姓名",required = true)
    private String name;
    @ApiModelProperty(name = "cardNo",value = "患者卡号")
    private String cardNo;
    @ApiModelProperty(name = "age",value = "患者年龄",required = true)
    private Integer age;
    @ApiModelProperty(name = "birthday",value = "出生日期",required = true)
    private Date birthDay;
    @ApiModelProperty(name = "gender",value = "性别",required = true)
    private String gender;
    @ApiModelProperty(name = "phoneNo",value = "手机号码")
    private String phoneNo;
    @ApiModelProperty(name = "idNo",value = "证件号码")
    private String idNo;
    @ApiModelProperty(name = "loc",value = "地址")
    private String loc;
    @ApiModelProperty(name = "remarks",value = "备注")
    private String remarks;
}
