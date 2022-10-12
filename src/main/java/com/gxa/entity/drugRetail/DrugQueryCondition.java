package com.gxa.entity.drugRetail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrugQueryCondition {
    private String chargeCategory;
    private String drugCode;
    private String drugName;
}
