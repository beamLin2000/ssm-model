package com.gxa.controller.tolls;

import com.gxa.entity.tolls.Toll;
import com.gxa.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Api(tags = {"收费管理"})
public class TollController {
    @GetMapping("/toll/state")
    @ResponseBody
    @ApiOperation(value = "查找接口",notes = "状态查找缴费",httpMethod = "GET")
    public R tollStateList(@ApiParam(name = "状态查找信息", value = "tollState")Integer tollState){
        R r = new R();
        return r;
    }

    @GetMapping("/toll/name")
    @ResponseBody
    @ApiOperation(value = "查找接口",notes = "姓名查找缴费",httpMethod = "GET")
    public R tollNameList(@ApiParam(name = "姓名查找信息", value = "tollName")String tollName){
        R r = new R();
        return r;
    }

    @DeleteMapping("/toll/delete")
    @ResponseBody
    @ApiOperation(value = "删除接口",notes = "缴费删除",httpMethod = "DELETE")
    public R tollDelete(@ApiParam(name = "缴费删除条件",value = "tollId") Integer tollId){
        return null;
    }

    @PutMapping("/toll/update_state")
    @ResponseBody
    @ApiOperation(value = "修改接口",notes = "状态修改",httpMethod = "PUT")
    public R tollState(@ApiParam(name = "状态修改信息", value = "tollId")String tollId){
        R r = new R();
        return r;
    }

    @GetMapping("/toll/update_prescriptionPre")
    @ResponseBody
    @ApiOperation(value = "查询要修改的处方",notes = "处方修改",httpMethod = "GET")
    public R tollPrescriptionPre(@ApiParam(name = "要修改处方的信息", value = "tollId")String tollId){
        R r = new R();
        return r;
    }

    @PutMapping("/toll/update_prescription")
    @ResponseBody
    @ApiOperation(value = "修改处方",notes = "处方修改",httpMethod = "PUT")
    public R tollPrescription(@ApiParam(name = "处方修改信息", value = "toll")Toll toll){
        R r = new R();
        return r;
    }

    @GetMapping("/toll/update_pharmaceuticalsPre")
    @ResponseBody
    @ApiOperation(value = "查询要修改的药品",notes = "药品修改",httpMethod = "GET")
    public R tollPharmaceuticalsPre(@ApiParam(name = "要修改药品的信息", value = "tollId")String tollId){
        R r = new R();
        return r;
    }

    @PutMapping("/toll/update_pharmaceuticals")
    @ResponseBody
    @ApiOperation(value = "修改处方",notes = "处方修改",httpMethod = "PUT")
    public R tollPharmaceuticals(@ApiParam(name = "处方修改信息", value = "toll")Toll toll){
        R r = new R();
        return r;
    }
}
