package com.gxa.entity.systemSettings;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//诊所信息实体类
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClinicInformation {
    @ApiModelProperty(value = "诊所编号",name = "clinicNo",required = false)
    private Integer clinicNo;//诊所编码
    @ApiModelProperty(value = "诊所名称",name = "clinicName")
    private String clinicName;//诊所名称
    @ApiModelProperty(value = "诊所logo",name = "logo")
    private String logo;//诊所logo
    @ApiModelProperty(value = "诊所所有人",name = "clinicOwner")
    private String clinicOwner;//诊所所有人
    @ApiModelProperty(value = "所有人电话",name = "ownerPhone")
    private Integer ownerPhone;//所有人电话
    @ApiModelProperty(value = "所有人邮箱",name = "ownerEmail")
    private String ownerEmail;//所有人邮箱
    @ApiModelProperty(value = "地址",name = "address")
    private String address;//地址
    @ApiModelProperty(value = "详细地址",name = "detailedAddress")
    private String detailedAddress;//详细地址
    @ApiModelProperty(value = "诊所邮箱",name = "clinicIntroduce")
    private String clinicIntroduce;//诊所介绍
    @ApiModelProperty(value = "诊所状态",name = "clinicState")
    private String clinicState;//诊所状态


}
