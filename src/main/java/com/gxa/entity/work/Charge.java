package com.gxa.entity.work;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("charge_info")
@Setter
@Getter
public class Charge {
    @ApiModelProperty(name = "chargeType",value ="收费类型",required = true)
    @TableField("charge_type")
    private String chargeType;
    @ApiModelProperty(name = "chargeStatus",value ="收费状态",required = true)
    @TableField("charge_status")
    private String chargeStatus;
    @ApiModelProperty(name = "chargeNum",value ="订单编号",required = true)
    @TableField("charge_num")
    private String chargeNum;
    @ApiModelProperty(name = "amountReceivable",value ="应收金额",required = true)
    @TableField("amount_receivable")
    private Double amountReceivable;
    @ApiModelProperty(name = "netReceipts",value ="实收金额",required = true)
    @TableField("net_receipts")
    private Double netReceipts;
    @ApiModelProperty(name = "paymentMethod",value ="支付方式")
    @TableField("payment_method")
    private String paymentMethod;
    @ApiModelProperty(name = "chargePerson",value ="支付人")
    @TableField("charge_person")
    private String chargePerson;
    @ApiModelProperty(name = "chargeTime",value ="支付时间")
    @TableField("charge_time")
    private Date chargeTime;
}
