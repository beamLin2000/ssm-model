package com.gxa.entity.registration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterMsg {
    private String registrationForm;
    private String name;
    private String gender;
    private Integer age;
    private String phoneNo;
    private String department;
    private String attendingDoctor;
    private Date receptionTime;
    private BigDecimal willPaid;
    private BigDecimal amountPaid;
    private String status;
}
