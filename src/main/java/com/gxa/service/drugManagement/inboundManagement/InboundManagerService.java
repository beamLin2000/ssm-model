package com.gxa.service.drugManagement.inboundManagement;

import com.gxa.entity.drugManagement.inboundManagement.InboundInfo;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/16 16:54
 */
public interface InboundManagerService {
    //主页查询所有
    List<InboundInfo> queryAll();
    //编辑,根据id查询单个数据
    InboundInfo queryById(Integer id);
    //删除,根据id删除单个数据
    void deleteById(Integer id);
    //根据关键字搜索数据集
    List<InboundInfo> search(String auditStatus,String receiptType,String rules);
    //保存数据
    void save(InboundInfo inboundInfo);
}
