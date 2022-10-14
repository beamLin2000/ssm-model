package com.gxa.mapper.systemSettings;

import com.gxa.entity.systemSettings.EMEmployeeTable;
import com.gxa.form.systemSettings.EMEdit;

import java.util.List;

public interface EmployeeManagementMapper {
    List<EMEmployeeTable> selectAll();
    void update(EMEdit emEdit);
}
