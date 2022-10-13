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
  @ApiModelProperty(name = "id", value = "主键id")
  private Integer id;
  @ApiModelProperty(name = "code",value="药品编码",required = true)
  private String code;
  @ApiModelProperty(name = "medicalName",value = "药品名字",required = true)
  private String medicalName;
  @ApiModelProperty(name = "specs",value = "规格",required = true)
  private String specs;
  @ApiModelProperty(name = "drugType",value = "收费类别",required = true)
  private String drugType;
  @ApiModelProperty(name = "purchasePrice",value = "采购价格",required = true)
  private Integer purchasePrice;
  @ApiModelProperty(name = "salesPrice",value = "售出价",required = true)
  private Double salesPrice;
  @ApiModelProperty(name = "manufacture",value = "生产厂家",required = true)
  private String manufacture;
  @ApiModelProperty(name = "status",value = "状态",required = true)
  private Integer status;
  @ApiModelProperty(name = "createTime",value = "创建时间",required = true)
  private String createTime;

}
