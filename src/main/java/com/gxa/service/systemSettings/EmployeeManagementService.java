package com.gxa.service.systemSettings;

import com.gxa.entity.systemSettings.EMEmployeeTable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeManagementService {

    List<EMEmployeeTable> selectAll();
}