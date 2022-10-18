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
@ApiModel("返回的病历信息对象")
public class MedicalRecord {
    @ApiModelProperty("发病时间")
    private Date sickTime;
    @ApiModelProperty("主述")
    private String suit;
    @ApiModelProperty("现病史")
    private String present;
    @ApiModelProperty("既往史")
    private String previous;
    @ApiModelProperty("过敏史")
    private String allergy;
    @ApiModelProperty("个人史")
    private String personalized;
    @ApiModelProperty("家族史")
    private String familyHistory;
    @ApiModelProperty("辅助检查")
    private String auxiliary;
    @ApiModelProperty("治疗意见")
    private String treatment;
    @ApiModelProperty("备注")
    private String notes;
}
