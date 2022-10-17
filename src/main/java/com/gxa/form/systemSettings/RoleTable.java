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
public class RoleTable {
    @ApiModelProperty(value = "角色名称,10 为管理员，20医生，30 财务",name = "nameRole",hidden = false,required = false)
    private int nameRole;//角色名称
}
