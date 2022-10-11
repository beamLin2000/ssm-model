package com.gxa.entity.work;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("返回的work患者对象")
public class WorkPatient {
    private Integer id;
    private String name;
    private String card;
    private String age;
    private Date brith;
    private String gender;
    private String phone;
    private String idcard;
    private String type;
    private Address address;
    private String diagnosis;
    private String order;
}
