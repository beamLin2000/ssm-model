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
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("体温")
    private String temperature;
    @ApiModelProperty("呼吸")
    private String breathe;
    @ApiModelProperty("脉搏")
    private String pulse;
    @ApiModelProperty("血压")
    private String blood;
    @ApiModelProperty("身高")
    private String height;
    @ApiModelProperty("体重")
    private String weight;
    @ApiModelProperty("血糖")
    private String bloodSugar;
    @ApiModelProperty("血脂")
    private String bloodFat;
}
