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
public class EMEdit {

    @ApiModelProperty(value = "员工编号",name = "员工编号",hidden = false,required = false)
    private int workNumber;//工号
    @ApiModelProperty(value = "员工姓名",name = "员工姓名",hidden = false,required =true)
    private String name;//员工姓名
    @ApiModelProperty(value = "员工年龄",name = "员工年龄",hidden = false,required = true)
    private String age;//员工年龄
    @ApiModelProperty(value = "员工性别",name = "员工性别",hidden = false,required = true)
    private String sex;//员工性别
    @ApiModelProperty(value = "手机号码",name = "手机号码",hidden = false,required = false)
    private int phoneNumber;//手机号码
//    @ApiModelProperty(value = "所属科室",name = "所属科室",hidden = false,required = true)
//    private String offices;//所属科室
    @ApiModelProperty(value = "角色",name = "角色",hidden = false,required = true)
    private String roles;//角色
    @ApiModelProperty(value = "员工状态",name = "员工状态",hidden = false,required = false)
    private boolean employeeStatus;//员工状态    停用    启用

    @ApiModelProperty(value = "电子邮箱",name = "电子邮箱",hidden = false,required = false)
    private String letterBox;//电子邮箱
    @ApiModelProperty(value = "证件号码",name = "证件号码",hidden = false,required = false)
    private String idNumber;//证件号码
    @ApiModelProperty(value = "职位",name = "职位",hidden = false,required = false)
    private String position;//职位
    @ApiModelProperty(value = "地址",name = "地址",hidden = false,required = false)
    private String address;//地址
    @ApiModelProperty(value = "地址详细信息",name = "地址详细信息",hidden = false,required = false)
    private String addressPro;//地址详细信息
    @ApiModelProperty(value = "密码",name = "密码",hidden = false,required = false)
    private String password;//密码



}
