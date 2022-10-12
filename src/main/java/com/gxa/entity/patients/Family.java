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
    @ApiModelProperty(name = "family_id",value = "家庭序号")
    private Integer family_id;
    @ApiModelProperty(name = "family_relationship",value = "家庭关系")
    private String family_relationship;
    @ApiModelProperty(name = "family_name",value = "姓名")
    private String family_name;
    @ApiModelProperty(name = "family_unit",value = "单位")
    private String family_unit;
    @ApiModelProperty(name = "family_birthday",value = "出生日期")
    private Date family_birthday;
    @ApiModelProperty(name = "family_gender",value = "性别")
    private String family_gender;
    @ApiModelProperty(name = "family_phone" ,value = "手机号码")
    private String family_phone;
    @ApiModelProperty(name = "family_chreattiome",value = "创建时间")
    private Date family_chreattiome;
}
