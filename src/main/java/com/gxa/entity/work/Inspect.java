package com.gxa.entity.work;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("返回对象实体")
public class Inspect {
    private Integer id;
    private String name;
    private String type;
    private String unit;
    private String price;
}
