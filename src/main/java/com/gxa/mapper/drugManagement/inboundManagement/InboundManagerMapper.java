package com.gxa.mapper.drugManagement.inboundManagement;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.entity.drugManagement.basicInfo.UpdateInventoryList;
import com.gxa.entity.drugManagement.inboundManagement.IOboundInfoAddArray;
import com.gxa.entity.drugManagement.inboundManagement.InboundInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/16 18:09
 */
public interface InboundManagerMapper {
    //主页查询列表
    List<InboundInfo> queryAll(@Param("isAll")String all);
    //编辑或者查看功能
    InboundInfo queryById(@Param("id")Integer id);
    //查询新增药品列表
    List<IOboundInfoAddArray>queryArrayById(@Param("id")Integer id);
    //删除入库信息
    void deleteInboundInfoById(@Param("id")Integer id);
    //删除具体入库药品列表
    void deleteInboundInfoArrayById(@Param("id")Integer id);
    //主页搜索功能
    List<InboundInfo> search(@Param("auditStatus") Integer auditStatus,
                             @Param("receiptType")String receiptType,
                             @Param("rules")String rules);
    //保存入库单号
    void saveInboundInfo(InboundInfo inboundInfo);
    //保存入库
    void saveInboundInfoArray(@Param("IOboundInfoAddList") List<IOboundInfoAddArray> inboundInfoAddArray,
                              @Param("InboundInfoId")Integer inboundInfoId,
                              @Param("OutboundInfoId")Integer outboundInfoId);

    //更新主页-显示数据
    void updateInboundInfo(InboundInfo inboundInfo);
    //更新array
    void updateInboundInfoArray(@Param("IOboundInfoAddList") IOboundInfoAddArray inboundInfoAddArray);

    //每次入库均需要对其值进行增加
    void updateInventoryInfo(@Param("newInventoryInfos") List<UpdateInventoryList> updateInventoryLists);

}
