package com.gxa.mapper.systemSettings;

import com.gxa.entity.systemSettings.EMEmployeeTable;
import com.gxa.entity.systemSettings.Role;
import com.gxa.entity.work.Charge;
import com.gxa.form.systemSettings.EMEdit;
import com.gxa.form.systemSettings.RoleTable;
import com.gxa.form.systemSettings.RolesEdit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeManagementMapper {
    List<EMEmployeeTable> selectAll();
    void update(EMEdit emEdit);
    void insertRole(@Param("id") int id, @Param("nameRole") int nameRole);
    void deleteRole(int id);
//    List<RoleTable> selectUpdate(EMEdit emEdit);
//    void update1(EMEdit emEdit);
//    void update3(EMEdit emEdit);
    void insert(EMEdit emEdit);
    void insert1(@Param("user_id") int user_id,@Param("role_id") int role_id);
    int selectInsert(EMEdit emEdit);

    void delete(int id);

    List<EMEmployeeTable> selectByName(String name);

    List<Role> drop();

//    List<ClinicDrop> dropClinic();

}
