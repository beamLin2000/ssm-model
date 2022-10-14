package com.gxa.form.CostSettngsForm;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//诊疗费
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("诊疗费实体类")
public class TreatmentForm {
    @ApiModelProperty(value = "id",name = "序号",required = false)
    private Integer id;
    @ApiModelProperty(value = "treatment",name = "附加费名称",required = false)
    private String treatment;
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




}
