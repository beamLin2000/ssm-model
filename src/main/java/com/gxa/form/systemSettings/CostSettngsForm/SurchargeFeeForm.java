package com.gxa.form.systemSettings.CostSettngsForm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
//附加费
@ToString
@Data
@ApiModel("附加费实体类")
public class SurchargeFeeForm {

    private Integer id;
    @ApiModelProperty(value = "surchargeName",name = "附加费名称",required = false)
    private String surchargeName;
    @ApiModelProperty(value = "prescription",name = "处方类型",required = false)
    private String prescription;
    @ApiModelProperty(value = "price",name = "金额",required = false)
    private Double price;
    @ApiModelProperty(value = "cost",name = "成本价",required = false)
    private Double cost;
    @ApiModelProperty(value = "foundPerson",name = "创建人员",required = false)
    private String foundPerson;
    @ApiModelProperty(value = "costState",name = "费用状态",required = false)
    private String costState;

    public SurchargeFeeForm(Integer id, String surchargeName, String prescription, Double price, Double cost, String foundPerson, String costState) {
        this.id = id;
        this.surchargeName = surchargeName;
        this.prescription = prescription;
        this.price = price;
        this.cost = cost;

        this.foundPerson = foundPerson;
        this.costState = costState;
    }

    public SurchargeFeeForm() {
    }


}
