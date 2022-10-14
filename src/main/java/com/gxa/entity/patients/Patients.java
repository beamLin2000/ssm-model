package com.gxa.entity.patients;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
@TableName(value = "patients")
public class Patients {
    @ApiModelProperty(name = "patientId",value = "患者序号")
    private Integer patientId;
    @ApiModelProperty(name = "patientNumber",value = "患者编码")
    private Integer patientNumber;
    @ApiModelProperty(name = "patientName",value = "患者姓名")
    private String patientName;
    @ApiModelProperty(name = "patientCard",value = "患者卡号")
    private Integer patientCard;
    @ApiModelProperty(name = "patientAge",value = "患者年龄")
    private Integer patientAge;
    @ApiModelProperty(name = "patientBirthday",value = "出生日期")
    private Date patientBirthday;
    @ApiModelProperty(name = "patientGender",value = "性别")
    private String patientGender;
    @ApiModelProperty(name = "patientPhone",value = "手机号码")
    private String patientPhone;
    @ApiModelProperty(name = "patientDocuments",value = "证件号码")
    private String patientDocuments;
    @ApiModelProperty(name = "patientSource",value = "患者来源")
    private String patientSource;
    @ApiModelProperty(name = "patientExpiry",value = "到期时间")
    private Date patientExpiry;
    @ApiModelProperty(name = "patientGroup",value = "民族")
    private String patientGroup;
    @ApiModelProperty(name = "patientMarriage",value = "婚姻状况")
    private String patientMarriage;
    @ApiModelProperty(name = "patientAddress",value = "地址")
    private String patientAddress;
    @ApiModelProperty(name = "patientDetailedAddress",value = "详细地址")
    private String patientDetailedAddress;
    @ApiModelProperty(name = "patientDegree",value = "学历")
    private String patientDegree;
    @ApiModelProperty(name = "patientOccupation",value = "职业")
    private String patientOccupation;
    @ApiModelProperty(name = "patientJob",value = "工作单位")
    private String patientJob;
    @ApiModelProperty(name = "patientRemark",value = "备注")
    private String patientRemark;
    @ApiModelProperty(name = "patientCreatTime",value = "创建时间")
    private Date patientCreatTime;
    @ApiModelProperty(name = "operators",value = "操作人员")
    private String operators;
    @ApiModelProperty(name = "patientStart",value = "状态")
    private Integer patientStart;

    public Patients(Integer patientId, Integer patientNumber, String patientName, Integer patientAge, String patientGender, String patientPhone, Date patientCreatTime, String operators) {
        this.patientId = patientId;
        this.patientNumber = patientNumber;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientGender = patientGender;
        this.patientPhone = patientPhone;
        this.patientCreatTime = patientCreatTime;
        this.operators = operators;
    }

    public Patients() {
    }
}
