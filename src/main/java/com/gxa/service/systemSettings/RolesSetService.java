package com.gxa.service.systemSettings;

import com.gxa.entity.systemSettings.Role;
import com.gxa.form.systemSettings.RolesEdit;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;


public interface RolesSetService {
    List<Role> selectAll();
    void update(Role role);
    void insert(Role role);
    void delete(int id);
    List<Role> select(String name);




}
