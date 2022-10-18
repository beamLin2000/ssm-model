package com.gxa.entity.work;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("此页面关联信息")
public class Relation {
    @ApiModelProperty(value = "身份证号",required = true)
    private String idCard;
    @ApiModelProperty(value = "病人名字",required = true)
    private String personName;
    @ApiModelProperty(value = "创建时间",required = true)
    private Date createTime;
}
