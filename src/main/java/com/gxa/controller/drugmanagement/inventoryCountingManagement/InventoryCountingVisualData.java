package com.gxa.controller.drugmanagement.inventoryCountingManagement;

import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfo;
import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfoArray;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/12 20:21
 */
@Component
@Setter
@Getter
public class InventoryCountingVisualData {
    private List<InventoryCountingInfo> InventoryCountingInfo = new ArrayList<>();
    {
        //创建第一条list
            //创建第一条array
        List<InventoryCountingInfoArray> inventoryCountingInfoArrays = new ArrayList<>();
        inventoryCountingInfoArrays.add(new InventoryCountingInfoArray(1,"asdasdas","三聚氰胺","12-1001","微信","6颗/盒","三鹿奶粉有限公司",20,45,20,"没死"));
        inventoryCountingInfoArrays.add(new InventoryCountingInfoArray(2,"asdasdas","三聚氰胺2","12-1001","支付宝","6颗/盒","三鹿奶粉有限公司",20,45,20,"还行"));
        inventoryCountingInfoArrays.add(new InventoryCountingInfoArray(3,"asdasdas","三聚氰胺3","12-1001","QQ","6颗/盒","三鹿奶粉有限公司",20,45,20,"有毒"));
        InventoryCountingInfo.add(new InventoryCountingInfo(1,"asdzxqwe","2020-12-30","lx",1,inventoryCountingInfoArrays));
        List<InventoryCountingInfoArray> inventoryCountingInfoArrays1 = new ArrayList<>();
        inventoryCountingInfoArrays.add(new InventoryCountingInfoArray(1,"asdasdas","三聚氰胺","12-1001","微信","6颗/盒","三鹿奶粉有限公司",20,45,20,"没死"));
        inventoryCountingInfoArrays.add(new InventoryCountingInfoArray(2,"asdasdas","三聚氰胺2","12-1001","支付宝","6颗/盒","三鹿奶粉有限公司",20,45,20,"还行"));
        inventoryCountingInfoArrays.add(new InventoryCountingInfoArray(3,"asdasdas","三聚氰胺3","12-1001","QQ","6颗/盒","三鹿奶粉有限公司",20,45,20,"有毒"));
        InventoryCountingInfo.add(new InventoryCountingInfo(1,"asdzxqwe","2020-12-30","lx",1,inventoryCountingInfoArrays1));
        List<InventoryCountingInfoArray> inventoryCountingInfoArrays2 = new ArrayList<>();
        inventoryCountingInfoArrays.add(new InventoryCountingInfoArray(1,"asdasdas","三聚氰胺","12-1001","微信","6颗/盒","三鹿奶粉有限公司",20,45,20,"没死"));
        inventoryCountingInfoArrays.add(new InventoryCountingInfoArray(2,"asdasdas","三聚氰胺2","12-1001","支付宝","6颗/盒","三鹿奶粉有限公司",20,45,20,"还行"));
        inventoryCountingInfoArrays.add(new InventoryCountingInfoArray(3,"asdasdas","三聚氰胺3","12-1001","QQ","6颗/盒","三鹿奶粉有限公司",20,45,20,"有毒"));
        InventoryCountingInfo.add(new InventoryCountingInfo(1,"asdzxqwe","2020-12-30","lx",1,inventoryCountingInfoArrays2));
    }
}
