package com.gxa.form.systemSettings;

import com.gxa.entity.systemSettings.Role;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@ApiModel
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EMEdit {
    @ApiModelProperty(value = "id",name = "id",hidden = false,required = false)
    private int id;//id
    @ApiModelProperty(value = "员工编号,,不可重复",name = "workNumber",hidden = false,required = false)
    private String workNumber;//工号
    @ApiModelProperty(value = "员工姓名",name = "name",hidden = false,required =true)
    private String name;//员工姓名
    @ApiModelProperty(value = "员工年龄",name = "age",hidden = false)
    private int age;//员工年龄
    @ApiModelProperty(value = "员工性别",name = "sex",hidden = false)
    private String sex;//员工性别
    @ApiModelProperty(value = "手机号码",name = "phoneNumber",hidden = false,required = false)
    private String phoneNumber;//手机号码

//    @ApiModelProperty(value = "所属诊所,1表示支所1，2表示支所2",name = "clinic_id",hidden = false,required = true)
//    private int  clinic_id;//所属诊所
//    @ApiModelProperty(value = "角色",name = "roles",hidden = false,required = true)
//    private String roles;//角色
    @ApiModelProperty(value = "员工状态",name = "employeeStatus",hidden = false,required = false)
    private String employeeStatus;//员工状态    停用    启用

    @ApiModelProperty(value = "电子邮箱",name = "email",hidden = false,required = false)
    private String email;//电子邮箱
    @ApiModelProperty(value = "证件号码",name = "idNumber",hidden = false,required = false)
    private String idNumber;//证件号码
    @ApiModelProperty(value = "职位",name = "position",hidden = false,required = false)
    private String position;//职位
    @ApiModelProperty(value = "地址",name = "address",hidden = false,required = false)
    private String address;//地址
//    @ApiModelProperty(value = "地址详细信息",name = "地址详细信息",hidden = false,required = false)
//    private String addressPro;//地址详细信息
    @ApiModelProperty(value = "密码",name = "password",hidden = false,required = false)
    private String password;//密码

    private String salt;


//    @ApiModelProperty(value = "角色表",name = "rolesEdit",hidden = false,required = false)
//    private List<RolesEdit> rolesEdit;

    @ApiModelProperty(value = "角色表",name = "rolesEdit",hidden = false,required = true)
    private List<RoleTable> roleTable;


    @ApiModelProperty(value = "创建时间",name = "creationTime",hidden = false)
    private Date creationTime;

    @ApiModelProperty(value = "创建人员",name = "createPerson",hidden = false)
    private String createPerson;


}
