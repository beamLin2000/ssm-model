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
    @ApiModelProperty(name = "id",value = "主键id")
    private Integer id;
    @ApiModelProperty(name = "inventoryFloor",value = "库存下限",required = true)
    private Integer inventoryFloor;
    @ApiModelProperty(name = "inventoryCeiling",value = "库存上限",required = true)
    private Integer inventoryCeiling;
    @ApiModelProperty(name = "locationNo",value = "货位号",required = true)
    private String locationNo;
    @ApiModelProperty(name = "validPeriodAlert",value = "有效期预警",required = true)
    private Integer validPeriodAlert;
    @ApiModelProperty(name = "drugDescription",value = "药品说明",required = true)
    private String drugDescription;
    @ApiModelProperty(name = "remarks",value = "备注",required = true)
    private String remarks;

}

