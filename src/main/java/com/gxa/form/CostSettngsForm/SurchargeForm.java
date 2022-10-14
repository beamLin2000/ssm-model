package com.gxa.form.CostSettngsForm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
//附加费
@ToString
@Data
@ApiModel("附加费实体类")
public class SurchargeForm {
    @ApiModelProperty(value = "id",name = "序号",required = false)
    private Integer id;
    @ApiModelProperty(value = "surchargeName",name = "附加费名称",required = false)
    private String surchargeName;
    @ApiModelProperty(value = "prescription",name = "处方类型",required = false)
    private String prescription;
    @ApiModelProperty(value = "price",name = "金额",required = false)
    private Double price;
    @ApiModelProperty(value = "cost",name = "成本价",required = false)
    private Double cost;
    @ApiModelProperty(value = "time",name = "创建时间",required = false)
    private Date time;
    @ApiModelProperty(value = "foundPerson",name = "创建人员",required = false)
    private String foundPerson;
    @ApiModelProperty(value = "costState",name = "费用状态",required = false)
    private String costState;

    public SurchargeForm(Integer id, String surchargeName, String prescription, Double price, Double cost, Date time, String foundPerson, String costState) {
        this.id = id;
        this.surchargeName = surchargeName;
        this.prescription = prescription;
        this.price = price;
        this.cost = cost;
        this.time = time;
        this.foundPerson = foundPerson;
        this.costState = costState;
    }

    public SurchargeForm() {
    }


}
