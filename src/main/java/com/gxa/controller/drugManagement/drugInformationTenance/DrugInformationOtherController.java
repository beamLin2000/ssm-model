package com.gxa.controller.drugManagement.drugInformationTenance;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.result.Result;
import com.gxa.result.ResultUtils;
import com.gxa.service.drugManagement.drugInformationTenance.DrugInformationOtherService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/12 10:44
 */
@RestController
@RequestMapping("/drugInformationOtherController")
@Api(tags = {"药品信息维护新增功能中的下拉框接口"})
public class DrugInformationOtherController {
    //药品分类特征码
    private final Integer DRUG_TYPE_ID = 1;

    //药品剂型特征码
    private final Integer DRUG_DOSAGE_ID = 2;

    //发票项目特征码
    private final Integer INVOICE_ITEMS_Id = 3;

    //生产厂家特征码
    private final Integer MANUFACTURER_ID = 4;

    //包装单位特征码
    private final Integer PACKING_UNIT = 5;

    //基本单位特征码
    private final Integer BASIC_UNIT_ID = 6;

    //剂量单位特征码
    private final Integer DOSAGE_UNIT_ID = 7;

    //用法特征码
    private final Integer USE_METHOD_ID = 8;

    //频度特征码
    private final Integer FREQUENCY_ID = 9;

    //天数特征码
    private final Integer DAYS = 10;

    //单位特征码
    private final Integer UNIT = 11;

    @Autowired
    private DrugInformationOtherService drugInformationOtherService;
    /**
     *
     * @return药品分类
     */
    //药品查询列表
    @GetMapping("/drugTypeQuery")
    @ApiOperation(value = "drugTypeQuery",notes = "药品分类下拉框")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response =BasicInfo.class )
    })
    public Result drugTypeQuery(){
        List<BasicInfo> basicInfos = drugInformationOtherService.queryAllType(DRUG_TYPE_ID);
        System.out.println("drugTypeQuery");
        return ResultUtils.buildFail(200,"ok",Long.valueOf(basicInfos.size()),basicInfos);
    }

    //药品分类新增
    @PostMapping("/drugTypeAdd")
    @ApiOperation(value = "drugTypeAdd",notes = "药品分类下拉框的新增")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result drugTypeAdd(@ApiParam(value = "药品分类新增名字") @RequestBody BasicInfo basicInfo){
        System.out.println("basicInfo"+basicInfo.getName());
        drugInformationOtherService.addOneType(new BasicInfo(DRUG_TYPE_ID, basicInfo.getName()));
        return ResultUtils.buildFail(200,"ok",2L,null);
    }

    /**
     *
     * @return药品剂型
     */
    //药品剂型列表
    @GetMapping("/drugDosageQuery")
    @ApiOperation(value = "drugDosageQuery",notes = "药品剂型查询列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result drugDosageQuery(){

        List<BasicInfo> drugDosageids = drugInformationOtherService.queryAllType(DRUG_DOSAGE_ID);
        System.out.println("drugDosageQuery");
        return ResultUtils.buildFail(200,"ok",Long.valueOf(drugDosageids.size()),drugDosageids);
    }

    //药品剂型新增
    @PostMapping("/drugDosageAdd")
    @ApiOperation(value = "drugDosageAdd",notes = "药品剂型新增")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result drugDosageAdd(@ApiParam(value = "药品剂型新增名字")@RequestBody BasicInfo basicInfo){
        drugInformationOtherService.addOneType(new BasicInfo(DRUG_DOSAGE_ID, basicInfo.getName()));
        return ResultUtils.buildFail(200,"ok",0L,null);
    }

    /**
     *
     * @return发票项目
     */
    //发票项目新增
    @PostMapping("/invoiceItemsAdd")
    @ApiOperation(value = "invoiceItemsAdd",notes = "发票项目新增")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result invoiceItemsAdd(@ApiParam(value = "新增发票名字")@RequestBody BasicInfo basicInfo){
        drugInformationOtherService.addOneType(new BasicInfo(INVOICE_ITEMS_Id, basicInfo.getName()));
        return ResultUtils.buildFail(200,"ok",0L,null);
    }

    //发票项目查询列表
    @GetMapping("/invoiceItemsQuery")
    @ApiOperation(value = "invoiceItemsQuery",notes = "发票项目查询列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result invoiceItemsQuery(){
        List<BasicInfo> basicInfos = drugInformationOtherService.queryAllType(INVOICE_ITEMS_Id);
        return ResultUtils.buildFail(200,"ok",Long.valueOf(basicInfos.size()),basicInfos);
    }

    /**
     *
     * @return生产厂家
     */
    //生产厂家新增
    @PostMapping("/ManufacturerAdd")
    @ApiOperation(value = "ManufacturerAdd",notes = "生产厂家新增")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result manufacturerAdd(@ApiParam(value = "生产厂家名字")@RequestBody BasicInfo basicInfo){
        drugInformationOtherService.addOneType(new BasicInfo(MANUFACTURER_ID, basicInfo.getName()));
        return ResultUtils.buildFail(200,"ok",0L,null);
    }

    //生产厂家查询列表
    @GetMapping("/ManufacturerQuery")
    @ApiOperation(value = "ManufacturerQuery",notes = "生产厂家查询列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result ManufacturerQuery(){
        List<BasicInfo> manufacturers = drugInformationOtherService.queryAllType(MANUFACTURER_ID);
        return ResultUtils.buildFail(200,"ok",Long.valueOf(manufacturers.size()),manufacturers);
    }

    /**
     *
     * @return包装单位
     */
    //包装单位新增
    @PostMapping("/packingUnitAdd")
    @ApiOperation(value = "packingUnitAdd",notes = "包装单位新增")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result packingUnitAdd(@ApiParam(value = "包装单位新增名字")@RequestBody BasicInfo basicInfo){

        drugInformationOtherService.addOneType(new BasicInfo(PACKING_UNIT, basicInfo.getName()));
        return ResultUtils.buildFail(200,"ok",0L,null);
    }

    //包装单位查询列表
    @GetMapping("/packingUnitQuery")
    @ApiOperation(value = "packingUnitQuery",notes = "包装单位查询列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result packingUnitQuery(){
        List<BasicInfo> packingUnits = drugInformationOtherService.queryAllType(PACKING_UNIT);
        return ResultUtils.buildFail(200,"ok",Long.valueOf(packingUnits.size()),packingUnits);
    }

    /**
     *
     * @returnj基本系数
     */
    //基本系数新增
    @PostMapping("/basicUnitAdd")
    @ApiOperation(value = "basicUnitAdd",notes = "剂量系数新增")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result basicUnitAdd(@ApiParam(value = "基本系数名字")@RequestBody BasicInfo basicInfo){
        drugInformationOtherService.addOneType(new BasicInfo(BASIC_UNIT_ID, basicInfo.getName()));

        return ResultUtils.buildFail(200,"ok",0L,null);
    }

    //基本系数查询列表
    @GetMapping("/basicUnitQuery")
    @ApiOperation(value = "drugDosageQuery",notes = "基本系数查询列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "drugDosageQuery",response = BasicInfo.class)
    })
    public Result basicUnitQuery(){
        List<BasicInfo> basicInfos = drugInformationOtherService.queryAllType(BASIC_UNIT_ID);
        return ResultUtils.buildFail(200,"drugTypeQuery",Long.valueOf(basicInfos.size()),basicInfos);
    }

    /**
     *
     * @return剂量单位
     */
    //剂量系数新增新增
    @PostMapping("/dosageUnitAdd")
    @ApiOperation(value = "dosageUnitAdd",notes = "药品剂量单位新增")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result dosageUnitAdd(@ApiParam(value = "新增剂量系数名字")@RequestBody BasicInfo basicInfo){

        drugInformationOtherService.addOneType(new BasicInfo(DOSAGE_UNIT_ID, basicInfo.getName()));
        return ResultUtils.buildFail(200,"ok",0L,null);
    }
    //剂量单位查询列表
    @GetMapping("/dosageUnitQuery")
    @ApiOperation(value = "dosageUnitQuery",notes = "药品剂量单位查询列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result dosageUnitQuery(){
        List<BasicInfo> dosageUnits = drugInformationOtherService.queryAllType(DOSAGE_UNIT_ID);
        return ResultUtils.buildFail(200,"ok",Long.valueOf(dosageUnits.size()),dosageUnits);
    }

    /**
     * @return使用方法
     */
    //使用方法
    @PostMapping("/useMethodAdd")
    @ApiOperation(value = "useMethodAdd",notes = "新增的方法名")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result useMethodAdd(@ApiParam(value = "使用方法名字")@RequestBody BasicInfo basicInfo){
        drugInformationOtherService.addOneType(new BasicInfo(USE_METHOD_ID, basicInfo.getName()));

        return ResultUtils.buildFail(200,"ok",0L,null);
    }
    //剂量系数查询列表
    @GetMapping("/useMethodQuery")
    @ApiOperation(value = "useMethodQuery",notes = "药品使用方法")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result useMethodQuery(){
        List<BasicInfo> useMethods = drugInformationOtherService.queryAllType(USE_METHOD_ID);
        return ResultUtils.buildFail(200,"ok",2L,useMethods);
    }

    /**
     *
     * @return频度
     */
    @GetMapping("/frequencyQuery")
    @ApiOperation(value = "frequencyQuery",notes = "频度下拉框")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result frequencyQuery(){
        System.out.println("frequencyQuery");
        List<BasicInfo> frequencys = drugInformationOtherService.queryAllType(FREQUENCY_ID);
        return ResultUtils.buildFail(200,"ok",Long.valueOf(frequencys.size()),frequencys);
    }

    /**
     *
     * @return天数
     */
    @GetMapping("/daysQuery")
    @ApiOperation(value = "daysQuery",notes = "天数下拉框")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result daysQuery(){
        System.out.println("daysQuery");
        List<BasicInfo> days = drugInformationOtherService.queryAllType(DAYS);
        return ResultUtils.buildFail(200,"ok",Long.valueOf(days.size()),days);
    }

    /**
     *
     * @return单位下拉框
     */
    @GetMapping("/unit")
    @ApiOperation(value = "unit",notes = "单位下拉框")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result unit(){
        System.out.println("unit");
        List<BasicInfo> units = drugInformationOtherService.queryAllType(UNIT);
        return ResultUtils.buildFail(200,"ok",0L,units);
    }

    @GetMapping("/candyi")
    public Result candyi(){
        return ResultUtils.buildFail(200,"ok",0L,"you can found me! 菇砸 !");
    }

}
