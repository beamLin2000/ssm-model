package com.gxa.service.impl.systemSettings;

import com.gxa.entity.systemSettings.EMEmployeeTable;
import com.gxa.entity.systemSettings.RolesTable;
import com.gxa.mapper.systemSettings.RolesSetMapper;
import com.gxa.service.systemSettings.RolesSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesSetServiceImpl implements RolesSetService {
    @Autowired
    private RolesSetMapper rolesSetMapper;
    @Override
    public List<RolesTable> selectAll() {
        List<RolesTable> rolesTables = rolesSetMapper.selectAll();
        return rolesTables;
    }
}
