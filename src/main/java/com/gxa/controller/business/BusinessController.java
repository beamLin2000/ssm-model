package com.gxa.controller.business;

import com.gxa.entity.business.OutpatientRecordToday;
import com.gxa.entity.work.MedicalRecord;
import com.gxa.service.business.BusinessService;
import com.gxa.utils.R;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
            @ApiResponse(code = 0,message = "ok")
    })
    public R contrast(@ApiParam("今天的日期到天就行")String todayTime){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date time = null;
        try {
             time = simpleDateFormat.parse(todayTime);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(time);
        Integer integer = this.service.queryCountByToday(time,null);
        System.out.println(integer);
        Integer integer1 = this.service.queryCountByToday(time, "已就诊");
        System.out.println(integer1);
        Double money = this.service.queryTodayRevenue(time);
        Map map = new HashMap();
        map.put("todayregister",integer);
        map.put("todayregistered",integer1);
        map.put("money",money);
        R r = new R();
        return r.ok(map);
    }




    @GetMapping("/business/list02")
    @ResponseBody
    @ApiOperation(value = "经营状况",notes = "")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok")
    })
    public R contrast01(@ApiParam("查多少天的数据")Integer days,@ApiParam("今天的日期到天就行")String todayTime){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date time = null;
        try {
            time = simpleDateFormat.parse(todayTime);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        List<Map> list = this.service.queryTotal(time, days);
        R r = new R();
        r.put("list",list);
        return r;
    }




    @GetMapping("/business/list01")
    @ResponseBody
    @ApiOperation(value = "经营状况",notes = "")
    @ApiResponses({
            @ApiResponse(code = 0,message = "ok",response = MedicalRecord.class)
    })
    public R contrast02(@ApiParam("今天的日期到天")String todayTime){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date time = null;
        try {
            time = simpleDateFormat.parse(todayTime);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        List<OutpatientRecordToday> list = this.service.queryByToday(time);

        R r = new R();
        r.put("todayList",list);
        return r;
    }

}
