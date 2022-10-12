package com.gxa.controller.work;

import com.gxa.entity.work.*;
import com.gxa.utils.R;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@Api(tags = {"工作台接口"})
public class WorkConeroller {
    @GetMapping("/work/list")
    @ResponseBody
    public R patientList(String name,Date strTime,Date endTime){
        Date date = new Date();
        long time = date.getTime();
        date.setTime(time);
        Patient1 patient = new Patient1(1,"李四","18","nan","已就诊",date,"全科","beam","13256485216");
        Patient1 patient1 = new Patient1(2,"ww","18","nan","已就诊",date,"全科","beam","13256485216");
        Patient1 patient2 = new Patient1(3,"zn","18","nan","已就诊",date,"全科","beam","13256485216");
        Patient1 patient3 = new Patient1(4,"zs","18","nan","已就诊",date,"全科","beam","13256485216");
        Patient1 patient4 = new Patient1(5,"qq","18","nan","已就诊",date,"全科","beam","13256485216");
        Patient1 patient5 = new Patient1(6,"ht","18","nan","已就诊",date,"全科","beam","13256485216");
        List<Patient1> list = new ArrayList<>();
        list.add(patient);
        list.add(patient1);
        list.add(patient2);
        list.add(patient3);
        list.add(patient4);
        list.add(patient5);

        Map map = new HashMap();
        map.put("drugs",list);
        R r = new R();
        return r.ok(map);
    }
}
