package com.gxa.mapper.drugManagement.outboundManagement;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.entity.drugManagement.inboundManagement.IOboundInfoAddArray;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/16 18:09
 */
public interface OutboundManagerOtherMapper {

     //根据type_id查询出库类型
     List<BasicInfo> queryAllOutboundType(Integer id);

     List<BasicInfo> queryAllWarehousingPersonnel();

     List<IOboundInfoAddArray> search(@Param("drugType") String drugType,
                                      @Param("rules") String rules);

}
