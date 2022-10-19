package com.gxa.entity.systemSettings;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//诊所信息实体类
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("clinic_information")
public class ClinicInformation {
    @ApiModelProperty(value = "诊所id",name = "id_no",required = false)
    @TableId(value = "id_no",type = IdType.AUTO)
    private Integer clinicId;//诊所编码

    @ApiModelProperty(value = "诊所编号",name = "clinicNo",required = false)
    @TableField("clinic_no")
    private Integer clinicNo;//诊所编码

    @ApiModelProperty(value = "诊所名称",name = "clinicName")
    @TableField("clinic_name")
    private String clinicName;//诊所名称

    @ApiModelProperty(value = "诊所logo",name = "logo")
    @TableField("logo")
    private String logo;//诊所logo

    @ApiModelProperty(value = "诊所所有人",name = "clinicOwner")
    @TableField("clinic_owner")
    private String clinicOwner;//诊所所有人

    @ApiModelProperty(value = "所有人电话",name = "ownerPhone")
    @TableField("owner_phone")
    private Integer ownerPhone;//所有人电话

    @ApiModelProperty(value = "所有人邮箱",name = "ownerEmail")
    @TableField("owner_email")
    private String ownerEmail;//所有人邮箱

    @ApiModelProperty(value = "地址",name = "address")
    @TableField("address")
    private String address;//地址

    @ApiModelProperty(value = "详细地址",name = "detailedAddress")
    @TableField("detailed_address")
    private String detailedAddress;//详细地址

    @ApiModelProperty(value = "诊所介绍",name = "clinicIntroduce")
    @TableField("clinic_introduce")
    private String clinicIntroduce;//诊所介绍

    @ApiModelProperty(value = "诊所状态",name = "clinicState")
    @TableField("clinic_state")
    private String clinicState;//诊所状态


    public ClinicInformation(Integer clinicNo, String clinicName, String logo, String clinicOwner, Integer ownerPhone, String ownerEmail, String address, String detailedAddress, String clinicIntroduce, String clinicState) {
        this.clinicNo = clinicNo;
        this.clinicName = clinicName;
        this.logo = logo;
        this.clinicOwner = clinicOwner;
        this.ownerPhone = ownerPhone;
        this.ownerEmail = ownerEmail;
        this.address = address;
        this.detailedAddress = detailedAddress;
        this.clinicIntroduce = clinicIntroduce;
        this.clinicState = clinicState;
    }
}
