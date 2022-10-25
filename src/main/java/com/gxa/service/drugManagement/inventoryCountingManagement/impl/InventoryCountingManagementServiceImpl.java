package com.gxa.service.drugManagement.inventoryCountingManagement.impl;

import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingArrayToData;
import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfo;
import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfoArray;
import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfoArrayAll;
import com.gxa.mapper.drugManagement.inventoryCountingManagement.InventoryCountingInfoArrayAllMapper;
import com.gxa.mapper.drugManagement.inventoryCountingManagement.InventoryCountingManagementMapper;
import com.gxa.service.drugManagement.inventoryCountingManagement.InventoryCountingManagementService;
import io.swagger.models.auth.In;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InventoryCountingManagementServiceImpl implements InventoryCountingManagementService {
    @Autowired
    private InventoryCountingManagementMapper inventoryCountingManagementMapper;
    @Autowired
    private InventoryCountingInfoArrayAllMapper inventoryCountingInfoArrayAllMapper;

    @Override
    public List<InventoryCountingInfo> queryAll() {
        List<InventoryCountingInfo> inventoryCountingInfos = this.inventoryCountingManagementMapper.selectList(null);
        return inventoryCountingInfos;
    }


    @Override
    public List<InventoryCountingInfo> queryByCondition(String createTime, String countSheetNo) {
        //将前端获取到的字符串数据拆分
        String start = null;
        String end = null;
        if(createTime!=null && createTime.indexOf(",")!=-1){
            String[] createTimeArray = createTime.split(",");
            start = createTimeArray[0].trim();
            end = createTimeArray[1].trim();
        }
        return inventoryCountingManagementMapper.queryByCondition(start,end,countSheetNo);
    }

    //查询buid
    @Override
    public InventoryCountingInfo queryById(Integer id) {
        InventoryCountingInfo inventoryCountingInfo = this.inventoryCountingManagementMapper.queryArraysById(id);
        List<InventoryCountingInfoArray> inventoryCountingInfoArrayAlls = this.inventoryCountingInfoArrayAllMapper.queryAll(id);
        inventoryCountingInfo.setInventoryCountingInfoArrays(inventoryCountingInfoArrayAlls);
        return inventoryCountingInfo;
    }

    @Override
    public void saveAllData(InventoryCountingInfo inventoryCountingInfo) {
        //查询所有
        List<InventoryCountingInfo> inventoryCountingInfos1 = inventoryCountingManagementMapper.queryAll();
        System.out.println("查询所有=" + inventoryCountingInfos1);
        StringBuilder code = new StringBuilder("SA");
        if(inventoryCountingInfos1.size()==0){
            code.append("201911190030");
        }else{
            code.append(Long.parseLong(inventoryCountingInfos1.get(inventoryCountingInfos1.size()-1).getCountSheetNo().substring(2))+1);
        }
        //定义todata
        List<InventoryCountingArrayToData> inventoryCountingArrayToData = new ArrayList<>();
        //获取来自前端的数据
        List<InventoryCountingInfoArray> inventoryCountingInfoArrays = inventoryCountingInfo.getInventoryCountingInfoArrays();

        //保存大表
        inventoryCountingManagementMapper.saveAll(inventoryCountingInfo);
        //获取大表id
        List<InventoryCountingInfo> inventoryCountingInfos = inventoryCountingManagementMapper.queryByCondition(null, null, null);
        Integer countInfoId = inventoryCountingInfos.get(inventoryCountingInfos.size() - 1).getId() + 1;
        //循环取出drug_info_id
        for(int i = 0;i<inventoryCountingInfoArrays.size();i++){
            InventoryCountingInfoArray tempObj = inventoryCountingInfoArrays.get(i);
            inventoryCountingArrayToData.add(new InventoryCountingArrayToData(null,countInfoId,tempObj.getId(),tempObj.getInventoryProfitAndLoss(),tempObj.getInventoryLoss(),tempObj.getRemarks()));
        }
        //保存小表的数据
        if(inventoryCountingArrayToData!=null){
            inventoryCountingInfoArrayAllMapper.saveAllArray(inventoryCountingArrayToData);
        }


    }


    @Override
    public void deleteById(Integer id) {
        this.inventoryCountingManagementMapper.deleteById(id);
    }

}
