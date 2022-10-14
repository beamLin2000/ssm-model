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
@ApiModel
public class DrugOtherInformation {
    @ApiModelProperty(value = "inventoryFloor",name = "库存下限",required = true)
    private Integer inventoryFloor;
    @ApiModelProperty(value = "inventoryFloor",name = "库存上限",required = true)
    private Integer inventoryCeiling;
    @ApiModelProperty(value = "inventoryFloor",name = "货位号",required = true)
    private String locationNo;
    @ApiModelProperty(value = "inventoryFloor",name = "有效期预警",required = true)
    private Integer validPeriodAlert;
    @ApiModelProperty(value = "inventoryFloor",name = "药品说明",required = true)
    private String drugDescription;
    @ApiModelProperty(value = "inventoryFloor",name = "备注",required = true)
    private String remarks;

}

