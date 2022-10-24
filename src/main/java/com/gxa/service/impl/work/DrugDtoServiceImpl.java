package com.gxa.service.impl.work;

import com.gxa.dto.work.DrugDto;
import com.gxa.entity.work.Inspect;
import com.gxa.mapper.work.DrugDtoMapper;
import com.gxa.service.work.DrugDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DrugDtoServiceImpl implements DrugDtoService {
    @Autowired
    private DrugDtoMapper drugDtoMapper;
    @Override
    public List<DrugDto> queryAllDrugDto(String prescriptionName) {

        List<DrugDto> drugDtos = this.drugDtoMapper.queryAllDrugDto(prescriptionName);

        return drugDtos;
    }

    @Override
    public List<Inspect> queryAllInspect() {
        List<Inspect> inspects = this.drugDtoMapper.queryAllInspect();
        return inspects;
    }
}
