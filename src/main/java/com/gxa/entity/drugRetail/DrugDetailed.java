package com.gxa.entity.drugRetail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrugDetailed {
    private String drugName;//收费名称
    private BigDecimal price;
    private Integer num;
    private String company;//单位
    private BigDecimal totalPrice;//零售金额
}
