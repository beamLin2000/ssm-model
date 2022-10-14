package com.gxa.controller.systemSettings;

import com.gxa.entity.systemSettings.CPSMainTable;
import com.gxa.entity.systemSettings.CPSViceTable;
import com.gxa.entity.systemSettings.EMEmployeeTable;
import com.gxa.entity.systemSettings.Role;
import com.gxa.form.systemSettings.CPSEdit;
import com.gxa.form.systemSettings.EMEdit;
import com.gxa.form.systemSettings.EMSelect;
import com.gxa.form.systemSettings.RolesEdit;
import com.gxa.service.systemSettings.CheckProjectSetService;
import com.gxa.service.systemSettings.EmployeeManagementService;
import com.gxa.service.systemSettings.RolesSetService;
import com.gxa.utils.systemSettings.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Api(tags = {"系统设置接口"})
@RestController
public class SystemSettingsController {

    @Autowired
    private CheckProjectSetService checkProjectSet_service;
    @Autowired
    private RolesSetService rolesSetService;
    @Autowired
    private EmployeeManagementService employeeManagementService;


    @GetMapping("/CheckProjectSet/List")//查询所有
    @ApiOperation(value = "检查项目设置-查询所有数据" ,notes = "",httpMethod = "Get",response = CPSMainTable.class)
    public Result CheckProjectSet_List(){

        List<CPSMainTable> cpsMainTables = checkProjectSet_service.selectAll();
        Result result = new Result(1,"seccess",cpsMainTables);
        return result;
    }

    @PostMapping("/CheckProjectSet/Edit")//编辑
    @ApiOperation(value = "检查项目设置-编辑数据" ,notes = "",httpMethod = "Post")
    public Result CheckProjectSet_Edit(@RequestBody CPSEdit cps_edit){
        checkProjectSet_service.update(cps_edit);
        Result result = new Result(2,"成功","hello");
        return result;
    }

    @PostMapping("/CheckProjectSet/Insert")//添加
    @ApiOperation(value = "检查项目设置-添加数据" ,notes = "",httpMethod = "Post")
    public Result CheckProjectSet_Insert(@RequestBody CPSEdit cps_edit){

        System.out.println(cps_edit);
        checkProjectSet_service.insert(cps_edit);
        Result result = new Result(2,"成功","hello");
        return result;
    }

    @GetMapping("/CheckProjectSet/Delete")//删除
    @ApiOperation(value = "检查项目设置-删除数据" ,notes = "根据id删除数据",httpMethod = "Get")
    public Result CheckProjectSet_Delete(@RequestParam("id") int id ){
        checkProjectSet_service.delete(id);
        Result result = new Result(2,"成功","hello");
        return result;
    }

    @GetMapping("/CheckProjectSet/Select")//根据条件搜索
    @ApiOperation(value = "检查项目设置-根据条件查询数据" ,notes = "",httpMethod = "get")
    public Result CheckProjectSet_Select(@RequestBody CPSEdit cpsEdit){

        System.out.println(cpsEdit);
        CPSMainTable select = checkProjectSet_service.select(cpsEdit);
        Result result = new Result(1,"成功",select);
        return result;
    }

    @GetMapping("/CheckProjectSet/Drop")//查询下拉框
    @ApiOperation(value = "检查项目设置-下拉框的数据" ,notes = "",httpMethod = "Get")
    public Result CheckProjectSet_Drop(){

        List<CPSViceTable> drop = checkProjectSet_service.drop();
        Result result = new Result(1,"seccess",drop);
        return result;
    }












    @GetMapping("/Roles/List")//查询所有
    @ApiOperation(value = "角色列表-查询所有数据" ,notes = "",httpMethod = "Get",response = Role.class)
    public Result Roles_List(){
        List<Role> roles = rolesSetService.selectAll();

        Result result = new Result(1,"seccess", roles);
        return result;
    }

    @PostMapping("/Roles/Edit")//编辑
    @ApiOperation(value = "角色列表-编辑数据" ,notes = "",httpMethod = "Post")
    public Result Roles_Edit(@RequestBody RolesEdit rolesEdit){
        rolesSetService.update(rolesEdit);
        Result result = new Result(2,"成功","hello");
        return result;
    }

    @PostMapping("/Roles/Insert")//添加
    @ApiOperation(value = "角色列表-添加数据" ,notes = "",httpMethod = "Post")
    public Result Roles_Insert(@RequestBody RolesEdit rolesEdit){
//        rolesSetService.insert(rolesEdit);
        Result result = new Result(2,"成功","hello");
        return result;
    }

    @GetMapping("/Roles/Delete")//删除
    @ApiOperation(value = "角色列表-删除数据" ,notes = "根据id删除数据",httpMethod = "Get")
    public Result Roles_Delete(@RequestParam("id") int id){

        Result result = new Result(2,"成功","hello");
        return result;
    }

    @GetMapping("/Roles/Select")//根据条件搜索
    @ApiOperation(value = "角色列表-根据条件查询数据" ,notes = "",httpMethod = "get")
    public Result Roles_Select(@RequestParam ("nameRole") String nameRole){

        rolesSetService.select(nameRole);
        Result result = new Result();
        return result;
    }













    @GetMapping("/EmployeeManagement/List")//查询所有
    @ApiOperation(value = "员工列表-查询所有数据" ,notes = "",httpMethod = "Get",response = EMEmployeeTable.class)
    public Result EmployeeManagement_List(){
        List<EMEmployeeTable> emEmployeeTables = employeeManagementService.selectAll();

       Result result = new Result(1,"seccess",emEmployeeTables);
        return result;
    }

    @PostMapping("/EmployeeManagement/Edit")//编辑
    @ApiOperation(value = "员工列表-编辑数据" ,notes = "",httpMethod = "Post")
    public Result EmployeeManagement_Edit(@RequestBody EMEdit em_edit){
        employeeManagementService.update(em_edit);
        Result result = new Result(2,"成功","hello");
        return result;
    }

    @PostMapping("/EmployeeManagement/Insert")//添加
    @ApiOperation(value = "员工列表-添加数据" ,notes = "",httpMethod = "Post")
    public Result EmployeeManagement_Insert(@RequestBody EMEdit em_edit){

        Result result = new Result(2,"成功","hello");
        return result;
    }

    @GetMapping("/EmployeeManagement/Delete")//删除
    @ApiOperation(value = "员工列表-删除数据" ,notes = "根据ID删除数据",httpMethod = "Get")
    public Result EmployeeManagement_Delete(@RequestParam("id") int id){

        Result result = new Result(2,"成功","hello");
        return result;
    }

    @GetMapping("/EmployeeManagement/Select")//根据条件搜索
    @ApiOperation(value = "员工列表-根据条件查询数据" ,notes = "",httpMethod = "get")
    public Result EmployeeManagement_Select(@RequestBody EMSelect em_select){

        Date date = new Date(2000 - 2 - 2);
        EMEmployeeTable emEmployeeTable = new EMEmployeeTable(1, "1", "1", "1", "1", 1, "1", "1", date, "1", "1");
        Result result = new Result();
        return result;
    }

    @GetMapping("/EmployeeManagement/Drop")//查询下拉框
    @ApiOperation(value = "员工列表-下拉框的数据" ,notes = "",httpMethod = "Get")
    public Result EmployeeManagement_Drop(){

        Date date = new Date(2000 - 2 - 2);
        EMEmployeeTable emEmployeeTable = new EMEmployeeTable(1, "1", "1", "1", "1", 1, "1", "1", date, "1", "1");
        Result result = new Result();
        return result;
    }







}
