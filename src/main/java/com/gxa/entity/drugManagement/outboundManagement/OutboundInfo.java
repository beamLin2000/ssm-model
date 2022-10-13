package com.gxa.entity.drugManagement.outboundManagement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/12 14:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "OutboundInfo",description = "出库管理table表")
public class OutboundInfo {
    //id
    @ApiModelProperty(value = "id",name = "主键id",required = true)
    private Integer id;
    //出库单号
    @ApiModelProperty(value = "deliveryOrderNo",name = "出库单号",required = true)
    private String deliveryOrderNo;
    //出库类型
    @ApiModelProperty(value = "deliveryType",name = "出库类型",required = true)
    private String deliveryType;
    //制单人员
    @ApiModelProperty(value = "voucherPreparer",name = "制单人员",required = true)
    private String voucherPreparer;
    //采购金额
    @ApiModelProperty(value = "purchasePrice",name = "采购金额",required = true)
    private Double purchasePrice;
    //零售金额
    @ApiModelProperty(value = "retailAmount",name = "零售金额",required = true)
    private Double retailAmount;
    //出库人员
    @ApiModelProperty(value = "warehouseOutPersonnel",name = "出库人员",required = true)
    private String warehouseOutPersonnel;
    //创建时间
    @ApiModelProperty(value = "createTime",name = "创建时间",required = true)
    private String createTime;
    //审核状态
    @ApiModelProperty(value = "auditStatus",name = "审核状态",required = true)
    private Integer auditStatus;

    //出库日期
    @ApiModelProperty(value = "deliveryTime",name = "出库日期",required = true)
    private String deliveryTime;
    //创单日期
    @ApiModelProperty(value = "preparationDate",name = "创单日期",required = true)
    private String preparationDate;
    //备注
    @ApiModelProperty(value = "remarks",name = "备注",required = true)
    private String remarks;
    @ApiModelProperty(value = "outboundInfoAddArray",name = "出库的添加药品",required = true)
    private List<OutboundInfoAddArray> outboundInfoAddArray;
}
