package com.gxa.mapper.work;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.work.DrugDto;
import com.gxa.entity.work.Inspect;

import java.util.List;

public interface DrugDtoMapper extends BaseMapper<DrugDto> {
    List<DrugDto> queryAllDrugDto(String prescriptionName);
    List<Inspect> queryAllInspect();
}
