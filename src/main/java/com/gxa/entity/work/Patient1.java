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
@ApiModel("返回的患者对象")
public class Patient1 {
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("年龄")
    private String age;
    @ApiModelProperty("性别")
    private String gender;
    @ApiModelProperty("状态")
    private String status;
    @ApiModelProperty("创建时间")
    private Date creatTime;
    @ApiModelProperty("医生")
    private String doctor;
    @ApiModelProperty("电话")
    private String phone;
}
