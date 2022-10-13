package com.gxa.controller.drugManagement.outboundManagement;

import com.gxa.entity.drugManagement.outboundManagement.OutboundInfo;
import com.gxa.result.Result;
import com.gxa.result.ResultUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :林溪
 * @date : 2022/10/12 14:06
 */
@RestController
@RequestMapping("/outboundManagement")
@Api(value = "OutboundManagementController",description = "出库管理的增删改查")
public class OutboundManagementController {

    @Autowired
    private OutboundManagerVisualData outboundManagerVisualData;
    //新增出库/提交审核/直接出库(修改状态)
    @PostMapping("/add")
    @ApiOperation(value = "add",notes = "新增出库")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result add(){
        System.out.println("add");
        return ResultUtils.buildFail(200,"add",0L,null);
    }
    //搜索功能
    @GetMapping("/search")
    @ApiOperation(value = "search",notes = "搜索功能")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = OutboundInfo.class)
    })
    public Result search(){
        System.out.println("search");
        return ResultUtils.buildFail(200,"search",0L,outboundManagerVisualData.getLos().get(0));
    }
    //再次出库
    @PostMapping("/outboundAgain")
    @ApiOperation(value = "outboundAgain",notes = "再次入库")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result outboundAgain(){
        System.out.println("outboundAgain");
        return ResultUtils.buildFail(200,"outboundAgain",0L,null);
    }
    //删除
    @PostMapping("/deleteById")
    @ApiOperation(value = "deleteById",notes = "根据id删除")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result deleteById(){
        System.out.println("deleteById");
        return ResultUtils.buildFail(200,"deleteById",0L,null);
    }

}
