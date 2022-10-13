package com.gxa.entity.drugManagement.drugPriceAdjustment;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :林溪
 * @date : 2022/10/12 16:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "DrugPriceAdjustInfoList",description = "新增调价历史记录")
public class DrugPriceAdjustInfoList {
    @ApiModelProperty(name = "id",value = "主键id")
    private Integer id;
    //采购编号
    @ApiModelProperty(name = "purchaseNo",value = "采购编号",required = true)
    private String purchaseNo;
    //规格
    @ApiModelProperty(name = "specs",value = "规格",required = true)
    private String specs;
    //库存量
    @ApiModelProperty(name = "Inventory",value = "库存量",required = true)
    private Integer inventory;
    //批号
    @ApiModelProperty(name = "batchNo",value = "批号",required = true)
    private String batchNo;
    //采购价
    @ApiModelProperty(name = "purchasePrice",value = "采购价",required = true)
    private Double purchasePrice;
    //原零售价
    @ApiModelProperty(name = "originalZeroPrice",value = "原零售价",required = true)
    private Double originalZeroPrice;
    //现零售价
    @ApiModelProperty(name = "spotSellingPrice",value = "现零售价",required = true)
    private Double spotSellingPrice;
    //差价
    @ApiModelProperty(name = "priceDifference",value = "差价",required = true)
    private Double priceDifference;
    //比例
    @ApiModelProperty(name = "proportion",value = "比例",required = true)
    private String proportion;
    //备注
    @ApiModelProperty(name = "remarks",value = "备注",required = true)
    private String remarks;
    //操作时间
    @ApiModelProperty(name = "operationTime",value = "操作时间",required = true)
    private String operationTime;
    //操作员
    @ApiModelProperty(name = "operator",value = "操作员",required = true)
    private String operator;
}
