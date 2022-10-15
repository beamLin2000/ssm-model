package com.gxa.entity.drugManagement.inventoryCountingManagement;

import com.baomidou.mybatisplus.annotation.TableName;
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
@ApiModel(value = "InventoryCountingInfoArray",description = "单个工作人员对药品的盘点列表")
@TableName("drugManagement_inventoryCounting_inventoryCountingInfoArray")
public class InventoryCountingInfoArray {

    //主键id
    @ApiModelProperty(name = "id",value = "主键id",required = true)
    private Integer id;
    //药品编码
    @ApiModelProperty(name = "code",value = "药品编码",required = true)
    private String code;
    //药品名称
    @ApiModelProperty(name = "drugName",value = "药品名称",required = true)
    private String drugName;
    //货位号
    @ApiModelProperty(name = "locationNo",value = "货位号",required = true)
    private String locationNo;
    //收费类别
    @ApiModelProperty(name = "drugType",value = "收费类别",required = true)
    private String drugType;
    //规格
    @ApiModelProperty(name = "specs",value = "规格",required = true)
    private String specs;
    //生产厂家
    @ApiModelProperty(name = "manufacturer",value = "生产厂家",required = true)
    private String manufacturer;
    //当前库存数量
    @ApiModelProperty(name = "currentInventoryDataVolume",value = "当前库存数量",required = true)
    private Integer currentInventoryDataVolume;
    //盘点盈亏
    @ApiModelProperty(name = "inventoryProfitAndLoss",value = "盘点盈亏",required = true)
    private Integer inventoryProfitAndLoss;
    //盘盈盘亏
    @ApiModelProperty(name = "inventoryLoss",value = "盘盈盘亏",required = true)
    private Integer inventoryLoss;
    //备注
    @ApiModelProperty(name = "remarks",value = "备注",required = true)
    private String remarks;
}
