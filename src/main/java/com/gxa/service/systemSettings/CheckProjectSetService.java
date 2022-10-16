package com.gxa.service.systemSettings;

import com.gxa.entity.systemSettings.CPSMainTable;
import com.gxa.entity.systemSettings.CPSViceTable;
import com.gxa.form.systemSettings.CPSEdit;

import java.util.List;

public interface CheckProjectSetService {

    List<CPSMainTable> selectAll();
    void update(CPSEdit cpsEdit);
    void insert(CPSEdit cpsEdit);
    void delete(int id,String projectStatus);
    List<CPSMainTable> select(CPSEdit cpsEdit);
    List<CPSViceTable> drop();
}
