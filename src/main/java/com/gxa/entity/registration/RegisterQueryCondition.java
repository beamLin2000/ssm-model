package com.gxa.entity.registration;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@ApiModel("挂号查询条件")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterQueryCondition {
    @ApiModelProperty(name = "visitStatus",value = "就诊状态")
    private String visitStatus;
//    @ApiModelProperty(name = "department",value = "挂号科室")
//    private String department;
    @ApiModelProperty(name = "attendingDoctor",value = "挂号医生")
    private String attendingDoctor;
    @ApiModelProperty(name = "startTime",value = "开始时间")
    private String startTime;
    @ApiModelProperty(name = "endTime",value = "结束时间")
    private String endTime;
    @ApiModelProperty(name = "patientName",value = "患者姓名")
    private String patientName;
}
