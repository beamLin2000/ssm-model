package com.gxa.controller.tolls;

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
    public R tollStateList(@ApiParam(name = "状态查找信息", value = "toll_state")Integer toll_state){
        R r = new R();
        return r;
    }

    @GetMapping("/toll/name")
    @ResponseBody
    @ApiOperation(value = "查找接口",notes = "姓名查找缴费",httpMethod = "GET")
    public R tollNameList(@ApiParam(name = "姓名查找信息", value = "toll_state")String toll_name){
        R r = new R();
        return r;
    }

    @DeleteMapping("/toll/delete")
    @ResponseBody
    @ApiOperation(value = "删除接口",notes = "缴费删除",httpMethod = "DELETE")
    public R tollDelete(@ApiParam(name = "缴费删除条件",value = "toll_id") Integer toll_id){
        return null;
    }

    @PutMapping("/toll/update_state")
    @ResponseBody
    @ApiOperation(value = "修改接口",notes = "状态修改",httpMethod = "Put")
    public R tollState(@ApiParam(name = "toll_id", value = "状态修改信息")String toll_id){
        R r = new R();
        return r;
    }


}
