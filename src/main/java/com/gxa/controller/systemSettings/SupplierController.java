package com.gxa.controller.systemSettings;

import com.gxa.form.clinicInformation.clinicInformation.ClinicInformationForm;
import com.gxa.form.supplier.SupplierForm;
import com.gxa.utils.systemSettings.Result;
import org.springframework.web.bind.annotation.*;

@RestController
public class SupplierController {


    @GetMapping("/supplier/list")
    public Result select(){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(0,"成功",1,clinicInformationForm);
        return result;
    }


    @PostMapping("/supplier/add")
    public Result add(SupplierForm supplierForm){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);

        return result;
    }

    @PutMapping("/supplier/edit")
    public Result edit (SupplierForm supplierForm){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);
        System.out.println("supplierForm"+supplierForm);

        return result;
    }

    @DeleteMapping("/supplier/delete")
    public Result delete(@RequestParam("id") int id){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);
        System.out.println(id);
        return result;
    }


}
