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
@ApiModel("返回挂号信息实体")
public class RegisterMsgUpdate {
    @ApiModelProperty(name = "registrationForm",value = "订单编号")
    private String registrationForm;//单号
    @ApiModelProperty(name = "name",value = "患者姓名")
    private String name;
    @ApiModelProperty(name = "gender",value = "性别")
    private String gender;
    @ApiModelProperty(name = "cardNo",value = "患者卡号")
    private Integer cardNo;//患者卡号
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
    @ApiModelProperty(name = "willPaid",value = "应收金额")
    private Double willPaid;//应收金额
    @ApiModelProperty(name = "amountPaid",value = "实收金额")
    private Double amountPaid;//实收金额
    @ApiModelProperty(name = "insurancePayment",value = "医保支付")
    private Double insurancePayment;//医保支付
    @ApiModelProperty(name = "payMethod",value = "支付方式")
    private String payMethod;//支付方式
    @ApiModelProperty(name = "changeMoney",value = "找零")
    private Double changeMoney;//找零
    @ApiModelProperty(name = "registrationDateTime",value = "收费日期")
    private Date registrationDateTime;//收费日期
    @ApiModelProperty(name = "tolCollector",value = "收费员")
    private String tolCollector;//收费员
    @ApiModelProperty(name = "receptionType",value = "接诊类型")
    private String receptionType;//接诊类型
    @ApiModelProperty(name = "receptionType",value = "挂号费")
    private Double registrationFee;//挂号费
    @ApiModelProperty(name = "consultationFee",value = "诊疗费")
    private Double consultationFee;//诊疗费
}
