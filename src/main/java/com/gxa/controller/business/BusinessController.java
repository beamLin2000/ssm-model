package com.gxa.controller.business;

import com.gxa.entity.business.Business;
import com.gxa.entity.business.OutpatientRecordToday;
import com.gxa.entity.work.MedicalRecord;
import com.gxa.service.business.BusinessService;
import com.gxa.utils.R;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@Api(tags = {"经营状况"})
public class BusinessController {
    @Autowired
    private BusinessService service;
    @GetMapping("/business/list")
    @ResponseBody
    @ApiOperation(value = "经营状况",notes = "")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = Business.class)
    })
    public R contrast(@ApiParam("传入天数") Integer days,@ApiParam("今天的日期到天就行")Date todayTime){

        Integer integer = this.service.queryCountByToday(todayTime);
        Integer integer1 = this.service.queryCountByToday(todayTime, "已就诊");
        Map map = new HashMap();
        map.put("todayregister",integer);
        map.put("todayregistered",integer1);
        R r = new R();
        return r.ok(map);
    }
    @GetMapping("/business/list01")
    @ResponseBody
    @ApiOperation(value = "经营状况",notes = "")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = MedicalRecord.class)
    })
    public R contrast(){

        Date date = new Date();
        long time = date.getTime();
        date.setTime(time);
        OutpatientRecordToday today0 = new OutpatientRecordToday(1,"就诊中","200","张三","男","18","12345678911","复诊","beam",
                date);
        OutpatientRecordToday today1 = new OutpatientRecordToday(2,"就诊中","200","张三","男","18","12345678911","复诊","beam",
                date);
        OutpatientRecordToday today2 = new OutpatientRecordToday(3,"就诊中","200","张三","男","18","12345678911","复诊","beam",
                date);
        OutpatientRecordToday today3 = new OutpatientRecordToday(4,"就诊中","200","张三","男","18","12345678911","复诊","beam",
                date);
        OutpatientRecordToday today4= new OutpatientRecordToday(5,"就诊中","200","张三","男","18","12345678911","复诊","beam",
                date);
        List<OutpatientRecordToday> list = new ArrayList<>();
        list.add(today0);
        list.add(today1);
        list.add(today2);
        list.add(today3);
        list.add(today4);
        Map map = new HashMap();
        map.put("drugs",list);
        R r = new R();
        return r.ok(map);
    }

}
