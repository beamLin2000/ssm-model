package com.gxa.entity.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutpatientRecordToday {
    private Integer id;
    private String sttus;
    private String patientsNum;
    private String patientsName;
    private String gender;
    private String age;
    private String phone;
    private String type;
    private String administrative;
    private String doctor;
    private Date lastUpdateTime;
}
