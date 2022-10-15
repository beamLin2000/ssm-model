package com.gxa.controller.drugManagement.drugInformationTenance;

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
    public Result list(Integer page){
        //创建DrugBasicInformation
        List<DrugBasicInformation> drugBasicInformation = new ArrayList<>();
        //添加列表
        drugBasicInformation.add(new DrugBasicInformation(1,"dsadsa","asdasdasdas","阿莫西林1","AMoXiLin","注射类","32","片剂",1,"西药费","qwasd123","昆明制药",1,"西/成药",23.1,56.2,"2022-10-21",null,null,null));
        drugBasicInformation.add(new DrugBasicInformation(2,"eqw","safdzc","阿莫西林2","AMoXiLin","口服","32","片剂",1,"西药费","qwasd123","昆明制药",1,"西/成药",23.1,56.2,"2022-10-21",null,null,null));
        drugBasicInformation.add(new DrugBasicInformation(3,"fasd","dgfcb","阿莫西林3","AMoXiLin","外敷","32","片剂",1,"西药费","qwasd123","昆明制药",1,"西/成药",23.1,56.2,"2022-10-21",null,null,null));
        drugBasicInformation.add(new DrugBasicInformation(4,"zcvcz","fhvn","阿莫西林4","AMoXiLin","注射类","32","片剂",1,"西药费","qwasd123","昆明制药",1,"西/成药",23.1,56.2,"2022-10-21",null,null,null));
        drugBasicInformation.add(new DrugBasicInformation(5,"dasfzc","kjmbfj","阿莫西林5","AMoXiLin","注射类","32","片剂",1,"西药费","qwasd123","昆明制药",1,"西/成药",23.1,56.2,"2022-10-21",null,null,null));
        drugBasicInformation.add(new DrugBasicInformation(6,"xcvbhg","sfdxvcas","阿莫西林6","AMoXiLin","注射类","32","片剂",1,"西药费","qwasd123","昆明制药",1,"西/成药",23.1,56.2,"2022-10-21",null,null,null));
        drugBasicInformation.add(new DrugBasicInformation(7,"mnvfgh","asdfzc","阿莫西林7","AMoXiLin","注射类","32","片剂",1,"西药费","qwasd123","昆明制药",1,"西/成药",23.1,56.2,"2022-10-21",null,null,null));
        drugBasicInformation.add(new DrugBasicInformation(9,"sdfzxcv","fcnb","阿莫西林9","AMoXiLin","注射类","32","片剂",1,"西药费","qwasd123","昆明制药",1,"西/成药",23.1,56.2,"2022-10-21",null,null,null));
        drugBasicInformation.add(new DrugBasicInformation(10,"asdfzc","fdgtrhfnchn","阿莫西林0","AMoXiLin","注射类","32","片剂",1,"西药费","qwasd123","昆明制药",1,"西/成药",23.1,56.2,"2022-10-21",null,null,null));

        drugInformationService.list((page-1)*5);
        //service查询
        return ResultUtils.buildFail(200,"ok",2L,drugBasicInformation);
    }

    //搜索功能
    @GetMapping("/search")
    @ApiOperation(value = "search",notes = "药品信息搜索")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response =DrugBasicInformation.class )
    })
    public Result search(@ApiParam(name = "prescriptionCategory",value = "处方类别") String prescriptionCategory,
                         @ApiParam(name = "status",value = "药品状态") String status,
                         @ApiParam(name = "createTime",value = "创建时间") String createTime,
                         @ApiParam(name = "rules",value = "药品名称/编码/生成厂家") String rules){
        System.out.println(prescriptionCategory+","+status+","+createTime+","+rules);
        //创建DrugBasicInformation
        List<DrugBasicInformation> drugBasicInformation = new ArrayList<>();
        drugBasicInformation.add(new DrugBasicInformation(1,"dsadsa","asdasdasdas","阿莫西林","AMoXiLin","注射类","32","片剂",1,"西药费","qwasd123","昆明制药",1,"西/成药",23.1,56.2,"2022-10-21",null,null,null));
        return ResultUtils.buildFail(200,"ok",2L,drugBasicInformation);
    }

    //修改状态
    @PostMapping("/editStatus")
    @ApiOperation(value = "editStatus",notes = "药品信息的停用与启用")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result editStatus(@ApiParam( name = "id",value = "需要被修改状态的id")Integer id){
        System.out.println("editStatus success");
        return ResultUtils.buildFail(200,"ok",2L,null);
    }

//    //新增成功
//    @PostMapping("/add")
//    @ApiOperation(value = "add",notes = "药品信息数据新增")
//    @ApiResponses({
//            @ApiResponse(code = 200,message = "ok")
//    })
//    public Result add(@ApiParam(value = "药品新增需要提供的数据",name = "DrugBasicInformation") DrugBasicInformation drugBasicInformation){
//        System.out.println("add success");
//        return ResultUtils.buildFail(200,"ok",2L,null);
//    }

    //新增之前,首先需要查询信息
    @PostMapping("/queryById")
    @ApiOperation(value = "queryById",notes = "对需要修改的数据查询")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = DrugBasicInformation.class )
    })
    public Result editPre(@ApiParam(value = "需要被更新记录的id") Integer id){
        System.out.println("editPre");
        //创建DrugBasicInformation
        List<DrugBasicInformation> drugBasicInformation = new ArrayList<>();
        //创建drugPackageInformation
        DrugPackageInformation drugPackageInformation = new DrugPackageInformation(1,"盒","0.23","颗","0.11","袋",12.3,16.9,1,1);
        //创建AfficacyDescription
        AfficacyDescription afficacyDescription = new AfficacyDescription(1,"口服",1,"一天一次","14",3,"瓶");
        //创建DrugOtherInformation
        DrugOtherInformation drugOtherInformation = new DrugOtherInformation(1,32,150,"1-1023",456,"好吃,多买","不要吃的太多");
        //添加列表
        drugBasicInformation.add(new DrugBasicInformation(1,"dsadsa","asdasdasdas","阿莫西林","AMoXiLin","注射类","32","片剂",1,"西药费","qwasd123","昆明制药",1,"西/成药",23.1,56.2,"2022-10-21",drugPackageInformation,afficacyDescription,drugOtherInformation));
        return ResultUtils.buildFail(200,"ok",2L,drugBasicInformation);
    }

    //对所有数据进行保存
    @PostMapping("/save")
    @ApiOperation(value = "save",notes = "保存用户修改后的数据")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result editSave(@ApiParam(value = "药品信息提交接口")DrugBasicInformation drugBasicInformation){
        System.out.println("editSave");
        return ResultUtils.buildFail(200,"ok",2L,null);
    }


}
