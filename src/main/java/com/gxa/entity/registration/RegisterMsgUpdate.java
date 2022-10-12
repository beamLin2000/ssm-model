package com.gxa.entity.registration;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterMsgUpdate {
    private String registrationForm;//单号
    private String name;
    private String gender;
    private String cardNo;//患者卡号
    private String idNo;//证件号码
    private String loc;
    private String remarks;
    private Date birthDay;
    private Integer age;
    private String phoneNo;
    private String department;
    private String attendingDoctor;//接诊医生
    private BigDecimal willPaid;//应收金额
    private BigDecimal amountPaid;//实收金额
    private BigDecimal discountPaid;//优惠金额
    private BigDecimal insurancePayment;//医保支付
    private String payMethod;//支付方式
    private BigDecimal changeMoney;//找零
    private Date registrationDateTime;//收费日期
    private String tolCcollector;//收费员
    private String receptionType;//接诊类型
    private Double registrationFee;//挂号费
    private Double consultationFee;//诊疗费
}
