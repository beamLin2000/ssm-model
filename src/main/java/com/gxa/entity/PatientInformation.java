package com.gxa.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("患者信息实体")
public class PatientInformation {
    @ApiModelProperty(name = "患者姓名",required = true)
    private String patientName;
    @ApiModelProperty("患者卡号")
    private Integer patientCardNo;
    @ApiModelProperty(name = "患者年龄",required = true)
    private Integer patientAge;
    @ApiModelProperty(name = "出生日期",required = true)
    private Date birthDay;
    @ApiModelProperty(name = "性别",required = true)
    private String gender;
    @ApiModelProperty("手机号码")
    private Integer phoneNo;
    @ApiModelProperty("证件号码")
    private Integer idNo;
    @ApiModelProperty("地址")
    private String location;
    @ApiModelProperty("备注")
    private String remarks;
}
