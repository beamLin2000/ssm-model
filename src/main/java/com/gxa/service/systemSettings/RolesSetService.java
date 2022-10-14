package com.gxa.service.systemSettings;

import com.gxa.entity.systemSettings.Role;
import com.gxa.form.systemSettings.RolesEdit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RolesSetService {
    List<Role> selectAll();
    void update(RolesEdit rolesEdit);
    List<Role> select(String nameRoel);

}
