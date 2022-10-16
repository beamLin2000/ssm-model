package com.gxa.mapper.systemSettings;

import com.gxa.entity.systemSettings.CPSMainTable;
import com.gxa.entity.systemSettings.CPSViceTable;
import com.gxa.form.systemSettings.CPSEdit;

import java.util.List;

public interface CheckProjectSetMapper {


    List<CPSMainTable> selectALl();
    void update(CPSEdit cpsEdit);
    void insert(CPSEdit cpsEdit);
    void delete(int id);
    List<CPSMainTable> select(CPSEdit cpsEdit);
    List<CPSViceTable> drop();
    void change(int id);
}
