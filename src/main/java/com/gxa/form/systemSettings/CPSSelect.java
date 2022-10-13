package com.gxa.form.systemSettings;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Data
@ApiModel
@AllArgsConstructor
@NoArgsConstructor
public class CPSSelect {
    @ApiModelProperty(value = "项目状态",name = "项目状态",hidden = false,required = false)
    private boolean projectStatus;//项目状态  1 启用  0 未启用
    @ApiModelProperty(value = "项目名称",name = "项目名称",hidden = false,required = false)
    private String projectName;//项目名称
    @ApiModelProperty(value = "项目编码",name = "项目编码",hidden = false,required = false)
    private int itemNumber;//项目编号

}
