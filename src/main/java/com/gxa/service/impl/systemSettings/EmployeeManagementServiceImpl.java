package com.gxa.service.impl.systemSettings;

import com.gxa.utils.systemSettings.Information;
import com.gxa.entity.systemSettings.EMEmployeeTable;
import com.gxa.entity.systemSettings.Role;
import com.gxa.form.systemSettings.EMEdit;
import com.gxa.form.systemSettings.RoleTable;
import com.gxa.mapper.systemSettings.EmployeeManagementMapper;
import com.gxa.service.systemSettings.EmployeeManagementService;
import com.gxa.utils.systemSettings.CodeUtil;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
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
    public EMEmployeeTable incloud(String userName) {
        EMEmployeeTable incloud = employeeManagementMapper.incloud(userName);

        ArrayList<RoleTable> roleTables = new ArrayList<>(1);
        RoleTable roleTable = new RoleTable(0);
        roleTables.add(roleTable);
        incloud.setRoleTable(roleTables);
        System.out.println(roleTables+"---------------------------");
        return incloud;
    }

    @Override
    public void update(EMEdit emEdit) {
        if (emEdit.getRoleTable()==null||emEdit.getRoleTable().get(0).getNameRole()==0){
            Information.message="未选择角色！！！";
            return;
        }
        System.out.println(emEdit+"--------------------");
        Date date = new Date();
        emEdit.setCreationTime(date);

        int id = emEdit.getId();
        List<RoleTable> roleTable = emEdit.getRoleTable();

        String salt = CodeUtil.salt();
        emEdit.setSalt(salt);

        if (emEdit.getPassword() == null) {

            employeeManagementMapper.update1(emEdit);

        }else {

            SimpleHash pwd = new SimpleHash("MD5", emEdit.getPassword(), salt, 1024);
            emEdit.setPassword(pwd.toString());

            employeeManagementMapper.update(emEdit);
        }

        employeeManagementMapper.deleteRole(id);

        for (int i= 0;i< roleTable.size();i++){
            int nameRole = roleTable.get(i).getNameRole();
            employeeManagementMapper.insertRole(id,nameRole);
            }

            Information.message="编辑成功！！！";



    }
    @Override
    public void insert(EMEdit emEdit) {


        if (emEdit.getRoleTable()==null||emEdit.getRoleTable().get(0).getNameRole()==0){
            Information.message="未选择角色！！！";
            return;
        }

            Date date = new Date();
            emEdit.setCreationTime(date);

            String salt = CodeUtil.salt();
            emEdit.setSalt(salt);
        //加密
            SimpleHash pwd = new SimpleHash("MD5", emEdit.getPassword(), salt, 1024);
            emEdit.setPassword(pwd.toString());

            List<String> strings = employeeManagementMapper.insertO();

            int count = 0;
            for (int a = 0; a < strings.size(); a++) {

                if (strings.get(a).equals(emEdit.getWorkNumber())) {
                    count++;
                    System.out.println(count);
                    Information.message="错误！员工编号已在数据库中存在！！！";

                    break;

                }
            }

            if (count == 0) {
                System.out.println("ttttttttttttt");
                Information.message="添加成功！！！";
                employeeManagementMapper.insert(emEdit);

                int id = employeeManagementMapper.selectInsert(emEdit);
                List<RoleTable> roleTable = emEdit.getRoleTable();

                for (int i = 0; i < roleTable.size(); i++) {
                    int nameRole = roleTable.get(i).getNameRole();
                    employeeManagementMapper.insert1(id, nameRole);
                }
            }

        //                count++;
        //            }
        //        }




    }

//
//    public static void main(String[] args) {
//        String salt = CodeUtil.salt();
//        String pwd = "12111";
//
//        SimpleHash pwd1 = new SimpleHash("MD5", "111111", salt, 1024);
//        System.out.println(pwd1);
//    }
    @Override
    public void delete(int id) {
        employeeManagementMapper.delete(id);
        employeeManagementMapper.deleteRole(id);
    }

    @Override
    public List<EMEmployeeTable> select(String name) {
        List<EMEmployeeTable> emEmployeeTables = employeeManagementMapper.selectByName(name);
        return emEmployeeTables;
    }

    @Override
    public List<Role> drop() {
        List<Role> drop = employeeManagementMapper.drop();
        return drop;
    }

//    @Override
//    public List<ClinicDrop> dropClinic() {
//        List<ClinicDrop> clinicDrops = employeeManagementMapper.dropClinic();
//        return clinicDrops;
//    }


}
