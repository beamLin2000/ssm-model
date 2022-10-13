package com.gxa.entity.drugManagement.basicInfo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author :林溪
 * @date : 2022/10/12 10:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class BasicInfo {
    @ApiModelProperty(value = "Id",name = "下拉框键",required = true)
    private Integer id;
    @ApiModelProperty(value = "name", name = "下拉框值",required = true)
    private String name;
}
