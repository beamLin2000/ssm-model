package com.gxa.entity.drugManagement.inventoryCountingManagement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/12 16:04
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel
public class InventoryCountingInfo {

    //主键id
    @ApiModelProperty(value = "id",name = "主键id",required = true)
    private Integer id;
    //盘点单号
    @ApiModelProperty(value = "countSheetNo",name = "盘点单号",required = true)
    private String countSheetNo;
    //盘点日期
    @ApiModelProperty(value = "countDate",name = "盘点日期",required = true)
    private String countDate;
    //制单人
    @ApiModelProperty(value = "voucherPreparer",name = "制单人",required = true)
    private String voucherPreparer;
    //盘点状态
    @ApiModelProperty(value = "countingStatus",name = "盘点状态",required = true)
    private Integer countingStatus;
    //
    @ApiModelProperty(value = "inventoryCountingInfoArray",name = "新增盘点的list",required = true)
    private List<InventoryCountingInfoArray> inventoryCountingInfoArray;
}
