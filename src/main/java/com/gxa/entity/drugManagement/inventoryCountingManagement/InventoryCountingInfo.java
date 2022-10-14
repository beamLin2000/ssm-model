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
@ApiModel(value = "InventoryCountingInfo",description = "库存盘点列表")
public class InventoryCountingInfo {

    //主键id
    @ApiModelProperty(name = "id",value = "主键id",required = true)
    private Integer id;
    //盘点单号
    @ApiModelProperty(name = "countSheetNo",value = "盘点单号",required = true)
    private String countSheetNo;
    //盘点日期
    @ApiModelProperty(name = "createTime",value = "盘点日期",required = true)
    private String countDate;
    //制单人
    @ApiModelProperty(name = "voucherPreparer",value = "制单人",required = true)
    private String voucherPreparer;
    //盘点状态
    @ApiModelProperty(name = "countingStatus",value = "盘点状态",required = true)
    private Integer countingStatus;
    //
    @ApiModelProperty(name = "inventoryCountingInfoArray",value = "新增盘点的list",required = true)
    private List<InventoryCountingInfoArray> inventoryCountingInfoArray;
}
