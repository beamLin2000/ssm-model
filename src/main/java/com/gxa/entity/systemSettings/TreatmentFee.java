package com.gxa.entity.systemSettings;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TreatmentFee {
    private Integer id;
    private String treatment;
    private Double price;
    private Double cost;
    private Date timeing;
    private String foundPerson;
    private String costState;

}
