package com.gxa.entity.systemSettings;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date timeing;
    private String foundPerson;
    private String costState;

}
