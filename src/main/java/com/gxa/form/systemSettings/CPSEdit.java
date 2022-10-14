package com.gxa.form.systemSettings;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ApiModel
@AllArgsConstructor
@NoArgsConstructor
public class CPSEdit {

    @ApiModelProperty(value = "项目编码",name = "项目编码",hidden = false,required = false)
    private int itemNumber;//项目编码

    @ApiModelProperty(value = "项目名称",name = "项目名称",hidden = false,required = false)
    private String projectName;//项目名称

    @ApiModelProperty(value = "成本价",name = "成本价",hidden = false,required = false)
    private double costPrice;//成本价

    @ApiModelProperty(value = "零售价",name = "零售价",hidden = false,required = false)
    private double retailPrice;//零售价

    @ApiModelProperty(value = "单位",name = "单位",hidden = false,required = true)
    private String unit;//单位      次 支 盒

    @ApiModelProperty(value = "项目分类",name = "项目分类",hidden = false,required = true)
    private String projectCategory;//项目类别   脑电图 针灸 材料费。。。

    @ApiModelProperty(value = "发票项目",name = "发票项目",hidden = false,required = true)
    private String invoiceItem;//发票项目

    @ApiModelProperty(value = "部位",name = "部位",hidden = false,required = false)
    private String part;//部位

    @ApiModelProperty(value = "是否允许会员折扣",name = "是否允许会员折扣",hidden = false,required = false)
    private Double membership;//是否会员

    @ApiModelProperty(value = "项目状态",name = "项目状态",hidden = false,required = false)
    private boolean projectStatus;//项目状态   启用   未启用

    @ApiModelProperty(value = "备注",name = "备注",hidden = false,required = false)
    private String remarks;//备注

}
