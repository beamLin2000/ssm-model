package com.gxa.mapper.drugManagement.inboundManagement;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.entity.drugManagement.inventoryManagement.InventoryInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/16 18:09
 */
public interface InboundManagerOtherMapper {

     List<BasicInfo> queryAllInboundType(@Param("typeId")Integer typeId);


     List<BasicInfo> queryAllWarehousingPersonnel();


     List<BasicInfo> queryAllManufacture();

     List<InventoryInfo>searchAdd(@Param("code")String code,
                                  @Param("drugName")String drugName);
}
