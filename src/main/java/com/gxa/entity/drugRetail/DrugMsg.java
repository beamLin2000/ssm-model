package com.gxa.entity.drugRetail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrugMsg {
    private String drugCode;
    private String drugName;
    private String chargeCategory;//收费类别
    private String drugSpecifications;//规格
    private String manuFactor;//厂家
    private String stock;//库存
    private Double price;//零售价格
}
