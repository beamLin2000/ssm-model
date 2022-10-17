package com.gxa.entity.work;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Charge {
    @ApiModelProperty(name = "chargeType",value ="收费类型",required = true)
    private String chargeType;
    @ApiModelProperty(name = "chargeStatus",value ="收费状态",required = true)
    private String chargeStatus;
    @ApiModelProperty(name = "chargeNum",value ="订单编号",required = true)
    private String chargeNum;
    @ApiModelProperty(name = "amountReceivable",value ="应收金额",required = true)
    private Double amountReceivable;
    @ApiModelProperty(name = "netReceipts",value ="实收金额",required = true)
    private Double netReceipts;
    @ApiModelProperty(name = "paymentMethod",value ="支付方式")
    private String paymentMethod;
    @ApiModelProperty(name = "chargePerson",value ="支付人")
    private String chargePerson;
    @ApiModelProperty(name = "chargeTime",value ="支付时间")
    private Date chargeTime;
    @ApiModelProperty(name = "charges",value ="收费详细",required = true)
    private List<ChargeDetails> charges;

}
