package com.gxa.entity.drugManagement.drugPriceAdjustment;

import com.baomidou.mybatisplus.annotation.TableName;
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
@ApiModel(value = "DrugPriceAdjustInfo",description = "药品调价table表")
@TableName("drugManagement_drugPriceAdjustment_drugPriceAdjustInfo")
public class DrugPriceAdjustInfo {
    @ApiModelProperty(name = "id",value = "主键id")
    private Integer id;
    //药品编码
    @ApiModelProperty(name = "code",value = "药品编码",required = true)
    private String code;
    //药品名称
    @ApiModelProperty(name = "drugName",value = "药品名称",required = true)
    private String drugName;
    //处方类型
    @ApiModelProperty(name = "drugType",value = "处方类型",required = true)
    private String drugType;
    //规格
    @ApiModelProperty(name = "specifications",value = "规格",required = true)
    private String specifications;
    //剂型
    @ApiModelProperty(name = "pharmaceuticalDosage",value = "剂型",required = true)
    private String pharmaceuticalDosage;
    //生产厂家
    @ApiModelProperty(name = "manufacture",value = "生产厂家",required = true)
    private String manufacture;
    //调价次数
    @ApiModelProperty(name = "priceAdjustmentTimes",value = "调价次数",required = true)
    private Integer priceAdjustmentTimes;

    @ApiModelProperty(name = "drugPriceAdjustInfoLists",value = "查看调价详情，调价的历史",required = true)
    private List<DrugPriceAdjustInfoList> drugPriceAdjustInfoLists;
}
