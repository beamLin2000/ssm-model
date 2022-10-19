package com.gxa.dto.work;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("返回的体格对象")
public class PhysicalDto {
    @ApiModelProperty(value = "id",hidden = true)
    private Integer id;
    @ApiModelProperty(name ="temperature" ,value = "体温")
    private String temperature;
    @ApiModelProperty(name ="breathe" ,value ="呼吸")
    private String breathe;
    @ApiModelProperty(name ="pulse" ,value ="脉搏")
    private String pulse;
    @ApiModelProperty(name ="blood" ,value ="血压")
    private String blood;
    @ApiModelProperty(name ="height" ,value ="身高")
    private String height;
    @ApiModelProperty(name ="weight" ,value ="体重")
    private String weight;
    @ApiModelProperty(name ="bloodSugar" ,value ="血糖")
    private String bloodSugar;
    @ApiModelProperty(name ="bloodFat" ,value ="血脂")
    private String bloodFat;
}
