package com.gxa.entity.tolls;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
@TableName(value = "charge")
public class TollFinish {
    @ApiModelProperty(name = "Id",value = "序号")
    private Integer Id;
    @ApiModelProperty(name = "insurancePayment",value = "医保支付")
    private Integer insurancePayment;
    @ApiModelProperty(name = "amountPaid",value = "应收金额")
    private Double amountPaid;
    @ApiModelProperty(name = "payMethod",value = "收费方式")
    private String payMethod;
    @ApiModelProperty(name = "collectionRemarks",value = "收费员")
    private String collectionRemarks;
    @ApiModelProperty(name = "changeMoney",value = "找零")
    private Double changeMoney;
    @ApiModelProperty(name = "registrationForm",value = "订单编号")
    private String registrationForm;
    @ApiModelProperty(name = "registrationDateTime",value = "收费日期")
    private Date registrationDateTime;


}
