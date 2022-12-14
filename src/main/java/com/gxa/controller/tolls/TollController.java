package com.gxa.controller.tolls;


import com.gxa.entity.tolls.*;
import com.gxa.service.toll.*;
import com.gxa.utils.R;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private SurchargesService surchargesService;

    //缴费首页搜索条件查找表toll
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
        //if循环查询时间非空，不然前端渲染报错
        if (tollDate !=null && !"".equals(tollDate)){

            String tollType = tollInquire.getTollType();
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

    //缴费首页选择删除
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

    @PostMapping("/toll/TollDrugs")
    @ResponseBody
    @ApiOperation(value = "查询项目明细",notes = "项目明细",httpMethod = "POST")
    @ApiResponses({
            @ApiResponse(code = 0,message = "tollPatient",response = TollPatient.class),
            @ApiResponse(code = 1,message = "tollDrugs",response = TollDrugs.class),
            @ApiResponse(code = 2,message = "patientDrugs",response = PatientDrugs.class),
            @ApiResponse(code = 3,message = "tollFinish",response = TollFinish.class),
    })
    public R tollDrugs(@ApiParam(name = "查询条件", value = "tollNumber")@RequestBody TollNumbers tollNumbers){
        String tollNumber= tollNumbers.getTollNumber();
//        System.out.println(tollNumber);
        List<TollDrugs> tollDrugs = this.tollDrugsService.queryByTollId(tollNumber);
        PatientDrugs patientDrugs = this.patientDrugsService.queryByTollId(tollNumber);
        TollPatient tollPatient = this.tollPatientService.queryByTollId(tollNumber);
        List<Surcharges> surcharges = this.surchargesService.queryByTollId(tollNumber);
        Map map = new HashMap();

        map.put("tollDrugs",tollDrugs);
        map.put("patientDrugs",patientDrugs);
        map.put("tollPatient",tollPatient);
        map.put("surcharges",surcharges);
        return R.ok(map);
    }

    @PostMapping("/toll/TollPatient")
    @ResponseBody
    @ApiOperation(value = "查询退费查看信息",notes = "退费信息",httpMethod = "POST")
    @ApiResponses({
            @ApiResponse(code = 0,message = "tollPatient",response = TollPatient.class),
            @ApiResponse(code = 1,message = "tollDrugs",response = TollDrugs.class),
            @ApiResponse(code = 2,message = "patientDrugs",response = PatientDrugs.class),
            @ApiResponse(code = 3,message = "tollFinish",response = TollFinish.class),
            @ApiResponse(code = 4,message = "surcharges",response = Surcharges.class)
    })
    public R tollPatient(@RequestBody TollNumbers tollNumbers){
        String tollNumber= tollNumbers.getTollNumber();
        List<TollDrugs> tollDrugs = this.tollDrugsService.queryByTollId(tollNumber);
        PatientDrugs patientDrugs = this.patientDrugsService.queryByTollId(tollNumber);
        TollPatient tollPatient = this.tollPatientService.queryByTollId(tollNumber);
        TollFinish tollFinish = this.tollFinshService.queryByTollId(tollNumber);
        List<Surcharges> surcharges = this.surchargesService.queryByTollId(tollNumber);
        Map map = new HashMap();
        map.put("tollDrugs",tollDrugs);
        map.put("patientDrugs",patientDrugs);
        map.put("tollPatient",tollPatient);
        map.put("tollFinish",tollFinish);
        map.put("surcharges",surcharges);
        return R.ok(map);
    }

    @PostMapping("/toll/TollFinish")
    @ResponseBody
    @ApiOperation(value = "收费提交信息",notes = "收费信息",httpMethod = "POST")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = TollFinish.class)
    })
    public R tollFinsh(@RequestBody TollFinish tollFinish){
        try {
            this.tollFinshService.addFinish(tollFinish);
        } catch (Exception e) {
            e.printStackTrace();
            R.ok("fale");
        }
        return R.ok("succes");
    }

    @PostMapping("/toll/TollDrugsNum")
    @ResponseBody
    @ApiOperation(value = "类型/订单查询信息",notes = "查询信息",httpMethod = "POST")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = TollDrugs.class)
    })
    public R tollDrugsNum(@RequestBody TollVerNumber tollVerNumber){
        String tollDrugsVer = tollVerNumber.getTollDrugsVer();
        String tollNumber = tollVerNumber.getTollNumber();
        List<TollDrugs> tollDrugs= this.tollDrugsService.queryByTollVer(tollDrugsVer,tollNumber);
        Map map = new HashMap();
        map.put("tollDrugs",tollDrugs);
        return R.ok(map);
    }

    @PutMapping("/toll/TollRefunds")
    @ResponseBody
    @ApiOperation(value = "退费修改",notes = "患者信息",httpMethod = "PUT")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok")
    })
    public R tollRefunds(@RequestBody TollNumbers tollNumbers){
        String tollNumber= tollNumbers.getTollNumber();
        try {
            this.tollService.updateRefunds(tollNumber);
        } catch (Exception e) {
            e.printStackTrace();
            R.ok("fale");
        }
        return R.ok("succes");
    }


}
