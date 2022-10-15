package com.gxa.entity.drugManagement.drugInformationTenance;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("drugManagement_drugInformationTenance_afficacyDescription")
public class AfficacyDescription {
    @ApiModelProperty(name = "id",value = "主键id")
    private Integer id;
    @ApiModelProperty(name = "useMethod",value = "使用方法",required = true)
    private String useMethod;
    @ApiModelProperty(name = "singleUsage",value = "单次用量",required = true)
    private Integer singleUsage;
    @ApiModelProperty(name = "frequency",value = "频度",required = true)
    private String frequency;
    @ApiModelProperty(name = "days",value = "天",required = true)
    private String days;
    @ApiModelProperty(name = "consumption",value = "用量",required = true)
    private Integer consumption;
    @ApiModelProperty(name = "unit",value = "单位",required = true)
    private String unit;
}
