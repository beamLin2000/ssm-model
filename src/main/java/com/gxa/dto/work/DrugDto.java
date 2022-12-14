package com.gxa.dto.work;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("返回对象实体")
public class DrugDto {
    @ApiModelProperty(name = "id",value ="药品id",hidden = true)
    private Integer id;
    @ApiModelProperty(name = "name",value ="名字")
    private String name;
    @ApiModelProperty(name = "norms",value ="规格")
    private String norms;
    @ApiModelProperty(name = "stock",value ="库存")
    private String stock;
    @ApiModelProperty(name = "price",value ="价格")
    private String price;
}
