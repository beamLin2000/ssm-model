package com.gxa.entity.systemSettings;


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
    private Date time;
    private String foundPerson;
    private String costState;

}
