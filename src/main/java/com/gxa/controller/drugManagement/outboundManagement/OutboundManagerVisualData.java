package com.gxa.controller.drugManagement.outboundManagement;

import com.gxa.entity.drugManagement.outboundManagement.OutboundInfo;
import com.gxa.entity.drugManagement.outboundManagement.OutboundInfoAddArray;
import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/12 14:22
 */
@Component
@Getter
@Setter
public class OutboundManagerVisualData {
    //list
    private List<OutboundInfo> los = new ArrayList<>();
    //array
    private List<OutboundInfoAddArray> loArray = new ArrayList<>();
    //warehouseOutPersonnel
    private List<BasicInfo> warehouseOutPersonnel = new ArrayList<>();
    //deliveryType
    private List<BasicInfo> deliveryType = new ArrayList<>();
    {
        //初始化添加药品array
        loArray.add(new OutboundInfoAddArray(1,"asda","头孢","黑云制药",20,"粒",20.0,30.1,"123qweas321321","2019-05-06",1253.0,415.0));
        loArray.add(new OutboundInfoAddArray(2,"qwe","头孢1","黑云制药1",21,"粒",20.0,30.1,"123qweas321123","2019-04-06",1623.0,245.0));
        loArray.add(new OutboundInfoAddArray(3,"zxc","头孢2","黑云制药2",220,"粒",20.0,30.1,"123212qewassa","2019-06-06",1283.0,435.0));
        loArray.add(new OutboundInfoAddArray(4,"cvbcv","头孢3","黑云制药3",240,"粒",20.0,30.1,"123qweas321123ee","2012-05-06",1293.0,445.0));

        //创建list1
        los.add(new OutboundInfo(1,"asdzasdxc","科室领药","lx",2000.0,32230.0,"lx","2021-10-13",1,"2010-10-6","2022-10-11","nothing",null));
        //创建list2
            //创建array
        List<OutboundInfoAddArray> loArray1 = new ArrayList<>();
        loArray1.add(loArray.get(0));
        loArray1.add(loArray.get(1));
        loArray1.add(loArray.get(2));
        los.add(new OutboundInfo(2,"asdzx12qwec","销售","lx",2032.0,31230.0,"lx1","2021-10-13",0,"2010-10-16","2021-10-11","nothing",
                loArray1));
        //创建list3
            //创建array
        List<OutboundInfoAddArray> loArray2 = new ArrayList<>();
        loArray2.add(loArray.get(0));
        loArray2.add(loArray.get(3));
        los.add(new OutboundInfo(3,"asdzzxasdasxc","报损出库","lx",2540.0,21300.0,"lx2","2021-10-13",3,"2010-12-6","2023-10-11","nothing",null));

        //人员集合
        warehouseOutPersonnel.add(new BasicInfo(1,"lxin1"));
        warehouseOutPersonnel.add(new BasicInfo(2,"linx2"));
        warehouseOutPersonnel.add(new BasicInfo(3,"lxi3"));
        warehouseOutPersonnel.add(new BasicInfo(4,"lix4"));

        //出库类型
        deliveryType.add(new BasicInfo(1,"lxin1"));
        deliveryType.add(new BasicInfo(2,"linx2"));
        deliveryType.add(new BasicInfo(3,"lxi3"));
        deliveryType.add(new BasicInfo(4,"lix4"));
    }
}
