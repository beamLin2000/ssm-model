package com.gxa.controller.tolls;

import com.gxa.entity.patients.Family;
import com.gxa.entity.tolls.PatientDrugs;
import com.gxa.entity.tolls.Toll;
import com.gxa.entity.tolls.TollDrugs;
import com.gxa.entity.tolls.TollPatient;
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
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
    @ResponseBody
    @ApiOperation(value = "查找接口",notes = "状态查找缴费",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Toll.class)
    })
    public R tollStateList(@ApiParam(name = "状态查找信息", value = "tollState")@RequestParam("tollState") Integer tollState){
        List<Toll> tolls = this.tollService.queryByTollState(tollState);
        Map map = new HashMap();
        map.put("tolls",tolls);
        return R.ok(map);
    }

    @GetMapping("/toll/name")
    @ResponseBody
    @ApiOperation(value = "查找接口",notes = "姓名查找缴费",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Toll.class)
    })
    public R tollNameList(@ApiParam(name = "姓名查找信息", value = "tollName")String tollName){
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
    @ResponseBody
    @ApiOperation(value = "查询人员信息",notes = "人员信息",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = PatientDrugs.class)
    })
    public R PatientDrugs(@ApiParam(name = "人员id", value = "tollId")Integer tollId){
        PatientDrugs patientDrugs = this.patientDrugsService.queryByTollId(tollId);
        Map map = new HashMap();
        map.put("patientDrugs",patientDrugs);
        return R.ok(map);
    }

    @GetMapping("/toll/TollDrugs")
    @ResponseBody
    @ApiOperation(value = "查询项目明细",notes = "项目明细",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = TollDrugs.class)
    })
    public R TollDrugs(@ApiParam(name = "人员id", value = "tollId")Integer tollId){
        TollDrugs tollDrugs = this.tollDrugsService.queryByTollId(tollId);
        Map map = new HashMap();
        map.put("tollDrugs",tollDrugs);
        return R.ok(map);
    }

    @GetMapping("/toll/TollPatient")
    @ResponseBody
    @ApiOperation(value = "查询接诊信息",notes = "接诊信息",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = TollPatient.class)
    })
    public R TollPatient(@ApiParam(name = "人员id", value = "patientId")Integer patientId){
        TollPatient tollPatient = this.tollPatientService.queryByTollId(patientId);
        Map map = new HashMap();
        map.put("tollPatient",tollPatient);
        return R.ok(map);
    }

    @GetMapping("/toll/update_prescriptionPre")
    @ResponseBody
    @ApiOperation(value = "查询要修改的处方",notes = "处方修改",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = WorkPatient.class)
    })
    public R tollPrescriptionPre(@ApiParam(name = "要修改处方的信息", value = "tollId")String tollId){
        System.out.println(tollId);
        R r = new R();
        return r.ok();
    }

    @PutMapping("/toll/update_prescription")
    @ResponseBody
    @ApiOperation(value = "修改处方",notes = "处方修改",httpMethod = "PUT")
    public R tollPrescription(@ApiParam(name = "处方修改信息", value = "toll")Toll toll){
        System.out.println(toll);
        R r = new R();
        return r.ok();
    }

    @GetMapping("/toll/update_pharmaceuticalsPre")
    @ResponseBody
    @ApiOperation(value = "查询要修改的药品",notes = "药品修改",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Drug.class)
    })
    public R tollPharmaceuticalsPre(@ApiParam(name = "要修改药品的信息", value = "tollId")String tollId){
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
