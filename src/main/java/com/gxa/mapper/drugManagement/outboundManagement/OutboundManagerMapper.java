package com.gxa.mapper.drugManagement.outboundManagement;

import com.gxa.entity.drugManagement.basicInfo.UpdateInventoryList;
import com.gxa.entity.drugManagement.inboundManagement.IOboundInfoAddArray;
import com.gxa.entity.drugManagement.outboundManagement.OutboundInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author LXD
 * @Date 2022/10/18 17:00
 * @Version 1.0
 */
public interface OutboundManagerMapper {
    //查询所有
    List<OutboundInfo> queryAll(@Param("isAll") String isAll);

    //主页搜索功能
    List<OutboundInfo> search(@Param("auditStatus") String auditStatus,
                              @Param("deliveryType") String deliveryType,
                              @Param("rules") String rules);

    //根据id删除主表数据
    void deleteById(@Param("id") Integer id);

    //根据id删除出库药品的数据
    void deleteInboundInfoArrayById(@Param("id") Integer id);

    //根据出库id删除出库记录
    void deleteOutboundInfoArrayById(Integer id);

    //根据id 查询
    OutboundInfo queryById(@Param("id") Integer id);

    //查询新增药品列表
    List<IOboundInfoAddArray>queryArrayById(@Param("id") Integer id);

    //保存主页入库信息
    void saveOutboundInfo(OutboundInfo outboundInfo);

    //保存药品添加入库信息
    void saveOutboundInfoArray(@Param("IOboundInfoAddList") List<IOboundInfoAddArray> IOboundInfoAddList,
                               @Param("InboundInfoId") Integer inboundInfoId,
                               @Param("OutboundInfoId") Integer outboundInfoId);

    void updateInventoryInfo(@Param("newInventoryInfos") List<UpdateInventoryList> updateInventoryLists);

}
