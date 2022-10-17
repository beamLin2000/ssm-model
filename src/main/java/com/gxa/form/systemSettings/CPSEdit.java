package com.gxa.form.systemSettings;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@ApiModel
@AllArgsConstructor
@NoArgsConstructor
public class CPSEdit {
    @ApiModelProperty(value = "序号",name = "id",hidden = false,required = false)
    private int id;//序号

    @ApiModelProperty(value = "项目编码",name = "itemName",hidden = false,required = false)
    private String itemNumber;//项目编码

    @ApiModelProperty(value = "项目名称",name = "projectName",hidden = false,required = false)
    private String projectName;//项目名称

    @ApiModelProperty(value = "成本价",name = "costPrice",hidden = false,required = false)
    private double costPrice;//成本价

    @ApiModelProperty(value = "零售价",name = "retailPrice",hidden = false,required = false)
    private double retailPrice;//零售价

    @ApiModelProperty(value = "单位",name = "unit",hidden = false,required = true)
    private String unit;//单位      次 支 盒

    @ApiModelProperty(value = "项目分类",name = "projectCategory",hidden = false,required = true)
    private String projectCategory;//项目类别   脑电图 针灸 材料费。。。

    @ApiModelProperty(value = "发票项目",name = "invoiceItem",hidden = false,required = true)
    private String invoiceItem;//发票项目

    @ApiModelProperty(value = "部位",name = "part",hidden = false,required = false)
    private String part;//部位

//    @ApiModelProperty(value = "是否允许会员折扣",name = "是否允许会员折扣",hidden = false,required = false)
//    private Double membership;//是否会员

    @ApiModelProperty(value = "项目状态",name = "projectStatus",hidden = false,required = false)
    private String projectStatus;//项目状态   1启用   0未启用

    @ApiModelProperty(value = "备注",name = "remarks",hidden = false,required = false)
    private String remarks;//备注

    @ApiModelProperty(value = "创建时间",name = "creationTime",hidden = false,required = false)
    private Date creationTime;//创建时间



}
