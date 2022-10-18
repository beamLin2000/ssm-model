package com.gxa.controller.work;

import com.gxa.dto.work.*;
import com.gxa.entity.work.*;
import com.gxa.service.work.*;
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


    @PostMapping("/work/ConditionList")
    @ResponseBody
    @ApiOperation(value = "工作台的搜索条件查询数据接口",notes = "搜索条件")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Drug.class)
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
