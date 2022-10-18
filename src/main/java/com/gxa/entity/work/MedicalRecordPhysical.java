package com.gxa.entity.work;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("接收的体格病历信息")
public class MedicalRecordPhysical {
    @ApiModelProperty(value = "发病时间",required = true)
    private Date sickTime;
    @ApiModelProperty(value = "主述",required = true)
    private String suit;
    @ApiModelProperty(value = "现病史",required = true)
    private String present;
    @ApiModelProperty(value = "既往史",required = true)
    private String previous;
    @ApiModelProperty(value = "过敏史",required = true)
    private String allergy;
    @ApiModelProperty(value = "个人史",required = true)
    private String personalized;
    @ApiModelProperty(value = "家族史",required = true)
    private String familyHistory;
    @ApiModelProperty(value = "辅助检查",required = true)
    private String auxiliary;
    @ApiModelProperty(value = "治疗意见",required = true)
    private String treatment;
    @ApiModelProperty(value = "备注",required = true)
    private String notes;
    @ApiModelProperty(value = "体温",required = true)
    private String temperature;
    @ApiModelProperty(value = "呼吸",required = true)
    private String breathe;
    @ApiModelProperty(value = "脉搏",required = true)
    private String pulse;
    @ApiModelProperty(value = "血压",required = true)
    private String blood;
    @ApiModelProperty(value = "身高",required = true)
    private Double height;
    @ApiModelProperty(value = "体重",required = true)
    private Double weight;
    @ApiModelProperty(value = "血糖",required = true)
    private String bloodSugar;
    @ApiModelProperty(value = "血脂",required = true)
    private String bloodFat;

}
