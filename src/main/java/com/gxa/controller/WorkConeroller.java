package com.gxa.controller;

import com.gxa.entity.work.*;
import com.gxa.utils.R;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@Api(tags = {"工作台接口"})
public class WorkConeroller {
    @GetMapping("/work/list")
    @ResponseBody
    public R patientList(){
        Date date = new Date();
        long time = date.getTime();
        date.setTime(time);
        Patient patient = new Patient(1,"李四","18","nan","已就诊",date,"全科","beam","13256485216");
        Patient patient1 = new Patient(2,"ww","18","nan","已就诊",date,"全科","beam","13256485216");
        Patient patient2 = new Patient(3,"zn","18","nan","已就诊",date,"全科","beam","13256485216");
        Patient patient3 = new Patient(4,"zs","18","nan","已就诊",date,"全科","beam","13256485216");
        Patient patient4 = new Patient(5,"qq","18","nan","已就诊",date,"全科","beam","13256485216");
        Patient patient5 = new Patient(6,"ht","18","nan","已就诊",date,"全科","beam","13256485216");
        List<Patient> list = new ArrayList<>();
        list.add(patient);
        list.add(patient1);
        list.add(patient2);
        list.add(patient3);
        list.add(patient4);
        list.add(patient5);

        Map map = new HashMap();
        map.put("drugs",list);
        R r = new R();
        return r.ok(map);
    }
    @GetMapping("/work/list01")
    @ResponseBody
    public R patientList01(Integer id){
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
    @GetMapping("/work/durglist0")
    @ResponseBody
    public R durgList0(){
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
    @GetMapping("/work/durglist1")
    @ResponseBody
    public R durgList1(){
        Drug drug = new Drug(1,"阿莫西林","1g*1","1000","0.16");
        Drug drug1 = new Drug(2,"减肥药复合袋","1g*1","1000","0.15");
        Drug drug2 = new Drug(3,"阿莫西林","1g*1","1000","0.18");
        List<Drug> list = new ArrayList<>();
        list.add(drug);
        list.add(drug1);
        list.add(drug2);
        Map map = new HashMap();
        map.put("list",list);
        R r = new R();
        return r.ok(map);
    }

    @GetMapping("/work/durglist2")
    @ResponseBody
    public R durgList2(){
        Inspect drug = new Inspect(1,"局部推拿","检查费","次","20");
        Inspect drug1 = new Inspect(2,"煎药费","材料费","次","20");
        Inspect drug2 = new Inspect(3,"拔牙","治疗费","次","100");
        List<Inspect> drugs = new ArrayList<>();
        drugs.add(drug);
        drugs.add(drug1);
        drugs.add(drug2);
        Map map = new HashMap();
        map.put("drugs",drugs);
        R r = new R();
        return r.ok(map);
    }
    @GetMapping("/work/prescriptionlist")
    @ResponseBody
    public R prescription(){
        Date date = new Date();
        long time = date.getTime();
        date.setTime(time);
        PrescriptionTemplate template = new PrescriptionTemplate(1,"rz2000005","处方模板名称","通用","西/成药处方","私人模板","心悸",date,"王冕");
        Map map = new HashMap();
        map.put("template",template);
        R r = new R();

        return r.ok(map);
    }
    @GetMapping("/work/prescriptionDetailsList01")
    @ResponseBody
    public R prescriptionDetailsList(){
        Date date = new Date();
        long time = date.getTime();
        date.setTime(time);
        PrescriptionDetails details = new PrescriptionDetails(1,"1","头孢丙烯分散片","1片","温水吞服","一天三次","2天","6片","6元");
        Map map = new HashMap();
        map.put("details",details);
        R r = new R();

        return r.ok(map);
    }
    @GetMapping("/work/medicalRecordList")
    @ResponseBody
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
    @GetMapping("/work/prescriptionDetailsList02")
    @ResponseBody
    public R physicalList(){

        Physical physical  = new Physical(1,"36.50","36.50","36.50","36.50","36.50","36.50","36.50","36.50");
        Map map = new HashMap();
        map.put("physicals",physical);
        R r = new R();

        return r.ok(map);
    }


    @PostMapping ("/work/prescriptionDetailsSave")
    @ResponseBody
    public R prescriptionDetailsSave(PrescriptionDetails prescriptionDetails){

        R r = new R();

        return r.ok();
    }
    @PostMapping ("/work/physicalSave")
    @ResponseBody
    public R physicalSave(PrescriptionDetails prescriptionDetails){

        R r = new R();

        return r.ok();
    }
    @PostMapping ("/work/medicalRecordSave")
    @ResponseBody
    public R medicalRecordSave(PrescriptionDetails prescriptionDetails){

        R r = new R();

        return r.ok();
    }



}
