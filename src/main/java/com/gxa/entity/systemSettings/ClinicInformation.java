package com.gxa.entity.systemSettings;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//诊所信息实体类
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClinicInformation {
    private Integer clinicNo;//诊所编码
    private String clinicName;//诊所名称
    private String logo;//诊所logo
    private String clinicOwner;//诊所所有人
    private Integer ownerPhone;//所有人电话
    private String ownerEmail;//所有人邮箱
    private String address;//地址
    private String detailedAddress;//详细地址
    private String clinicIntroduce;//诊所介绍
    private Integer clinicState;//诊所状态


}
