package com.gxa.controller.patients;

import com.gxa.entity.patients.Family;
import com.gxa.entity.patients.Patients;
import com.gxa.entity.patients.PatientsDatePhone;
import com.gxa.service.patient.FamilyService;
import com.gxa.service.patient.PatientService;
import com.gxa.utils.R;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.*;

@RestController
@Api(tags = {"患者管理"})
public class PatientController {
    @Autowired
    private PatientService patientService;
    @Autowired
    private FamilyService familyService;

    @GetMapping("/patient")
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


    @PostMapping("/patient/datetime")
    @ApiOperation(value = "查找日期",notes = "用开始日期和结束日期查找",httpMethod = "POST")
    @ResponseBody
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Patients.class)
    })
    public R patientDateTimeList(@RequestBody PatientsDatePhone patientsDatePhone){
        String patientsDateTim = patientsDatePhone.getPatientsDateTim();
        String patientPhone = patientsDatePhone.getPatientPhone();
        System.out.println(patientsDateTim);
        if (patientsDateTim != null && !"".equals(patientsDateTim) && patientPhone != null && !"".equals(patientPhone)){
            String firstDateTime =null;
            String lastDateTime = null;
            String[] dateTime = patientsDateTim.split(",");
            firstDateTime = dateTime[0].trim();
            lastDateTime =  dateTime[1].trim();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {

                Date firstTime = simpleDateFormat.parse(firstDateTime);
                Date lastTime = simpleDateFormat.parse(lastDateTime);
                List<Patients> patients = this.patientService.queryByDateTimePhone(firstTime,lastTime,patientPhone);
                Map map = new HashMap();
                map.put("patients",patients);
                return R.ok(map);
            } catch (ParseException e) {
                e.printStackTrace();
                return R.ok("fale");
            }
        }else if (patientsDateTim != null && !"".equals(patientsDateTim) ){
            String firstDateTime =null;
            String lastDateTime = null;
            String[] dateTime = patientsDateTim.split(",");
            firstDateTime = dateTime[0].trim();
            lastDateTime =  dateTime[1].trim();
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
        }else if ( patientPhone != null && !"".equals(patientPhone)){
            List<Patients> patients = this.patientService.queryByPhone(patientPhone);
            Map map = new HashMap();
            map.put("patients",patients);

//        System.out.println(patients);
            return R.ok(map);
        }
        return null;

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
    @ApiOperation(value = "查询接口",notes = "患者修改查询",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Patients.class)
    })
    public R tpPatientUpdate(@ApiParam(name = "患者修改条件",value = "patientCard")@RequestParam("patientCard") String patientCard){
        Patients patients = this.patientService.queryById(patientCard);
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
    public R patientDelete(@ApiParam(name = "患者删除条件",value = "patientCard")@RequestBody String patientCard){
        try {
            this.patientService.delete(patientCard);
        } catch (Exception e) {
            e.printStackTrace();
            R.ok("fale");
        }
        return R.ok("success");
    }


    @GetMapping("/family/list")
    @ApiOperation(value = "查找接口",notes = "查找家庭",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Family.class)
    })
    public R familyList(@ApiParam(name = "患者编号查询条件",value = "patientCard")@RequestParam("patientCard") String patientCard){
        List<Family> family = this.familyService.queryByFamilyId(patientCard);
        Map map = new HashMap();
        map.put("family",family);
        return R.ok(map);

    }

    @GetMapping("/family/updatePre")
    @ApiOperation(value = "查询接口",notes = "家庭修改条件",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Family.class)
    })
    public R tpFamilyUpdate(@ApiParam(name = "家庭修改条件",value = "familyId")@RequestParam("familyId") String familyName){
       Family family = this.familyService.queryById(familyName);
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
    public R delete(@ApiParam(name = "患者删除条件",value = "familyId")@RequestParam("familyId") String familyName){
        try {
            this.familyService.delete(familyName);
        } catch (Exception e) {
            e.printStackTrace();
            R.ok("fale");
        }
        return R.ok("success");
    }
}
