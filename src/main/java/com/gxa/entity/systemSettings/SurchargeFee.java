package com.gxa.entity.systemSettings;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SurchargeFee {

    private Integer id;
    private String surchargeName;
    private Double price;
    private Double cost;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date timeing;
    private String foundPerson;
    private String costState;
    private Integer perscripId;
    private PrescriptionTable prescriptionTable;



}
