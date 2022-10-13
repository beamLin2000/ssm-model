package com.gxa.entity.drugManagement.drugPriceAdjustment;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/12 15:53
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel
public class DrugPriceAdjustInfo {
    @ApiModelProperty(value = "id",name = "主键id",required = true)
    //主键id
    private Integer id;
    //药品编码
    @ApiModelProperty(value = "code",name = "药品编码",required = true)
    private String code;
    //药品名称
    @ApiModelProperty(value = "drugName",name = "药品名称",required = true)
    private String drugName;
    //处方类型
    @ApiModelProperty(value = "drugType",name = "处方类型",required = true)
    private String drugType;
    //规格
    @ApiModelProperty(value = "specifications",name = "规格",required = true)
    private String specifications;
    //剂型
    @ApiModelProperty(value = "pharmaceuticalDosage",name = "剂型",required = true)
    private String pharmaceuticalDosage;
    //生产厂家
    @ApiModelProperty(value = "manufacture",name = "生产厂家",required = true)
    private String manufacture;
    //调价次数
    @ApiModelProperty(value = "priceAdjustmentTimes",name = "调价次数",required = true)
    private Integer priceAdjustmentTimes;

    @ApiModelProperty(value = "drugPriceAdjustInfoLists",name = "查看调价详情，调价的历史",required = true)
    private List<DrugPriceAdjustInfoList> drugPriceAdjustInfoLists;
}
