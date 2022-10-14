package com.gxa.service.impl.systemSettings;

import com.gxa.entity.systemSettings.Role;
import com.gxa.form.systemSettings.RolesEdit;
import com.gxa.mapper.systemSettings.RolesSetMapper;
import com.gxa.service.systemSettings.RolesSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesSetServiceImpl implements RolesSetService {
    @Autowired
    private RolesSetMapper rolesSetMapper;
    @Override
    public List<Role> selectAll() {
        List<Role> roles = rolesSetMapper.selectAll();
        return roles;
    }

    @Override
    public void update(RolesEdit rolesEdit) {
        rolesSetMapper.update(rolesEdit);
    }

    @Override
    public List<Role> select(String nameRoel) {
        List<Role> select = rolesSetMapper.select(nameRoel);
        return select;
    }
}
