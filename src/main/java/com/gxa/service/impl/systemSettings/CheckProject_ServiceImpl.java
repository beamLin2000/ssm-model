package com.gxa.service.impl.systemSettings;

import com.gxa.entity.systemSettings.CPSMainTable;
import com.gxa.entity.systemSettings.CPSViceTable;
import com.gxa.form.systemSettings.CPSEdit;
import com.gxa.mapper.systemSettings.CheckProjectSetMapper;
import com.gxa.service.systemSettings.CheckProjectSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckProject_ServiceImpl implements CheckProjectSetService {
    @Autowired
    private CheckProjectSetMapper checkProjectSet_mapper;
    @Override
    public List<CPSMainTable> selectAll() {
        List<CPSMainTable> CPSMainTables = checkProjectSet_mapper.selectALl();
        return CPSMainTables;
    }

    @Override
    public void update(CPSEdit cpsEdit) {
        checkProjectSet_mapper.update(cpsEdit);
    }

    @Override
    public void insert(CPSEdit cpsEdit) {
        checkProjectSet_mapper.insert(cpsEdit);
    }

    @Override
    public void delete(int id) {
        checkProjectSet_mapper.delete(id);
    }

    @Override
    public CPSMainTable select(CPSEdit cpsEdit) {
        CPSMainTable select = checkProjectSet_mapper.select(cpsEdit);
        return select;
    }

    @Override
    public List<CPSViceTable> drop() {
        List<CPSViceTable> drop = checkProjectSet_mapper.drop();
        return drop;
    }
}
