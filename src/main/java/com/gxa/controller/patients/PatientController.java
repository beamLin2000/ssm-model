package com.gxa.controller.patients;

import com.gxa.entity.patients.FamilyAdd;
import com.gxa.entity.patients.Patients;
import com.gxa.service.patient.FamilyService;
import com.gxa.service.patient.PatientService;
import com.gxa.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@Api(tags = {"患者管理"})
public class PatientController {
    @Autowired
    private PatientService patientService;
    @Autowired
    private FamilyService familyService;

    @GetMapping("/patient")
    @ResponseBody
    @ApiOperation(value = "查找接口",notes = "查找患者",httpMethod = "GET")
    public R patientList(){
        Date date = new Date();
        long time = date.getTime();
        date.setTime(time);

        Patients patient = new Patients(1,100130,"李四",12,"男","17754138769",date,"李四");
        List<Patients> list = new ArrayList<>();
        list.add(patient);

        Map map = new HashMap();
        map.put("drugs",list);
        R r = new R();
        return r.ok(map);
    }

    @GetMapping("/patient/phone")
    @ResponseBody
    @ApiOperation(value = "查找接口",notes = "电话查找患者",httpMethod = "GET")
    public R patientPhoneList(@ApiParam(name = "patientPhone", value = "电话查找患者信息")String patientPhone){
        R r = new R();
        return r;
    }


    @PostMapping("/patient/add")
    @ResponseBody
    @ApiOperation(value = "添加接口",notes = "患者添加",httpMethod = "POST")
    public R patientAdd(@ApiParam(name = "patientAdd", value = "患者添加信息")Patients patients){
        R r = new R();
        this.patientService.patientAdd(patients);
        R.ok("success");
        return r;
    }

    @PutMapping("/patient/updatePre")
    @ResponseBody
    @ApiOperation(value = "修改接口",notes = "患者修改",httpMethod = "PUT")
    public R tpPatientUpdate(@ApiParam(name = "patient_id",value = "患者修改条件") Integer patientId){
        R r = new R();
        this.patientService.tpPatientUpdate(patientId);
        R.ok("success");
        return r;
    }

    @PutMapping("/patient/update")
    @ResponseBody
    @ApiOperation(value = "修改接口",notes = "患者修改",httpMethod = "PUT")
    public R patientUpdate(@ApiParam(name = "patients",value = "患者修改") Patients patients){
        R r = new R();
        this.patientService.patientUpdate(patients);
        R.ok("success");
        return r;
    }


    @DeleteMapping("/patient/delete")
    @ResponseBody
    @ApiOperation(value = "删除接口",notes = "患者删除",httpMethod = "DELETE")
    public R patientDelete(@ApiParam(name = "patientId",value = "患者删除条件") Integer patientId){
        return null;
    }


    @GetMapping("/family/list")
    @ApiOperation(value = "查找接口",notes = "查找家庭",httpMethod = "GET")
    public R familyList(@ApiParam(name = "patientNumber",value = "患者编号查询条件") Integer patientNumber){
//       Date date = new Date();
//        long time = date.getTime();
//        date.setTime(time);
//
//
//        Family family = new Family(1,"父子","李四","国企",date,"男","12354689",date);
//        List<Family> familyList= new ArrayList<>();
//        familyList.add(family);
//        Map map = new HashMap();
//        map.put("drugs",familyList);
//        R r = new R();
//        return r.ok(map);
     R r = new R();
     return r;

    }

    @PutMapping("/family/updatePre")
    @ResponseBody
    @ApiOperation(value = "修改接口",notes = "家庭修改",httpMethod = "PUT")
    public R tpFamilyUpdate(@ApiParam(name = "familyId",value = "家庭修改条件") Integer familyId){
        R r = new R();
        this.familyService.tpFamilyUpdate(familyId);
        R.ok("success");
        return r;
    }


    @PutMapping("/family/update")
    @ResponseBody
    @ApiOperation(value = "修改接口",notes = "家庭修改",httpMethod = "PUT")
    public R familyAddUpdate(@ApiParam(name = "familyAdd",value = "患者修改") FamilyAdd familyAdd){
        R r = new R();
        this.familyService.familyAddUpdate(familyAdd);
        R.ok("success");
        return r;
    }


    @PostMapping("/family/add")
    @ResponseBody
    @ApiOperation(value = "添加接口",notes = "家庭添加",httpMethod = "POST")
    public R add(@ApiParam(name = "familyAdd", value = "家庭添加信息")FamilyAdd familyAdd){
        R r = new R();
        this.familyService.add(familyAdd);
        R.ok("success");
        return r;
    }

    @DeleteMapping("/family/delete")
    @ResponseBody
    @ApiOperation(value = "删除接口",notes = "家庭删除",httpMethod = "DELETE")
    public R delete(@ApiParam(name = "familyId",value = "患者删除条件") Integer familyId){
       return null;
    }
}
