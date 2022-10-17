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
@ApiModel("返回的work里面的患者对象")
public class WorkPatientDto {
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("名字")
    private String name;
    @ApiModelProperty("患者卡号")
    private String card;
    @ApiModelProperty("年龄")
    private String age;
    @ApiModelProperty("出生日期")
    private Date brith;
    @ApiModelProperty("性别")
    private String gender;
    @ApiModelProperty("电话")
    private String phone;
    @ApiModelProperty("证件号码")
    private String idcard;
    @ApiModelProperty("接诊类型")
    private String type;
    @ApiModelProperty("地址")
    private String address;
    @ApiModelProperty("诊断")
    private String diagnosis;
    @ApiModelProperty("医嘱")
    private String order;
}
