package com.gxa.entity.registration;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel("挂号实体")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Register {
    @ApiModelProperty(name = "registrationForm",value = "挂号单号")
    private Integer registrationForm;
    @ApiModelProperty(name = "department",value = "科室",required = true)
    private String department;
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
    @ApiModelProperty(name = "discountAmount",value = "优惠金额")
    private BigDecimal discountAmount;
    @ApiModelProperty(name = "discount",value = "折扣")
    private Integer discount;
    @ApiModelProperty(name = "medicalInsurancePayment",value = "医保支付")
    private BigDecimal medicalInsurancePayment;
    @ApiModelProperty(name = "amountPaid",value = "实收金额")
    private BigDecimal amountPaid;
    @ApiModelProperty(name = "paymentMethod",value = "支付方式")
    private String paymentMethod;
    @ApiModelProperty(name = "collectionRemarks",value = "收款备注")
    private String collectionRemarks;

}
