package com.gxa.entity.drugRetail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@ApiModel("药品零售实体")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrugRetail {
    @ApiModelProperty(name = "patientName",value = "患者姓名")
    private String patientName;
    @ApiModelProperty(name = "patientCard",value = "患者卡号")
    private String patientCard;
    @ApiModelProperty(name = "patientAge",value = "患者年龄")
    private Integer patientAge;
    @ApiModelProperty(name = "patientBirthday",value = "出生日期")
    private Date patientBirthday;
    @ApiModelProperty(name = "patientGender",value = "性别")
    private String patientGender;
    @ApiModelProperty(name = "patientPhone",value = "手机号码")
    private String patientPhone;
    @ApiModelProperty(name = "patientDocuments",value = "证件号码")
    private String patientDocuments;
    @ApiModelProperty(name = "drugMsg",value = "药品信息")
    private List<DrugMsg> drugMsg;
    @ApiModelProperty(name = "operator",value = "操作员")
    private String operator;
    @ApiModelProperty(name = "surChargeFee",value = "附加费用")
    private List<SurChargeFee> surChargeFee;
    private String tollNum;//编号
}
