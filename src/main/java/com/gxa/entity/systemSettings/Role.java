package com.gxa.entity.systemSettings;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@ApiModel
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @ApiModelProperty(value = "序号",name = "id",hidden = false,required = false)
    private int id;//序号
    @ApiModelProperty(value = "角色编号",name = "roleNumber",hidden = false,required = false)
    private String roleNumber;//角色编号
    @ApiModelProperty(value = "角色名称",name = "nameRole",hidden = false,required = false)
    private String name;//角色名称
    @ApiModelProperty(value = "角色描述",name = "description",hidden = false,required = false)
    private String description;//角色描述
    @ApiModelProperty(value = "创建时间",name = "creationTime",hidden = false,required = false)
    private Date creationTime;//创建时间
    @ApiModelProperty(value = "创建人员",name = "createPerson",hidden = false,required = false)
    private String createPerson;//创建人员

    @ApiModelProperty(value = "1启用   0未启用",name = "roleStatus",hidden = false,required = false)
    private String roleStatus;//角色状态


    //权限表


}
