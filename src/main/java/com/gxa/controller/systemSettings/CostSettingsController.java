package com.gxa.controller.systemSettings;

import com.gxa.form.clinicInformation.clinicInformation.ClinicInformationForm;
import com.gxa.utils.systemSettings.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//surcharge 附加费
//diagnosis 诊疗费
//registration 挂号费
@RestController
public class CostSettingsController {

    @GetMapping("/costsettings/list")
    public Result select(){
        ClinicInformationForm clinicInformationForm = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm);

        return result;
    }





}
