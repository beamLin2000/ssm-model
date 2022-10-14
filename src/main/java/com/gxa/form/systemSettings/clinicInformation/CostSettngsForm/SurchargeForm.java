package com.gxa.form.systemSettings.clinicInformation.CostSettngsForm;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class SurchargeForm {
    @ApiModelProperty(value = "id",name = "id",required = false)
    private Integer id;
    @ApiModelProperty(value = "id",name = "id",required = false)
    private String surchargeName;
    @ApiModelProperty(value = "id",name = "id",required = false)
    private String prescription;
    @ApiModelProperty(value = "id",name = "id",required = false)
    private Double price;
    @ApiModelProperty(value = "id",name = "id",required = false)
    private Double cost;
    @ApiModelProperty(value = "id",name = "id",required = false)
    private Date time;
    @ApiModelProperty(value = "id",name = "id",required = false)
    private String foundPerson;
    @ApiModelProperty(value = "id",name = "id",required = false)
    private String costState;




}
