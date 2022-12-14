package com.gxa.form.systemSettings.CostSettngsForm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//挂号费
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("挂号费实体类")
public class RegisterFeeForm {
    @ApiModelProperty(value = "id",name = "序号",required = false)
    private Integer id;
    @ApiModelProperty(value = "registerName",name = "挂号费费名称",required = false)
    private String registerName;
    @ApiModelProperty(value = "price",name = "金额",required = false)
    private Double price;
    @ApiModelProperty(value = "cost",name = "成本价",required = false)
    private Double cost;
    @ApiModelProperty(value = "foundPerson",name = "创建人员",required = false)
    private String foundPerson;
    @ApiModelProperty(value = "costState",name = "费用状态",required = false)
    private String costState;

    public RegisterFeeForm(String registerName, Double price, Double cost, String foundPerson, String costState) {
        this.registerName = registerName;
        this.price = price;
        this.cost = cost;
        this.foundPerson = foundPerson;
        this.costState = costState;
    }
}
