package com.gxa.entity.drugManagement.basicInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :林溪
 * @date : 2022/10/19 11:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateInventoryList {
    private Integer id;
    private Integer stock;
    private Integer medicalId;
}
