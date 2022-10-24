package com.gxa.controller.systemSettings;

import com.gxa.entity.systemSettings.*;
import com.gxa.form.systemSettings.CPSEdit;
import com.gxa.form.systemSettings.CostSettngsForm.PaymentMethodForm;
import com.gxa.form.systemSettings.CostSettngsForm.RegisterFeeForm;
import com.gxa.form.systemSettings.CostSettngsForm.SurchargeFeeForm;
import com.gxa.form.systemSettings.CostSettngsForm.TreatmentFeeForm;
import com.gxa.form.systemSettings.EMEdit;

import com.gxa.form.systemSettings.clinicInformation.ClinicInformationForm;
import com.gxa.form.systemSettings.supplier.SupplierForm;
import com.gxa.service.systemSettings.*;
import com.gxa.utils.systemSettings.Result;
import com.gxa.utils.systemSettings.YResult;
import com.gxa.utils.systemSettings.Information;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Api(tags = {"系统设置接口"})
@RestController
public class

SystemSettingsController {

    @Autowired
    private CheckProjectSetService checkProjectSet_service;
    @Autowired
    private RolesSetService rolesSetService;
    @Autowired
    private EmployeeManagementService employeeManagementService;


    @GetMapping("/CheckProjectSet/List")//查询所有
    @ApiOperation(value = "检查项目设置-查询所有数据" ,notes = "",httpMethod = "Get",response = CPSMainTable.class)
    public Result checkProjectSetList(){

        List<CPSMainTable> cpsMainTables = checkProjectSet_service.selectAll();
        Result result = new Result(1,"seccess",cpsMainTables);
        return result;
    }

    @PostMapping("/CheckProjectSet/Edit")//编辑
    @ApiOperation(value = "检查项目设置-编辑数据" ,notes = "",httpMethod = "Post")
    public Result checkProjectSetEdit(@RequestBody CPSEdit cps_edit){
        checkProjectSet_service.update(cps_edit);
        Result result = new Result(2,"成功","hello");
        return result;
    }

    @PostMapping("/CheckProjectSet/Insert")//添加
    @ApiOperation(value = "检查项目设置-添加数据" ,notes = "",httpMethod = "Post")
    public Result checkProjectSetInsert(@RequestBody CPSEdit cps_edit){

        System.out.println(cps_edit);
        checkProjectSet_service.insert(cps_edit);
        Result result = new Result(2,"成功","hello");
        return result;
    }

    @GetMapping("/CheckProjectSet/Delete")//删除
    @ApiOperation(value = "检查项目设置-停用,启用数据" ,notes = "根据id,状态停，启用数据",httpMethod = "Get")
    public Result checkProjectSetDelete(@RequestParam("id") int id ,@RequestParam("projectStatus") String projectStatus ){
        System.out.println(id+"------------------"+projectStatus);
        checkProjectSet_service.delete(id,projectStatus);
        Result result = new Result(2,"成功","hello");
        return result;
    }

    @PostMapping("/CheckProjectSet/Select")//根据条件搜索
    @ApiOperation(value = "检查项目设置-根据条件查询数据" ,notes = "",httpMethod = "post")
    public Result checkProjectSetSelect(@RequestBody CPSEdit cpsEdit){

        System.out.println(cpsEdit+"----------------------");
        List<CPSMainTable> select = checkProjectSet_service.select(cpsEdit);
        Result result = new Result(1,"成功",select);
        return result;
    }

    @GetMapping("/CheckProjectSet/Drop")//查询下拉框
    @ApiOperation(value = "检查项目设置-下拉框的数据" ,notes = "",httpMethod = "Get")
    public Result checkProjectSetDrop(){

        List<CPSViceTable> drop = checkProjectSet_service.drop();
        Result result = new Result(1,"seccess",drop);
        return result;
    }












    @GetMapping("/Roles/List")//查询所有
    @ApiOperation(value = "角色列表-查询所有数据" ,notes = "",httpMethod = "Get",response = Role.class)
    public Result rolesList(){
        List<Role> roles = rolesSetService.selectAll();

        Result result = new Result(1,"seccess", roles);
        return result;
    }

    @PostMapping("/Roles/Edit")//编辑
    @ApiOperation(value = "角色列表-编辑数据" ,notes = "",httpMethod = "Post")
    public Result rolesEdit(@RequestBody Role role){
        rolesSetService.update(role);
        Result result = new Result(2,"成功","hello");
        return result;
    }

    @PostMapping("/Roles/Insert")//添加
    @ApiOperation(value = "角色列表-添加数据" ,notes = "",httpMethod = "Post")
    public Result rolesInsert(@RequestBody Role role){
        rolesSetService.insert(role);
        Result result = new Result(2,"成功","hello");
        return result;
    }

    @GetMapping("/Roles/Delete")//删除
    @ApiOperation(value = "角色列表-删除数据" ,notes = "根据id删除数据",httpMethod = "Get")
    public Result rolesDelete(@RequestParam("id") int id){
        rolesSetService.delete(id);
        Result result = new Result(2,"成功","hello");
        return result;
    }

    @GetMapping("/Roles/Select")//根据条件搜索
    @ApiOperation(value = "角色列表-根据条件查询数据" ,notes = "",httpMethod = "get")
    public Result rolesSelect(@RequestParam ("name") String name){

        List<Role> select = rolesSetService.select(name);
        Result result = new Result(1,"seccess",select);
        return result;
    }













    @GetMapping("/EmployeeManagement/List")//查询所有
    @ApiOperation(value = "员工列表-查询所有数据" ,notes = "",httpMethod = "Get",response = EMEmployeeTable.class)
    public Result employeeManagementList(){
        List<EMEmployeeTable> emEmployeeTables = employeeManagementService.selectAll();

       Result result = new Result(1,"seccess",emEmployeeTables);
        return result;
    }

    @PostMapping("/EmployeeManagement/Edit")//编辑
    @ApiOperation(value = "员工列表-编辑数据" ,notes = "",httpMethod = "Post")
    public Result employeeManagementEdit(@RequestBody EMEdit em_edit){
        System.out.println(em_edit+"--------------------");
        employeeManagementService.update(em_edit);
        Result result = new Result(2,Information.message,"hello");
        return result;
    }

    @PostMapping("/EmployeeManagement/Insert")//添加
    @ApiOperation(value = "员工列表-添加数据" ,notes = "",httpMethod = "Post")
    public Result employeeManagementInsert(@RequestBody EMEdit em_edit){

        System.out.println(em_edit+"11111111111111111111111111111111111111111111111111");
        employeeManagementService.insert(em_edit);
        Result result = new Result(2,Information.message,"hello");
        return result;
    }

    @GetMapping("/EmployeeManagement/Delete")//删除
    @ApiOperation(value = "员工列表-删除数据" ,notes = "根据ID删除数据",httpMethod = "Get")
    public Result employeeManagementDelete(@RequestParam("id") int id){
        employeeManagementService.delete(id);
        Result result = new Result(2,"成功", "hello");

        return result;
    }

    @GetMapping("/EmployeeManagement/Select")//根据条件搜索
    @ApiOperation(value = "员工列表-根据条件查询数据" ,notes = "",httpMethod = "get")
    public Result employeeManagementSelect(@RequestParam ("name") String  name){
        List<EMEmployeeTable> select = employeeManagementService.select(name);

        Result result = new Result(1,"seccess",select);
        return result;
    }

    @GetMapping("/EmployeeManagement/Drop")//查询下拉框
    @ApiOperation(value = "员工列表-角色下拉框的数据" ,notes = "",httpMethod = "Get")
    public Result employeeManagementDrop(){

        List<Role> drop = employeeManagementService.drop();

        Result result = new Result(1,"seccess",drop);
        return result;
    }

    @GetMapping("/EmployeeManagement/Incloud")//
    @ApiOperation(value = "员工列表-编辑，通过员工编号做数据回显" ,notes = "",httpMethod = "Get")
    public Result employeeManagementIncloud(@RequestParam("userName") String userName){

        EMEmployeeTable drop = employeeManagementService.incloud(userName);

        Result result = new Result(1,"seccess",drop);
        return result;
    }

























/*===========================================================================================================================================================*/




































    @Autowired
    private ClinicInformationService clinicInformationService;

//诊所信息维护

    @GetMapping("/clinicinformation/list")
    @ApiOperation(value = "诊所维护信息",notes = "查询接口",httpMethod = "Get")
    public YResult selectClinic(){
        List<ClinicInformation> clinicInformations = this.clinicInformationService.queryAll();
        YResult yResult = new YResult(0, "修改成功",clinicInformations );


        return yResult;
    }


    //
    @PutMapping("/clinicinformation/edit")
    @ApiOperation(value = "诊所维护信息",notes = "修改接口",httpMethod = "Put")
    public YResult updateClinic(@RequestBody ClinicInformationForm clinicInformationForm){
        ClinicInformation clinicInformation = new ClinicInformation(clinicInformationForm.getClinicNo(),clinicInformationForm.getClinicName(),clinicInformationForm.getLogo(),clinicInformationForm.getClinicOwner(),clinicInformationForm.getOwnerPhone(),clinicInformationForm.getOwnerEmail(),clinicInformationForm.getAddress(),clinicInformationForm.getDetailedAddress(),clinicInformationForm.getClinicIntroduce(),clinicInformationForm.getClinicState());
        this.clinicInformationService.updateClinic(clinicInformation);
        YResult YResult = new YResult(0,"修改成功",clinicInformation);
        System.out.println("诊所维护信息修改"+clinicInformationForm);
        System.out.println(clinicInformation);

        return YResult;
    }
    /*--------------------------------------------------------------------------------------------------------------------------*/



    @Autowired
    private SupplierService supplierService;
    //供应商管理
    @GetMapping("/supplier/list")
    @ApiOperation(value = "供应商管理",notes = "查询接口",httpMethod = "Get")
    public YResult selectSupplier(){
        List<SupplierAdministration> supplierAdministrations = this.supplierService.selectSupplier();
        YResult YResult = new YResult(0,"查询成功",supplierAdministrations);
        System.out.println("supplierAdministrations------------------"+supplierAdministrations);
        return YResult;
    }



    @GetMapping("/supplier/conditionlist")
    @ApiOperation(value = "供应商管理",notes = "条件查询接口",httpMethod = "Get")
    public YResult selectBysupplierName(@RequestParam("supplierName") String supplierName){
        List<SupplierAdministration> supplierAdministrations = this.supplierService.selectBySuppliername(supplierName);
        YResult YResult = new YResult(0,"查询成功",supplierAdministrations);


        return YResult;
    }



    @PostMapping("/supplier/add")
    @ApiOperation(value = "供应商管理",notes = "添加接口",httpMethod = "Post")
    public YResult addSupplier(@RequestBody SupplierForm supplierForm){
        Date date = new Date();
        date.setTime(date.getTime());
        SupplierAdministration supplierAdministration = new SupplierAdministration(supplierForm.getId(),supplierForm.getSupplierNo(),supplierForm.getSupplierName(),supplierForm.getContacts(),supplierForm.getPhone(),date,supplierForm.getFoundPerson(),supplierForm.getSupplierState(),supplierForm.getRemarks());
        this.supplierService.addSupplier(supplierAdministration);

        YResult YResult = new YResult(0,"添加成功",supplierAdministration);
        System.out.println("供应商添加"+supplierForm);

        return YResult;

    }


    @GetMapping("/supplier/echolist")
    @ApiOperation(value = "供应商管理",notes = "数据回显查询接口",httpMethod = "Get")
    public YResult selectBysupplierNo(@RequestParam("supplierNo") String supplierNo){
        List<SupplierAdministration> supplierAdministrations = this.supplierService.selectBySuppliername(supplierNo);
        YResult YResult = new YResult(0,"查询成功",supplierAdministrations);

        return YResult;
    }


    @PutMapping("/supplier/edit")
    @ApiOperation(value = "供应商管理",notes = "修改接口",httpMethod = "Put")
    public YResult supplierEdit (@RequestBody SupplierForm supplierForm){
        Date timeing = new Date();
        timeing.setTime(timeing.getTime());
        System.out.println("shijian"+timeing);
        SupplierAdministration supplierAdministration = new SupplierAdministration(supplierForm.getId(),supplierForm.getSupplierNo(),supplierForm.getSupplierName(),supplierForm.getContacts(),supplierForm.getPhone(),timeing,supplierForm.getFoundPerson(),supplierForm.getSupplierState(),supplierForm.getRemarks());
        this.supplierService.updateSupplier(supplierAdministration);
        YResult YResult = new YResult(0,"修改成功");
        System.out.println("供应商修改"+supplierAdministration);

        return YResult;
    }



    @DeleteMapping("/supplier/delete")
    @ApiOperation(value = "供应商管理",notes = "删除接口",httpMethod = "Delete")
    public YResult deleteSupplier(@RequestParam("supplierId") Integer supplierId){
        System.out.println("supplierId-------"+supplierId);
        this.supplierService.deleteBySupplierId(supplierId);
        YResult YResult = new YResult(0,"删除成功");

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
        YResult YResult = new YResult(0,"查询成功",surchargeFees);


        return YResult;
    }


    @Autowired
    private QueryPrescriptionService queryPrescriptionService;
    @GetMapping("/costsettings/prescription")
    @ApiOperation(value = "费用设置-附加费用",notes = "下拉框接口",httpMethod = "Get")
    public YResult prescriptiontable(){
        List<PrescriptionTable> prescriptionTables = this.queryPrescriptionService.queryPrescription();
        System.out.println("prescriptionTables"+prescriptionTables);
        YResult YResult = new YResult(0,"查询成功",prescriptionTables);

        return YResult;
    }



    @GetMapping("/costsettings/prescriptionBy")
    @ApiOperation(value = "费用设置-附加费用",notes = "查询处方接口",httpMethod = "Get")
    public YResult prescriptiontableBy(@RequestParam("prescription") String prescription){
        List<PrescriptionTable> prescriptionTables = this.queryPrescriptionService.queryPrescriptionBy(prescription);
        System.out.println("prescriptionTables"+prescriptionTables);
        YResult YResult = new YResult(0,"查询成功",prescriptionTables);

        return YResult;
    }



//-------------------------------------------------------------------------------------------------------------------------
    @GetMapping("/costsettings/conditionlist")
    @ApiOperation(value = "费用设置-附加费用",notes = "根据条件查询接口",httpMethod = "Get")
    public YResult selectByTj(@RequestParam("surchargeName") String surchargeName,@RequestParam("prescription") String prescription){
        List<SurchargeFee> surchargeFees = this.surchargeFeeiService.queryByTj(surchargeName,prescription);
        YResult YResult = new YResult(0,"查询成功",surchargeFees);
        System.out.println("surchargeFees"+surchargeFees);


        return YResult;
    }




    @PostMapping("/costsettings/add")
    @ApiOperation(value = "费用设置-附加费用",notes = "添加接口",httpMethod = "Post")
    public YResult addCost(@RequestBody SurchargeFeeForm surchargeForm){
        Date timeing = new Date();
        timeing.setTime(timeing.getTime());
        SurchargeFee surchargeFee = new SurchargeFee(surchargeForm.getId(),surchargeForm.getSurchargeName(),surchargeForm.getPrice(),surchargeForm.getCost(),timeing,surchargeForm.getFoundPerson(),surchargeForm.getCostState(),surchargeForm.getPerscripId(),surchargeForm.getPrescriptionTable());
        this.surchargeFeeiService.addSurchargeFee(surchargeFee);
        YResult YResult = new YResult(0,"添加成功",surchargeFee);
        System.out.println("附加费用添加"+surchargeForm);

        return YResult;
    }


    @PutMapping("/costsettings/edit")
    @ApiOperation(value = "费用设置-附加费用",notes = "修改接口",httpMethod = "Put")
    public YResult editCost(@RequestBody SurchargeFeeForm surchargeForm){
        Date timeing = new Date();
        timeing.setTime(timeing.getTime());
        SurchargeFee surchargeFee = new SurchargeFee(surchargeForm.getId(),surchargeForm.getSurchargeName(),surchargeForm.getPrice(),surchargeForm.getCost(),timeing,surchargeForm.getFoundPerson(),surchargeForm.getCostState(),surchargeForm.getPerscripId(),surchargeForm.getPrescriptionTable());
        this.surchargeFeeiService.updateSurchargeFee(surchargeFee);
        YResult YResult = new YResult(0,"修改成功",surchargeFee);
        System.out.println("附加费用修改"+surchargeForm);

        return  YResult;
    }


    @DeleteMapping("/costsettings/delete")
    @ApiOperation(value = "费用设置-附加费用",notes = "删除接口",httpMethod = "Delete")
    public YResult deleteCost(@RequestParam("id") int id){
        this.surchargeFeeiService.deleteById(id);

        YResult YResult = new YResult(0,"删除成功");
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
        YResult YResult = new YResult(0,"查询成功",treatmentFees);


        return YResult;
    }


    @GetMapping("/treatment/conditionlist")
    @ApiOperation(value = "费用设置-诊疗费",notes = "费用名称查询接口",httpMethod = "Get")
    public YResult selectByTreatment(@RequestParam("treatment") String treatment){
        List<TreatmentFee> treatmentFees = this.treatmentFeeService.queryByTreatment(treatment);
        YResult YResult = new YResult(0,"查询成功",treatmentFees);
        System.out.println("treatmentFees"+treatmentFees);


        return YResult;
    }



    @PostMapping("/treatment/add")
    @ApiOperation(value = "费用设置-诊疗费",notes = "添加接口",httpMethod = "Post")
    public YResult treatmentAdd(@RequestBody TreatmentFeeForm treatmentForm){
        Date timeing = new Date();
        timeing.setTime(timeing.getTime());
        TreatmentFee treatmentFee = new TreatmentFee(treatmentForm.getTreatment(),treatmentForm.getPrice(),treatmentForm.getCost(),timeing,treatmentForm.getFoundPerson(),treatmentForm.getCostState());
        this.treatmentFeeService.addTreatmentFee(treatmentFee);
        System.out.println("treatmentFee"+treatmentFee);
        YResult YResult = new YResult(0,"添加成功",treatmentFee);
        System.out.println("诊疗费添加"+treatmentForm);

        return YResult;
    }


    @PutMapping("/treatment/edit")
    @ApiOperation(value = "费用设置-诊疗费",notes = "修改接口",httpMethod = "Put")
    public YResult treatmentEdit(@RequestBody TreatmentFeeForm treatmentForm){
        Date timeing = new Date();
        timeing.setTime(timeing.getTime());
        TreatmentFee treatmentFee = new TreatmentFee(treatmentForm.getId(),treatmentForm.getTreatment(),treatmentForm.getPrice(),treatmentForm.getCost(),timeing,treatmentForm.getFoundPerson(),treatmentForm.getCostState());
        this.treatmentFeeService.updateTreatmentFee(treatmentFee);
        YResult YResult = new YResult(0,"修改成功",treatmentFee);
        System.out.println("诊疗费修改"+treatmentFee);

        return YResult;
    }

    @DeleteMapping("/treatment/delete")
    @ApiOperation(value = "费用设置-诊疗费",notes = "删除接口",httpMethod = "Delete")
    public YResult treatmentDelete(@RequestParam("id") int id){
        this.treatmentFeeService.deleteTreatmentFee(id);
        YResult YResult = new YResult(0,"删除成功");
        System.out.println("诊疗费删除"+id);

        return YResult;
    }




    /*--------------------------------------------------------------------------------------------------------------------------*/





    //挂号费设置
    @Autowired
    private RegisterFeeService registerFeeService;

    @GetMapping("/register/select1")
    @ApiOperation(value = "费用设置-挂号费",notes = "查询接口",httpMethod = "Get")
    public YResult registerSelect(){
        List<RegisterFee> registerFees = this.registerFeeService.queryAll();
        System.out.println("registerFees"+registerFees);
        YResult YResult = new YResult(0,"查询成功",registerFees);

        return YResult;
    }

    @GetMapping("/register/conditionlist")
    @ApiOperation(value = "费用设置-挂号费",notes = "条件查询接口",httpMethod = "Get")
    public YResult selectByRegisterFee(@RequestParam("registerName") String registerName){
        List<RegisterFee> registerFees = this.registerFeeService.queryByRegisterName(registerName);
        YResult YResult = new YResult(0,"查询成功",registerFees);
        System.out.println("registerName"+registerName);


        return YResult;
    }


    @PostMapping("/register/add1")
    @ApiOperation(value = "费用设置-挂号费",notes = "添加接口",httpMethod = "Post")
    public YResult registerAdd(@RequestBody RegisterFeeForm registerFeeForm){
        Date timing = new Date();
        timing.setTime(timing.getTime());
        RegisterFee registerFee = new RegisterFee(registerFeeForm.getRegisterName(),registerFeeForm.getPrice(),registerFeeForm.getCost(),timing,registerFeeForm.getFoundPerson(),registerFeeForm.getCostState());
        this.registerFeeService.addRegisterFee(registerFee);
        YResult YResult = new YResult(0,"添加成功",registerFee);
        System.out.println("挂号费查询"+registerFeeForm);

        return YResult;
    }

    @PutMapping("/register/edit1")
    @ApiOperation(value = "费用设置-挂号费",notes = "修改接口",httpMethod = "Put")
    public YResult registerEdit(@RequestBody RegisterFeeForm registerFeeForm){
        Date timing = new Date();
        timing.setTime(timing.getTime());
        RegisterFee registerFee = new RegisterFee(registerFeeForm.getId(),registerFeeForm.getRegisterName(),registerFeeForm.getPrice(),registerFeeForm.getCost(),timing,registerFeeForm.getFoundPerson(),registerFeeForm.getCostState());
        this.registerFeeService.updateRegisterFee(registerFee);
        YResult YResult = new YResult(0,"修改成功",registerFee);
        System.out.println("挂号费修改"+registerFeeForm);

        return YResult;
    }

    @DeleteMapping("/register/delete1")
    @ApiOperation(value = "费用设置-挂号费",notes = "删除接口",httpMethod = "Delete")
    public YResult registerDelete(@RequestParam("id") int id){
        this.registerFeeService.deleteRegisterFee(id);
        YResult YResult = new YResult(0,"删除成功");
        System.out.println("挂号费删除"+id);

        return YResult;
    }


    //支付方式
    //------------------------------------------------------------------------------------------------------------
    @Autowired
    private PaymentMethodService paymentMethodService;
    @GetMapping("/paymentMethod/tianjia")
    @ApiOperation(value = "支付方式设置",notes = "查询接口",httpMethod = "Get")
    public YResult selectPaymentMethodAll(){
        List<PaymentMethod> paymentMethods = this.paymentMethodService.queryAll();
        YResult YResult = new YResult(0,"查询成功",paymentMethods);


        return YResult;
    }


    @PutMapping("/paymentMethod/xiugai")
    @ApiOperation(value = "支付方式设置",notes = "修改接口",httpMethod = "Put")
    public YResult updatePaymentMethod(@RequestBody PaymentMethodForm paymentMethodForm){
        this.paymentMethodService.updateByState(paymentMethodForm);

        YResult YResult = new YResult(0,"修改成功",paymentMethodForm);


        return YResult;
    }



    @Autowired
    private ClinicInformationPlusService clinicInformationPlusService;
    @GetMapping("/Test/select01")
    @ApiOperation(value = "测试",notes = "查询",httpMethod = "Get")
    public YResult PlusSelect01(){
        List<ClinicInformation> list = this.clinicInformationPlusService.queryAll();
        System.out.println("registerFees"+list);
        YResult YResult = new YResult(0,"查询成功",list);

        return YResult;
    }



    @GetMapping("/Test/select02")
    @ApiOperation(value = "测试",notes = "查询",httpMethod = "Get")
    public YResult PlusSelect02(@RequestParam("id") Integer id){
        ClinicInformation clinicInformation = this.clinicInformationPlusService.queryById(id);
        System.out.println("clinicInformation"+clinicInformation);
        YResult YResult = new YResult(0,"查询成功",clinicInformation);

        return YResult;
    }

    @GetMapping("/Test/select03")
    @ApiOperation(value = "测试",notes = "查询",httpMethod = "Get")
    public YResult PlusSelect03(@RequestParam("clinicName") String clinicName){
        List<ClinicInformation> list = this.clinicInformationPlusService.queryByClinicName(clinicName);
        System.out.println("前端传的clinicName"+clinicName);
        YResult YResult = new YResult(0,"查询成功",list);

        return YResult;
    }

    @PutMapping("/Test/update")
    @ApiOperation(value = "测试",notes = "修改",httpMethod = "Put")
    public YResult PlusUpdate(@RequestBody ClinicInformation clinicInformation){
        this.clinicInformationPlusService.updateById(clinicInformation);
        System.out.println("传过来的修改的clinicInformation"+clinicInformation);
        YResult YResult = new YResult(0,"修改成功");

        return YResult;
    }


    @DeleteMapping("/Test/delete")
    @ApiOperation(value = "测试",notes = "删除",httpMethod = "Delete")
    public YResult PlusDelete(@RequestParam("id") Integer id){
        this.clinicInformationPlusService.deleteById(id);
        System.out.println("传过来的id"+id);
        YResult YResult = new YResult(0,"删除成功");

        return YResult;
    }


}
