package com.gxa.service.impl.systemSettings;

import com.gxa.entity.systemSettings.EMEmployeeTable;
import com.gxa.form.systemSettings.EMEdit;
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
        return emEmployeeTables;
    }

    @Override
    public void update(EMEdit emEdit) {
        employeeManagementMapper.update(emEdit);
    }


}
