package com.gxa.service.impl.systemSettings;

import com.gxa.entity.systemSettings.Role;
import com.gxa.form.systemSettings.RolesEdit;
import com.gxa.mapper.systemSettings.RolesSetMapper;
import com.gxa.service.systemSettings.RolesSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    public void update(Role role) {
        int id = role.getId();
        Date date = new Date();
        role.setCreationTime(date);

        if (id!=1&&id!=2&&id!=3){
        rolesSetMapper.update(role);
        }
    }

    @Override
    public void insert(Role role) {
        Date date = new Date();
        role.setCreationTime(date);
        int id = role.getId();
        if (id!=1&&id!=2&&id!=3){
            rolesSetMapper.insert(role);
        }

    }

    @Override
    public void delete(int id) {

        if (id!=1&&id!=2&&id!=3){
            rolesSetMapper.delete(id);
        }
    }

    @Override
    public List<Role> select(String name) {
        List<Role> select = rolesSetMapper.select(name);
        return select;
    }
}
