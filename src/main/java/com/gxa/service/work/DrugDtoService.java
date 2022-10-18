package com.gxa.service.work;

import com.gxa.dto.work.DrugDto;
import com.gxa.entity.work.Inspect;

import java.util.List;

public interface DrugDtoService {
    List<DrugDto> queryAllDrugDto(String prescriptionName);
    List<Inspect> queryAllInspect();
}
