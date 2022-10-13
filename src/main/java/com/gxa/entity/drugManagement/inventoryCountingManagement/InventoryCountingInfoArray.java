package com.gxa.entity.drugManagement.inventoryCountingManagement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :林溪
 * @date : 2022/10/12 16:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class InventoryCountingInfoArray {

    //主键id
    @ApiModelProperty(value = "id",name = "主键id",required = true)
    private Integer id;
    //药品编码
    @ApiModelProperty(value = "code",name = "药品编码",required = true)
    private String code;
    //药品名称
    @ApiModelProperty(value = "drugName",name = "药品名称",required = true)
    private String drugName;
    //货位号
    @ApiModelProperty(value = "locationNo",name = "货位号",required = true)
    private String locationNo;
    //收费类别
    @ApiModelProperty(value = "chargeCategory",name = "收费类别",required = true)
    private String chargeCategory;
    //规格
    @ApiModelProperty(value = "specs",name = "规格",required = true)
    private String specs;
    //生产厂家
    @ApiModelProperty(value = "manufacturer",name = "生产厂家",required = true)
    private String manufacturer;
    //当前库存数量
    @ApiModelProperty(value = "currentInventoryDataVolume",name = "当前库存数量",required = true)
    private Integer currentInventoryDataVolume;
    //盘点盈亏
    @ApiModelProperty(value = "inventoryProfitAndLoss",name = "盘点盈亏",required = true)
    private Integer inventoryProfitAndLoss;
    //盘盈盘亏
    @ApiModelProperty(value = "inventoryLoss",name = "盘盈盘亏",required = true)
    private Integer inventoryLoss;
    //备注
    @ApiModelProperty(value = "remarks",name = "备注",required = true)
    private String remarks;
}
