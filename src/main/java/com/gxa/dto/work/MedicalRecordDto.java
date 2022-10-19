package com.gxa.dto.work;

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
public class MedicalRecordDto {
    @ApiModelProperty(name ="id" ,value = "病历id",hidden = true)
    private Integer id;
    @ApiModelProperty(name ="sickTime" ,value = "发病时间")
    private Date sickTime;
    @ApiModelProperty(name ="suit" ,value = "主述")
    private String suit;
    @ApiModelProperty(name ="present" ,value = "现病史")
    private String present;
    @ApiModelProperty(name ="previous" ,value = "既往史")
    private String previous;
    @ApiModelProperty(name ="allergy" ,value = "过敏史")
    private String allergy;
    @ApiModelProperty(name ="personalized" ,value = "个人史")
    private String personalized;
    @ApiModelProperty(name ="familyHistory" ,value = "家族史")
    private String familyHistory;
    @ApiModelProperty(name ="auxiliary" ,value = "辅助检查")
    private String auxiliary;
    @ApiModelProperty(name ="treatment" ,value = "治疗意见")
    private String treatment;
    @ApiModelProperty(name ="notes" ,value = "备注")
    private String notes;

}
