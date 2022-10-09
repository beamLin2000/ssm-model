package com.gxa.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("用户")
public class User {
    @ApiModelProperty("用户编号")
    private Integer id;
    @ApiModelProperty(value="用户名",name="用户名01",hidden = true)
    private String userName;
    @ApiModelProperty(value="密码",name="密码01",required = true)
    private String pwd;
    @ApiModelProperty(value = "盐值")
    private String salt;
}
