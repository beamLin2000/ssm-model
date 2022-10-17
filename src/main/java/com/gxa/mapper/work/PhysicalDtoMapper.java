package com.gxa.mapper.work;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.work.PhysicalDto;

public interface PhysicalDtoMapper extends BaseMapper<PhysicalDto> {
    PhysicalDto queryPhysicalDtoByIdCard(String idCard);
}
