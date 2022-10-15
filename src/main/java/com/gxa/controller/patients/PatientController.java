package com.gxa.controller.patients;

import com.gxa.entity.patients.Family;
import com.gxa.entity.patients.Patients;
import com.gxa.entity.patients.PatientsDateTime;
import com.gxa.service.patient.FamilyService;
import com.gxa.service.patient.PatientService;
import com.gxa.utils.R;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

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
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Patients.class)
    })
    public R patientList(){
        List<Patients> patients = this.patientService.queryAll();
        Map map = new HashMap();
        map.put("patients",patients);
        return R.ok(map);

    }

//    @GetMapping("/patient/time")
//    @

    @GetMapping("/patient/phone")
    @ResponseBody
    @ApiOperation(value = "查找接口",notes = "电话或姓名查找患者",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Patients.class)
    })
    public R patientPhoneList(@ApiParam(name = "电话或姓名查找患者信息", value = "patientPhone")@RequestParam("patientPhone") String patientPhone){
        List<Patients> patients = this.patientService.queryByPhone(patientPhone);
       Map map = new HashMap();
       map.put("patients",patients);

//        System.out.println(patients);
        return R.ok(map);
    }

    @GetMapping("/patient/datetime")
    @ResponseBody
    @ApiOperation(value = "查找日期",notes = "用开始日期和结束日期查找",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Patients.class)
    })
    public R patientDateTimeList(
            @ApiParam(name = "开始时间", value = "firstDateTime") @RequestBody PatientsDateTime patientsDateTime

    ){
        String firstDateTime = patientsDateTime.getFirstDateTime();
        String lastDateTime = patientsDateTime.getLastDateTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {

            Date firstTime = simpleDateFormat.parse(firstDateTime);
            Date lastTime = simpleDateFormat.parse(lastDateTime);
            List<Patients> patients = this.patientService.queryByDateTime(firstTime,lastTime);
            Map map = new HashMap();
            map.put("patients",patients);
            return R.ok(map);
        } catch (ParseException e) {
            e.printStackTrace();
            return R.ok("fale");
        }

    }


    @PostMapping("/patient/add")
    @ResponseBody
    @ApiOperation(value = "添加接口",notes = "患者添加",httpMethod = "POST")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok")
    })
    public R patientAdd(@ApiParam(name = "患者添加信息", value = "patientAdd")@RequestBody Patients patients){

        try {
            this.patientService.add(patients);

        } catch (Exception e) {
            e.printStackTrace();
            R.ok("fale");
        }
        return R.ok("succes");
    }

    @GetMapping("/patient/updatePre")
    @ResponseBody
    @ApiOperation(value = "查询接口",notes = "患者修改查询",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Patients.class)
    })
    public R tpPatientUpdate(@ApiParam(name = "患者修改条件",value = "patientId")@RequestParam("patientId") Integer patientId){
        Patients patients = this.patientService.queryById(patientId);
        Map map = new HashMap();
        map.put("patients",patients);
        return R.ok(map);
    }

    @PutMapping("/patient/update")
    @ResponseBody
    @ApiOperation(value = "修改接口",notes = "患者修改",httpMethod = "PUT")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok")
    })
    public R patientUpdate(@ApiParam(name = "患者修改",value = "patients")@RequestBody Patients patients){
        try {
            this.patientService.update(patients);
        } catch (Exception e) {
            e.printStackTrace();
            R.ok("fale");
        }
        return R.ok("succes");
    }


    @DeleteMapping("/patient/delete")
    @ResponseBody
    @ApiOperation(value = "删除接口",notes = "患者删除",httpMethod = "DELETE")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok")
    })
    public R patientDelete(@ApiParam(name = "患者删除条件",value = "patientId")@RequestParam("patientId") Integer patientId){
        try {
            this.patientService.delete(patientId);
        } catch (Exception e) {
            e.printStackTrace();
            R.ok("fale");
        }
        return R.ok("success");
    }


    @GetMapping("/family/list")
    @ApiOperation(value = "查找接口",notes = "查找家庭",httpMethod = "GET")
    @ResponseBody
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Family.class)
    })
    public R familyList(@ApiParam(name = "患者编号查询条件",value = "patientNumber")@RequestParam("patientId") Integer patientId){
        List<Family> family = this.familyService.queryByFamilyId(patientId);
        Map map = new HashMap();
        map.put("family",family);
        return R.ok(map);

    }

    @GetMapping("/family/updatePre")
    @ResponseBody
    @ApiOperation(value = "查询接口",notes = "家庭修改条件",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Family.class)
    })
    public R tpFamilyUpdate(@ApiParam(name = "家庭修改条件",value = "familyId")@RequestParam("familyId") Integer familyId){
       Family family = this.familyService.queryById(familyId);
        Map map = new HashMap();
        map.put("family",family);
        return R.ok(map);
    }


    @PutMapping("/family/update")
    @ResponseBody
    @ApiOperation(value = "修改接口",notes = "家庭修改",httpMethod = "PUT")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok")
    })
    public R familyAddUpdate(@ApiParam(name = "患者修改",value = "familyAdd")@RequestBody Family family){
        try {
            this.familyService.update(family);
        } catch (Exception e) {
            e.printStackTrace();
            R.ok("fale");
        }
        return R.ok("success");
    }


    @PostMapping("/family/add")
    @ResponseBody
    @ApiOperation(value = "添加接口",notes = "家庭添加",httpMethod = "POST")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok")
    })
    public R add(@ApiParam(name = "家庭添加信息", value = "familyAdd")@RequestBody Family family){
        try {
            this.familyService.add(family);
        } catch (Exception e) {
            e.printStackTrace();
            R.ok("fale");
        }
        return R.ok("success");
    }

    @DeleteMapping("/family/delete")
    @ResponseBody
    @ApiOperation(value = "删除接口",notes = "家庭删除",httpMethod = "DELETE")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok")
    })
    public R delete(@ApiParam(name = "患者删除条件",value = "familyId")@RequestParam("familyId") Integer familyId){
        try {
            this.familyService.delete(familyId);
        } catch (Exception e) {
            e.printStackTrace();
            R.ok("fale");
        }
        return R.ok("success");
    }
}
