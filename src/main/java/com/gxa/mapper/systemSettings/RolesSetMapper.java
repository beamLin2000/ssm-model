package com.gxa.mapper.systemSettings;

import com.gxa.entity.systemSettings.Role;
import com.gxa.form.systemSettings.RolesEdit;

import java.util.List;

public interface RolesSetMapper {
    List<Role> selectAll();
    void update(RolesEdit rolesEdit);
    List<Role> select(String nameRole);
}
