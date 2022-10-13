package com.gxa.entity.drugManagement.drugInformationTenance;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author LXD
 * @Date 2022/10/11 19:41
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "DrugBasicInformation",description = "适用于药品信息以及药品信息新增中的所有信息")
public class DrugBasicInformation {
  @ApiModelProperty(value = "id",name = "主键id")
  private Integer id;
  @ApiModelProperty(value = "code",name = "药品编码",required = true)
  private String code;
  @ApiModelProperty(value = "barcode",name = "药品条形码",required = true)
  private String barcode;
  @ApiModelProperty(value = "commonNameDrug",name = "药品通用名",required = true)
  private String commonNameDrug;
  @ApiModelProperty(value = "pinyinCode",name = "拼音码",required = true)
  private String pinyinCode;
  @ApiModelProperty(value = "drugType",name = "药品分类",required = true)
  private String drugType;
  @ApiModelProperty(value = "drugSpecifications",name = "药品规格",required = true)
  private String drugSpecifications;
  @ApiModelProperty(value = "pharmaceuticalDosage",name = "药品剂型",required = true)
  private String pharmaceuticalDosage;
  @ApiModelProperty(value = "OTC",name = "OTC药品",required = true)
  private Integer OTC;
  @ApiModelProperty(value = "InvoiceItems",name = "发票项目",required = true)
  private String InvoiceItems;
  @ApiModelProperty(value = "approvalNo",name = "批准文号",required = true)
  private String approvalNo;
  @ApiModelProperty(value = "manufacturer",name = "生产厂家",required = true)
  private String manufacturer;
  @ApiModelProperty(value = "status",name = "药品状态",required = true)
  private Integer status;


  @ApiModelProperty(value = "purchasePrice",name = "采购价格",required = true)
  private Double purchasePrice;
  @ApiModelProperty(value = "salesPrice",name = "售出价",required = true)
  private Double salesPrice;
  @ApiModelProperty(value = "createTime",name = "创建时间",required = true)
  private String createTime;

  @ApiModelProperty(value = "drugPackageInformation",name = "包装信息数据集")
  private DrugPackageInformation drugPackageInformation;
  @ApiModelProperty(value = "afficacyDescription",name = "功效说明数据集")
  private AfficacyDescription afficacyDescription;
  @ApiModelProperty(value = "drugOtherInformation",name = "其他信息数据集")
  private DrugOtherInformation drugOtherInformation;
}
