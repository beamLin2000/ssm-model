package com.gxa.entity.tolls;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "toll_patient")
public class TollPatient {
    @ApiModelProperty(name = "tollPatientId", value = "id")
    private Integer tollPatientId;
    @ApiModelProperty(name = "tollPatientNumber", value = "门诊编号")
    private Integer tollPatientNumber;
    @ApiModelProperty(name = "tollPatientDoctor", value = "接诊医生")
    private String tollPatientDoctor;
    @ApiModelProperty(name = "tollPatientTime", value = "接诊日期")
    private Date tollPatientTime;
    @ApiModelProperty(name = "tollPatientType", value = "接诊类型")
    private String tollPatientType;
    @ApiModelProperty(name = "tollId", value = "序号")
    private Integer tollId;
}