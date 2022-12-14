package com.gxa.entity.drugManagement.inventoryManagement;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gxa.entity.drugManagement.drugInformationTenance.DrugBasicInformation;
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
@ApiModel(value = "InventoryInfo",description = "库存管理列表")
@TableName("drugManagement_inventoryManagement_inventoryDetails")
public class InventoryInfo {
    //主键
    @ApiModelProperty(name = "id",value = "主键id",required = true)
    private Integer id;
    //药品编码
    @ApiModelProperty(name = "code",value = "药品编码",required = true)
    private String code;//
    //货位号
    @ApiModelProperty(name = "locationNo",value = "货位号",required = true)
    private String locationNo;
    //药品名称
    @ApiModelProperty(name = "medicalName",value = "药品名称",required = true)
    private String medicalName;//
    //处方类型
    @ApiModelProperty(name = "drugType",value = "处方类别",required = true)
    private String drugType;
    //规格
    @ApiModelProperty(name = "specs",value = "药品/规格",required = true)
    private String specs;
    //剂型
    @ApiModelProperty(name = "dosage",value = "药品/剂型",required = true)
    private String dosage;
    //厂家
    @ApiModelProperty(name = "manufacturer",value = "厂家",required = true)
    private String manufacturer;//
    //库存
    @ApiModelProperty(name = "stock",value = "库存数量",required = true)
    private Integer stock;
    //采购金额
    @ApiModelProperty(name = "purchaseAmount",value = "采购金额",required = true)
    private Double purchaseAmount;
    //零售金额
    @ApiModelProperty(name = "retailAmount",value = "零售金额",required = true)
    private Double retailAmount;


    //收费类别
//    @ApiModelProperty(name = "chargeCategory",value = "收费类型",required = true)
//    private String chargeCategory;
    //库存数量

    //药品信息
    private Integer drugInfoId;
    //查看明细
    @ApiModelProperty(name = "inventoryDetails",value = "库存明细",required = true)
    private List<InventoryDetails> inventoryDetails;
}
