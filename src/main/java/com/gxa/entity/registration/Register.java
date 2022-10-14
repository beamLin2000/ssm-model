package com.gxa.entity.registration;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@ApiModel("挂号实体")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Register {
    @ApiModelProperty(name = "registrationForm",value = "挂号单号")
    private Integer registrationForm;
//    @ApiModelProperty(name = "department",value = "科室",required = true)
//    private String department;
    @ApiModelProperty(name = "receptionType",value = "接诊类型",required = true)
    private String receptionType;
    @ApiModelProperty(name = "attendingDoctor",value = "接诊医生",required = true)
    private String attendingDoctor;
    @ApiModelProperty(name = "registrationFee",value = "挂号费",required = true)
    private Double registrationFee;
    @ApiModelProperty(name = "consultationFee",value = "诊疗费")
    private Double consultationFee;
    @ApiModelProperty(name = "registrationDate",value = "挂号日期")
    private Date registrationDate;
    @ApiModelProperty(name = "registrationClerk",value = "挂号员")
    private String registrationClerk;
    @ApiModelProperty(name = "medicalInsurancePayment",value = "医保支付")
    private Double medicalInsurancePayment;
    @ApiModelProperty(name = "amountPaid",value = "实收金额")
    private Double amountPaid;
    @ApiModelProperty(name = "changeMoney",value = "找零")
    private Double changeMoney;
    @ApiModelProperty(name = "paymentMethod",value = "支付方式")
    private String paymentMethod;
    @ApiModelProperty(name = "collectionRemarks",value = "收款备注")
    private String collectionRemarks;
    @ApiModelProperty(name = "name",value = "患者姓名",required = true)
    private String name;
    @ApiModelProperty(name = "cardNo",value = "患者卡号")
    private String cardNo;
    @ApiModelProperty(name = "age",value = "患者年龄",required = true)
    private Integer age;
    @ApiModelProperty(name = "birthday",value = "出生日期",required = true)
    private Date birthDay;
    @ApiModelProperty(name = "gender",value = "性别",required = true)
    private String gender;
    @ApiModelProperty(name = "phoneNo",value = "手机号码")
    private String phoneNo;
    @ApiModelProperty(name = "idNo",value = "证件号码")
    private String idNo;
    @ApiModelProperty(name = "loc",value = "地址")
    private String loc;
    @ApiModelProperty(name = "remarks",value = "备注")
    private String remarks;
    private Date registrationDateTime;//收费日期
    private String status;//就诊状态
}
