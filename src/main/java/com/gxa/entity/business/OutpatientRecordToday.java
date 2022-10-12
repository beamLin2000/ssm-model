package com.gxa.entity.business;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("返回对象实体")
public class OutpatientRecordToday {
    @ApiModelProperty("序号")
    private Integer id;
    @ApiModelProperty("就诊状态")
    private String status;
    @ApiModelProperty("患者编号")
    private String patientsNum;
    @ApiModelProperty("患者姓名")
    private String patientsName;
    @ApiModelProperty("性别")
    private String gender;
    @ApiModelProperty("年龄")
    private String age;
    @ApiModelProperty("电话号码")
    private String phone;
    @ApiModelProperty("门诊类型")
    private String type;
    @ApiModelProperty("挂号医生")
    private String doctor;
    @ApiModelProperty("最后更新时间")
    private Date lastUpdateTime;
}
