package com.gxa.entity.systemSettings;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterFee {
    private Integer id;
    private String registerName;
    private Double price;
    private Double cost;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date timeing;
    private String foundPerson;
    private String costState;

    public RegisterFee(String registerName, Double price, Double cost, Date timeing, String foundPerson, String costState) {
        this.registerName = registerName;
        this.price = price;
        this.cost = cost;
        this.timeing = timeing;
        this.foundPerson = foundPerson;
        this.costState = costState;

    }
}
