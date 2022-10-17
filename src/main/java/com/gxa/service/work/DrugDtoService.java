package com.gxa.service.work;

import com.gxa.dto.work.DrugDto;

import java.util.List;

public interface DrugDtoService {
    List<DrugDto> queryAllDrugDto(String prescriptionName);
}
