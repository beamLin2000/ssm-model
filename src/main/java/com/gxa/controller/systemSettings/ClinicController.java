package com.gxa.controller.systemSettings;

import com.gxa.entity.systemSettings.ClinicInformation;
import com.gxa.form.systemSettings.clinicInformation.clinicInformation.ClinicInformationForm;
import com.gxa.service.systemSettings.ClinicInformationService;
import com.gxa.utils.systemSettings.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;



@RestController
public class ClinicController {


    @Autowired
    private ClinicInformationService clinicInformationService;

//    value = “接口说明”, httpMethod = “接口请求方式”, response = “接口返回参数类型”, notes = “接口发布说明
    @GetMapping("/clinicinformation/list")
    @ApiOperation(value = "查询接口",notes = "诊所维护信息",httpMethod = "Get",response = ClinicInformation.class)
    public Result select(){
        List<ClinicInformation> clinicInformations1 = this.clinicInformationService.queryAll();
        Result result = new Result(1, "成功", 1,clinicInformations1 );

        return result;
    }

    @PutMapping("/clinicinformation/edit")
    @ApiOperation(value = "修改接口",notes = "诊所维护修改信息",httpMethod = "Put")
    public Result update(ClinicInformationForm clinicInformationForm){
        ClinicInformationForm clinicInformationForm1 = new ClinicInformationForm(1,"1","1","1",1,"1","1","1","1",1);
        Result result = new Result(1,"成功",1,clinicInformationForm1);

        return result;
    }




}
