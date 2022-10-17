package com.gxa.controller.systemSettings;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gxa.entity.systemSettings.*;
import com.gxa.form.systemSettings.CPSEdit;
import com.gxa.form.systemSettings.CostSettngsForm.RegisterFeeForm;
import com.gxa.form.systemSettings.CostSettngsForm.SurchargeFeeForm;
import com.gxa.form.systemSettings.CostSettngsForm.TreatmentFeeForm;
import com.gxa.form.systemSettings.EMEdit;

import com.gxa.form.systemSettings.clinicInformation.ClinicInformationForm;
import com.gxa.form.systemSettings.supplier.SupplierForm;
import com.gxa.service.systemSettings.*;
import com.gxa.utils.systemSettings.Result;
import com.gxa.utils.systemSettings.YResult;
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
    @ApiOperation(value = "检查项目设置-停用,启用数据" ,notes = "根据id,状态停，启用数据",httpMethod = "Get")
    public Result CheckProjectSet_Delete(@RequestParam("id") int id ,@RequestParam("projectStatus") String projectStatus ){
        System.out.println(id+"------------------"+projectStatus);
        checkProjectSet_service.delete(id,projectStatus);
        Result result = new Result(2,"成功","hello");
        return result;
    }

    @PostMapping("/CheckProjectSet/Select")//根据条件搜索
    @ApiOperation(value = "检查项目设置-根据条件查询数据" ,notes = "",httpMethod = "post")
    public Result CheckProjectSet_Select(@RequestBody CPSEdit cpsEdit){

        System.out.println(cpsEdit+"----------------------");
        List<CPSMainTable> select = checkProjectSet_service.select(cpsEdit);
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
    public Result Roles_Edit(@RequestBody Role role){
        rolesSetService.update(role);
        Result result = new Result(2,"成功","hello");
        return result;
    }

    @PostMapping("/Roles/Insert")//添加
    @ApiOperation(value = "角色列表-添加数据" ,notes = "",httpMethod = "Post")
    public Result Roles_Insert(@RequestBody Role role){
        rolesSetService.insert(role);
        Result result = new Result(2,"成功","hello");
        return result;
    }

    @GetMapping("/Roles/Delete")//删除
    @ApiOperation(value = "角色列表-删除数据" ,notes = "根据id删除数据",httpMethod = "Get")
    public Result Roles_Delete(@RequestParam("id") int id){
        rolesSetService.delete(id);
        Result result = new Result(2,"成功","hello");
        return result;
    }

    @GetMapping("/Roles/Select")//根据条件搜索
    @ApiOperation(value = "角色列表-根据条件查询数据" ,notes = "",httpMethod = "get")
    public Result Roles_Select(@RequestParam ("name") String name){

        List<Role> select = rolesSetService.select(name);
        Result result = new Result(1,"seccess",select);
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
        System.out.println(em_edit+"--------------------");
        employeeManagementService.update(em_edit);
        Result result = new Result(2,"成功","hello");
        return result;
    }

    @PostMapping("/EmployeeManagement/Insert")//添加
    @ApiOperation(value = "员工列表-添加数据" ,notes = "",httpMethod = "Post")
    public Result EmployeeManagement_Insert(@RequestBody EMEdit em_edit){
        employeeManagementService.insert(em_edit);
        Result result = new Result(2,"成功","hello");
        return result;
    }

    @GetMapping("/EmployeeManagement/Delete")//删除
    @ApiOperation(value = "员工列表-删除数据" ,notes = "根据ID删除数据",httpMethod = "Get")
    public Result EmployeeManagement_Delete(@RequestParam("id") int id){
        employeeManagementService.delete(id);
        Result result = new Result(2,"成功","hello");
        return result;
    }

    @GetMapping("/EmployeeManagement/Select")//根据条件搜索
    @ApiOperation(value = "员工列表-根据条件查询数据" ,notes = "",httpMethod = "get")
    public Result EmployeeManagement_Select(@RequestParam ("name") String  name){
        List<EMEmployeeTable> select = employeeManagementService.select(name);

        Result result = new Result(1,"seccess",select);
        return result;
    }

    @GetMapping("/EmployeeManagement/Drop")//查询下拉框
    @ApiOperation(value = "员工列表-角色下拉框的数据" ,notes = "",httpMethod = "Get")
    public Result EmployeeManagement_Drop(){

        List<Role> drop = employeeManagementService.drop();

        Result result = new Result(1,"seccess",drop);
        return result;
    }






























































    @Autowired
    private ClinicInformationService clinicInformationService;

//诊所信息维护

    @GetMapping("/clinicinformation/list")
    @ApiOperation(value = "诊所维护信息",notes = "查询接口",httpMethod = "Get")
    public YResult selectClinic(){
        List<ClinicInformation> clinicInformations = this.clinicInformationService.queryAll();
        YResult yResult = new YResult(1, "修改成功", 1,clinicInformations );


        return yResult;
    }

    @GetMapping("/clinicinformation/list01")
    @ApiOperation(value = "诊所维护信息",notes = "分页查询接口",httpMethod = "Get")
    public PageInfo<ClinicInformation> qrall(@RequestParam("page") int page, @RequestParam("size")int size){
        PageHelper.startPage(page,size);
        List<ClinicInformation>list = this.clinicInformationService.queryAll();
        PageInfo<ClinicInformation>pageInfo = new PageInfo<>(list);

        return pageInfo;

    }
    //
    @PutMapping("/clinicinformation/edit")
    @ApiOperation(value = "诊所维护信息",notes = "修改接口",httpMethod = "Put")
    public void updateClinic(@RequestBody ClinicInformationForm clinicInformationForm){
        ClinicInformation clinicInformation = new ClinicInformation(clinicInformationForm.getClinicNo(),clinicInformationForm.getClinicName(),clinicInformationForm.getLogo(),clinicInformationForm.getClinicOwner(),clinicInformationForm.getOwnerPhone(),clinicInformationForm.getOwnerEmail(),clinicInformationForm.getAddress(),clinicInformationForm.getDetailedAddress(),clinicInformationForm.getClinicIntroduce(),clinicInformationForm.getClinicState());
        this.clinicInformationService.updateClinic(clinicInformation);
        YResult YResult = new YResult(1,"修改成功",1,clinicInformation);
        System.out.println("诊所维护信息修改"+clinicInformationForm);
        System.out.println(clinicInformation);


    }
    /*--------------------------------------------------------------------------------------------------------------------------*/



    @Autowired
    private SupplierService supplierService;
    //供应商管理
    @GetMapping("/supplier/list")
    @ApiOperation(value = "供应商管理",notes = "查询接口",httpMethod = "Get")
    public YResult selectSupplier(){
        List<SupplierAdministration> supplierAdministrations = this.supplierService.selectSupplier();
        YResult YResult = new YResult(0,"查询成功",1,supplierAdministrations);

        return YResult;
    }



    @GetMapping("/supplier/conditionlist")
    @ApiOperation(value = "供应商管理",notes = "条件查询接口",httpMethod = "Get")
    public YResult selectBysupplierName(@RequestParam("supplierName") String supplierName){
        List<SupplierAdministration> supplierAdministrations = this.supplierService.selectBySuppliername(supplierName);
        YResult YResult = new YResult(0,"查询成功",1,supplierAdministrations);

        return YResult;
    }




    @PostMapping("/supplier/add")
    @ApiOperation(value = "供应商管理",notes = "添加接口",httpMethod = "Post")
    public void addSupplier(@RequestBody SupplierForm supplierForm){
        Date date = new Date();
        date.setTime(date.getTime());

        SupplierAdministration supplierAdministration = new SupplierAdministration(supplierForm.getSupplierNo(),supplierForm.getSupplierName(),supplierForm.getContacts(),supplierForm.getPhone(),date,supplierForm.getFoundPerson(),supplierForm.getSupplierState());
        this.supplierService.addSupplier(supplierAdministration);

        YResult YResult = new YResult(1,"添加成功",1,supplierAdministration);
        System.out.println("供应商添加"+supplierForm);


    }


    @GetMapping("/supplier/echolist")
    @ApiOperation(value = "供应商管理",notes = "数据回显查询接口",httpMethod = "Get")
    public YResult selectBysupplierNo(@RequestParam("supplierNo") String supplierNo){
        List<SupplierAdministration> supplierAdministrations = this.supplierService.selectBySuppliername(supplierNo);
        YResult YResult = new YResult(0,"查询成功",1,supplierAdministrations);

        return YResult;
    }


    @PutMapping("/supplier/edit")
    @ApiOperation(value = "供应商管理",notes = "修改接口",httpMethod = "Put")
    public YResult supplierEdit (@RequestBody SupplierForm supplierForm){
        Date timeing = new Date();
        timeing.setTime(timeing.getTime());
        System.out.println("shijian"+timeing);
        SupplierAdministration supplierAdministration = new SupplierAdministration(supplierForm.getSupplierNo(),supplierForm.getSupplierName(),supplierForm.getContacts(),supplierForm.getPhone(),timeing,supplierForm.getFoundPerson(),supplierForm.getSupplierState());
        System.out.println("number-----------"+supplierAdministration.getSupplierno());

        this.supplierService.updateSupplier(supplierAdministration);
        YResult YResult = new YResult(1,"修改成功",1);
        System.out.println("供应商修改"+supplierAdministration);
        return YResult;
    }





    @DeleteMapping("/supplier/delete")
    @ApiOperation(value = "供应商管理",notes = "删除接口",httpMethod = "Delete")
    public YResult deleteSupplier(@RequestParam("supplierNo") Integer supplierNo){
        System.out.println("supplierNo-------"+supplierNo);
        this.supplierService.deleteBySupplierNo(supplierNo);
        YResult YResult = new YResult(1,"删除成功",1);

        return YResult;
    }
    /*--------------------------------------------------------------------------------------------------------------------------*/



    @Autowired
    private SurchargeFeeiService surchargeFeeiService;
    //附加费用设置
    @GetMapping("/costsettings/list")
    @ApiOperation(value = "费用设置-附加费用",notes = "查询接口",httpMethod = "Get")
    public YResult selectCost(){
        List<SurchargeFee> surchargeFees = this.surchargeFeeiService.queryAll();
        YResult YResult = new YResult(1,"查询成功",1,surchargeFees);


        return YResult;
    }


    @GetMapping("/costsettings/conditionlist01")
    @ApiOperation(value = "费用设置-附加费用",notes = "根据处方查询接口",httpMethod = "Get")
    public YResult selectBysurchargeName(@RequestParam("prescription") String prescription){
        List<SurchargeFee> surchargeFees = this.surchargeFeeiService.queryByPrescription(prescription);
        YResult YResult = new YResult(1,"查询成功",1,surchargeFees);
        System.out.println("surchargeFees"+surchargeFees);


        return YResult;
    }



    @GetMapping("/costsettings/conditionlist02")
    @ApiOperation(value = "费用设置-附加费用",notes = "根据附加费用名称查询接口",httpMethod = "Get")
    public YResult selectByprescription(@RequestParam("surchargeName") String surchargeName){
        List<SurchargeFee> surchargeFees = this.surchargeFeeiService.queryBySurchargeName(surchargeName);
        YResult YResult = new YResult(1,"查询成功",1,surchargeFees);
        System.out.println("surchargeFees"+surchargeFees);


        return YResult;
    }



    @PostMapping("/costsettings/add")
    @ApiOperation(value = "费用设置-附加费用",notes = "添加接口",httpMethod = "Post")
    public YResult addCost(@RequestBody SurchargeFeeForm surchargeForm){
        Date timeing = new Date();
        timeing.setTime(timeing.getTime());
        SurchargeFee surchargeFee = new SurchargeFee(surchargeForm.getSurchargeName(),surchargeForm.getPrescription(),surchargeForm.getPrice(),surchargeForm.getCost(),timeing,surchargeForm.getFoundPerson(),surchargeForm.getCostState());
        this.surchargeFeeiService.addSurchargeFee(surchargeFee);
        YResult YResult = new YResult(1,"添加成功",1);
        System.out.println("附加费用添加"+surchargeForm);

        return YResult;
    }

    @PutMapping("/costsettings/edit")
    @ApiOperation(value = "费用设置-附加费用",notes = "修改接口",httpMethod = "Put")
    public YResult editCost(@RequestBody SurchargeFeeForm surchargeForm){
        Date timeing = new Date();
        timeing.setTime(timeing.getTime());
        SurchargeFee surchargeFee = new SurchargeFee(surchargeForm.getId(),surchargeForm.getSurchargeName(),surchargeForm.getPrescription(),surchargeForm.getPrice(),surchargeForm.getCost(),timeing,surchargeForm.getFoundPerson(),surchargeForm.getCostState());
        this.surchargeFeeiService.updateSurchargeFee(surchargeFee);
        YResult YResult = new YResult(1,"修改成功",1);
        System.out.println("附加费用修改"+surchargeForm);

        return  YResult;
    }

    @DeleteMapping("/costsettings/delete")
    @ApiOperation(value = "费用设置-附加费用",notes = "删除接口",httpMethod = "Delete")
    public YResult deleteCost(@RequestParam("id") int id){
        this.surchargeFeeiService.deleteById(id);

        YResult YResult = new YResult(1,"删除成功",1);
        System.out.println("附加费用删除"+id);

        return YResult;
    }

    /*--------------------------------------------------------------------------------------------------------------------------*/

    @Autowired
    private TreatmentFeeService treatmentFeeService;
    //诊疗费设置
    @GetMapping("/treatment/list")
    @ApiOperation(value = "费用设置-诊疗费",notes = "查询接口",httpMethod = "Get")
    public YResult selectTreatment(){
        List<TreatmentFee> treatmentFees = this.treatmentFeeService.queryAll();
        YResult YResult = new YResult(1,"查询成功",1,treatmentFees);


        return YResult;
    }


    @GetMapping("/treatment/conditionlist")
    @ApiOperation(value = "费用设置-附加费用",notes = "费用名称查询接口",httpMethod = "Get")
    public YResult selectByTreatment(@RequestParam("Treatment") String Treatment){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        YResult YResult = new YResult(1,"查询成功",1,clinicInformationForm);
        System.out.println("surchargeName"+Treatment);


        return YResult;
    }



    @PostMapping("/treatment/add")
    @ApiOperation(value = "费用设置-诊疗费",notes = "添加接口",httpMethod = "Post")
    public YResult treatmentAdd(@RequestBody TreatmentFeeForm treatmentForm){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        YResult YResult = new YResult(1,"成功",1,clinicInformationForm);
        System.out.println("诊疗费添加"+treatmentForm);

        return YResult;
    }


    @PutMapping("/treatment/edit")
    @ApiOperation(value = "费用设置-诊疗费",notes = "修改接口",httpMethod = "Put")
    public YResult treatmentEdit(@RequestBody TreatmentFeeForm treatmentForm){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        YResult YResult = new YResult(1,"成功",1,clinicInformationForm);
        System.out.println("诊疗费修改"+treatmentForm);

        return YResult;
    }

    @DeleteMapping("/treatment/delete")
    @ApiOperation(value = "费用设置-诊疗费",notes = "删除接口",httpMethod = "Delete")
    public YResult treatmentDelete(@RequestParam("id") int id){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        YResult YResult = new YResult(1,"成功",1,clinicInformationForm);
        System.out.println("诊疗费删除"+id);

        return YResult;
    }




    /*--------------------------------------------------------------------------------------------------------------------------*/





    //挂号费设置
    @GetMapping("/register/select1")
    @ApiOperation(value = "费用设置-挂号费",notes = "查询接口",httpMethod = "Get")
    public YResult registerSelect(){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        YResult YResult = new YResult(1,"成功",1,clinicInformationForm);

        return YResult;
    }

    @GetMapping("/register/conditionlist")
    @ApiOperation(value = "费用设置-附加费用",notes = "查询接口",httpMethod = "Get")
    public YResult selectByRegisterFee(@RequestParam("RegisterFee") String RegisterFee){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        YResult YResult = new YResult(1,"成功",1,clinicInformationForm);
        System.out.println("surchargeName"+RegisterFee);


        return YResult;
    }


    @PostMapping("/register/add1")
    @ApiOperation(value = "费用设置-挂号费",notes = "添加接口",httpMethod = "Post")
    public YResult registerAdd(RegisterFeeForm registerFeeForm){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        YResult YResult = new YResult(1,"成功",1,clinicInformationForm);
        System.out.println("挂号费查询"+registerFeeForm);

        return YResult;
    }

    @PutMapping("/register/edit1")
    @ApiOperation(value = "费用设置-挂号费",notes = "修改接口",httpMethod = "Put")
    public YResult registerEdit(RegisterFeeForm registerFeeForm){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        YResult YResult = new YResult(1,"成功",1,clinicInformationForm);
        System.out.println("挂号费xuugai"+registerFeeForm);

        return YResult;
    }

    @DeleteMapping("/register/delete1")
    @ApiOperation(value = "费用设置-挂号费",notes = "删除接口",httpMethod = "Delete")
    public YResult registerDelete(@RequestParam("id") int id){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        YResult YResult = new YResult(1,"成功",1,clinicInformationForm);
        System.out.println("挂号费shanchu"+id);

        return YResult;
    }



}
