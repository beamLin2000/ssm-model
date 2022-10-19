package com.gxa.dto.work;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("返回的患者对象")

public class PatientDto {
    @ApiModelProperty("患者id")
    private Integer id;
    @ApiModelProperty("名字")
    private String name;
    @ApiModelProperty("年龄")
    private String age;
    @ApiModelProperty("性别")
    private String gender;
    @ApiModelProperty("状态")
    private String status;
    @ApiModelProperty("创建时间")
    private Date registrationDate;
    @ApiModelProperty("医生")
    private String attendingDoctor;
    @ApiModelProperty("电话")
    private String phoneNo;
    @ApiModelProperty(value = "身份证号",required = true)
    private String idCard;
}
