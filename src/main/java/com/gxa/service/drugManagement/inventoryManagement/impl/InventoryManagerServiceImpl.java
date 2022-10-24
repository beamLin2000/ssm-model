package com.gxa.service.drugManagement.inventoryManagement.impl;

import com.gxa.entity.drugManagement.inboundManagement.IOboundInfoAddArray;
import com.gxa.entity.drugManagement.inboundManagement.InboundInfo;
import com.gxa.entity.drugManagement.inventoryManagement.InventoryDetails;
import com.gxa.entity.drugManagement.inventoryManagement.InventoryInfo;
import com.gxa.mapper.drugManagement.inventoryManagement.InventoryManagerMapper;
import com.gxa.service.drugManagement.inventoryManagement.InventoryManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/17 15:52
 */
@Service
public class InventoryManagerServiceImpl implements InventoryManagerService {
    @Autowired
    private InventoryManagerMapper inventoryManagerMapper;
    //库存明细
    @Override
    public InventoryInfo queryIOboundInfoAddArrayById(Integer ioboundInfoId,String code) {
        //数量
        List<IOboundInfoAddArray> queryReceiptNo = inventoryManagerMapper.queryReceiptNo(code);
        System.out.println("数量个数:"+queryReceiptNo.size());
        //单号
        List<InboundInfo> InboundInfos = inventoryManagerMapper.queryDetailNumber(code);
        System.out.println("单号个数:"+InboundInfos.size());
        //mainHead
        InventoryInfo inventoryInfoHead = inventoryManagerMapper.queryMainHead(code);
        //明细集合
        List<InventoryDetails> inventoryDetails= new ArrayList<>();
        for(int i = 0; i< queryReceiptNo.size(); i++){
            //单号
            String receiptNo = InboundInfos.get(i).getReceiptNo();
            //操作时间
            String receiptTime = InboundInfos.get(i).getReceiptTime();
            //类型
            String drugType = queryReceiptNo.get(i).getDrugType();
            //数量
            Integer medicalNumber = queryReceiptNo.get(i).getMedicalNumber();
            //批号
            String batchNo = queryReceiptNo.get(i).getBatchNo();
            //采购金额
            Double purchaseAmount = queryReceiptNo.get(i).getPurchaseAmount();
            //零售金额
            Double retailAmount = queryReceiptNo.get(i).getRetailAmount();

            //拼接明细
            InventoryDetails inventoryDetail = new InventoryDetails(null, receiptNo, receiptTime, drugType, medicalNumber, batchNo, purchaseAmount, retailAmount);
            //
            inventoryDetails.add(inventoryDetail);
        }
        System.out.println("获取到的inventoryDetails=" + inventoryDetails);
        System.out.println("获取到的inventoryInfoHead=" + inventoryInfoHead);

        inventoryInfoHead.setInventoryDetails(inventoryDetails);
        return inventoryInfoHead;
    }

    @Override
    public List<InventoryInfo> search(String drugType, String rules) {
        return inventoryManagerMapper.search(drugType,rules);
    }

}
