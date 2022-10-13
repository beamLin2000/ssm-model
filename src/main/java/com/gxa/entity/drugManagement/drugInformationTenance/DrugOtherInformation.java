package com.gxa.entity.drugManagement.drugInformationTenance;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author LXD
 * @Date 2022/10/11 19:58
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "DrugOtherInformation",description = "其他信息")
public class DrugOtherInformation {
    @ApiModelProperty(value = "id",name = "主键id")
    private Integer id;
    @ApiModelProperty(value = "inventoryFloor",name = "库存下限",required = true)
    private Integer inventoryFloor;
    @ApiModelProperty(value = "inventoryCeiling",name = "库存上限",required = true)
    private Integer inventoryCeiling;
    @ApiModelProperty(value = "locationNo",name = "货位号",required = true)
    private String locationNo;
    @ApiModelProperty(value = "validPeriodAlert",name = "有效期预警",required = true)
    private Integer validPeriodAlert;
    @ApiModelProperty(value = "drugDescription",name = "药品说明",required = true)
    private String drugDescription;
    @ApiModelProperty(value = "remarks",name = "备注",required = true)
    private String remarks;

}

