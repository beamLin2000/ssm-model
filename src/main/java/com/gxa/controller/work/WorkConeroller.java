package com.gxa.controller.work;

import com.alibaba.fastjson.JSON;
import com.gxa.dto.PatientDto;
import com.gxa.dto.WorkPatientDto;
import com.gxa.entity.patients.Patients;
import com.gxa.entity.work.*;
import com.gxa.service.work.PatientDtoService;
import com.gxa.service.work.WorkPatientDtoService;
import com.gxa.utils.R;
import com.hazelcast.internal.json.Json;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@Api(tags = {"工作台接口"})
public class WorkConeroller {

    @Autowired
    private PatientDtoService patientService;

    @Autowired
    private WorkPatientDtoService workPatientDtoService;

    //工作台list
    @GetMapping("/work/list")
    @ResponseBody
    @ApiOperation(value = "工作台的数据接口",notes = "工作台list")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Patient1.class)
    })
    public R workList(){

        Map map = new HashMap();

        List<PatientDto> patientDtos = this.patientService.queryAllPatientDto();

        map.put("drugs",patientDtos);
        R r = new R();
        return r.ok(map);
    }
    //处方患者信息
    @GetMapping("/work/patientList")
    @ResponseBody
    @ApiOperation(value = "工作台的数据接口",notes = "就诊人信息")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = WorkPatient.class)
    })
    public R patientList(String phoneNum,String status){

        WorkPatientDto workPatientDto = this.workPatientDtoService.queryWorkPatientDtoByPhoneNum(phoneNum,status);

        Map map = new HashMap();
        map.put("drugs",workPatientDto);
        R r = new R();
        return r.ok(map);
    }
    //处方list  传一个string
    @GetMapping("/work/durglist")
    @ResponseBody
    @ApiOperation(value = "工作台的数据接口",notes = "西,中药处方")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Drug.class)
    })
    public R durgList(String prescriptionName){
        System.out.println(prescriptionName
        );
        Drug drug = new Drug(1,"阿莫西林","1g*1","1000","0.16");
        Drug drug1 = new Drug(2,"减肥药复合袋","1g*1","1000","0.15");
        Drug drug2 = new Drug(3,"阿莫西林","1g*1","1000","0.18");
        List<Drug> list = new ArrayList<>();
        list.add(drug);
        list.add(drug1);
        list.add(drug2);
        Map map = new HashMap();
        map.put("drugs",list);
        R r = new R();
        return r.ok(map);
    }
    //体格信息
    @GetMapping("/work/physicalList")
    @ResponseBody
    @ApiOperation(value = "工作台的数据接口",notes = "体格信息")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Physical.class)
    })
    public R physicalList(){

        Physical physical  = new Physical(1,"36.50","36.50","36.50","36.50","36.50","36.50","36.50","36.50");
        Map map = new HashMap();
        map.put("physicals",physical);
        R r = new R();

        return r.ok(map);
    }
    //病历信息
    @GetMapping("/work/medicalRecordList")
    @ResponseBody
    @ApiOperation(value = "工作台的数据接口",notes = "病历信息")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = MedicalRecord.class)
    })
    public R medicalRecordList(){
        Date date = new Date();
        long time = date.getTime();
        date.setTime(time);
        MedicalRecord medicalRecord = new MedicalRecord(1,date,"头疼","现病史","既往史","过敏史",
                "个人史","家族史","辅助检查","治疗意见","备注");
        Map map = new HashMap();
        map.put("medicalRecords",medicalRecord);
        R r = new R();

        return r.ok(map);
    }


    //保存患者信息
    @PostMapping("/work/savePatient")
    @ResponseBody
    public R savePatient(@RequestBody String patient1){

        System.out.println(patient1);
        Patient1 patient = JSON.parseObject(patient1, Patient1.class);
        Drug drug = JSON.parseObject(patient1, Drug.class);
        Inspect inspect = JSON.parseObject(patient1, Inspect.class);
        CDrug cDrug = JSON.parseObject(patient1, CDrug.class);
        Physical physical = JSON.parseObject(patient1, Physical.class);
        MedicalRecord medicalRecord = JSON.parseObject(patient1, MedicalRecord.class);

        System.out.println(patient);
        System.out.println(drug);
//        System.out.println(drug);
        R r = new R();

        return r.ok();
    }
    //保存西、成处方信息
    @PostMapping("/work/saveDurg")
    @ResponseBody
    public R saveDurg(Drug drug){
        System.out.println(drug);
        R r = new R();

        return r.ok();
    }
    //保存中药处方
 @PostMapping("/work/saveTraditional")
    @ResponseBody
    public R saveTraditional (Drug drug){
     System.out.println(drug);
        R r = new R();

        return r.ok();
    }
    //保存检查项目
    @PostMapping("/work/saveInspect")
    @ResponseBody
    public R saveInspect(Inspect inspect){
        System.out.println(inspect);
        R r = new R();

        return r.ok();
    }
    //保存体格信息
@PostMapping("/work/saveMedical")
    @ResponseBody
    public R saveMedical(Physical physical){
    System.out.println(physical);
        R r = new R();

        return r.ok();
    }
    //保存病历信息
    @PostMapping("/work/saveMedicalRecord")
    @ResponseBody
    public R saveMedicalRecord(MedicalRecord medicalRecord){
        System.out.println(medicalRecord);
        R r = new R();

        return r.ok();
    }

}
