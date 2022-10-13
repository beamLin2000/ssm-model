package com.gxa.entity.systemSettings;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/*
* 检查项目主表
*
* */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class CPSMainTable {
    @ApiModelProperty(value = "序号",name = "序号",hidden = false,required = false)
    private int serialNumber;//序号
    @ApiModelProperty(value = "项目编码",name = "项目编码",hidden = false,required = false)
    private int itemNumber;//项目编码
    @ApiModelProperty(value = "项目名称",name = "项目名称",hidden = false,required = false)
    private String projectName;//项目名称
    @ApiModelProperty(value = "项目类别",name = "项目类别",hidden = false,required = false)
    private String projectCategory;//项目类别   脑电图 针灸 材料费。。。
    @ApiModelProperty(value = "发票项目",name = "发票项目",hidden = false,required = false)
    private String invoiceItem;//发票项目
    @ApiModelProperty(value = "零售价",name = "零售价",hidden = false,required = false)
    private double retailPrice;//零售价
    @ApiModelProperty(value = "成本价",name = "成本价",hidden = false,required = false)
    private double costPrice;//成本价
    @ApiModelProperty(value = "单位",name = "单位",hidden = false,required = false)
    private String unit;//单位      次 支 盒
    @ApiModelProperty(value = "项目状态",name = "项目状态",hidden = false,required = false)
    private boolean projectStatus;//项目状态   启用   未启用
    @ApiModelProperty(value = "创建时间",name = "创建时间",hidden = false,required = false)
    private Date creationTime;//创建时间


//    @ApiModelProperty(value = "是否会员",name = "是否会员",hidden = false,required = false)
//    private Double membership;//是否会员
    @ApiModelProperty(value = "备注",name = "备注",hidden = false,required = false)
    private String remarks;//备注
    @ApiModelProperty(value = "部位",name = "部位",hidden = false,required = false)
    private String part;//部位


    private int viceTable;//副表的外建

    private CPSViceTable cps_viceTable;

    public CPSMainTable(int serialNumber, int itemNumber, String projectName, String projectCategory, String invoiceItem, double retailPrice, double costPrice, String unit, boolean projectStatus, Date creationTime, String remarks, String part, int viceTable) {
        this.serialNumber = serialNumber;
        this.itemNumber = itemNumber;
        this.projectName = projectName;
        this.projectCategory = projectCategory;
        this.invoiceItem = invoiceItem;
        this.retailPrice = retailPrice;
        this.costPrice = costPrice;
        this.unit = unit;
        this.projectStatus = projectStatus;
        this.creationTime = creationTime;
        this.remarks = remarks;
        this.part = part;
        this.viceTable = viceTable;
    }


}
