package com.gxa.entity.woek;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("返回的患者对象")
public class Patient {
    private Integer id;
    private String name;
    private String age;
    private String gender;
    private String status;
    private Date creatTime;
    private String department;
    private String doctor;
    private String phone;
}
