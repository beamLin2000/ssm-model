package com.gxa.entity.systemSettings;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@ApiModel
@AllArgsConstructor
@NoArgsConstructor
public class EMEmployeeTable {
    @ApiModelProperty(value = "序号",name = "id",hidden = false,required = false)
    private int id;//序号
    @ApiModelProperty(value = "工号",name = "workNumber",hidden = false,required = false)
    private String workNumber;//工号
    @ApiModelProperty(value = "员工姓名",name = "name",hidden = false,required = false)
    private String name;//员工姓名
    @ApiModelProperty(value = "员工性别",name = "sex",hidden = false,required = false)
    private String sex;//员工性别
    @ApiModelProperty(value = "员工年龄",name = "age",hidden = false,required = false)
    private int age;//员工年龄
    @ApiModelProperty(value = "手机号码",name = "phoneNumber",hidden = false,required = false)
    private String phoneNumber;//手机号码
//    @ApiModelProperty(value = "所属诊所",name = "clinic",hidden = false,required = false)
//    private String clinic;//所属诊所
//    @ApiModelProperty(value = "所属科室",name = "所属科室",hidden = false,required = false)
//    private String offices;//所属科室
//    @ApiModelProperty(value = "角色",name = "roles",hidden = false,required = true)
//    private String roles;//角色
    @ApiModelProperty(value = "创建时间",name = "creationTime",hidden = false,required = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date creationTime;//创建时间
    @ApiModelProperty(value = "创建人员",name = "createPerson",hidden = false,required = false)
    private String createPerson;//创建人员
    @ApiModelProperty(value = "1启用   0未启用",name = "employeeStatus",hidden = false,required = false)
    private String employeeStatus;//员工状态    停用    启用

    @ApiModelProperty(value = "邮箱",name = "email")
    private String email;
    @ApiModelProperty(value = "证件号码",name = "id_num")
    private String id_num;
    @ApiModelProperty(value = "地址",name = "address")
    private String address;
//    @ApiModelProperty(value = "职位",name = "position")
//    private String position;

    @ApiModelProperty(value = "角色,表",name = "role")
    private List<Role> role;



    public EMEmployeeTable(int id, String workNumber, String name, String sex, int age, String phoneNumber, Date creationTime, String createPerson, String employeeStatus) {
        this.id = id;
        this.workNumber = workNumber;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phoneNumber = phoneNumber;


        this.creationTime = creationTime;
        this.createPerson = createPerson;
        this.employeeStatus = employeeStatus;
    }
//
}
