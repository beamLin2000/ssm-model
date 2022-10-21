package com.gxa.form.systemSettings.CostSettngsForm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("支付方式实体类")
public class PaymentMethodForm {
    @ApiModelProperty(value = "id",name = "id",required = false)
    private Integer id;
    @ApiModelProperty(value = "state",name = "状态",required = false)
    private String state;


}
