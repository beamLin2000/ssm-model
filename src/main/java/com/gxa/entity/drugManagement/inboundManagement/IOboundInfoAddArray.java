package com.gxa.entity.drugManagement.inboundManagement;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
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
@TableName("drugManagement_inboundManagement_ioboundInfoAddArray")
public class IOboundInfoAddArray {
    @ApiModelProperty(name = "id",value = "主键id",required = true)
    private Integer id;
    @ApiModelProperty(name = "code",value = "药品编码",required = true)
    private String code;
    @ApiParam(name = "drugType",value = "收费类别/处方类别",required = true)
    private String drugType;
    @ApiParam(name = "drugSpecifications",value = "药品规格",required = true)
    private String drugSpecifications;
    @ApiModelProperty(name = "medicalName",value = "药品名称",required = true)
    private String medicalName;
    @ApiModelProperty(name = "manufacturer",value = "生产厂家",required = true)
    private String manufacturer;
    //用于装载添加药品
    @ApiModelProperty(name = "stock",value = "库存",required = true)
    private String stock;//

    @ApiModelProperty(name = "medicalNumber",value = "数量",required = true) //数量+单位=库存
    private Integer medicalNumber;//
    @ApiModelProperty(name = "unit",value = "单位",required = true)
    private String unit;//
    @ApiModelProperty(name = "purchasePrice",value = "采购价（元）",required = true)
    private Double purchasePrice;//
    @ApiModelProperty(name = "retailPrice",value = "零售加（元）",required = true)
    private Double retailPrice;//
    @ApiModelProperty(name = "batchNo",value = "批号",required = true)
    private String batchNo;//
    @ApiModelProperty(name = "expiryDrugsDate",value = "药品有效期",required = true)
    private String expiryDrugsDate;//
    @ApiModelProperty(name = "purchaseAmount",value = "采购金额",required = true)
    private Double purchaseAmount;//
    @ApiModelProperty(name = "retailAmount",value = "零售金额",required = true)
    private Double retailAmount;//
    //入库信息id
    private Integer inboundInfoId;//
    private Integer outboundInfoId;//
}
