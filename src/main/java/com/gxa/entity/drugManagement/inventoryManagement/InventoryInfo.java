package com.gxa.entity.drugManagement.inventoryManagement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author LXD
 * @Date 2022/10/12 15:56
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class InventoryInfo {
    //主键
    @ApiModelProperty(value = "id",name = "主键id",required = true)
    private Integer id;
    //药品编码
    @ApiModelProperty(value = "drugCode",name = "药品编码",required = true)
    private String drugCode;
    //货位号
    @ApiModelProperty(value = "locationNo",name = "货位号",required = true)
    private String locationNo;
    //处方类型
    @ApiModelProperty(value = "prescriptionType",name = "处方类型",required = true)
    private String prescriptionType;
    //规格
    @ApiModelProperty(value = "specs",name = "规格",required = true)
    private String specs;
    //剂型
    @ApiModelProperty(value = "dosage",name = "剂型",required = true)
    private String dosage;
    //厂家
    @ApiModelProperty(value = "manuFactor",name = "厂家",required = true)
    private String manuFactor;
    //库存
    @ApiModelProperty(value = "stock",name = "库存",required = true)
    private Integer stock;
    //采购金额
    @ApiModelProperty(value = "purchaseAmount",name = "采购金额",required = true)
    private Double purchaseAmount;
    //零售金额
    @ApiModelProperty(value = "retailAmount",name = "零售金额",required = true)
    private Double retailAmount;


    //查看库存明细
    @ApiModelProperty(value = "viewInventoryDetails",name = "查看库存明细",required = true)
    private ViewInventoryDetails viewInventoryDetails;
    //库存明细
    @ApiModelProperty(value = "inventoryDetails",name = "库存明细",required = true)
    private List<InventoryDetails> inventoryDetails;
}