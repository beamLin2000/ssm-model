package com.gxa.controller.work;


import com.gxa.dto.work.*;
import com.gxa.entity.tolls.Toll;
import com.gxa.entity.tolls.TollDrugs;
import com.gxa.entity.work.*;
import com.gxa.service.work.*;
import com.gxa.utils.OrderNo;
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
    private PatientDtoService patientService;

    @Autowired
    private WorkPatientDtoService workPatientDtoService;

    @Autowired
    private DrugDtoService drugDtoService;

    @Autowired
    private PhysicalDtoService physicalDtoService;

    @Autowired
    private MedicalRecordDtoService medicalRecordDtoService;

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
    @PostMapping("/work/patientList")
    @ResponseBody
    @ApiOperation(value = "点击接诊后的显示该病人所有数据的接口",notes = "就诊人信息")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = WorkPatient.class)
    })
    public R patientList(@RequestBody WorkSelectDto workSelectDto){

        if(!workSelectDto.getStatus().equals("未就诊")){
            return R.error("fail");
        }
        this.workPatientDtoService.updateStatus(workSelectDto.getIdCard());
        WorkPatientDto workPatientDto = this.workPatientDtoService.queryWorkPatientDtoByPhoneNum(workSelectDto.getIdCard());
        MedicalRecordDto medicalRecordDto = this.medicalRecordDtoService.queryMedicalRecordDtoByIdCard(workSelectDto.getIdCard());
        PhysicalDto physicalDto = this.physicalDtoService.queryPhysicalDtoByIdCard(workSelectDto.getIdCard());

        Map map = new HashMap();
        map.put("drugs",workPatientDto);
        map.put("medicalRecord",medicalRecordDto);
        map.put("physical",physicalDto);
        R r = new R();
        return r.ok(map);
    }
    //处方list  传一个string
    @PostMapping("/work/durglist")
    @ResponseBody
    @ApiOperation(value = "工作台的数据接口",notes = "西，成处方,中药处方")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Drug.class)
    })
    public R durgList(@RequestBody WorkSelectDto workSelectDto){

        List<DrugDto> drugDtos = this.drugDtoService.queryAllDrugDto(workSelectDto.getPrescriptionName());
        Map map = new HashMap();
        map.put("drugs",drugDtos);
        R r = new R();
        return r.ok(map);
    }



    //保存患者信息
    @PostMapping("/work/savePatient")
    @ResponseBody
    public R savePatient(@RequestBody PatientAllInfoDto dto){
        Date date = new Date();
        long time = date.getTime();
        date.setTime(time);

        //获取保存对象
        WorkPatient patient = dto.getPatient();
        MedicalRecordPhysical medicalRecordPhysical = dto.getMedicalRecordPhysical();
        List<MedicalCharge> medicalCharges = dto.getMedicalCharges();
        List<ItemCharge> itemCharges = dto.getItemCharge();
        Prescriptions prescriptions = dto.getPrescriptions();



        this.workPatientDtoService.updataPatientIncfo(patient);
        if ("初诊".equals(patient.getType())){
            this.workPatientDtoService.addPatientPhyInfo(medicalRecordPhysical);
        }
        this.workPatientDtoService.addPatientMedicalChargeInfo(medicalCharges);
        for (ItemCharge itemCharge :
                itemCharges) {
            this.workPatientDtoService.addPatientItemInfo(itemCharge);
        }

        this.workPatientDtoService.addprescriptionsInfo(prescriptions);
        String orderNum = OrderNo.orderNum();
        Toll toll = new Toll(1,orderNum ,"处方开立",patient.getName(),patient.getGender(),
                Integer.parseInt(patient.getAge()),patient.getPhone(),prescriptions.getDoctorName(),medicalRecordPhysical.getCreateTime(),prescriptions.getTotalMoney(),0);
        this.workPatientDtoService.addToll(toll,patient.getIdCard());
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

        R r = new R();


        return r.ok();
    }

}
