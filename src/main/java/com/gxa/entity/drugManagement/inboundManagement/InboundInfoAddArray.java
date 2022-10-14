package com.gxa.entity.drugManagement.inboundManagement;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :林溪
 * @date : 2022/10/12 9:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InboundInfoAddArray {
    @ApiModelProperty(value = "id",name = "主键id",required = true)
    private Integer id;
    @ApiModelProperty(value = "code",name = "药品编码",required = true)
    private String code;
    @ApiModelProperty(value = "medicalName",name = "药品名称",required = true)
    private String medicalName;
    @ApiModelProperty(value = "manufacturer",name = "生产厂家",required = true)
    private String manufacturer;
    @ApiModelProperty(value = "medicalNumber",name = "数量",required = true)
    private Integer medicalNumber;
    @ApiModelProperty(value = "unit",name = "单位",required = true)
    private String unit;
    @ApiModelProperty(value = "purchasePrice",name = "采购价（元）",required = true)
    private Double purchasePrice;
    @ApiModelProperty(value = "retailPrice",name = "零售加（元）",required = true)
    private Double retailPrice;
    @ApiModelProperty(value = "batchNo",name = "批号",required = true)
    private String batchNo;
    @ApiModelProperty(value = "expiryDrugsDate",name = "药品有效期",required = true)
    private String expiryDrugsDate;
    @ApiModelProperty(value = "purchaseAmount",name = "采购金额",required = true)
    private Double purchaseAmount;
    @ApiModelProperty(value = "retailAmount",name = "零售金额",required = true)
    private Double retailAmount;

}
