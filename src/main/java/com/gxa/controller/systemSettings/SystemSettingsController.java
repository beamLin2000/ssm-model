package com.gxa.controller.systemSettings;

import com.gxa.entity.systemSettings.CPSMainTable;
import com.gxa.entity.systemSettings.EMEmployeeTable;
import com.gxa.entity.systemSettings.RolesTable;
import com.gxa.form.systemSettings.CPSEdit;
import com.gxa.form.systemSettings.CPSSelect;
import com.gxa.form.systemSettings.EMEdit;
import com.gxa.form.systemSettings.EMSelect;
import com.gxa.service.systemSettings.CheckProjectSet_Service;
import com.gxa.utils.systemSettings.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api(tags = {"系统设置接口"})
@RestController
public class SystemSettingsController {

    @Autowired
    private CheckProjectSet_Service checkProjectSet_service;


    @GetMapping("/CheckProjectSet/List")//查询所有
    @ApiOperation(value = "检查项目设置-查询所有数据" ,notes = "",httpMethod = "Get",response = CPSMainTable.class)
    public Result CheckProjectSet_List(){

//        List<CheckProjectSet> checkProjectSets = checkProjectSet_service.selectAll();
//        map.put("checkProjectSets",checkProjectSets);

        Date date = new Date(2000 - 2 - 2);
        CPSMainTable cps_mainTable = new CPSMainTable(1, 1, "", "", "", 23, 23, "", true, date, "", "", 23);
        Result result = new Result(cps_mainTable);
        return result;
    }

    @PostMapping("/CheckProjectSet/Edit")//编辑
    @ApiOperation(value = "检查项目设置-编辑数据" ,notes = "",httpMethod = "Post")
    public Result CheckProjectSet_Edit(@RequestBody CPSEdit cps_edit){

        Result result = new Result(2,"成功","hello");
        return result;
    }

    @PostMapping("/CheckProjectSet/Insert")//添加
    @ApiOperation(value = "检查项目设置-添加数据" ,notes = "",httpMethod = "Post")
    public Result CheckProjectSet_Insert(@RequestBody CPSEdit cps_edit){

        Result result = new Result(2,"成功","hello");
        return result;
    }

    @GetMapping("/CheckProjectSet/Delete")//删除
    @ApiOperation(value = "检查项目设置-删除数据" ,notes = "根据id删除数据",httpMethod = "Get")
    public Result CheckProjectSet_Delete(@RequestParam("id") int id ){

        Result result = new Result(2,"成功","hello");
        return result;
    }

    @GetMapping("/CheckProjectSet/Select")//根据条件搜索
    @ApiOperation(value = "检查项目设置-根据条件查询数据" ,notes = "",httpMethod = "get")
    public Result CheckProjectSet_Select(@RequestBody CPSSelect cps_select){

        System.out.println(cps_select);
        Date date = new Date(2000 - 2 - 2);
        CPSMainTable cps_mainTable = new CPSMainTable(1, 1, "", "", "", 23, 23, "", true, date, "", "", 23);
        Result result = new Result(cps_mainTable);
        return result;
    }

    @GetMapping("/CheckProjectSet/Drop")//查询下拉框
    @ApiOperation(value = "检查项目设置-下拉框的数据" ,notes = "",httpMethod = "Get")
    public Result CheckProjectSet_Drop(){

        Date date = new Date(2000 - 2 - 2);
        CPSMainTable cps_mainTable = new CPSMainTable(1, 1, "", "", "", 23, 23, "", true, date, "", "", 23);
        Result result = new Result(cps_mainTable);
        return result;
    }












    @GetMapping("/Roles/List")//查询所有
    @ApiOperation(value = "角色列表-查询所有数据" ,notes = "",httpMethod = "Get",response = RolesTable.class)
    public Result Roles_List(){

//        List<CheckProjectSet> checkProjectSets = checkProjectSet_service.selectAll();
//        map.put("checkProjectSets",checkProjectSets);


        Date date = new Date(2000 - 2 - 2);
        RolesTable roles_table = new RolesTable(1,"1","1","1",date,"1",true);
        Result result = new Result(roles_table);
        return result;
    }

    @PostMapping("/Roles/Edit")//编辑
    @ApiOperation(value = "角色列表-编辑数据" ,notes = "",httpMethod = "Post")
    public Result Roles_Edit(@RequestBody EMEdit em_edit){

        Result result = new Result(2,"成功","hello");
        return result;
    }

    @PostMapping("/Roles/Insert")//添加
    @ApiOperation(value = "角色列表-添加数据" ,notes = "",httpMethod = "Post")
    public Result Roles_Insert(@RequestBody EMEdit em_edit){

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
    public Result Roles_Select(@RequestBody EMSelect em_select){

        Date date = new Date(2000 - 2 - 2);
        RolesTable roles_table = new RolesTable(1,"1","1","1",date,"1",true);
        Result result = new Result(roles_table);
        return result;
    }

    @GetMapping("/Roles/Drop")//查询下拉框
    @ApiOperation(value = "角色列表-下拉框的数据" ,notes = "",httpMethod = "Get")
    public Result Roles_Drop(){

        Date date = new Date(2000 - 2 - 2);
        RolesTable roles_table = new RolesTable(1,"1","1","1",date,"1",true);
        Result result = new Result(roles_table);
        return result;
    }









    @GetMapping("/EmployeeManagement/List")//查询所有
    @ApiOperation(value = "员工列表-查询所有数据" ,notes = "",httpMethod = "Get",response = EMEmployeeTable.class)
    public Result EmployeeManagement_List(){

//        List<CheckProjectSet> checkProjectSets = checkProjectSet_service.selectAll();
//        map.put("checkProjectSets",checkProjectSets);

        Date date = new Date(2000 - 2 - 2);
        EMEmployeeTable emEmployeeTable = new EMEmployeeTable(1, 1, "1", "1", "1", 1, "1", "1", date, "1", true);
        Result result = new Result(emEmployeeTable);
        return result;
    }

    @PostMapping("/EmployeeManagement/Edit")//编辑
    @ApiOperation(value = "员工列表-编辑数据" ,notes = "",httpMethod = "Post")
    public Result EmployeeManagement_Edit(@RequestBody EMEdit em_edit){

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
        EMEmployeeTable emEmployeeTable = new EMEmployeeTable(1, 1, "1", "1", "1", 1, "1", "1", date, "1", true);
        Result result = new Result(emEmployeeTable);
        return result;
    }

    @GetMapping("/EmployeeManagement/Drop")//查询下拉框
    @ApiOperation(value = "员工列表-下拉框的数据" ,notes = "",httpMethod = "Get")
    public Result EmployeeManagement_Drop(){

        Date date = new Date(2000 - 2 - 2);
        EMEmployeeTable emEmployeeTable = new EMEmployeeTable(1, 1, "1", "1", "1", 1, "1", "1", date, "1", true);
        Result result = new Result(emEmployeeTable);
        return result;
    }







}
