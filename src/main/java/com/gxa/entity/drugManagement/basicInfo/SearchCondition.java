package com.gxa.entity.drugManagement.basicInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author LXD
 * @Date 2022/10/22 16:03
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchCondition {
  private String code;
  private String drugType;
  private String rules;
}
