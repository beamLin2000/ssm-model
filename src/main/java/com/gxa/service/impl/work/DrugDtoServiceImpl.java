package com.gxa.service.impl.work;

import com.gxa.dto.work.DrugDto;
import com.gxa.mapper.work.DrugDtoMapper;
import com.gxa.service.work.DrugDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugDtoServiceImpl implements DrugDtoService {
    @Autowired
    private DrugDtoMapper drugDtoMapper;
    @Override
    public List<DrugDto> queryAllDrugDto(String prescriptionName) {

        List<DrugDto> drugDtos = this.drugDtoMapper.queryAllDrugDto(prescriptionName);

        return drugDtos;
    }
}
