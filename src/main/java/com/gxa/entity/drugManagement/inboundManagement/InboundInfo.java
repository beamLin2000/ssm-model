package com.gxa.entity.drugManagement.inboundManagement;

import com.baomidou.mybatisplus.annotation.TableName;
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
@ApiModel(value = "InboundInfo",description = "出库管理table表")
@TableName("drugManagement_inboundManagement_inboundInfo")
public class InboundInfo {
    @ApiModelProperty(name = "id",value = "主键id",required = true)
    private Integer id;
    //入库单号
    @ApiModelProperty(name = "receiptNo",value = "入库单号",required = true)
    private String receiptNo;
    //入库类型
    @ApiModelProperty(name = "receiptType",value = "入库类型",required = true)
    private String receiptType;
    //供应商名称
    @ApiModelProperty(name = "supplierName",value = "供应商名称",required = true)
    private String supplierName;
    //制单人员
    @ApiModelProperty(name = "voucherPreparer",value = "制单人员",required = true)
    private String voucherPreparer;
    //采购金额
    @ApiModelProperty(name = "purchasePrice",value = "采购金额",required = true)
    private Double purchasePrice;
    //零售金额
    @ApiModelProperty(name = "retailAmount",value = "零售金额",required = true)
    private Double retailAmount;
    //入库人员
    @ApiModelProperty(name = "warehousingPersonnel",value = "入库人员",required = true)
    private String warehousingPersonnel;
    //创建时间
    @ApiModelProperty(name = "createTime",value = "创建时间",required = true)
    private String createTime;
    //审核状态
    @ApiModelProperty(name = "auditStatus",value = "审核状态",required = true)
    private Integer auditStatus;

    //入库日期
    @ApiModelProperty(name = "receiptTime",value = "入库日期",required = true)
    private String receiptTime;
    //供应商
    @ApiModelProperty(name = "supplier",value = "供应商",required = true)
    private String supplier;
    //制单日期
    @ApiModelProperty(name = "preparationDate",value = "制单日期",required = true)
    private String preparationDate;
    //备注
    @ApiModelProperty(name = "remarks",value = "备注",required = true)
    private String remarks;
    //添加药品
    @ApiModelProperty(name = "InboundInfoAddArray",value = "添加药品",required = true)
    private List<InboundInfoAddArray> InboundInfoAddArray;

}
