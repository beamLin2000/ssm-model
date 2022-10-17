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
    @ApiModelProperty(name = "tollPatientCard", value = "门诊编号")
    private String tollPatientCard;
    @ApiModelProperty(name = "tollPatientDoctor", value = "接诊医生")
    private String tollPatientDoctor;
    @ApiModelProperty(name = "tollPatientTime", value = "接诊日期")
    private Date tollPatientTime;
    @ApiModelProperty(name = "tollPatientType", value = "接诊类型")
    private String tollPatientType;
    @ApiModelProperty(name = "tollNumber",value = "订单编号")
    private String tollNumber;
}