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
@ApiModel("处方合计")
public class Prescriptions {
    @ApiModelProperty(value = "医生名字",required = true)
    private String doctorName;
    @ApiModelProperty(value = "处方合计",required = true)
    private Double totalMoney;
    @ApiModelProperty(value = "处方数量",required = true)
    private Integer prescriptionsNum;

}
