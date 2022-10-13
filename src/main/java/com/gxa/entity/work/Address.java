package com.gxa.entity.work;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @ApiModelProperty(name = "province",value = "省")
    private String province;
    @ApiModelProperty(name = "city",value ="市")
    private String city;
    @ApiModelProperty(name = "detailedAddress",value ="详细地址")
    private String detailedAddress;
}
