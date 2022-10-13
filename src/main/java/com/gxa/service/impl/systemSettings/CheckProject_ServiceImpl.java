package com.gxa.service.impl.systemSettings;

import com.gxa.entity.systemSettings.CPSMainTable;
import com.gxa.mapper.systemSettings.CheckProjectSet_Mapper;
import com.gxa.service.systemSettings.CheckProjectSet_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckProject_ServiceImpl implements CheckProjectSet_Service {
    @Autowired
    private CheckProjectSet_Mapper checkProjectSet_mapper;
    @Override
    public List<CPSMainTable> selectAll() {
        List<CPSMainTable> CPSMainTables = checkProjectSet_mapper.selectALl();
        return CPSMainTables;
    }
}
