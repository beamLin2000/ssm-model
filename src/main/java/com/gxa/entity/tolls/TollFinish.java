package com.gxa.entity.tolls;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
@TableName(value = "toll_finish")
public class TollFinish {
    @ApiModelProperty(name = "tollFinishId",value = "序号")
    private Integer tollFinishId;
    @ApiModelProperty(name = "tollNumber",value = "订单编号")
    private String tollNumber;
    @ApiModelProperty(name = "tollFinishReceivables",value = "应收金额")
    private Double tollFinishReceivables;
    @ApiModelProperty(name = "tollFinishReceived",value = "实收金额")
    private Double tollFinishReceived;
    @ApiModelProperty(name = "tollFinishPreferential",value = "优惠金额")
    private Integer tollFinishPreferential;
    @ApiModelProperty(name = "tollFinishHealth",value = "医保支付")
    private Integer tollFinishHealth;
    @ApiModelProperty(name = "tollFinishChange",value = "找零")
    private Double tollFinishChange;
    @ApiModelProperty(name = "tollFinishDate",value = "收费日期")
    private Date tollFinishDate;
    @ApiModelProperty(name = "tollFinishName",value = "收费员")
    private String tollFinishName;
}
