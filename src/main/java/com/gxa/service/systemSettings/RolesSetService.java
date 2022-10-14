package com.gxa.service.systemSettings;

import com.gxa.entity.systemSettings.EMEmployeeTable;
import com.gxa.entity.systemSettings.RolesTable;

import java.util.List;

public interface RolesSetService {
    List<RolesTable> selectAll();
}
