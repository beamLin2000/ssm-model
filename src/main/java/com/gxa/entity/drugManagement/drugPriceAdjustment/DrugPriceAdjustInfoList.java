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
    //采购编号
    @ApiModelProperty(value = "purchaseNo",name = "采购编号",required = true)
    private String purchaseNo;
    //规格
    @ApiModelProperty(value = "specs",name = "规格",required = true)
    private String specs;
    //库存量
    @ApiModelProperty(value = "Inventory",name = "库存量",required = true)
    private Integer inventory;
    //批号
    @ApiModelProperty(value = "batchNo",name = "批号",required = true)
    private String batchNo;
    //采购价
    @ApiModelProperty(value = "purchasePrice",name = "采购价",required = true)
    private Double purchasePrice;
    //原零售价
    @ApiModelProperty(value = "originalZeroPrice",name = "原零售价",required = true)
    private Double originalZeroPrice;
    //现零售价
    @ApiModelProperty(value = "spotSellingPrice",name = "现零售价",required = true)
    private Double spotSellingPrice;
    //差价
    @ApiModelProperty(value = "priceDifference",name = "差价",required = true)
    private Double priceDifference;
    //比例
    @ApiModelProperty(value = "proportion",name = "比例",required = true)
    private String proportion;
    //备注
    @ApiModelProperty(value = "remarks",name = "备注",required = true)
    private String remarks;
    //操作时间
    @ApiModelProperty(value = "operationTime",name = "操作时间",required = true)
    private String operationTime;
    //操作员
    @ApiModelProperty(value = "operator",name = "操作员",required = true)
    private String operator;
}
