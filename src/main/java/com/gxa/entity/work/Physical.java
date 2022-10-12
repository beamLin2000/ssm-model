package com.gxa.entity.work;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("返回的患者对象")
public class Physical {
    private Integer id;
    private String temperature;
    private String breathe;
    private String pulse;
    private String blood;
    private String height;
    private String weight;
    private String bloodSugar;
    private String bloodFat;
}
