package com.gxa.entity.work;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("返回的患者对象")
public class MedicalRecord {
    private Integer id;
    private Date sickTime;
    private String suit;
    private String present;
    private String previous;
    private String allergy;
    private String personalized;
    private String familyHistory;
    private String auxiliary;
    private String treatment;
    private String notes;
}
