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
    public R patientList(Patients patients){
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
    public R patientPhoneList(@ApiParam(name = "电话查找患者信息", value = "patientPhone")String patientPhone){
        Date date = new Date();
        long time = date.getTime();
        date.setTime(time);
        R r = new R();
        Patients patient = new Patients(1,100130,"李四",12,"男","17754138769",date,"李四");
        Patients patient1 = new Patients(1,100130,"李四",12,"男","17754138755",date,"李四");
        Patients patient2 = new Patients(1,100130,"李四",12,"男","17754138768",date,"李四");
        List<Patients> list = new ArrayList<>();
        list.add(patient);
        list.add(patient1);
        list.add(patient2);
        Map map = new HashMap();
        map.put("patient",list);

        return r.ok(map);
    }


    @PostMapping("/patient/add")
    @ResponseBody
    @ApiOperation(value = "添加接口",notes = "患者添加",httpMethod = "POST")
    public R patientAdd(@ApiParam(name = "患者添加信息", value = "patientAdd")Patients patients){
        Date date = new Date();
        long time = date.getTime();
        date.setTime(time);
        R r = new R();
        Patients patient2 = new Patients(1,100130,"李四",12,"男","17754138768",date,"李四");
        List<Patients> list = new ArrayList<>();

        list.add(patient2);
        Map map = new HashMap();
        map.put("patient",list);

        return r.ok(map);
    }

    @GetMapping("/patient/updatePre")
    @ResponseBody
    @ApiOperation(value = "查询接口",notes = "患者修改查询",httpMethod = "GET")
    public R tpPatientUpdate(@ApiParam(name = "患者修改条件",value = "patientId") Integer patientId){
        R r = new R();
        this.patientService.tpPatientUpdate(patientId);
        R.ok("success");
        return r;
    }

    @PutMapping("/patient/update")
    @ResponseBody
    @ApiOperation(value = "修改接口",notes = "患者修改",httpMethod = "PUT")
    public R patientUpdate(@ApiParam(name = "患者修改",value = "patients") Patients patients){
        Date date = new Date();
        long time = date.getTime();
        date.setTime(time);
        R r = new R();
        Patients patient = new Patients(1,100130,"李四",12,"男","17754138769",date,"李四");
        Patients patient1 = new Patients(1,100130,"李四",12,"男","17754138755",date,"李四");
        Patients patient2 = new Patients(1,100130,"李四",12,"男","17754138768",date,"李四");
        List<Patients> list = new ArrayList<>();
        list.add(patient);
        list.add(patient1);
        list.add(patient2);
        Map map = new HashMap();
        map.put("patient",list);

        return r.ok(map);
    }


    @DeleteMapping("/patient/delete")
    @ResponseBody
    @ApiOperation(value = "删除接口",notes = "患者删除",httpMethod = "DELETE")
    public R patientDelete(@ApiParam(name = "患者删除条件",value = "patientId") Integer patientId){
        R r = new R();
        this.patientService.tpPatientUpdate(patientId);
        R.ok("success");
        return r;
    }


    @GetMapping("/family/list")
    @ApiOperation(value = "查找接口",notes = "查找家庭",httpMethod = "GET")
    public R familyList(@ApiParam(name = "患者编号查询条件",value = "patientNumber") Integer patientNumber){
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
        this.patientService.tpPatientUpdate(patientNumber);
        R.ok("success");
        return r;

    }

    @GetMapping("/family/updatePre")
    @ResponseBody
    @ApiOperation(value = "查询接口",notes = "家庭修改条件",httpMethod = "GET")
    public R tpFamilyUpdate(@ApiParam(name = "家庭修改条件",value = "familyId") Integer familyId){
        R r = new R();
        this.familyService.tpFamilyUpdate(familyId);
        R.ok("success");
        return r;
    }


    @PutMapping("/family/update")
    @ResponseBody
    @ApiOperation(value = "修改接口",notes = "家庭修改",httpMethod = "PUT")
    public R familyAddUpdate(@ApiParam(name = "患者修改",value = "familyAdd") FamilyAdd familyAdd){
        R r = new R();
        this.familyService.familyAddUpdate(familyAdd);
        R.ok("success");
        return r;
    }


    @PostMapping("/family/add")
    @ResponseBody
    @ApiOperation(value = "添加接口",notes = "家庭添加",httpMethod = "POST")
    public R add(@ApiParam(name = "家庭添加信息", value = "familyAdd")FamilyAdd familyAdd){
        R r = new R();
        this.familyService.add(familyAdd);
        R.ok("success");
        return r;
    }

    @DeleteMapping("/family/delete")
    @ResponseBody
    @ApiOperation(value = "删除接口",notes = "家庭删除",httpMethod = "DELETE")
    public R delete(@ApiParam(name = "患者删除条件",value = "familyId") Integer familyId){
        R r = new R();
        this.familyService.tpFamilyUpdate(familyId);
        R.ok("success");
        return r;
    }
}
