package com.gxa.entity.drugManagement.inboundManagement;

import io.swagger.annotations.ApiModel;
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
@ApiModel(value = "InboundInfoAddArray",description="出库信息编辑功能中的添加药品功能已添加以及未添加显示的数据格式")
public class InboundInfoAddArray {
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
