package com.gxa.entity.woek;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("返回对象实体")
public class Drug {
    private Integer id;
    private String name;
    private String norms;
    private String stock;
    private String price;
}
