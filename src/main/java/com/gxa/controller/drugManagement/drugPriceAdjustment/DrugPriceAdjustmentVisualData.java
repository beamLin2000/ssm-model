package com.gxa.controller.drugManagement.drugPriceAdjustment;

import com.gxa.entity.drugManagement.drugPriceAdjustment.DrugPriceAdjustInfo;
import com.gxa.entity.drugManagement.drugPriceAdjustment.DrugPriceAdjustInfoList;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/12 17:58
 */
@Setter
@Getter
@Component
public class DrugPriceAdjustmentVisualData {
    //List
    private List<DrugPriceAdjustInfo> drugPriceAdjustInfos = new ArrayList<>();
    {
        //添加array
        List<DrugPriceAdjustInfoList> drugPriceAdjustInfoList1 = new ArrayList<>();
        drugPriceAdjustInfoList1.add(new DrugPriceAdjustInfoList("dsadsa","36g/盒",32,"asdazc",65.0,70.0,75.0,10.0,"10%","z涨价了","2021-10-21","lx"));
        drugPriceAdjustInfoList1.add(new DrugPriceAdjustInfoList("dsadsa1","36g/盒",32,"asdazc",65.0,70.0,75.0,10.0,"10%","z涨价了","2021-10-21","lx"));
        //添加List
        drugPriceAdjustInfos.add(new DrugPriceAdjustInfo(1,"qweasdzx","阿莫西林","西药","36g/盒","口服","黑云制药",2,
                drugPriceAdjustInfoList1));

        //添加array
        List<DrugPriceAdjustInfoList> drugPriceAdjustInfoList2 = new ArrayList<>();
        drugPriceAdjustInfoList1.add(new DrugPriceAdjustInfoList("dsadsa12","316g/盒",321,"asdazc321",15.0,30.0,75.0,60.0,"130%","z7涨价了","2021-10-21","lx1"));
        drugPriceAdjustInfoList1.add(new DrugPriceAdjustInfoList("dsadsa121","316g/盒",322,"asdazc2113",25.0,40.0,75.0,50.0,"190%","z4涨价了","2021-10-21","lx2"));
        //添加List
        drugPriceAdjustInfos.add(new DrugPriceAdjustInfo(1,"qweasdzx","阿莫西林","西药","36g/盒","口服","黑云制药",2,
                drugPriceAdjustInfoList2));

        //添加array
        List<DrugPriceAdjustInfoList> drugPriceAdjustInfoList3 = new ArrayList<>();
        drugPriceAdjustInfoList1.add(new DrugPriceAdjustInfoList("dsadsa","36g/盒",32,"asdazc",65.0,70.0,75.0,10.0,"10%","z涨价了","2021-10-21","lx"));
        //添加List
        drugPriceAdjustInfos.add(new DrugPriceAdjustInfo(1,"qweasdzx","阿莫西林","西药","36g/盒","口服","黑云制药",1,
                drugPriceAdjustInfoList3));

        //添加array
        List<DrugPriceAdjustInfoList> drugPriceAdjustInfoList4 = new ArrayList<>();
        drugPriceAdjustInfoList1.add(new DrugPriceAdjustInfoList("poiu","3126g/盒",325,"teyr",65.0,70.0,75.0,10.0,"10%","zqewr涨价了","2021-10-21","lx"));
        drugPriceAdjustInfoList1.add(new DrugPriceAdjustInfoList("pouil","3326g/盒",362,"dghvcb",65.0,70.0,75.0,10.0,"10%","zasdf涨价了","2021-10-21","lx"));
        drugPriceAdjustInfoList1.add(new DrugPriceAdjustInfoList("wresfd","3326g/盒",362,"dghvcb",65.0,70.0,75.0,10.0,"10%","zasdf涨价了","2021-10-21","lx"));
        drugPriceAdjustInfoList1.add(new DrugPriceAdjustInfoList("opuilh","3326g/盒",362,"dghvcb",65.0,70.0,75.0,10.0,"10%","zasdf涨价了","2021-10-21","lx"));
        //添加List
        drugPriceAdjustInfos.add(new DrugPriceAdjustInfo(1,"qweasdzx","浓硝酸","西药","3436g/盒","口服","黑云制药",4,
                drugPriceAdjustInfoList4));
    }
}
