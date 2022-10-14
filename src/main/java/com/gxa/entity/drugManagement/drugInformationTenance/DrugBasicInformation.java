package com.gxa.entity.drugManagement.drugInformationTenance;

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
@ApiModel
public class DrugBasicInformation {
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
}
