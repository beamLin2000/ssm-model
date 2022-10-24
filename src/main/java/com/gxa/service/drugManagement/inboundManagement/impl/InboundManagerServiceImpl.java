package com.gxa.service.drugManagement.inboundManagement.impl;

import com.gxa.entity.drugManagement.basicInfo.UpdateInventoryList;
import com.gxa.entity.drugManagement.drugInformationTenance.DrugBasicInformation;
import com.gxa.entity.drugManagement.inboundManagement.InboundInfo;
import com.gxa.entity.drugManagement.inboundManagement.IOboundInfoAddArray;
import com.gxa.entity.drugManagement.inventoryManagement.InventoryInfo;
import com.gxa.mapper.drugManagement.drugInformationTenance.DrugInformationMapper;
import com.gxa.mapper.drugManagement.inboundManagement.InboundManagerMapper;
import com.gxa.mapper.drugManagement.inventoryManagement.InventoryManagerMapper;
import com.gxa.service.drugManagement.inboundManagement.InboundManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/16 16:54
 */
@Service
@SuppressWarnings({"all"})
public class InboundManagerServiceImpl implements InboundManagerService {
    @Autowired
    private InboundManagerMapper inboundManagerMapper;
    @Autowired
    private InventoryManagerMapper inventoryManagerMapper;

    @Autowired
    private DrugInformationMapper drugInformationMapper;
    @Override
    public List<InboundInfo> queryAll() {
        return inboundManagerMapper.queryAll(null);
    }

    @Override
    public InboundInfo queryById(Integer id) {
        //查询入库信息
        InboundInfo inboundInfo = inboundManagerMapper.queryById(id);
        //查询入库的药品明细
        List<IOboundInfoAddArray> IOboundInfoAddArrays = inboundManagerMapper.queryArrayById(id);
        //将入库药品添加到入库信息中并返回
        inboundInfo.setIOboundInfoAddArray(IOboundInfoAddArrays);
        return inboundInfo;
    }

    @Override
    public void deleteById(Integer id) {
        inboundManagerMapper.deleteInboundInfoArrayById(id);
        inboundManagerMapper.deleteInboundInfoById(id);
    }

    @Override
    public List<InboundInfo> search(Integer auditStatus, String receiptType, String rules) {
        List<InboundInfo> searchs = inboundManagerMapper.search(auditStatus, receiptType, rules);
        return searchs;
    }

    @Override
    public void save(InboundInfo inboundInfo) {
        //获取药品的详细信息
        List<DrugBasicInformation> drugBasicInformations1 = drugInformationMapper.queryList();
        System.out.println("药品明细信息"+drugBasicInformations1);
        //获取来自前端新增的药品array数据
        List<IOboundInfoAddArray> HTMLioboundInfoAddArray = inboundInfo.getIOboundInfoAddArray();
        System.out.println("来自前端的数据"+HTMLioboundInfoAddArray);
        if(inboundInfo.getId()==null) {//新增
            //首先获取所有已经新增的记录,获取最后一条数据,其值+1为本条新增记录的id
            List<InboundInfo> inboundInfos = inboundManagerMapper.queryAll("true");
            //定义主键id
            Integer id = null;
            //判断入库记录中是否存在数据
            int inboundInfoSize = inboundInfos.size();
            StringBuilder code = new StringBuilder("SP");
            if (inboundInfoSize == 0) {//如果没有数据,则设置id为1
                id = 1;
                code.append("202210220820");
            } else {//若存在数据,则id值为其最后一条数据的id+1
                id = inboundInfos.get(inboundInfoSize - 1).getId() + 1;
                System.out.println("code123"+inboundInfos.get(inboundInfoSize - 1).getReceiptNo().substring(2));
                code.append(Long.parseLong(inboundInfos.get(inboundInfoSize - 1).getReceiptNo().substring(2)) + 1);
            }
            //将id值赋予入库信息
            inboundInfo.setId(id);
            //填入单号
            inboundInfo.setReceiptNo(code.toString());
            //审核日期
            String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            inboundInfo.setAuditDate(format);
            //审核人员  自动获取当前人员
            inboundInfo.setReviewer("lx");
            //执行保存主页显示数据方法
            inboundManagerMapper.saveInboundInfo(inboundInfo);



            if (HTMLioboundInfoAddArray != null){
            //收集新增入库的药品id及其数量
            List<UpdateInventoryList> newInventoryInfos = new ArrayList<>();
            //交替循环遍历新增的列表与药品信息
            for (int i = 0; i < drugBasicInformations1.size(); i++) {
                for (IOboundInfoAddArray array : HTMLioboundInfoAddArray) {
                    //通过判断两者的code,获取新增的数量与药品信息id,便于根据id修改库存
                    if (drugBasicInformations1.get(i).getCode().equals(array.getCode())) {
                        newInventoryInfos.add(new UpdateInventoryList(1, array.getMedicalNumber(), drugBasicInformations1.get(i).getId()));
                    }
                }
            }
            System.out.println("获取了所有的新增库存id以及库存后" + newInventoryInfos);
            //查询所有库存
            List<InventoryInfo> inventoryInfos = inventoryManagerMapper.search(null, null);
            System.out.println("库存信息" + inventoryInfos);
            //判断code的相等性,修改库存值
            for (int i = 0; i < newInventoryInfos.size(); i++) {
                for (InventoryInfo array : inventoryInfos) {
                    UpdateInventoryList updateInventoryList = newInventoryInfos.get(i);
                    if (updateInventoryList.getMedicalId().intValue() == array.getDrugInfoId().intValue()) {
                        //存储库存值
                        newInventoryInfos.get(i).setStock(updateInventoryList.getStock() + array.getStock());
                    }
                }
            }
            inboundManagerMapper.saveInboundInfoArray(HTMLioboundInfoAddArray, id, null);


            System.out.println("获取了所有的新增库存id以及库存后" + newInventoryInfos);
            //执行修改库存方法
            inboundManagerMapper.updateInventoryInfo(newInventoryInfos);
            //执行保存array方法
        }
        }else{//修改
//首先将曾经添加过的药品信息从inbound删除,并将库存数量进行相减
            //获取曾经添加过的药品
            List<IOboundInfoAddArray> oldIOboundInfoAddArrays = inboundManagerMapper.queryArrayById(inboundInfo.getId());

            //获取drug_info列表
            List<DrugBasicInformation> drugBasicInformations = drugInformationMapper.queryList();
            if (oldIOboundInfoAddArrays.size() != 0) {//如果曾经添加过药品,则将药品删除以及库存数量删除
                //获取库存
                List<InventoryInfo> InventoryInfos = inventoryManagerMapper.search(null, null);
                System.out.println("库存信息"+InventoryInfos);
                //定义需要进行相减库存的集合
                List<UpdateInventoryList> mulitIOboundInfoAddArrays = new ArrayList<>();
                //提取添加过药品的id以及已添加的数量
                for (int i = 0; i < oldIOboundInfoAddArrays.size(); i++) {
                    for (int j = 0; j < drugBasicInformations.size(); j++) {
                        if (oldIOboundInfoAddArrays.get(i).getCode().equals(drugBasicInformations.get(j).getCode())) {
                            mulitIOboundInfoAddArrays.add(new UpdateInventoryList(1, oldIOboundInfoAddArrays.get(i).getMedicalNumber(), drugBasicInformations.get(j).getId()));
                            break;
                        }
                    }
                }
                //使用库存减去曾经添加过的药品数量
                for (int i = 0; i < mulitIOboundInfoAddArrays.size(); i++) {
                    for (InventoryInfo array : InventoryInfos) {
                        if (mulitIOboundInfoAddArrays.get(i).getMedicalId().intValue() == array.getDrugInfoId().intValue()) {
                            mulitIOboundInfoAddArrays.get(i).setStock(array.getStock() - mulitIOboundInfoAddArrays.get(i).getStock());
                        }
                    }
                }
                //删除曾经添加过的药品
                inboundManagerMapper.deleteInboundInfoArrayById(inboundInfo.getId());
                //减去曾经添加过的药品数量
                inboundManagerMapper.updateInventoryInfo(mulitIOboundInfoAddArrays);
            }//将库存值以及添加的数据回滚后
            else if(inboundInfo.getIOboundInfoAddArray()!=null){//判断需要新增的数据是否存在数据
                //最后进行数据的添加
                //将前端提交的数据添加到库存管理中
                //获取来自前端新增的array数据
                List<IOboundInfoAddArray> IOboundInfoAddArray = inboundInfo.getIOboundInfoAddArray();
                //获取新增的药品及其数量
                //收集新增入库的药品id及其数量
                List<UpdateInventoryList> newAddInventoryInfos = new ArrayList<>();
                for (int i = 0; i < HTMLioboundInfoAddArray.size(); i++) {
                    for (int j = 0; j < drugBasicInformations.size(); j++) {
                        if (HTMLioboundInfoAddArray.get(i).getCode().equals(drugBasicInformations.get(j).getCode())) {
                            newAddInventoryInfos.add(new UpdateInventoryList(1, HTMLioboundInfoAddArray.get(i).getMedicalNumber(), drugBasicInformations.get(j).getId()));
                            break;
                        }
                    }
                }
                System.out.println("获取了所有的新增库存id以及库存后" + newAddInventoryInfos);
                //查询所有库存
                //获取库存
                List<InventoryInfo> InventoryInfos = inventoryManagerMapper.search(null, null);
                //获取药品库存以及drugId

                //根据药品名修改库存
                for (int i = 0; i < newAddInventoryInfos.size(); i++) {
                    for (InventoryInfo array : InventoryInfos) {
                        UpdateInventoryList updateInventoryList = newAddInventoryInfos.get(i);
                        if (updateInventoryList.getMedicalId() == array.getDrugInfoId()) {
                            //存储库存值
                            newAddInventoryInfos.get(i).setStock(updateInventoryList.getStock() + array.getStock());
                            //存储库存外键(drugInfo_id)
                            newAddInventoryInfos.get(i).setMedicalId(array.getDrugInfoId());
                        }
                    }
                }
                System.out.println("获取了所有的新增库存id以及库存后" + newAddInventoryInfos);
                //执行修改库存方法
                inboundManagerMapper.updateInventoryInfo(newAddInventoryInfos);
                for(IOboundInfoAddArray array:HTMLioboundInfoAddArray){
                    array.setId(null);
                }
                //新增添加的药品
                inboundManagerMapper.saveInboundInfoArray(HTMLioboundInfoAddArray, inboundInfo.getId(), null);
            }



        }
    }
}
