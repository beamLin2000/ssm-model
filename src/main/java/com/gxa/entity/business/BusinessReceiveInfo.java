package com.gxa.entity.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessReceiveInfo {
    private Integer days;
    private String todayTime;
}
