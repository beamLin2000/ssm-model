package com.gxa.service.systemSettings;

import com.gxa.entity.systemSettings.EMEmployeeTable;
import com.gxa.entity.systemSettings.Role;
import com.gxa.form.systemSettings.EMEdit;
import com.gxa.form.systemSettings.RolesEdit;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeManagementService {

    List<EMEmployeeTable> selectAll();
    void update(EMEdit emEdit);
    void insert(EMEdit emEdit);
    void delete(int id);
    List<EMEmployeeTable> select(String name);
    List<Role> drop();

}
