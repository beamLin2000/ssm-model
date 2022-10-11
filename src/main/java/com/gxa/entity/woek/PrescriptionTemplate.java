package com.gxa.entity.woek;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("返回的对象")
public class PrescriptionTemplate {
    private Integer id;
    private String identifierNum;
    private String name;
    private String describe;
    private String type;
    private String permissions;
    private String diagnosis;
    private Date creationTime;
    private String createdPerson;
}
