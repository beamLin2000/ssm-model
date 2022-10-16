package com.gxa.service.impl.systemSettings;

import com.gxa.entity.systemSettings.EMEmployeeTable;
import com.gxa.entity.systemSettings.Role;
import com.gxa.form.systemSettings.EMEdit;
import com.gxa.form.systemSettings.RolesEdit;
import com.gxa.mapper.systemSettings.EmployeeManagementMapper;
import com.gxa.service.systemSettings.EmployeeManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManagementServiceImpl implements EmployeeManagementService {

    @Autowired
    private EmployeeManagementMapper employeeManagementMapper;



    public List<EMEmployeeTable> selectAll(){
        List<EMEmployeeTable> emEmployeeTables = employeeManagementMapper.selectAll();
//        employeeManagementMapper.selectA();
        return emEmployeeTables;
    }

    @Override
    public void update(EMEdit emEdit) {
        for (RolesEdit a:emEdit.getRolesEdit()){

            if (a.getNameRole().equals("管理员")) {
                employeeManagementMapper.update(emEdit);
            }
            if (a.getNameRole().equals("医生")) {
                employeeManagementMapper.update1(emEdit);
            }
            if (a.getNameRole().equals("财务")) {
                employeeManagementMapper.update2(emEdit);
            }
//            if (a.getNameRole().equals("")) {
//                employeeManagementMapper.update3(emEdit);
//            }
        }


    }
    @Override
    public void insert(EMEdit emEdit) {

//        if (emEdit.getRolesEdit().getNameRole().equals("管理员")) {
//            employeeManagementMapper.insert(emEdit);
//        } else if (emEdit.getRolesEdit().getNameRole().equals("医生")) {
//            employeeManagementMapper.insert1(emEdit);
//        }else if (emEdit.getRolesEdit().getNameRole().equals("财务")) {
//            employeeManagementMapper.insert2(emEdit);
//        }

    }


}
