package com.gxa.entity.tolls;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Toll {
    @ApiModelProperty(name = "tollId",value = "序号")
    private Integer tollId;
    @ApiModelProperty(name = "tollNumber",value = "订单编号")
    private Integer tollNumber;
    @ApiModelProperty(name = "tollType",value = "订单类型")
    private String tollType;
    @ApiModelProperty(name = "tollName",value = "姓名")
    private String tollName;
    @ApiModelProperty(name = "tollGender",value = "性别")
    private String tollGender;
    @ApiModelProperty(name = "tollAge",value = "年龄")
    private Integer tollAge;
    @ApiModelProperty(name = "tollPhone",value = "手机号码")
    private String tollPhone;
    @ApiModelProperty(name = "tollDoctor",value = "接诊医生")
    private String tollDoctor;
    @ApiModelProperty(name = "tollCreatTime",value = "创建时间")
    private Date tollCreatTime;
    @ApiModelProperty(name = "tollMoney",value = "应收金额")
    private Integer tollMoney;
    @ApiModelProperty(name = "tollState",value = "收费状态")
    private Integer tollState;

}
