package com.gxa.entity.drugManagement.drugInformationTenance;

import com.baomidou.mybatisplus.annotation.TableName;
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
@ApiModel(value = "DrugPackageInformation",description = "包装信息")
@TableName("drugManagement_drugInformationTenance_drugPackageInformation")
public class DrugPackageInformation {
    @ApiModelProperty(name = "id",value = "主键id")
    private Integer id;
    @ApiModelProperty(name = "unit",value = "包装单位", required = true)
    private String unit;
    @ApiModelProperty(name = "basicUnit",value = "基本系数", required = true)
    private String basicUnit;
    @ApiModelProperty(name = "baseUnit",value = "基本单位", required = true)
    private String baseUnit;
    @ApiModelProperty(name = "doseCoefficient",value = "剂量系数", required = true)
    private String doseCoefficient;
    @ApiModelProperty(name = "dosageUnit",value = "剂量单位", required = true)
    private String dosageUnit;
    @ApiModelProperty(name = "purchasePrice",value = "采购价（元）", required = true)
    private Double purchasePrice;
    @ApiModelProperty(name = "retailPrice",value = "零售价（元）", required = true)
    private Double retailPrice;
    @ApiModelProperty(name = "splitZero",value = "允许拆零", required = true)
    private Integer splitZero;
    @ApiModelProperty(name = "memberDiscount",value = "允许会员折扣", required = true)
    private Integer memberDiscount;
    private Integer drugInfoId;

}
