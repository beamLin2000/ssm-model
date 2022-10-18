package com.gxa.entity.tolls;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "toll_drugs")
public class TollDrugs {
    @ApiModelProperty(name = "tollDrugsId",value = "序号")
    private Integer tollDrugsId;
    @ApiModelProperty(name = "tollDrugsVer",value = "类型")
    private String tollDrugsVer;
    @ApiModelProperty(name = "tollDrugsName",value = "收费名称")
    private String tollDrugsName;
    @ApiModelProperty(name = "tollDrugsMoney",value = "单价")
    private Double tollDrugsMoney;
    @ApiModelProperty(name = "tollDrugsQuantity",value = "总量")
    private Integer tollDrugsQuantity;
    @ApiModelProperty(name = "tollDrugsUnit",value = "单位")
    private String tollDrugsUnit;
    @ApiModelProperty(name = "tollDrugsRetail",value = "销售额度")
    private Double tollDrugsRetail;
    @ApiModelProperty(name = "tollNumber",value = "订单号")
    private String tollNumber;

}
