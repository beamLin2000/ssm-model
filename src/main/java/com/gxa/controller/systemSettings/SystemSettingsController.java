package com.gxa.controller.systemSettings;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gxa.entity.systemSettings.ClinicInformation;
import com.gxa.form.systemsettings.CostSettngsForm.RegisterFeeForm;
import com.gxa.form.systemsettings.CostSettngsForm.SurchargeForm;
import com.gxa.form.systemsettings.CostSettngsForm.TreatmentForm;
import com.gxa.form.systemsettings.clinicInformation.ClinicInformationForm;
import com.gxa.form.systemsettings.supplier.SupplierForm;
import com.gxa.service.systemSettings.ClinicInformationService;
import com.gxa.utils.systemSettings.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@Api(tags = {"系统设置接口"})
@RestController
public class SystemSettingsController {
//    value = “接口说明”, httpMethod = “接口请求方式”, response = “接口返回参数类型”, notes = “接口发布说明

    @Autowired
    private ClinicInformationService clinicInformationService;



//诊所信息维护
    @GetMapping("/clinicinformation/list")
    @ApiOperation(value = "诊所维护信息",notes = "查询接口",httpMethod = "Get",response = ClinicInformation.class)
    public Result selectClinic(){
        List<ClinicInformation> clinicInformations = this.clinicInformationService.queryAll();
        Result result = new Result(1, "成功", 1,clinicInformations );

        return result;
    }

    @GetMapping("/clinicinformation/list01")
    public PageInfo<ClinicInformation>qrall(@RequestParam("page") int page,@RequestParam("size")int size){
        PageHelper.startPage(page,size);
        List<ClinicInformation>list = this.clinicInformationService.queryAll();
        PageInfo<ClinicInformation>pageInfo = new PageInfo<>(list);

        return pageInfo;

    }

    @PutMapping("/clinicinformation/edit")
    @ApiOperation(value = "诊所维护信息",notes = "修改接口",httpMethod = "Put")
    public Result updateClinic(@RequestBody ClinicInformationForm clinicInformationForm){
        ClinicInformationForm clinicInformationForm1 = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm1);
        System.out.println("诊所维护信息修改"+clinicInformationForm);

        return result;
    }
    /*--------------------------------------------------------------------------------------------------------------------------*/




//供应商管理
    @GetMapping("/supplier/list")
    @ApiOperation(value = "供应商管理",notes = "查询接口",httpMethod = "Get")
    public Result selectSupplier(){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(0,"成功",1,clinicInformationForm);
        return result;
    }



    @GetMapping("/supplier/conditionlist")
    @ApiOperation(value = "供应商管理",notes = "条件查询接口",httpMethod = "Get")
    public Result selectBysupplierName(@RequestParam("supplierName") String supplierName){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(0,"成功",1,clinicInformationForm);
        System.out.println("条件"+supplierName);
        return result;
    }





    @PostMapping("/supplier/add")
    @ApiOperation(value = "供应商管理",notes = "添加接口",httpMethod = "Post")
    public Result addSupplier(@RequestBody SupplierForm supplierForm){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);
        System.out.println("供应商添加"+supplierForm);

        return result;
    }

    @PutMapping("/supplier/edit")
    @ApiOperation(value = "供应商管理",notes = "修改接口",httpMethod = "Put")
    public Result supplierEdit (@RequestBody SupplierForm supplierForm){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);
        System.out.println("供应商修改"+supplierForm);

        return result;
    }

    @DeleteMapping("/supplier/delete")
    @ApiOperation(value = "供应商管理",notes = "删除接口",httpMethod = "Delete")
    public Result deleteSupplier(@RequestParam("id") int id){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);
        System.out.println("供应商管理删除"+id);
        return result;
    }
    /*--------------------------------------------------------------------------------------------------------------------------*/



//费用设置
    @GetMapping("/costsettings/list")
    @ApiOperation(value = "费用设置-附加费用",notes = "查询接口",httpMethod = "Get")
    public Result selectCost(){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);


        return result;
    }


    @GetMapping("/costsettings/conditionlist")
    @ApiOperation(value = "费用设置-附加费用",notes = "查询接口",httpMethod = "Get")
    public Result selectBysurcharge(@RequestParam("surchargeName") String surchargeName,@RequestParam("prescription")String prescription){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);
        System.out.println("surchargeName"+surchargeName+"prescription"+prescription);


        return result;
    }

    @PostMapping("/costsettings/add")
    @ApiOperation(value = "费用设置-附加费用",notes = "添加接口",httpMethod = "Post")
    public Result addCost(@RequestBody SurchargeForm surchargeForm){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);
        System.out.println("附加费用添加"+surchargeForm);

        return result;
    }

    @PutMapping("/costsettings/edit")
    @ApiOperation(value = "费用设置-附加费用",notes = "修改接口",httpMethod = "Put")
    public Result editCost(@RequestBody SurchargeForm surchargeForm){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);
        System.out.println("附加费用修改"+surchargeForm);

        return  result;
    }

    @DeleteMapping("/costsettings/delete")
    @ApiOperation(value = "费用设置-附加费用",notes = "删除接口",httpMethod = "Delete")
    public Result deleteCost(@RequestParam("id") int id){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);
        System.out.println("附加费用删除"+id);

        return result;
    }

    /*--------------------------------------------------------------------------------------------------------------------------*/



//诊疗费设置
    @GetMapping("/treatment/list")
    @ApiOperation(value = "费用设置-诊疗费",notes = "查询接口",httpMethod = "Get")
    public Result treatmentSelect(){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);


        return result;
    }


    @GetMapping("/treatment/conditionlist")
    @ApiOperation(value = "费用设置-附加费用",notes = "查询接口",httpMethod = "Get")
    public Result selectByTreatment(@RequestParam("Treatment") String Treatment){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);
        System.out.println("surchargeName"+Treatment);


        return result;
    }



    @PostMapping("/treatment/add")
    @ApiOperation(value = "费用设置-诊疗费",notes = "添加接口",httpMethod = "Post")
    public Result treatmentAdd(@RequestBody TreatmentForm treatmentForm){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);
        System.out.println("诊疗费添加"+treatmentForm);

        return result;
    }


    @PutMapping("/treatment/edit")
    @ApiOperation(value = "费用设置-诊疗费",notes = "修改接口",httpMethod = "Put")
    public Result treatmentEdit(@RequestBody TreatmentForm treatmentForm){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);
        System.out.println("诊疗费修改"+treatmentForm);

        return result;
    }

    @DeleteMapping("/treatment/delete")
    @ApiOperation(value = "费用设置-诊疗费",notes = "删除接口",httpMethod = "Delete")
    public Result treatmentDelete(@RequestParam("id") int id){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);
        System.out.println("诊疗费删除"+id);

        return result;
    }




    /*--------------------------------------------------------------------------------------------------------------------------*/





//挂号费设置
    @GetMapping("/register/select1")
    @ApiOperation(value = "费用设置-挂号费",notes = "查询接口",httpMethod = "Get")
    public Result registerSelect(){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);

        return result;
    }

    @GetMapping("/register/conditionlist")
    @ApiOperation(value = "费用设置-附加费用",notes = "查询接口",httpMethod = "Get")
    public Result selectByRegisterFee(@RequestParam("RegisterFee") String RegisterFee){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);
        System.out.println("surchargeName"+RegisterFee);


        return result;
    }


    @PostMapping("/register/add1")
    @ApiOperation(value = "费用设置-挂号费",notes = "添加接口",httpMethod = "Post")
    public Result registerAdd(RegisterFeeForm registerFeeForm){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);
        System.out.println("挂号费查询"+registerFeeForm);

        return result;
    }

    @PutMapping("/register/edit1")
    @ApiOperation(value = "费用设置-挂号费",notes = "修改接口",httpMethod = "Put")
    public Result registerEdit(RegisterFeeForm registerFeeForm){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);
        System.out.println("挂号费xuugai"+registerFeeForm);

        return result;
    }

    @DeleteMapping("/register/delete1")
    @ApiOperation(value = "费用设置-挂号费",notes = "删除接口",httpMethod = "Delete")
    public Result registerDelete(@RequestParam("id") int id){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);
        System.out.println("挂号费shanchu"+id);

        return result;
    }







}
