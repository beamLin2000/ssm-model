package com.gxa.controller.drugmanagement.drugInformationTenance;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.entity.drugManagement.drugInformationTenance.DrugInfo;
import com.gxa.result.Result;
import com.gxa.result.ResultUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author LXD
 * @Date 2022/10/11 15:35
 * @Version 1.0
 */
@RestController
@RequestMapping("/drugInfo")
@Api(value = "DrugInformationController",description ="药品信息维护的增删改查" )
public class DrugInformationController {

//    @Autowired
//    private DrugManagementService drugManagementService;

    //列表
    @GetMapping(value = "/list")
    @ApiOperation(value = "list",notes = "药品信息列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = DrugInfo.class )
    })
    public Result list(){
        //创建data
        List<DrugInfo> data = new ArrayList<>();
        //添加列表
        data.add(new DrugInfo(1, "1002", "阿莫西林", "20", "中", 2, 20.2, "dasdsa", 1, new SimpleDateFormat("YYYY-MM-dd").format(new Date(System.currentTimeMillis()-30000))));
        data.add(new DrugInfo(1, "1002", "阿莫西林1", "20", "西", 2, 20.2, "dasdsa", 2, new SimpleDateFormat("YYYY-MM-dd").format(new Date(System.currentTimeMillis()-60000))));
        data.add(new DrugInfo(1, "1002", "阿莫西林2", "20", "中", 2, 20.2, "dasdsa", 2, new SimpleDateFormat("YYYY-MM-dd").format(new Date(System.currentTimeMillis()-36000))));
        data.add(new DrugInfo(1, "1002", "阿莫西林3", "20", "西", 2, 20.2, "dasdsa", 1, new SimpleDateFormat("YYYY-MM-dd").format(new Date(System.currentTimeMillis()-30000))));
        data.add(new DrugInfo(1, "1002", "阿莫西林4", "20", "中", 2, 20.2, "dasdsa", 2, new SimpleDateFormat("YYYY-MM-dd").format(new Date(System.currentTimeMillis()-3600))));
        data.add(new DrugInfo(1, "1002", "阿莫西林5", "20", "西", 2, 20.2, "dasdsa", 1, new SimpleDateFormat("YYYY-MM-dd").format(new Date(System.currentTimeMillis()-360))));
        //返回json
        return ResultUtils.buildFail(123,"查询所有",2L,data);
    }

    //搜索功能
    @GetMapping("/search")
    @ApiOperation(value = "search",notes = "药品信息搜索")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response =DrugInfo.class )
    })
    public Result search(){
        System.out.println();
        //创建data
        List<DrugInfo> data = new ArrayList<>();
        //添加列表
        if(System.currentTimeMillis()/3==1){
            data.add(new DrugInfo(1, "1002", "阿莫西林", "20", "中", 2, 20.2, "dasdsa", 1, new SimpleDateFormat("YYYY-MM-dd").format(new Date(System.currentTimeMillis()-30000))));
            data.add(new DrugInfo(1, "1002", "阿莫西林1", "20", "西", 2, 20.2, "dasdsa", 2, new SimpleDateFormat("YYYY-MM-dd").format(new Date(System.currentTimeMillis()-60000))));
        }else if(System.currentTimeMillis()/3==0){
            data.add(new DrugInfo(1, "1002", "阿莫西林4", "20", "中", 2, 20.2, "dasdsa", 2, new SimpleDateFormat("YYYY-MM-dd").format(new Date(System.currentTimeMillis()-3600))));
            data.add(new DrugInfo(1, "1002", "阿莫西林5", "20", "西", 2, 20.2, "dasdsa", 1, new SimpleDateFormat("YYYY-MM-dd").format(new Date(System.currentTimeMillis()-360))));
        }else{
            data.add(new DrugInfo(1, "1002", "阿莫西林2", "20", "中", 2, 20.2, "dasdsa", 2, new SimpleDateFormat("YYYY-MM-dd").format(new Date(System.currentTimeMillis()-36000))));
            data.add(new DrugInfo(1, "1002", "阿莫西林3", "20", "西", 2, 20.2, "dasdsa", 1, new SimpleDateFormat("YYYY-MM-dd").format(new Date(System.currentTimeMillis()-30000))));
        }
        //返回json
        return ResultUtils.buildFail(200,"ok",2L,data);
    }

    //修改状态
    @PostMapping("/editStatus")
    @ApiOperation(value = "editStatus",notes = "药品信息的停用与启用")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok" )
    })
    public Result editStatus(){
        System.out.println("editStatus success");
        return ResultUtils.buildFail(200,"ok",2L,null);
    }

    //新增成功
    @PostMapping("/add")
    @ApiOperation(value = "add",notes = "药品信息数据新增")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result add(){
        System.out.println("add success");
        return ResultUtils.buildFail(200,"ok",2L,null);
    }

    //新增之前,首先需要查询信息
    @PostMapping("/queryById")
    @ApiOperation(value = "queryById",notes = "对需要修改的数据查询")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response =DrugInfo.class )
    })
    public Result editPre(){
        System.out.println("editPre");
        //创建data
        List<DrugInfo> data = new ArrayList<>();
        //添加列表
        data.add(new DrugInfo(1, "1002", "阿莫西林", "20", "中", 2, 20.2, "dasdsa", 1, new SimpleDateFormat("YYYY-MM-dd").format(new Date(System.currentTimeMillis()-30000))));
        return ResultUtils.buildFail(200,"ok",2L,data);
    }

    //对所有数据进行保存
    @PostMapping("/save")
    @ApiOperation(value = "save",notes = "保存用户修改后的数据")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result editSave(){
        System.out.println("editSave");
        return ResultUtils.buildFail(200,"ok",2L,null);
    }


}
