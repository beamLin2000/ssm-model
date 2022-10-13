package com.gxa.entity.drugManagement.inboundManagement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/12 9:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class InboundInfo {
    @ApiModelProperty(value = "id",name = "主键id",required = true)
    private Integer id;
    //入库单号
    @ApiModelProperty(value = "receiptNo",name = "入库单号",required = true)
    private String receiptNo;
    //入库类型
    @ApiModelProperty(value = "receiptType",name = "入库类型",required = true)
    private String receiptType;
    //供应商名称
    @ApiModelProperty(value = "supplierName",name = "供应商名称",required = true)
    private String supplierName;
    //制单人员
    @ApiModelProperty(value = "voucherPreparer",name = "制单人员",required = true)
    private String voucherPreparer;
    //采购金额
    @ApiModelProperty(value = "purchasePrice",name = "采购金额",required = true)
    private Double purchasePrice;
    //零售金额
    @ApiModelProperty(value = "retailAmount",name = "零售金额",required = true)
    private Double retailAmount;
    //入库人员
    @ApiModelProperty(value = "warehousingPersonnel",name = "入库人员",required = true)
    private String warehousingPersonnel;
    //创建时间
    @ApiModelProperty(value = "createTime",name = "创建时间",required = true)
    private String createTime;
    //审核状态
    @ApiModelProperty(value = "auditStatus",name = "审核状态",required = true)
    private Integer auditStatus;

    //入库日期
    @ApiModelProperty(value = "receiptTime",name = "入库日期",required = true)
    private String receiptTime;
    //供应商
    @ApiModelProperty(value = "supplier",name = "供应商",required = true)
    private String supplier;
    //制单日期
    @ApiModelProperty(value = "preparationDate",name = "制单日期",required = true)
    private String preparationDate;
    //备注
    @ApiModelProperty(value = "remarks",name = "备注",required = true)
    private String remarks;
    //添加药品
    @ApiModelProperty(value = "InboundInfoAddArray",name = "添加药品",required = true)
    private List<InboundInfoAddArray> InboundInfoAddArray;

}
