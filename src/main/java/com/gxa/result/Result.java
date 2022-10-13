package com.gxa.result;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author LXD
 * @Date 2022/10/11 19:13
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Result<Object> {
  //提示编码
  @ApiModelProperty(value = "相应的状态码")
  private Integer code;

  //提示信息
  @ApiModelProperty(value = "提示相关的信息")
  private String msg;

  //总记录数
  @ApiModelProperty(value = "总记录条数")
  private Long count;

  //携带的数据
  @ApiModelProperty(value = "查询数据")
  private Object data;
}
