package com.gxa.entity.work;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ApiModel("返回的work里面的患者对象")
public class WorkPatient {
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty(value = "名字",required = true)
    private String name;
    @ApiModelProperty(value = "患者卡号",required = true)
    private String card;
    @ApiModelProperty(value = "年龄",required = true)
    private Integer age;
    @ApiModelProperty(value = "出生日期",required = true)
    private Date brith;
    @ApiModelProperty(value = "性别",required = true)
    private String gender;
    @ApiModelProperty(value = "电话",required = true)
    private String phone;
    @ApiModelProperty(value = "证件号码",required = true)
    private String idCard;
    @ApiModelProperty(value = "接诊类型",required = true)
    private String type;
    @ApiModelProperty(value = "地址",required = true)
    private String address;
    @ApiModelProperty(value = "诊断",required = true)
    private String diagnosis;
    @ApiModelProperty(value = "医嘱",required = true)
    private String order;
    @ApiModelProperty(value = "创建时间",required = true)
    private Date createTime;
}
