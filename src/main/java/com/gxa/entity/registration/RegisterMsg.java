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
@ApiModel("挂号信息实体")
public class RegisterMsg {
    @ApiModelProperty(name = "registrationForm",value = "挂号单号")
    private String registrationForm;
    @ApiModelProperty(name = "name",value = "患者姓名")
    private String name;
    @ApiModelProperty(name = "gender",value = "性别")
    private String gender;
    @ApiModelProperty(name = "age",value = "年龄")
    private Integer age;
    @ApiModelProperty(name = "phoneNo",value = "手机号码")
    private String phoneNo;
    @ApiModelProperty(name = "attendingDoctor",value = "接诊医生")
//    private String department;
    private String attendingDoctor;
    @ApiModelProperty(name = "receptionTime",value = "接诊时间")
    private Date receptionTime;
    @ApiModelProperty(name = "willPaid",value = "应收金额")
    private Double willPaid;
    @ApiModelProperty(name = "amountPaid",value = "实收金额")
    private Double amountPaid;
    @ApiModelProperty(name = "status",value = "就诊状态")
    private String status;
}
