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
public class RolesTable {
    @ApiModelProperty(value = "序号",name = "序号",hidden = false,required = false)
    private int id;//序号
    @ApiModelProperty(value = "角色编号",name = "角色编号",hidden = false,required = false)
    private String roleNumber;//角色编号
    @ApiModelProperty(value = "角色名称",name = "角色名称",hidden = false,required = false)
    private String nameRole;//角色名称
    @ApiModelProperty(value = "角色描述",name = "角色描述",hidden = false,required = false)
    private String description;//角色描述
    @ApiModelProperty(value = "创建时间",name = "创建时间",hidden = false,required = false)
    private Date creationTime;//创建时间
    @ApiModelProperty(value = "创建人员",name = "创建人员",hidden = false,required = false)
    private String createPerson;//创建人员

    public RolesTable(int id, String roleNumber, String nameRole, String description, Date creationTime, String createPerson, boolean roleStatus) {
        this.id = id;
        this.roleNumber = roleNumber;
        this.nameRole = nameRole;
        this.description = description;
        this.creationTime = creationTime;
        this.createPerson = createPerson;
        this.roleStatus = roleStatus;
    }

    @ApiModelProperty(value = "角色状态",name = "角色状态",hidden = false,required = false)
    private boolean roleStatus;//角色状态

    //权限表
    private JurisdictionTable jurisdiction_table;

}
