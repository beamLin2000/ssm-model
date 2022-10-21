package com.gxa.service.drugManagement.outboundManagement.impl;

import com.gxa.entity.drugManagement.basicInfo.UpdateInventoryList;
import com.gxa.entity.drugManagement.drugInformationTenance.DrugBasicInformation;
import com.gxa.entity.drugManagement.inboundManagement.IOboundInfoAddArray;
import com.gxa.entity.drugManagement.inventoryManagement.InventoryInfo;
import com.gxa.entity.drugManagement.outboundManagement.OutboundInfo;
import com.gxa.mapper.drugManagement.drugInformationTenance.DrugInformationMapper;
import com.gxa.mapper.drugManagement.inventoryManagement.InventoryManagerMapper;
import com.gxa.mapper.drugManagement.outboundManagement.OutboundManagerMapper;
import com.gxa.service.drugManagement.outboundManagement.OutboundManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author LXD
 * @Date 2022/10/18 17:05
 * @Version 1.0
 */
@Service
@SuppressWarnings({"all"})
public class OutboundManagerServiceImpl implements OutboundManagerService {
    @Autowired
    private OutboundManagerMapper outboundManagerMapper;

    @Autowired
    private InventoryManagerMapper inventoryManagerMapper;

    @Autowired
    private DrugInformationMapper drugInformationMapper;

    @Override
    public List<OutboundInfo> queryAll() {
        return outboundManagerMapper.queryAll(null);
    }

    @Override
    public OutboundInfo queryById(Integer id) {
        //根据id查询出库的信息
        OutboundInfo outboundInfo = outboundManagerMapper.queryById(id);
        System.out.println("根据id查询出库的信息=" + outboundInfo);
        //根据id查询出库新增药品的信息
        List<IOboundInfoAddArray> iOboundInfoAddArrays = outboundManagerMapper.queryArrayById(id);
        System.out.println("根据id查询出库新增药品的信息=" + iOboundInfoAddArrays);
        //将药品放进outboundInfo中
        outboundInfo.setIOboundInfoAddArray(iOboundInfoAddArrays);
        return outboundInfo;
    }

    @Override
    public void deleteById(Integer id) {
        outboundManagerMapper.deleteById(id);
    }

    @Override
    public List<OutboundInfo> search(Integer auditStatus, String deliveryType, String rules) {
        List<OutboundInfo> search = outboundManagerMapper.search(auditStatus, deliveryType, rules);
        return search;
    }

    @Override
    public void saveAndEdit(OutboundInfo outboundInfo) throws Exception {
        //获取drug_info列表
        List<DrugBasicInformation> drugBasicInformations = drugInformationMapper.queryList();
        System.out.println("获取到drugInfoId:"+drugBasicInformations);
        //判断是否是添加
        if (outboundInfo.getId() == null) {
            int id = 0;
            StringBuilder code = new StringBuilder("CB");
            //获取所有数据的条数，判断下一条的id为多少
            //首先获取所有数据
            List<OutboundInfo> outboundInfoList = outboundManagerMapper.queryAll("true");
            //得到大小
            int size = outboundInfoList.size();
            if (size == 0) {//如果没有数据，那么第一条id为1
                id = 1;
                code = code.append("20221022");
            } else {
                id = outboundInfoList.get(size - 1).getId() + 1;
                String codePre = outboundInfoList.get(size - 1).getDeliveryOrderNo().substring(2);
                code.append(String.valueOf(codePre)+1);
            }
            //将id赋值给出库单号的id
            outboundInfo.setId(id);
            outboundInfo.setDeliveryOrderNo(code.toString());
            System.out.println("新增：" + id);
            //将审核日期时间放进
            String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            outboundInfo.setCreateTime(format);

            //保存主表
            outboundManagerMapper.saveOutboundInfo(outboundInfo);

            //获取小表的对象
            List<IOboundInfoAddArray> iOboundInfoAddArray = outboundInfo.getIOboundInfoAddArray();
            //收集新增出库的药品以及数量
            List<UpdateInventoryList> updateInventoryLists = new ArrayList<>();
            //获取需要出库的药品id以及数量
            for (IOboundInfoAddArray i : iOboundInfoAddArray) {
                for(DrugBasicInformation d: drugBasicInformations){
                    if(i.getCode().equals(d.getCode())){
                        updateInventoryLists.add(new UpdateInventoryList(1, i.getMedicalNumber(),d.getId()));
                    }
                }
            }
            System.out.println("获取到的新增库存id以及数量=" + updateInventoryLists);

            //查询所有库
            List<InventoryInfo> inventoryInfos = inventoryManagerMapper.search(null, null);
            //根据药品命修改库存
            for (int i = 0; i < updateInventoryLists.size(); i++) {
                for (InventoryInfo info : inventoryInfos) {
                    //根据索引获取新增的药品以及数量的对象
                    UpdateInventoryList updateInventoryList = updateInventoryLists.get(i);
                    if (updateInventoryList.getMedicalId().intValue() == info.getDrugInfoId().intValue()) {
                        //减少库存值
                        //如果库存不够
                        if (updateInventoryList.getStock() < info.getStock()) {
                            System.out.println("库存不够");
                            new Exception("库存不够");
                        } else {
                            System.out.println("当前库存"+updateInventoryList.getStock()+"，当前需要出库的数量"+info.getStock());
                            updateInventoryLists.get(i).setStock(updateInventoryList.getStock() - info.getStock());
                        }
                        break;
                    }

                }
            }
            System.out.println("库存信息"+inventoryInfos);
            System.out.println("获取了所有的新增库存id以及库存后" + updateInventoryLists);
            //执行修改库存方法
            outboundManagerMapper.updateInventoryInfo(updateInventoryLists);
            //执行保存array方法
            outboundManagerMapper.saveOutboundInfoArray(iOboundInfoAddArray, null, id);
        } else {//修改
//            //先拿到前端给我们的数据
//            List<IOboundInfoAddArray> iOboundInfoAddArray = outboundInfo.getIOboundInfoAddArray();
//            //删除小表的数据
//            outboundManagerMapper.deleteInboundInfoArrayById(outboundInfo.getId());
//            //将获得的新数据放进去
//            outboundManagerMapper.saveOutboundInfoArray(iOboundInfoAddArray,null, outboundInfo.getId());

            //获取前端提交的集合
            List<IOboundInfoAddArray> HTMLiOboundInfoAddArray = outboundInfo.getIOboundInfoAddArray();
            //获取曾经添加过的药品
            List<IOboundInfoAddArray> oldIOboundInfoAddArrays = outboundManagerMapper.queryArrayById(outboundInfo.getId());
            System.out.println("曾经出库的药品有"+oldIOboundInfoAddArrays);
            //获取库存
            List<InventoryInfo> InventoryInfos = inventoryManagerMapper.search(null, null);


            System.out.println("药品信息管理=" + drugBasicInformations);
            if (oldIOboundInfoAddArrays.size() != 0) {//如果曾经添加过药品,则将药品删除以及库存数量删除
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
                //使用库存加上曾经添加过的药品数量
                for (int i = 0; i < mulitIOboundInfoAddArrays.size(); i++) {
                    for (InventoryInfo array : InventoryInfos) {
                        if (mulitIOboundInfoAddArrays.get(i).getMedicalId().intValue() == array.getDrugInfoId().intValue()) {
                            mulitIOboundInfoAddArrays.get(i).setStock(array.getStock() + mulitIOboundInfoAddArrays.get(i).getStock());
                        }
                    }
                }
                //删除曾经添加过的药品
                System.out.println("删除曾经修改的药品并回滚库存"+mulitIOboundInfoAddArrays);
                outboundManagerMapper.deleteOutboundInfoArrayById(outboundInfo.getId());
                //加上曾经添加过的药品数量
                outboundManagerMapper.updateInventoryInfo(mulitIOboundInfoAddArrays);
            }//如果曾经未曾添加过药品,则直接新增
//最后进行数据的添加
            //将前端提交的数据添加到库存管理中
            //获取来自前端新增的array数据
            List<IOboundInfoAddArray> IOboundInfoAddArray = outboundInfo.getIOboundInfoAddArray();
            System.out.println("需要出库的数据："+IOboundInfoAddArray);
            //获取新增的药品及其数量
            //收集新增出库的药品id及其数量
            List<UpdateInventoryList> newAddInventoryInfos = new ArrayList<>();
            //提取添加过药品的id以及已添加的数量
            for (int i = 0; i < oldIOboundInfoAddArrays.size(); i++) {
                for (int j = 0; j < drugBasicInformations.size(); j++) {
                    if (oldIOboundInfoAddArrays.get(i).getCode().equals(drugBasicInformations.get(j).getCode())) {
                        newAddInventoryInfos.add(new UpdateInventoryList(1, oldIOboundInfoAddArrays.get(i).getMedicalNumber(), drugBasicInformations.get(j).getId()));
                        break;
                    }
                }

            }
            System.out.println("获取现在需要添加的药品以及数量"+newAddInventoryInfos);
            //查询所有库存
            //获取药品库存以及drugId

            //根据药品名修改库存
            for (int i = 0; i < newAddInventoryInfos.size(); i++) {
                for (InventoryInfo array : InventoryInfos) {
                    UpdateInventoryList updateInventoryList = newAddInventoryInfos.get(i);
                    System.out.println("获取到的更新库存的list=" + updateInventoryList);
                    if (updateInventoryList.getMedicalId().intValue() == array.getDrugInfoId().intValue()) {
                        System.out.println("获取到的updateInventoryList.getStock = "  + updateInventoryList.getStock());
                        //存储库存值
                        if (array.getStock() - updateInventoryList.getStock() < 0){
                            new Exception("库存不够");
                        }else {
                            newAddInventoryInfos.get(i).setStock(array.getStock()-updateInventoryList.getStock());
                        }
                        //存储库存外键(drugInfo_id)
                        newAddInventoryInfos.get(i).setMedicalId(array.getDrugInfoId());
                    }
                }
            }
            System.out.println("获取了所有的新增库存id以及库存后" + newAddInventoryInfos);
            //执行修改库存方法
            outboundManagerMapper.updateInventoryInfo(newAddInventoryInfos);
            //将前端获取到的id值为空
            for (IOboundInfoAddArray iOboundInfoAddArray : HTMLiOboundInfoAddArray) {
                iOboundInfoAddArray.setId(null);
            }

            //新增添加的药品
            outboundManagerMapper.saveOutboundInfoArray(HTMLiOboundInfoAddArray, null, outboundInfo.getId());
        }
    }
}
