package com.gxa.entity.drugManagement.inventoryManagement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author LXD
 * @Date 2022/10/12 16:07
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class ViewInventoryDetails {
    //药品编码
    @ApiModelProperty(value = "drugCode",name = "药品编码",required = true)
    private String drugCode;
    //药品名称
    @ApiModelProperty(value = "drugName",name = "药品名称",required = true)
    private String drugName;
    //收费类别
    @ApiModelProperty(value = "chargeCategory",name = "收费类别",required = true)
    private String chargeCategory;
    //药品规格
    @ApiModelProperty(value = "drugSpecifications",name = "药品规格",required = true)
    private String drugSpecifications;
    //药品剂型
    @ApiModelProperty(value = "drugDosage",name = "药品剂型",required = true)
    private String drugDosage;
    //生产厂家
    @ApiModelProperty(value = "manuFactor",name = "生产厂家",required = true)
    private String manuFactor;
    //库存数量
    @ApiModelProperty(value = "stockNum",name = "库存数量",required = true)
    private Integer stockNum;
}
