package com.gxa.mapper.systemSettings;

import com.gxa.entity.systemSettings.EMEmployeeTable;
import com.gxa.entity.systemSettings.Role;
import com.gxa.form.systemSettings.EMEdit;

import java.util.List;

public interface EmployeeManagementMapper {
    List<EMEmployeeTable> selectAll();
    void update(EMEdit emEdit);
    void update1(EMEdit emEdit);
    void update2(EMEdit emEdit);
    void update3(EMEdit emEdit);
    void insert(EMEdit emEdit);
    void insert1(EMEdit emEdit);
    void insert2(EMEdit emEdit);

}
