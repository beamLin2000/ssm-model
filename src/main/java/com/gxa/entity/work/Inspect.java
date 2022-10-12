package com.gxa.entity.work;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("返回对象实体")
public class Inspect {
    @ApiModelProperty("检查项目id")
    private Integer id;
    @ApiModelProperty("名字")
    private String name;
    @ApiModelProperty("类型")
    private String type;
    @ApiModelProperty("单位")
    private String unit;
    @ApiModelProperty("价格")
    private String price;
}
