package com.gxa.service.drugManagement.drugPriceAdjustment.impl;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.entity.drugManagement.drugPriceAdjustment.DrugPriceAdjustInfo;
import com.gxa.entity.drugManagement.drugPriceAdjustment.DrugPriceAdjustInfoList;
import com.gxa.entity.drugManagement.inboundManagement.IOboundInfoAddArray;
import com.gxa.entity.drugManagement.inboundManagement.InboundInfo;
import com.gxa.mapper.drugManagement.drugPriceAdjustment.DrugPriceAdjustmentMapper;
import com.gxa.mapper.drugManagement.inboundManagement.InboundManagerMapper;
import com.gxa.service.drugManagement.drugPriceAdjustment.DrugPriceAdjustmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author LXD
 * @Date 2022/10/20 19:29
 * @Version 1.0
 */
@Service
public class DrugPriceAdjustmentServiceImpl implements DrugPriceAdjustmentService {

    @Autowired
    private DrugPriceAdjustmentMapper drugPriceAdjustmentMapper;
    @Autowired
    private InboundManagerMapper inboundManagerMapper;

    //搜索
    @Override
    public List<DrugPriceAdjustInfo> search(String drugType, String rules) {
        List<DrugPriceAdjustInfo> search = drugPriceAdjustmentMapper.search(drugType, rules);
        List<BasicInfo> basicInfos = drugPriceAdjustmentMapper.queryCount();
        for (int i = 0; i < search.size() ; i++) {
            for (BasicInfo array:basicInfos) {
                if (search.get(i).getCode().equals(array.getName())){
                    search.get(i).setPriceAdjustmentTimes(array.getId());
                }
            }
        }
        return search;
    }

    //根据code查询数据
    @Override
    public List<DrugPriceAdjustInfoList> queryByCode(String code) {
        List<DrugPriceAdjustInfoList> drugPriceAdjustInfoLists = drugPriceAdjustmentMapper.queryByCode(code);
        return drugPriceAdjustInfoLists;
    }

    @Override
    public void saveDrugPriceAdjustInfoList(List<DrugPriceAdjustInfoList> drugPriceAdjustInfoList, String operationTime,
                                            String operator) {
        //首先将数据库已存在的调价信息删除
        drugPriceAdjustmentMapper.deleteByCode(drugPriceAdjustInfoList.get(0).getCode());

        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String name = "张三";
        List<IOboundInfoAddArray> infoAddArraysID = new ArrayList<>();
        //查询所有的inboundInfos 的数据
        List<InboundInfo> inboundInfos = inboundManagerMapper.search(null, null, null);
        //获取到 ioInfoID
        List<Integer> ioInfoID = new ArrayList<>();
        for (DrugPriceAdjustInfoList priceAdjustInfoList : drugPriceAdjustInfoList) {
            for (int i = 0; i < inboundInfos.size() ; i++) {
                //通过订单编号判断获取到的ioInfoID
                if (priceAdjustInfoList.getPurchaseNo().equals(inboundInfos.get(i).getReceiptNo())){
                    ioInfoID.add(inboundInfos.get(i).getId());
                }
            }
        }
        System.out.println("获取到 ioInfoID=" + ioInfoID);
        List<Integer> ioArrayID = inboundManagerMapper.queryIoArrayIdByInboundId(ioInfoID);

        System.out.println("获取到 ioArrayID= " + ioArrayID);
        //保存调价的数据
        for (int i = 0; i < ioArrayID.size(); i++) {
            drugPriceAdjustInfoList.get(i).setInboundArrayId(ioArrayID.get(i));
        }
            drugPriceAdjustmentMapper.saveDrugPriceAdjustInfoList(drugPriceAdjustInfoList,format,name);

    }

    @Override
    public List<DrugPriceAdjustInfoList> queryById(Integer id) {
        List<DrugPriceAdjustInfoList> drugPriceAdjustInfoLists = drugPriceAdjustmentMapper.queryById(id);
        return drugPriceAdjustInfoLists;
    }


}
