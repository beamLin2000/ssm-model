package com.gxa.entity.business;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@TableName("test")
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("返回对象实体")
public class Business {
    @ApiModelProperty("今天挂号人数")
    @TableField("registerNum")
    private Integer registerNum;
    @ApiModelProperty("今天接诊人数")
    @TableField("visitNum")
    private Integer visitNum;
    @ApiModelProperty("今天收入")
    @TableField("money")
    private Double money;
    @ApiModelProperty("近days收入趋势")
    @TableField("moneys")
    private List<Double> moneys;
    @ApiModelProperty("今日门诊记录")
    @TableField("todays")
    private List<OutpatientRecordToday> todays;
}
