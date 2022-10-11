package com.gxa.entity.work;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("返回的对象")
public class PrescriptionDetails {
    private Integer id;
    private String gruopId;
    private String drugname;
    private String singleUsage;
    private String usage;
    private String frequency;
    private String days;
    private String total;
    private String price;
}
