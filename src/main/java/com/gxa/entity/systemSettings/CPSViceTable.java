package com.gxa.entity.systemSettings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor//副表  做下拉框
public class CPSViceTable {

//    private int viceTableno;//主表的外建
    private String projectCategory;//项目类别   脑电图 针灸 材料费。。。
    private String unit;//单位      次 支 盒
    private String invoiceItem;//发票项目
}
