package com.gxa.entity.registration;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("编辑挂号信息实体")
public class RegisterUpdate {
    @ApiModelProperty(name = "registrationForm",value = "订单编号")
    private String registrationForm;//单号
    @ApiModelProperty(name = "gender",value = "性别")
    private String gender;
    @ApiModelProperty(name = "idNo",value = "证件号码")
    private String idNo;//证件号码
    @ApiModelProperty(name = "loc",value = "地址")
    private String loc;
    @ApiModelProperty(name = "remarks",value = "备注")
    private String remarks;
    @ApiModelProperty(name = "birthDay",value = "出生日期")
    private Date birthDay;
    @ApiModelProperty(name = "age",value = "患者年龄")
    private Integer age;
    @ApiModelProperty(name = "phoneNo",value = "手机号码")
    private String phoneNo;
    @ApiModelProperty(name = "attendingDoctor",value = "接诊医生")
    private String attendingDoctor;//接诊医生
    @ApiModelProperty(name = "receptionType",value = "接诊类型")
    private String receptionType;//接诊类型
}
