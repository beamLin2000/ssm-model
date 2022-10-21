package com.gxa.service.drugManagement.outboundManagement;

import com.gxa.entity.drugManagement.outboundManagement.OutboundInfo;

import java.util.List;

/**
 * @Author LXD
 * @Date 2022/10/18 17:04
 * @Version 1.0
 */
public interface OutboundManagerService {
    //主页查询所有
    List<OutboundInfo> queryAll();
    //编辑,根据id查询单个数据
    OutboundInfo queryById(Integer id);
    //删除,根据id删除单个数据
    void deleteById(Integer id);
    //根据关键字搜索数据集
    List<OutboundInfo> search(Integer auditStatus, String deliveryType, String rules);

    //保存主页数据
    void saveAndEdit(OutboundInfo outboundInfo) throws Exception;
}
