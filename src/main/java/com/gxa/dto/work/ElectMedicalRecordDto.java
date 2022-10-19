package com.gxa.dto.work;

import com.gxa.entity.work.PrescriptionInfo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
public class ElectMedicalRecordDto {
    @ApiModelProperty(name ="creatTime",value = "创建时间")
    private Date creatTime;
    @ApiModelProperty(name ="attendingDoctor",value = "接诊医生")
    private String attendingDoctor;
    @ApiModelProperty(name ="doctorOrder",value = "医嘱")
    private String doctorOrder;
    @ApiModelProperty(name ="physicalDto",value = "体格信息")
    private PhysicalDto physicalDto;
    @ApiModelProperty(name ="medicalRecordDto",value = "病历信息")
    private MedicalRecordDto medicalRecordDto;
    @ApiModelProperty(name ="prescriptionInfos",value = "处方信息")
    List<PrescriptionInfo> prescriptionInfos;

}
