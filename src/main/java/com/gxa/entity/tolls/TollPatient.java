package com.gxa.entity.tolls;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class TollPatient {
    @ApiModelProperty(name = "tollPatientId",value = "id")
    private Integer tollPatientId;
    @ApiModelProperty(name = "tollPatientNumber",value = "门诊编号")
    private Integer tollPatientNumber;
    @ApiModelProperty(name = "tollPatientDoctor",value = "接诊医生")
    private String tollPatientDoctor;
    @ApiModelProperty(name = "tollPatientTime",value = "接诊日期")
    private Date tollPatientTime;
    @ApiModelProperty(name = "tollPatientType",value = "接诊类型")
    private String tollPatientType;
    @ApiModelProperty(name = "patientId",value = "患者ID")
    private Integer patientId;
}