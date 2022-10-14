package com.gxa.controller.tolls;

import com.gxa.entity.tolls.Toll;
import com.gxa.service.toll.TollService;
import com.gxa.utils.R;
import com.gxa.utils.systemSettings.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Api(tags = {"收费管理"})
public class TollController {
    @Autowired
    private TollService tollService;

    @GetMapping("/toll/state")
    @ResponseBody
    @ApiOperation(value = "查找接口",notes = "状态查找缴费",httpMethod = "GET")
    public R tollStateList(@ApiParam(name = "状态查找信息", value = "tollState")Integer tollState){
        System.out.println(tollState);
        R r = new R();
        return r.ok();
    }

    @GetMapping("/toll/name")
    @ResponseBody
    @ApiOperation(value = "查找接口",notes = "姓名查找缴费",httpMethod = "GET")
    public R tollNameList(@ApiParam(name = "姓名查找信息", value = "tollName")String tollName){
        System.out.println(tollName);
        R r = new R();
        return r.ok();
    }

    @DeleteMapping("/toll/delete")
    @ResponseBody
    @ApiOperation(value = "删除接口",notes = "缴费删除",httpMethod = "DELETE")
    public Result tollDelete(@ApiParam(name = "缴费删除条件",value = "tollId") Integer tollId){
        System.out.println(tollId);
        Result result = new Result(1,"成功",1,tollId);
        this.tollService.delete(tollId);
        return result;
    }

    @PutMapping("/toll/update_state")
    @ResponseBody
    @ApiOperation(value = "修改接口",notes = "状态修改",httpMethod = "PUT")
    public R tollState(@ApiParam(name = "状态修改信息", value = "tollId")String tollId){
        System.out.println(tollId);
        R r = new R();
        return r.ok();
    }

    @GetMapping("/toll/update_prescriptionPre")
    @ResponseBody
    @ApiOperation(value = "查询要修改的处方",notes = "处方修改",httpMethod = "GET")
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
    public R tollPharmaceuticalsPre(@ApiParam(name = "要修改药品的信息", value = "tollId")String tollId){
        System.out.println(tollId);
        R r = new R();
        return r.ok();
    }

    @PutMapping("/toll/update_pharmaceuticals")
    @ResponseBody
    @ApiOperation(value = "修改处方",notes = "处方修改",httpMethod = "PUT")
    public R tollPharmaceuticals(@ApiParam(name = "处方修改信息", value = "toll")Toll toll){
        System.out.println(toll);
        R r = new R();
        return r.ok();
    }

    @GetMapping("/toll/PatientDrugs")
    @ResponseBody
    @ApiOperation(value = "查询人员信息",notes = "人员信息",httpMethod = "GET")
    public R PatientDrugs(@ApiParam(name = "人员id", value = "patientId")Integer patientId){
        System.out.println(patientId);
        R r = new R();
        return r.ok();
    }

    @GetMapping("/toll/TollDrugs")
    @ResponseBody
    @ApiOperation(value = "查询项目明细",notes = "项目明细",httpMethod = "GET")
    public R TollDrugs(@ApiParam(name = "人员id", value = "patientId")Integer patientId){
        System.out.println(patientId);
        R r = new R();
        return r.ok();
    }

    @GetMapping("/toll/TollPatient")
    @ResponseBody
    @ApiOperation(value = "查询接诊信息",notes = "接诊信息",httpMethod = "GET")
    public R TollPatient(@ApiParam(name = "人员id", value = "patientId")Integer patientId){
        System.out.println(patientId);
        R r = new R();
        return r.ok();
    }
}
