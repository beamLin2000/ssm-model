package com.gxa.controller.work;

import com.gxa.entity.patients.Patients;
import com.gxa.entity.work.*;
import com.gxa.service.work.Patient1Service;
import com.gxa.utils.R;
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
    private Patient1Service patient1Service;

    //工作台list
    @GetMapping("/work/list")
    @ResponseBody
    @ApiOperation(value = "工作台的数据接口",notes = "工作台list")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Patient1.class)
    })
    public R workList(Integer page,Integer limit){
        Date date = new Date();
//        long time = date.getTime();
//        date.setTime(time);
//        Patient1 patient = new Patient1(1,"李四","18","nan","已就诊",date,"beam","13256485216");
//        Patient1 patient1 = new Patient1(2,"ww","18","nan","已就诊",date,"beam","13256485216");
//        Patient1 patient2 = new Patient1(3,"zn","18","nan","已就诊",date,"beam","13256485216");
//        Patient1 patient3 = new Patient1(4,"zs","18","nan","已就诊",date,"beam","13256485216");
//        Patient1 patient4 = new Patient1(5,"qq","18","nan","已就诊",date,"beam","13256485216");
//        Patient1 patient5 = new Patient1(6,"ht","18","nan","已就诊",date,"beam","13256485216");
//        List<Patient1> list = new ArrayList<>();
//        list.add(patient);
//        list.add(patient1);
//        list.add(patient2);
//        list.add(patient3);
//        list.add(patient4);
//        list.add(patient5);

        List<Patients> patient1s = this.patient1Service.queryAllPatient1();

        Map map = new HashMap();
        map.put("drugs",patient1s);
        map.put("username","username");
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
    public R patientList(Integer id){
        Date date = new Date();
        long time = date.getTime();
        date.setTime(time);
        Address address = new Address("四川省","成都市","武侯区大石西路");
        WorkPatient workPatient = new WorkPatient(1,"ZS","21542121","20",date,"男","123115464","510**************000","复诊",address,"流行性感冒","少吃肉");
        List<WorkPatient> list = new ArrayList<>();
        list.add(workPatient);
        Map map = new HashMap();
        map.put("drugs",list);
        R r = new R();
        return r.ok(map);
    }
    //处方list  传一个string
    @GetMapping("/work/durglist")
    @ResponseBody
    @ApiOperation(value = "工作台的数据接口",notes = "西，成处方,中药处方")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Drug.class)
    })
    public R durgList(String prescriptionName){
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
    public R savePatient(@RequestBody Patient1 patient1){
        System.out.println(patient1);
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
