package com.gxa.form.systemSettings;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ApiModel
@AllArgsConstructor
@NoArgsConstructor
public class RolesEdit {

    @ApiModelProperty(value = "角色编号",name = "roleNumber",hidden = false,required = false)
    private String roleNumber;//角色编号
    @ApiModelProperty(value = "角色名称",name = "nameRole",hidden = false,required = false)
    private String nameRole;//角色名称
    @ApiModelProperty(value = "角色状态",name = "roleStatus",hidden = false,required = false)
    private String roleStatus;//角色状态
    @ApiModelProperty(value = "角色描述",name = "description",hidden = false,required = false)
    private String description;//角色描述



}
