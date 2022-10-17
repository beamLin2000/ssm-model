package com.gxa.controller.tolls;

import com.gxa.entity.patients.Family;
import com.gxa.entity.patients.Patients;
import com.gxa.entity.tolls.*;
import com.gxa.entity.work.Drug;
import com.gxa.entity.work.WorkPatient;
import com.gxa.service.toll.*;
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
    @Autowired
    private TollFinshService tollFinshService;

    @PostMapping("/toll/tollInquire")
    @ApiOperation(value = "查找接口",notes = "查找缴费",httpMethod = "POST")
    @ResponseBody
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Toll.class)
    })

    public R tollInquire(@RequestBody TollInquire tollInquire){

        String tollDate = tollInquire.getTollDateTime();
        System.out.println(tollDate);
        String firstDateTime =null;
        String lastDateTime = null;
        if (tollDate !=null && !"".equals(tollDate)){
            String[] dateTime = tollDate.split(",");
            firstDateTime = dateTime[0].trim();
            lastDateTime =  dateTime[1].trim();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date firstTime = simpleDateFormat.parse(firstDateTime);
                Date lastTime = simpleDateFormat.parse(lastDateTime);
                List<Toll> tolls = this.tollService.queryByInquire(firstTime,lastTime,tollInquire);
                Map map = new HashMap();
                map.put("tolls",tolls);
                return R.ok(map);
            } catch (ParseException e) {
                e.printStackTrace();
                return R.ok("fale");
            }
        }else {
            List<Toll> tolls = this.tollService.queryByInquires(tollInquire);
            Map map = new HashMap();
            map.put("tolls",tolls);
            return R.ok(map);
        }
    }


    @DeleteMapping("/toll/delete")
    @ResponseBody
    @ApiOperation(value = "删除接口",notes = "缴费删除",httpMethod = "DELETE")
    public R tollDelete(@ApiParam(name = "缴费删除条件",value = "tollNumber") String tollNumber){
        try {
            this.tollService.delete(tollNumber);
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

//    @GetMapping("/toll/PatientDrugs")
//    @ApiOperation(value = "查询人员信息",notes = "人员信息",httpMethod = "GET")
//    @ApiResponses({
//            @ApiResponse(code = 0,message = "ok",response = PatientDrugs.class)
//    })
//    public R PatientDrugs(@ApiParam(name = "查询条件", value = "tollNumber")@RequestParam("tollNumber") String tollNumber){
//        PatientDrugs patientDrugs = this.patientDrugsService.queryByTollId(tollNumber);
//        Map map = new HashMap();
//        map.put("patientDrugs",patientDrugs);
//        return R.ok(map);
//    }

    @GetMapping("/toll/TollDrugs")
    @ApiOperation(value = "查询项目明细",notes = "项目明细",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = TollDrugs.class)
    })
    public R TollDrugs(@ApiParam(name = "查询条件", value = "tollNumber")@RequestParam("tollNumber")String tollNumber){
        List<TollDrugs> tollDrugs = this.tollDrugsService.queryByTollId(tollNumber);
        PatientDrugs patientDrugs = this.patientDrugsService.queryByTollId(tollNumber);
        TollPatient tollPatient = this.tollPatientService.queryByTollId(tollNumber);
        Map map = new HashMap();

        map.put("tollDrugs",tollDrugs);
        map.put("patientDrugs",patientDrugs);
        map.put("tollPatient",tollPatient);
        return R.ok(map);
    }

    @GetMapping("/toll/TollPatient")
    @ApiOperation(value = "查询退费查看信息",notes = "退费信息",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = TollPatient.class)
    })
    public R TollPatient(@ApiParam(name = "查询条件", value = "tollNumber")@RequestParam("tollNumber") String tollNumber){
        List<TollDrugs> tollDrugs = this.tollDrugsService.queryByTollId(tollNumber);
        PatientDrugs patientDrugs = this.patientDrugsService.queryByTollId(tollNumber);
        TollPatient tollPatient = this.tollPatientService.queryByTollId(tollNumber);
        TollFinish tollFinish = this.tollFinshService.queryByTollId(tollNumber);
        Map map = new HashMap();
        map.put("tollDrugs",tollDrugs);
        map.put("patientDrugs",patientDrugs);
        map.put("tollPatient",tollPatient);
        map.put("tollFinish",tollFinish);
        return R.ok(map);
    }

    @PostMapping("/toll/TollFinish")
    @ResponseBody
    @ApiOperation(value = "收费提交信息",notes = "收费信息",httpMethod = "POST")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = TollFinish.class)
    })
    public R TollFinsh(@RequestBody TollFinish tollFinish){
        try {
            this.tollFinshService.addFinish(tollFinish);
        } catch (Exception e) {
            e.printStackTrace();
            R.ok("fale");
        }
        return R.ok("succes");
    }

    @GetMapping("/toll/TollDrugsNum")
    @ResponseBody
    @ApiOperation(value = "类型/订单查询信息",notes = "查询信息",httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = TollDrugs.class)
    })
    public R TollDrugsNum(@RequestParam String tollDrugsVer,String tollNumber){
        List<TollDrugs> tollDrugs= this.tollDrugsService.queryByTollVer(tollDrugsVer,tollNumber);
        Map map = new HashMap();
        map.put("tollDrugs",tollDrugs);
        return R.ok(map);
    }

//    @GetMapping("/toll/tollTime")
//    @ApiOperation(value = "时间查询信息",notes = "时间信息",httpMethod = "GET")
//    @ApiResponses({
//            @ApiResponse(code = 0,message = "ok",response = Toll.class)
//    })
//    public R tollTime(@ApiParam(name = "时间", value = "tollDateTime")@RequestParam String tollDateTimes){
//
//        if (tollDateTimes != null && !"null".equals(tollDateTimes)){
//            String firstDateTime= null;
//            String lastDateTime= null;
//            String[] dateTime = tollDateTimes.split(",");
//            firstDateTime = dateTime[0].trim();
//            lastDateTime = dateTime[1].trim();
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            try {
//
//                Date firstTime = simpleDateFormat.parse(firstDateTime);
//                Date lastTime = simpleDateFormat.parse(lastDateTime);
//                List<Toll> tolls = this.tollService.queryByDateTime(firstTime,lastTime);
//                Map map = new HashMap();
//                map.put("tolls",tolls);
//                return R.ok(map);
//            } catch (ParseException e) {
//                e.printStackTrace();
//                return R.ok("fale");
//            }
//        }
//        return null;
//    }


   /* @GetMapping("/toll/update_prescriptionPre")
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
    }*/
}
