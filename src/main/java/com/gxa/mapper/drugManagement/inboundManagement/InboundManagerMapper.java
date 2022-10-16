package com.gxa.mapper.drugManagement.inboundManagement;

import com.gxa.entity.drugManagement.inboundManagement.InboundInfo;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/16 18:09
 */
public interface InboundManagerMapper {
    List<InboundInfo> queryAll();
}
