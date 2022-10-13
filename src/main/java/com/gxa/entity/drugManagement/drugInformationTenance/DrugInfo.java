package com.gxa.entity.drugManagement.drugInformationTenance;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author LXD
 * @Date 2022/10/11 15:49
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel
public class DrugInfo {
  @ApiModelProperty(value = "id", name = "主键id",required = true)
  private Integer id;
  @ApiModelProperty(value = "code",name="药品编码",required = true)
  private String code;
  @ApiModelProperty(value = "medicalName",name = "药品名字",required = true)
  private String medicalName;
  @ApiModelProperty(value = "specs",name = "规格",required = true)
  private String specs;
  @ApiModelProperty(value = "drugType",name = "收费类别",required = true)
  private String drugType;
  @ApiModelProperty(value = "purchasePrice",name = "采购价格",required = true)
  private Integer purchasePrice;
  @ApiModelProperty(value = "salesPrice",name = "售出价",required = true)
  private Double salesPrice;
  @ApiModelProperty(value = "manufacture",name = "生产厂家",required = true)
  private String manufacture;
  @ApiModelProperty(value = "status",name = "状态",required = true)
  private Integer status;
  @ApiModelProperty(value = "createTime",name = "创建时间",required = true)
  private String createTime;

}
