package com.gxa.entity.patients;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("返回家庭实体")
public class Family {
    @ApiModelProperty(name = "familyId",value = "家庭序号")
    private Integer familyId;
    @ApiModelProperty(name = "familyRelationship",value = "家庭关系")
    private String familyRelationship;
    @ApiModelProperty(name = "familyName",value = "姓名")
    private String familyName;
    @ApiModelProperty(name = "familyUnit",value = "单位")
    private String familyUnit;
    @ApiModelProperty(name = "familyBirthday",value = "出生日期")
    private Date familyBirthday;
    @ApiModelProperty(name = "familyGender",value = "性别")
    private String familyGender;
    @ApiModelProperty(name = "familyPhone" ,value = "手机号码")
    private String familyPhone;
    @ApiModelProperty(name = "familyCreatTime",value = "创建时间")
    private Date familyCreatTime;
}
