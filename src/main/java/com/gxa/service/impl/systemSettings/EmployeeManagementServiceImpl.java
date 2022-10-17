package com.gxa.service.impl.systemSettings;

import com.gxa.entity.systemSettings.EMEmployeeTable;
import com.gxa.entity.systemSettings.Role;
import com.gxa.form.systemSettings.EMEdit;
import com.gxa.form.systemSettings.RoleTable;
import com.gxa.form.systemSettings.RolesEdit;
import com.gxa.mapper.systemSettings.EmployeeManagementMapper;
import com.gxa.service.systemSettings.EmployeeManagementService;
import com.gxa.utils.systemSettings.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeManagementServiceImpl implements EmployeeManagementService {

    @Autowired
    private EmployeeManagementMapper employeeManagementMapper;

    public List<EMEmployeeTable> selectAll(){
        List<EMEmployeeTable> emEmployeeTables = employeeManagementMapper.selectAll();
        return emEmployeeTables;
    }

    @Override
    public void update(EMEdit emEdit) {
        int id = emEdit.getId();
        List<RoleTable> roleTable = emEdit.getRoleTable();

        employeeManagementMapper.update(emEdit);
        employeeManagementMapper.deleteRole(id);

        for (int i= 0;i< roleTable.size();i++){
            int nameRole = roleTable.get(i).getNameRole();
            employeeManagementMapper.insertRole(id,nameRole);
            }

    }
    @Override
    public void insert(EMEdit emEdit) {
        String salt = CodeUtil.salt();
        emEdit.setSalt(salt);
        employeeManagementMapper.insert(emEdit);

        int id = employeeManagementMapper.selectInsert(emEdit);
        List<RoleTable> roleTable = emEdit.getRoleTable();

        for (int i= 0;i< roleTable.size();i++){
            int nameRole = roleTable.get(i).getNameRole();
            employeeManagementMapper.insert1(id,nameRole);
        }

    }

    @Override
    public void delete(int id) {
        employeeManagementMapper.delete(id);
        employeeManagementMapper.deleteRole(id);
    }

    @Override
    public List<EMEmployeeTable> select(String name) {
        List<EMEmployeeTable> emEmployeeTables = employeeManagementMapper.selectByName(name);
        return emEmployeeTables;
    }

    @Override
    public List<Role> drop() {
        List<Role> drop = employeeManagementMapper.drop();
        return drop;
    }

//    @Override
//    public List<ClinicDrop> dropClinic() {
//        List<ClinicDrop> clinicDrops = employeeManagementMapper.dropClinic();
//        return clinicDrops;
//    }


}
