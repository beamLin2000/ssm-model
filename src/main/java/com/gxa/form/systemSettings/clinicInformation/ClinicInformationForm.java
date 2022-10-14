package com.gxa.form.systemSettings.clinicInformation;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


//诊所信息
@Data
@ApiModel("诊所信息实体类")
public class ClinicInformationForm {
    @ApiModelProperty(value = "诊所编号",name = "clinicNo",required = false)
    private Integer clinicNo;
    @ApiModelProperty(value = "诊所名称",name = "clinicName",required = false)
    private String clinicName;
    @ApiModelProperty(value = "logo",name = "logo",required = false)
    private String logo;
    @ApiModelProperty(value = "诊所所有人",name = "clinicOwner",required = false)
    private String clinicOwner;
    @ApiModelProperty(value = "所有人电话",name = "ownerPhone",required = false)
    private Integer ownerPhone;
    @ApiModelProperty(value = "所有人邮箱",name = "ownerEmail",required = false)
    private String ownerEmail;
    @ApiModelProperty(value = "地址",name = "address",required = false)
    private String address;
    @ApiModelProperty(value = "详细地址",name = "detailedAddress",required = false)
    private String detailedAddress;
    @ApiModelProperty(value = "诊所介绍",name = "clinicIntroduce",required = false)
    private String clinicIntroduce;
    @ApiModelProperty(value = "诊所状态",name = "clinicState",required = false)
    private Integer clinicState;



    public ClinicInformationForm(Integer clinicNo, String clinicName, String logo, String clinicOwner, Integer ownerPhone, String ownerEmail, String address, String detailedAddress, String clinicIntroduce, Integer clinicState) {
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

    public ClinicInformationForm() {
    }



    @Override
    public String toString() {
        return "ClinicInformationForm{" +
                "clinicNo=" + clinicNo +
                ", clinicName='" + clinicName + '\'' +
                ", logo='" + logo + '\'' +
                ", clinicOwner='" + clinicOwner + '\'' +
                ", ownerPhone=" + ownerPhone +
                ", ownerEmail='" + ownerEmail + '\'' +
                ", address='" + address + '\'' +
                ", detailedAddress='" + detailedAddress + '\'' +
                ", clinicIntroduce='" + clinicIntroduce + '\'' +
                ", clinicState=" + clinicState +
                '}';
    }
}
