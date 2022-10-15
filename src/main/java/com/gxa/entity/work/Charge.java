package com.gxa.entity.work;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Charge {

    private String chargeType;
    private String chargeStatus;
    private String amountReceivable;
    private String netReceipts;
    private String paymentMethod;
    private String chargePerson;
    private Date chargeTime;

}
