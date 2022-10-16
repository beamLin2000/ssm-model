package com.gxa.controller.drugManagement.inboundManagement;

import com.gxa.entity.drugManagement.inboundManagement.InboundInfo;
import com.gxa.entity.drugManagement.inboundManagement.InboundInfoAddArray;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/12 13:33
 */
@Getter
@Setter
@Component
public class InboundManagerVisualData {
    //list
    private List<InboundInfo> inboundInfos = new ArrayList<>();
    //三条新增药品数据
    private List<InboundInfoAddArray>InboundInfoAddArray = new ArrayList<>();
    private List<InboundInfoAddArray>InboundInfoAddArray1 = new ArrayList<>();
    private List<InboundInfoAddArray>InboundInfoAddArray2 = new ArrayList<>();

    {
        //初始化新增药品
        InboundInfoAddArray.add(new InboundInfoAddArray(1,"asdsad1","中药","23/盒","阿莫西林1","白云制药厂代理部1",632,"/盒",32.0,65.0,"132qwead","2050-05-02",1700.0,1600.0));
        InboundInfoAddArray.add(new InboundInfoAddArray(2,"asdsad2","阿莫西林2","中药","23/盒","白云制药厂代理部2",6321,"/盒",32.0,65.0,"132qwead","2050-05-02",1700.0,1600.0));
        InboundInfoAddArray.add(new InboundInfoAddArray(3,"asdsad3","阿莫西林3","中药","23/盒","白云制药厂代理部3",6322,"/盒",32.0,65.0,"132qwead","2050-05-02",1700.0,1600.0));
        InboundInfoAddArray.add(new InboundInfoAddArray(4,"asdsad4","阿莫西林4","中药","23/盒","白云制药厂代理部4",6332,"/盒",32.0,65.0,"132qwead","2050-05-02",1700.0,1600.0));
        //第一条list
        inboundInfos.add(new InboundInfo(1,"asdadsadsa","采购入库","白云制药厂","lx",2100.0,2400.0,"lx","2016-5-8",0,"2019-2-3","白云代理部","2019-9-9","666","lx","2019-06-02",null));

        //初始化新增药品
        InboundInfoAddArray1.add(InboundInfoAddArray.get(0));
        InboundInfoAddArray1.add(InboundInfoAddArray.get(1));
        //第二条list
        inboundInfos.add(new InboundInfo(2,"asdadsadsa","采购入库","白云制药厂","lx",2100.0,2400.0,"lx","2016-5-8",1,"2019-2-3","白云代理部","2019-9-9","666","lx","2019-06-02",
                InboundInfoAddArray1));

        //初始化新增药品
        InboundInfoAddArray2.add(InboundInfoAddArray.get(1));
        //第三条list
        inboundInfos.add(new InboundInfo(3,"asdadsadsa","采购入库","白云制药厂","lx",2100.0,2400.0,"lx","2016-5-8",2,"2019-2-3","白云代理部","2019-9-9","666","lx","2019-06-02",
                InboundInfoAddArray2));

    }
}
