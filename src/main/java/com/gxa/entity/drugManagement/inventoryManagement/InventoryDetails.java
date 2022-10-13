package com.gxa.entity.drugManagement.inventoryManagement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author LXD
 * @Date 2022/10/12 16:11
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "InventoryDetails",description = "库存明细")
public class InventoryDetails {
  //序号
  @ApiModelProperty(value = "id",name = "主键id",required = true)
  private Integer id;
  //单号
  @ApiModelProperty(value = "oddNum",name = "单号",required = true)
  private String oddNum;
  //操作时间
  @ApiModelProperty(value = "operation",name = "操作时间",required = true)
  private String operation;
  //类型
  @ApiModelProperty(value = "type",name = "类型",required = true)
  private String type;
  //数量
  @ApiModelProperty(value = "num",name = "数量",required = true)
  private Integer num;
  //批号
  @ApiModelProperty(value = "batchNo",name = "批号",required = true)
  private String batchNo;
  //采购金额
  @ApiModelProperty(value = "purchaseAmount",name = "采购金额",required = true)
  private Double purchaseAmount;
  //零售金额
  @ApiModelProperty(value = "retailAmount",name = "零售金额",required = true)
  private Double retailAmount;
}
