package com.gxa.entity.registration;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel("挂号实体")
@Data
public class Register {
    @ApiModelProperty("挂号单号")
    private Integer registrationForm;
    @ApiModelProperty(name = "科室",required = true)
    private String department;
    @ApiModelProperty(name = "接诊类型",required = true)
    private String receptionType;
    @ApiModelProperty(name = "接诊医生",required = true)
    private String attendingDoctor;
    @ApiModelProperty(name = "挂号费",required = true)
    private Double registrationFee;
    @ApiModelProperty("诊疗费")
    private Double consultationFee;
    @ApiModelProperty("挂号日期")
    private Date registrationDate;
    @ApiModelProperty("挂号员")
    private String registrationClerk;
    @ApiModelProperty("实收金额")
    private Double amountPaid;
}
