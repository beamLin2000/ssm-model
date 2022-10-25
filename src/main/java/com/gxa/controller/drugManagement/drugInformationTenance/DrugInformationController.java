package com.gxa.controller.drugManagement.drugInformationTenance;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.entity.drugManagement.basicInfo.SearchCondition;
import com.gxa.entity.drugManagement.drugInformationTenance.*;
import com.gxa.result.Result;
import com.gxa.result.ResultUtils;
import com.gxa.service.drugManagement.drugInformationTenance.DrugInformationService;
import io.swagger.annotations.*;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author LXD
 * @Date 2022/10/11 15:35
 * @Version 1.0
 */
@RestController
@RequestMapping("/drugInfo")
@Api(tags = {"药品信息维护的接口"})
public class DrugInformationController {

    @Autowired
    private DrugInformationService drugInformationService;

    //列表
    @GetMapping(value = "/list")
    @ApiOperation(value = "list",notes = "药品信息列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = DrugBasicInformation.class )
    })
    public Result list(){
        List<DrugBasicInformation> list = drugInformationService.list();
        return ResultUtils.buildFail(200,"ok",2L,list);
    }

    //搜索功能
    @PostMapping("/search")
    @ApiOperation(value = "search",notes = "药品信息搜索")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response =DrugBasicInformation.class )
    })
    public Result search(@ApiParam(name = "drugType",value = "处方类别") @RequestBody SearchCondition searchCondition){
//                         @ApiParam(name = "status",value = "药品状态") @RequestParam Integer status,
//                         @ApiParam(name = "createTime",value = "创建时间")@RequestParam("createTime") String createTime,
//                         @ApiParam(name = "rules",value = "药品名称/编码/生成厂家")@RequestParam("rules") String rules

        System.out.println("search=" + searchCondition);
        Integer statusNum = null;
//        if (!status.equals("NaN") && status.length() != 0){
//            statusNum = Integer.parseInt(status);
//        }
        List<DrugBasicInformation> search = drugInformationService.search(searchCondition.getDrugType(),searchCondition.getStatus(),searchCondition.getCreateTime(),searchCondition.getRules());
        return ResultUtils.buildFail(200,"ok",Long.valueOf(search.size()),search);
    }

    //修改状态
    @PostMapping("/editStatus")
    @ApiOperation(value = "editStatus",notes = "药品信息的停用与启用")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result editStatus(@ApiParam( name = "id",value = "需要被修改状态的id") @RequestBody BasicInfo basicInfo){
        drugInformationService.editStatus(basicInfo.getId());
        return ResultUtils.buildFail(200,"ok",2L,null);
    }

    //新增之前,首先需要查询信息
    @PostMapping("/queryById")
    @ApiOperation(value = "queryById",notes = "对需要修改的数据查询")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = DrugBasicInformation.class )
    })
    public Result editPre(@ApiParam(value = "需要被更新记录的id") @RequestBody BasicInfo basicInfo){
        System.out.println("查询的id=" + basicInfo.getId());
        DrugBasicInformation drugBasicInformations = drugInformationService.editPre(basicInfo.getId());
        return ResultUtils.buildFail(200,"ok",2L,drugBasicInformations);
    }

    //对所有数据进行保存
    @PostMapping("/save")
    @ApiOperation(value = "save",notes = "保存用户修改后的数据")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result save(@ApiParam(value = "药品信息提交接口")@RequestBody DrugBasicInformation drugBasicInformation){
        System.out.println("drugBasicInformation123"+drugBasicInformation);
        drugInformationService.save(drugBasicInformation);

        return ResultUtils.buildFail(200,"ok",2L,null);
    }


}
