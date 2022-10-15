package com.gxa.entity.drugManagement.drugInformationTenance;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("drugManagement_drugInformationTenance_drugBasicInformation")
public class DrugBasicInformation {
  @ApiModelProperty(name = "id",value = "主键id")
  private Integer id;
  @ApiModelProperty(name = "code",value = "药品编码",required = true)
  private String code;
  @ApiModelProperty(name = "barcode",value = "药品条形码",required = true)
  private String barcode;
  @ApiModelProperty(name = "commonNameDrug",value = "药品通用名/药品名",required = true)
  private String commonNameDrug;
  @ApiModelProperty(name = "pinyinCode",value = "拼音码",required = true)
  private String pinyinCode;
  @ApiModelProperty(name = "drugType",value = "药品分类/收费类别",required = true)
  private String drugType;
  @ApiModelProperty(name = "drugSpecifications",value = "药品规格/规格",required = true)
  private String drugSpecifications;
  @ApiModelProperty(name = "pharmaceuticalDosage",value = "药品剂型",required = true)
  private String pharmaceuticalDosage;
  @ApiModelProperty(name = "OTC",value = "OTC药品",required = true)
  private Integer OTC;
  @ApiModelProperty(name = "invoiceItems",value = "发票项目",required = true)
  private String invoiceItems;
  @ApiModelProperty(name = "approvalNo",value = "批准文号",required = true)
  private String approvalNo;
  @ApiModelProperty(name = "manufacturer",value = "生产厂家",required = true)
  private String manufacturer;
  @ApiModelProperty(name = "status",value = "药品状态",required = true)
  private Integer status;

  @ApiModelProperty(name = "prescriptionCategory",value = "收费类别/处方类别",required = true)
  private String prescriptionCategory;
  @ApiModelProperty(name = "purchasePrice",value = "采购价格",required = true)
  private Double purchasePrice;
  @ApiModelProperty(name = "salesPrice",value = "售出价",required = true)
  private Double salesPrice;
  @ApiModelProperty(name = "createTime",value = "创建时间",required = true)
  private String createTime;


  @ApiModelProperty(name = "drugPackageInformation",value = "包装信息数据集")
  private DrugPackageInformation drugPackageInformation;


  @ApiModelProperty(name = "afficacyDescription",value = "功效说明数据集")
  private AfficacyDescription afficacyDescription;

  @ApiModelProperty(name = "drugOtherInformation",value = "其他信息数据集")
  private DrugOtherInformation drugOtherInformation;
}
