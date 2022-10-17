package com.gxa.controller.tolls;

import com.gxa.entity.patients.Family;
import com.gxa.entity.patients.Patients;
import com.gxa.entity.tolls.*;
import com.gxa.entity.work.Drug;
import com.gxa.entity.work.WorkPatient;
import com.gxa.service.toll.PatientDrugsService;
import com.gxa.service.toll.TollDrugsService;
import com.gxa.service.toll.TollPatientService;
import com.gxa.service.toll.TollService;
import com.gxa.utils.R;
import com.gxa.utils.systemSettings.Result;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(tags = {"收费管理"})
public class TollController {
    @Autowired
    private TollService tollService;
    @Autowired
    private PatientDrugsService patientDrugsService;
    @Autowired
    private TollDrugsService tollDrugsService;
    @Autowired
    private TollPatientService tollPatientService;

    @GetMapping("/toll/state")
    @ApiOperation(value = "查找接口",notes = "状态查找缴费",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Toll.class)
    })
    public R tollStateList(@ApiParam(name = "tollState", value = "状态查找信息")@RequestParam("tollState") Integer tollState){
        List<Toll> tolls = this.tollService.queryByTollState(tollState);
        Map map = new HashMap();
        map.put("tolls",tolls);
        return R.ok(map);
    }

    @GetMapping("/toll/name")
    @ApiOperation(value = "查找接口",notes = "姓名查找缴费",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Toll.class)
    })
    public R tollNameList(@ApiParam(name = "姓名查找信息", value = "tollName")@RequestParam("tollName") String tollName){
        List<Toll> tolls = this.tollService.queryByTollName(tollName);
        Map map = new HashMap();
        map.put("tolls",tolls);
        return R.ok(map);
    }

    @DeleteMapping("/toll/delete")
    @ResponseBody
    @ApiOperation(value = "删除接口",notes = "缴费删除",httpMethod = "DELETE")
    public R tollDelete(@ApiParam(name = "缴费删除条件",value = "tollId") Integer tollId){
        try {
            this.tollService.delete(tollId);
        } catch (Exception e) {
            e.printStackTrace();
            R.ok("fale");
        }
        return R.ok("success");
    }


//    @PutMapping("/toll/update_state")
//    @ResponseBody
//    @ApiOperation(value = "修改接口",notes = "状态修改",httpMethod = "PUT")
//    public R tollState(@ApiParam(name = "状态修改信息", value = "tollId")String tollId){
//        System.out.println(tollId);
//        R r = new R();
//        return r.ok();
//    }

    @GetMapping("/toll/PatientDrugs")

    @ApiOperation(value = "查询人员信息",notes = "人员信息",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = PatientDrugs.class)
    })
    public R PatientDrugs(@ApiParam(name = "人员id", value = "tollId")@RequestParam("tollId") Integer tollId){
        PatientDrugs patientDrugs = this.patientDrugsService.queryByTollId(tollId);
        Map map = new HashMap();
        map.put("patientDrugs",patientDrugs);
        return R.ok(map);
    }

    @GetMapping("/toll/TollDrugs")
    @ApiOperation(value = "查询项目明细",notes = "项目明细",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = TollDrugs.class)
    })
    public R TollDrugs(@ApiParam(name = "人员id", value = "tollId")@RequestParam("tollId") Integer tollId){
        TollDrugs tollDrugs = this.tollDrugsService.queryByTollId(tollId);
        Map map = new HashMap();
        map.put("tollDrugs",tollDrugs);
        return R.ok(map);
    }

    @GetMapping("/toll/TollPatient")
    @ApiOperation(value = "查询接诊信息",notes = "接诊信息",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = TollPatient.class)
    })
    public R TollPatient(@ApiParam(name = "人员id", value = "patientId")@RequestParam("patientId") Integer patientId){
        TollPatient tollPatient = this.tollPatientService.queryByTollId(patientId);
        Map map = new HashMap();
        map.put("tollPatient",tollPatient);
        return R.ok(map);
    }

    @GetMapping("/toll/TollList")

    @ApiOperation(value = "订单编号/姓名查询信息",notes = "查询信息",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Toll.class)
    })
    public R TollList(@ApiParam(name = "订单编号/姓名查询信息加状态", value = "tollNumberNameState")@RequestParam TollNumberNameState tollNumberNameState){
        String tollNumberName = tollNumberNameState.getTollNumberName();
        Integer tollState = tollNumberNameState.getTollState();
        List<Toll> toll = this.tollService.queryByTollNumberName(tollNumberName,tollState);
        Map map = new HashMap();
        map.put("toll",toll);
        return R.ok(map);

    }

    @GetMapping("/toll/tollTime")
    @ApiOperation(value = "时间查询信息",notes = "时间信息",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Toll.class)
    })
    public R tollTime(@ApiParam(name = "时间", value = "tollDateTime")@RequestParam String tollDateTime){
        if (tollDateTime != null && !"null".equals(tollDateTime)){
            String firstDateTime= null;
            String lastDateTime= null;
            String[] dateTime = tollDateTime.split(",");
            firstDateTime = dateTime[0].trim();
            lastDateTime = dateTime[1].trim();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {

                Date firstTime = simpleDateFormat.parse(firstDateTime);
                Date lastTime = simpleDateFormat.parse(lastDateTime);
                List<Toll> tolls = this.tollService.queryByDateTime(firstTime,lastTime);
                Map map = new HashMap();
                map.put("tolls",tolls);
                return R.ok(map);
            } catch (ParseException e) {
                e.printStackTrace();
                return R.ok("fale");
            }
        }
        return null;
    }

    @GetMapping("/toll/update_prescriptionPre")

    @ApiOperation(value = "查询要修改的处方",notes = "处方修改",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = WorkPatient.class)
    })
    public R tollPrescriptionPre(@ApiParam(name = "要修改处方的信息", value = "tollId")@RequestParam String tollId){
        System.out.println(tollId);
        R r = new R();
        return r.ok();
    }

    @PutMapping("/toll/update_prescription")
    @ApiOperation(value = "修改处方",notes = "处方修改",httpMethod = "PUT")
    public R tollPrescription(@ApiParam(name = "处方修改信息", value = "toll")@RequestBody Toll toll){
        System.out.println(toll);
        R r = new R();
        return r.ok();
    }

    @GetMapping("/toll/update_pharmaceuticalsPre")
    @ApiOperation(value = "查询要修改的药品",notes = "药品修改",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Drug.class)
    })
    public R tollPharmaceuticalsPre(@ApiParam(name = "要修改药品的信息", value = "tollId")@RequestParam String tollId){
        System.out.println(tollId);
        R r = new R();
        return r.ok();
    }

    @PutMapping("/toll/update_pharmaceuticals")
    @ResponseBody
    @ApiOperation(value = "修改药品",notes = "药品修改",httpMethod = "PUT")
    public R tollPharmaceuticals(@ApiParam(name = "处方修改信息", value = "toll")Toll toll){
        System.out.println(toll);
        R r = new R();
        return r.ok();
    }
}
