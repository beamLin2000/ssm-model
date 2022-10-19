package com.gxa.dto.work;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ConditionSelectDto {
    @ApiModelProperty(name = "selectTime",value ="条件查询时间,前置时间和后置时间中用逗号隔开")
    private String selectTime;
    @ApiModelProperty(name = "status",value ="患者的接诊状态")
    private String status;
    @ApiModelProperty(name = "patientName",value ="患者的名称")
    private String patientName;
}
