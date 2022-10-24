package com.gxa.entity.systemSettings;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @ApiModelProperty(value = "序号",name = "id",hidden = false,required = false)
    private int id;//序号
    @ApiModelProperty(value = "项目编码",name = "itemNumber",hidden = false,required = false)
    private String itemNumber;//项目编码
    @ApiModelProperty(value = "项目名称",name = "projectName",hidden = false,required = false)
    private String projectName;//项目名称
    @ApiModelProperty(value = "项目类别",name = "projectCategory",hidden = false,required = false)
    private String projectCategory;//项目类别   脑电图 针灸 材料费。。。
    @ApiModelProperty(value = "发票项目",name = "invoiceItem",hidden = false,required = false)
    private String invoiceItem;//发票项目
    @ApiModelProperty(value = "零售价",name = "retailPrice",hidden = false,required = false)
    private double retailPrice;//零售价
    @ApiModelProperty(value = "成本价",name = "costPrice",hidden = false,required = false)
    private double costPrice;//成本价
    @ApiModelProperty(value = "单位",name = "unit",hidden = false,required = false)
    private String unit;//单位      次 支 盒
    @ApiModelProperty(value = "项目状态  1启用   0未启用",name = "projectStatus",hidden = false,required = false)
    private String projectStatus;//项目状态   1启用   0未启用
    @ApiModelProperty(value = "创建时间",name = "creationTime",hidden = false,required = false)
    @JsonFormat(pattern="yyyy-MM-dd ",timezone="GMT+8")
    private Date creationTime;//创建时间


//    @ApiModelProperty(value = "是否会员",name = "是否会员",hidden = false,required = false)
//    private Double membership;//是否会员
    @ApiModelProperty(value = "备注",name = "remarks",hidden = false,required = false)
    private String remarks;//备注
    @ApiModelProperty(value = "部位",name = "part",hidden = false,required = false)
    private String part;//部位


//    private int viceTable;//副表的外建

    private CPSViceTable cps_viceTable;

    public CPSMainTable(int serialNumber, String itemNumber, String projectName, String projectCategory, String invoiceItem, double retailPrice, double costPrice, String unit, String projectStatus, Date creationTime, String remarks, String part) {
        this.id = serialNumber;
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
//        this.viceTable = viceTable;
    }


}
