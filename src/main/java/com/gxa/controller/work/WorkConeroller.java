package com.gxa.controller.work;


import com.alibaba.fastjson.JSON;
import com.gxa.dto.work.*;
import com.gxa.entity.tolls.Toll;
import com.gxa.entity.tolls.TollDrugs;
import com.gxa.entity.work.*;
import com.gxa.service.work.*;
import com.gxa.utils.OrderNo;
import com.gxa.utils.R;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.swing.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller

@Api(tags = {"工作台接口"})
public class WorkConeroller {

    @Autowired
    private PatientDtoService patientService;

    @Autowired
    private WorkPatientDtoService workPatientDtoService;

    @Autowired
    private DrugDtoService drugDtoService;

    @Autowired
    private PhysicalDtoService physicalDtoService;

    @Autowired
    private MedicalRecordDtoService medicalRecordDtoService;

    @Autowired
    private ConditionSelectService conditionSelectService;

    @Autowired
    private ElectMedicalRecordDtoService electMedicalRecordDtoService;

    //工作台list
    @GetMapping("/work/list")
    @ResponseBody
    @ApiOperation(value = "工作台的数据接口",notes = "工作台list")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = PatientDto.class)
    })
    public R workList(){
        System.out.println("11111");
            Map map = new HashMap();
            List<PatientDto> patientDtos = this.patientService.queryAllPatientDto();
            map.put("drugs",patientDtos);
        System.out.println(patientDtos);
            R r = new R();
            return r.ok(map);
    }
    //处方患者信息
    @PostMapping("/work/patientList")
    @ResponseBody
    @ApiOperation(value = "点击接诊后的显示该病人所有数据的接口",notes = "就诊人信息")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = WorkPatientDto.class)
    })
    public R patientList(@RequestBody WorkSelectDto workSelectDto){

        if(!workSelectDto.getStatus().equals("未就诊")){
            return R.error("fail");
        }
        WorkPatientDto workPatientDto = null;
//        this.workPatientDtoService.updateStatus(workSelectDto.getIdCard());
        if (workSelectDto.getIdCard()!=null&&!"".equals(workSelectDto.getIdCard())){
             workPatientDto = this.workPatientDtoService.queryWorkPatientDtoByPhoneNum(workSelectDto.getIdCard());
        }else {
             workPatientDto = this.workPatientDtoService.queryWorkPatientDtoByForm(workSelectDto.getRegistrationForm());
        }

        MedicalRecordDto medicalRecordDto = this.medicalRecordDtoService.queryMedicalRecordDtoByIdCard(workPatientDto.getIdcard());
        PhysicalDto physicalDto = this.physicalDtoService.queryPhysicalDtoByIdCard(workPatientDto.getIdcard());

        Map map = new HashMap();
        map.put("drugs",workPatientDto);
        map.put("medicalRecord",medicalRecordDto);
        map.put("physical",physicalDto);
        R r = new R();
        return r.ok(map);
    }
    @PostMapping("/work/return")
    @ResponseBody
    @ApiOperation(value = "点击接诊后的点击返回",notes = "传入身份证号")
    public R patientList0(@RequestBody WorkSelectDto workSelectDto){
        this.workPatientDtoService.updateStatusIfReturn(workSelectDto.getIdCard());
        R r = new R();
        return r.ok();
    }
    //处方list  传一个string
    @PostMapping("/work/durglist")
    @ResponseBody
    @ApiOperation(value = "工作台的接诊的药品渲染",notes = "传西/成药或中药或检查项目" +
            " \"prescriptionName\": \"中药\"")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = DrugDto.class)
    })
    public R durgList(@RequestBody WorkSelectDto workSelectDto){
        Map map = new HashMap();
        if (workSelectDto.getPrescriptionName().equals("检查项目")){
            List<Inspect> inspects = this.drugDtoService.queryAllInspect();
            map.put("inspectordrugs",inspects);
        }else {
            List<DrugDto> drugDtos = this.drugDtoService.queryAllDrugDto(workSelectDto.getPrescriptionName());
            map.put("inspectordrugs",drugDtos);
        }
        R r = new R();
        return r.ok(map);
    }

    @PostMapping("/work/chargeList")
    @ResponseBody
    @ApiOperation(value = "工作台的查看患者信息",notes = "收费的渲染")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Drug.class)
    })
    public R chargeList(@RequestBody Relation relation){
        List<Charge> charges = this.workPatientDtoService.queryChargeList(relation);
        Map map = new HashMap<>();
        map.put("list",charges);
        return R.ok(map);
    }


    @PostMapping("/work/ConditionList")
    @ResponseBody
    @ApiOperation(value = "工作台的搜索条件查询数据接口",notes = "搜索条件")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = PatientDto.class)
    })
    public R workListByCondition(@RequestBody ConditionSelectDto conditionSelectDto){
        String startTime = null;
        String endTime = null;
        Date startDate = null;
        Date endDate = null;

        String selectTime = conditionSelectDto.getSelectTime();
        String status = conditionSelectDto.getStatus();
        String patientName = conditionSelectDto.getPatientName();

        if (selectTime != null && !selectTime.equals("")){
            String[] times = selectTime.split(",");
            startTime = times[0];
            endTime = times[1];

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                startDate = sdf.parse(selectTime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            try {
                endDate = sdf.parse(endTime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        List<PatientDto> patientDtos = this.conditionSelectService.queryPatientByCondition(startDate,endDate,status,patientName);

        Map map = new HashMap();
        map.put("patientDtos",patientDtos);

        R r = new R();
        return r.ok(map);
    }

    @PostMapping("/work/medicalRecordList")
    @ResponseBody
    @ApiOperation(value = "电子病历病历的数据接口",notes = "电子病历左边病历")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Drug.class)
    })
    public R medicalRecordList(@RequestBody WorkSelectDto workSelectDto){

        List<ElectMedicalRecordDto> electMedicalRecordDtos = this.electMedicalRecordDtoService.queryAllMedicalRecord(workSelectDto.getIdCard());
        Map map = new HashMap();
        map.put("electMedicalRecordDtos",electMedicalRecordDtos);
        R r = new R();
        return r.ok(map);
    }



    //保存患者信息
    @PostMapping("/work/savePatient")
    @ResponseBody
    @ApiOperation(value = "工作台的接诊里面的",notes = "保存")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = PatientAllInfoDto.class)
    })
    public R savePatient(@RequestBody PatientAllInfoDto dto){
        //获取请求时间
        Date date = new Date();
        long time = date.getTime();
        date.setTime(time);
        String orderNum = OrderNo.orderNum();
        //获取保存对象
        WorkPatient patient = dto.getPatient();
        MedicalRecordPhysical medicalRecordPhysical = dto.getMedicalRecordPhysical();
        List<MedicalCharge> medicalCharges = dto.getMedicalCharges();
        List<ItemCharge> itemCharges = dto.getItemCharge();
        Prescriptions prescriptions = dto.getPrescriptions();
        //保存对象的关联信息
        Relation relation = dto.getRelation();
        for (MedicalCharge m :
                medicalCharges) {
            m.setOrderNum(orderNum);
        }
        //修改给患者的医嘱，建议
        this.workPatientDtoService.updataPatientIncfo(patient);
        //
            this.workPatientDtoService.addPatientPhyInfo(medicalRecordPhysical,relation);

        this.workPatientDtoService.addPatientMedicalChargeInfo(medicalCharges,relation);
        for (ItemCharge itemCharge :
                itemCharges) {
            this.workPatientDtoService.addPatientItemInfo(itemCharge,relation);
        }

        this.workPatientDtoService.addprescriptionsInfo(prescriptions,relation);

        Toll toll = new Toll(1,orderNum ,"处方开立",patient.getName(),patient.getGender(),
                patient.getAge(),patient.getPhone(),prescriptions.getDoctorName(),relation.getCreateTime(),prescriptions.getTotalMoney(),0,"");
        this.workPatientDtoService.addToll(toll,relation);
        List<TollDrugs> tollDrugsList = new ArrayList<>();
        for (ItemCharge itemCharge :
                itemCharges) {
            TollDrugs tollDrugs = new TollDrugs(1,itemCharge.getType(),itemCharge.getName(),itemCharge.getTotalUnivalent(),
                    itemCharge.getNum(),"次",itemCharge.getTotalUnivalent(),orderNum);
            tollDrugsList.add(tollDrugs);
        }

        for (MedicalCharge charge :
                medicalCharges) {
            TollDrugs tollDrugs = new TollDrugs(1,charge.getType(),charge.getName(),charge.getPrice(),
                    Integer.parseInt(charge.getTotal()),"次",charge.getTotalPrice(),orderNum);
            tollDrugsList.add(tollDrugs);
        }
        for (TollDrugs drugs :
                tollDrugsList) {
            this.workPatientDtoService.addTollDurgs(drugs,relation);
        }
        Charge charge = new Charge("处方收费","未收费",orderNum,prescriptions.getTotalMoney(),0.0,"","",null);
        this.workPatientDtoService.addCharge(charge,relation);

        R r = new R();


        return r.ok();
    }

}
