package com.gxa.entity.drugManagement.drugInformationTenance;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :林溪
 * @date : 2022/10/13 9:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Api(value = "AfficacyDescription",description = "功效说明")
public class AfficacyDescription {
    @ApiModelProperty(value = "主键id",notes = "主键id")
    private Integer id;
    @ApiModelProperty(value = "useMethod",notes = "使用方法",required = true)
    private String useMethod;
    @ApiModelProperty(value = "singleUsage",notes = "单次用量",required = true)
    private Integer singleUsage;
    @ApiModelProperty(value = "frequency",notes = "频度",required = true)
    private String frequency;
    @ApiModelProperty(value = "days",notes = "天",required = true)
    private String days;
    @ApiModelProperty(value = "consumption",notes = "用量",required = true)
    private Integer consumption;
    @ApiModelProperty(value = "unit",notes = "单位",required = true)
    private String unit;
}
