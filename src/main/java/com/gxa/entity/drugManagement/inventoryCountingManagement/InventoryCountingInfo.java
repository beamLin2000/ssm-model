package com.gxa.entity.drugManagement.inventoryCountingManagement;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("drugManagement_inventoryCounting_inventoryCountingInfo")
public class InventoryCountingInfo {

    //主键id
    @ApiModelProperty(name = "id",value = "主键id",required = true)
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    //盘点单号
    @ApiModelProperty(name = "countSheetNo",value = "盘点单号",required = true)
    @TableField("count_sheet_no")
    private String countSheetNo;
    //盘点日期
    @ApiModelProperty(name = "createTime",value = "盘点日期",required = true)
    @TableField("count_date")
    private String countDate;
    //制单人
    @ApiModelProperty(name = "voucherPreparer",value = "制单人",required = true)
    @TableField("voucher_preparer")
    private String voucherPreparer;
    //盘点状态
    @ApiModelProperty(name = "countingStatus",value = "盘点状态",required = true)
    @TableField("counting_status")
    private Integer countingStatus;
    @ApiModelProperty(name = "countingStatus",value = "明细列表",required = true)
    List<InventoryCountingInfoArray> inventoryCountingInfoArrays;

    List<InventoryCountingArrayToData> inventoryCountingArrayToData;
}
