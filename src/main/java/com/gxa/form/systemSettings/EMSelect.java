package com.gxa.form.systemSettings;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ApiModel("根据条件查询员工表")
@AllArgsConstructor
@NoArgsConstructor
public class EMSelect {
//    @ApiModelProperty(value = "所属科室",name = "所属科室",hidden = false,required = true)
//    private String offices;//所属科室
    @ApiModelProperty(value = "员工姓名",name = "name",hidden = false,required =true)
    private String name;//员工姓名


}
