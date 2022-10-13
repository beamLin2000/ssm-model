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
public class EMEmployeeTable {
    @ApiModelProperty(value = "序号",name = "序号",hidden = false,required = false)
    private int id;//序号
    @ApiModelProperty(value = "工号",name = "工号",hidden = false,required = false)
    private int workNumber;//工号
    @ApiModelProperty(value = "员工姓名",name = "员工姓名",hidden = false,required = false)
    private String name;//员工姓名
    @ApiModelProperty(value = "员工性别",name = "员工性别",hidden = false,required = false)
    private String sex;//员工性别
    @ApiModelProperty(value = "员工年龄",name = "员工年龄",hidden = false,required = false)
    private String age;//员工年龄
    @ApiModelProperty(value = "手机号码",name = "手机号码",hidden = false,required = false)
    private int phoneNumber;//手机号码
    @ApiModelProperty(value = "所属诊所",name = "所属诊所",hidden = false,required = false)
    private String clinic;//所属诊所
//    @ApiModelProperty(value = "所属科室",name = "所属科室",hidden = false,required = false)
//    private String offices;//所属科室
    @ApiModelProperty(value = "角色",name = "角色",hidden = false,required = false)
    private String roles;//角色
    @ApiModelProperty(value = "创建时间",name = "创建时间",hidden = false,required = false)
    private Date creationTime;//创建时间
    @ApiModelProperty(value = "创建人员",name = "创建人员",hidden = false,required = false)
    private String createPerson;//创建人员
    @ApiModelProperty(value = "员工状态",name = "员工状态",hidden = false,required = false)
    private boolean employeeStatus;//员工状态    停用    启用


    //
}
