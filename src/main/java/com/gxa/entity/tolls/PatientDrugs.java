package com.gxa.entity.tolls;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName(value = "patient_drugs")
public class PatientDrugs {
    @ApiModelProperty(name = "patientId",value = "患者ID")
    private Integer patientId;
    @ApiModelProperty(name = "patientCard",value = "患者编号")
    private String patientCard;
    @ApiModelProperty(name = "patientName",value = "姓名")
    private String patientName;
    @ApiModelProperty(name = "patientAge",value = "年龄")
    private Integer patientAge;
    @ApiModelProperty(name = "patientGender",value = "性别")
    private String patientGender;
    @ApiModelProperty(name = "patientPhone",value = "手机")
    private String patientPhone;
    @ApiModelProperty(name = "tollNumber",value = "订单编号")
    private String tollNumber;
}
