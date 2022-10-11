package com.gxa.entity.woek;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String province;
    private String city;
    private String detailedAddress;
}
