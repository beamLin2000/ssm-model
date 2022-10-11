package com.gxa.entity.business;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("返回对象实体")
public class Business {
    @ApiModelProperty("今天挂号人数")
    private Integer registerNum;
    @ApiModelProperty("今天接诊人数")
    private Integer visitNum;
    @ApiModelProperty("今天收入")
    private Double money;
    @ApiModelProperty("近days收入趋势")
    private List<Double> moneys;
    @ApiModelProperty("今日门诊记录")
    private List<OutpatientRecordToday> todays;
}
