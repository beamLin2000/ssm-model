package com.gxa.entity.drugManagement.outboundManagement;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("drugManagement_outboundManagement_outboundInfo")
public class OutboundInfo {
    //id
    @ApiModelProperty(name = "id",value = "主键id",required = true)
    private Integer id;
    //出库单号
    @ApiModelProperty(name = "deliveryOrderNo",value = "出库单号",required = true)
    private String deliveryOrderNo;
    //出库类型
    @ApiModelProperty(name = "deliveryType",value = "出库类型",required = true)
    private String deliveryType;
    //制单人员
    @ApiModelProperty(name = "voucherPreparer",value = "制单人员",required = true)
    private String voucherPreparer;
    //采购金额
    @ApiModelProperty(name = "purchasePrice",value = "采购金额",required = true)
    private Double purchasePrice;
    //零售金额
    @ApiModelProperty(name = "retailAmount",value = "零售金额",required = true)
    private Double retailAmount;
    //出库人员
    @ApiModelProperty(name = "warehouseOutPersonnel",value = "出库人员",required = true)
    private String warehouseOutPersonnel;
    //创建时间
    @ApiModelProperty(name = "createTime",value = "创建时间",required = true)
    private String createTime;
    //审核状态
    @ApiModelProperty(name = "auditStatus",value = "审核状态",required = true)
    private Integer auditStatus;

    //出库日期
    @ApiModelProperty(name = "deliveryTime",value = "出库日期",required = true)
    private String deliveryTime;
    //创单日期
    @ApiModelProperty(name = "preparationDate",value = "创单日期",required = true)
    private String preparationDate;
    //备注
    @ApiModelProperty(name = "remarks",value = "备注",required = true)
    private String remarks;
    @ApiModelProperty(name = "outboundInfoAddArray",value = "出库的添加药品",required = true)
    private List<OutboundInfoAddArray> outboundInfoAddArray;
}
