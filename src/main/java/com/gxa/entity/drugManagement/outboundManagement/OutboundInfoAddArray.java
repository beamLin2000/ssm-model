package com.gxa.entity.drugManagement.outboundManagement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author LXD
 * @Date 2022/10/12 14:05
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "OutboundInfoAddArray",description = "编辑或新增中的添加药品功能数据列表")
public class OutboundInfoAddArray {
    @ApiModelProperty(name = "id",value = "主键id",required = true)
    private Integer id;
    @ApiModelProperty(name = "code",value = "药品编码",required = true)
    private String code;
    @ApiModelProperty(name = "medicalName",value = "药品名称",required = true)
    private String medicalName;
    @ApiModelProperty(name = "manufacturer",value = "生产厂家",required = true)
    private String manufacturer;
    @ApiModelProperty(name = "medicalNumber",value = "数量",required = true)
    private Integer medicalNumber;
    @ApiModelProperty(name = "unit",value = "单位",required = true)
    private String unit;
    @ApiModelProperty(name = "purchasePrice",value = "采购价（元）",required = true)
    private Double purchasePrice;
    @ApiModelProperty(name = "retailPrice",value = "零售加（元）",required = true)
    private Double retailPrice;
    @ApiModelProperty(name = "batchNo",value = "批号",required = true)
    private String batchNo;
    @ApiModelProperty(name = "expiryDrugsDate",value = "药品有效期",required = true)
    private String expiryDrugsDate;
    @ApiModelProperty(name = "purchaseAmount",value = "采购金额",required = true)
    private Double purchaseAmount;
    @ApiModelProperty(name = "retailAmount",value = "零售金额",required = true)
    private Double retailAmount;
}
