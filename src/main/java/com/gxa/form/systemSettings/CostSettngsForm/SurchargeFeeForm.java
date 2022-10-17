package com.gxa.form.systemSettings.CostSettngsForm;

import com.gxa.entity.systemSettings.PrescriptionTable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
//附加费

@Data
@ApiModel("附加费实体类")
@AllArgsConstructor
@NoArgsConstructor
public class SurchargeFeeForm {

    private Integer id;
    @ApiModelProperty(value = "surchargeName",name = "附加费名称",required = false)
    private String surchargeName;
    @ApiModelProperty(value = "price",name = "金额",required = false)
    private Double price;
    @ApiModelProperty(value = "cost",name = "成本价",required = false)
    private Double cost;
    @ApiModelProperty(value = "foundPerson",name = "创建人员",required = false)
    private String foundPerson;
    @ApiModelProperty(value = "costState",name = "费用状态",required = false)
    private String costState;
    @ApiModelProperty(value = "prescriptionTable",name = "处方外键",required = false)
    private Integer perscrip_id;
    @ApiModelProperty(value = "prescriptionTable",name = "处方对象",required = false)
    private PrescriptionTable prescriptionTable;




}
