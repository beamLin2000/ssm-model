package com.gxa.entity.login;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName(value = "user")
public class User {
    @ApiModelProperty(name = "id",value = "id")
    private int id;
    @ApiModelProperty(name = "userName",value = "用户名,工号")
    private String userName;
    @ApiModelProperty(name = "pwd",value = "密码")
    private String pwd;
    @ApiModelProperty(name = "salt",value = "盐值")
    private String salt;
    @ApiModelProperty(name = "name",value = "用户姓名")
    private String name;
    @ApiModelProperty(name = "age",value = "年龄")
    private int age;
    @ApiModelProperty(name = "sex",value = "姓名")
    private String sex;
    @ApiModelProperty(name = "phoneNum",value = "电话号码")
    private String phoneNum;
    @ApiModelProperty(name = "email",value = "邮件")
    private String email;
    @ApiModelProperty(name = "idNum",value = "身份证号")
    private String idNum;
    @ApiModelProperty(name = "position",value = "职位")
    private String position;
    @ApiModelProperty(name = "address",value = "地址")
    private String address;
    @ApiModelProperty(name = "status",value = "状态")
    private String status;
    @ApiModelProperty(name = "imgUrl",value = "头像地址")
    private String imgUrl;
}
