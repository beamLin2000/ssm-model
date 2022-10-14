package com.gxa.entity.systemSettings;


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
    private String prescription;
    private Double price;
    private Double cost;
    private Date timeing;
    private String foundPerson;
    private String costState;

    public SurchargeFee(String surchargeName, String prescription, Double price, Double cost, Date timeing, String foundPerson, String costState) {
        this.surchargeName = surchargeName;
        this.prescription = prescription;
        this.price = price;
        this.cost = cost;
        this.timeing = timeing;
        this.foundPerson = foundPerson;
        this.costState = costState;
    }
}
