package com.gxa.dto.work;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class WorkSelectDto {
    @ApiModelProperty(name = "idCard",value ="患者的身份证号")
    private String idCard;
    @ApiModelProperty(name = "status",value ="接诊状态")
    private String status;
    @ApiModelProperty(name = "prescriptionName",value ="患者的名称")
    private String prescriptionName;
    @ApiModelProperty(name = "registration_form",value ="患者的挂号单号")
    private String registrationForm;
}
