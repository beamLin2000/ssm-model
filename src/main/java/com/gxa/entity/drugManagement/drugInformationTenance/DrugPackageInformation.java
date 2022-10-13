package com.gxa.entity.drugManagement.drugInformationTenance;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author LXD
 * @Date 2022/10/11 19:51
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class DrugPackageInformation {
    @ApiModelProperty(value = "unit",name = "包装单位", required = true)
    private String unit;
    @ApiModelProperty(value = "unit",name = "基本系数", required = true)
    private String basicCoefficient;
    @ApiModelProperty(value = "unit",name = "基本单位", required = true)
    private String baseUnit;
    @ApiModelProperty(value = "unit",name = "剂量系数", required = true)
    private String doseCoefficient;
    @ApiModelProperty(value = "unit",name = "剂量单位", required = true)
    private String doseUnit;
    @ApiModelProperty(value = "unit",name = "采购价（元）", required = true)
    private Double purchasePrice;
    @ApiModelProperty(value = "unit",name = "零售价（元）", required = true)
    private Double retailPrice;
    @ApiModelProperty(value = "unit",name = "允许拆零", required = true)
    private Integer splitZero;
    @ApiModelProperty(value = "unit",name = "允许会员折扣", required = true)
    private Integer MemberDiscount;

}
