package com.gxa.entity.drugManagement.inventoryManagement;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("drugManagement_inventoryManagement_inventoryDetail")
public class InventoryDetails {
  //序号
  @ApiModelProperty(name = "id",value = "主键id",required = true)
  private Integer id;
  //单号
  @ApiModelProperty(name = "oddNum",value = "单号",required = true)
  private String oddNum;
  //操作时间
  @ApiModelProperty(name = "operation",value = "操作时间",required = true)
  private String operation;
  //类型
  @ApiModelProperty(name = "type",value = "类型",required = true)
  private String type;
  //数量
  @ApiModelProperty(name = "num",value = "数量",required = true)
  private Integer num;
  //批号
  @ApiModelProperty(name = "batchNo",value = "批号",required = true)
  private String batchNo;
  //采购金额
  @ApiModelProperty(name = "purchaseAmount",value = "采购金额",required = true)
  private Double purchaseAmount;
  //零售金额
  @ApiModelProperty(name = "retailAmount",value = "零售金额",required = true)
  private Double retailAmount;
}
