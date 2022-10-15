package com.gxa.entity.work;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChargeDetails {
    private String chargeName;
    private String price;
    private String total;
    private String util;
    private String retailAmount;
}
