package com.gxa.controller.drugManagement.drugInformationTenance;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.result.Result;
import com.gxa.result.ResultUtils;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    //药品分类
    private List<BasicInfo> drugType = new ArrayList<>();
    //药品剂型
    private List<BasicInfo> drugDosage  = new ArrayList<>();
    //发票项目
    private List<BasicInfo> invoiceItems = new ArrayList<>();
    //生产厂家
    private List<BasicInfo> Manufacturer = new ArrayList<>();
    //包装单位
    private List<BasicInfo> packingUnit = new ArrayList<>();
    //基本单位
    private List<BasicInfo> basicUnit = new ArrayList<>();
    //用法
    private List<BasicInfo> useMethod = new ArrayList<>();
    //剂量单位
    private List<BasicInfo> DosageUnit = new ArrayList<>();
    //频度
    private List<BasicInfo> Frequency = new ArrayList<>();
    //天数
    private List<BasicInfo> Days = new ArrayList<>();
    //药品单位
    private List<BasicInfo> unit = new ArrayList<>();

    {
        //药品编码
        drugType.add(new BasicInfo(1,"注射类"));
        drugType.add(new BasicInfo(2,"消炎类"));
        drugType.add(new BasicInfo(3,"西药"));
        //药品剂型
        drugDosage.add(new BasicInfo(1,"片剂"));
        drugDosage.add(new BasicInfo(2,"注射液"));
        drugDosage.add(new BasicInfo(3,"口服液"));
        //发票项目
        invoiceItems.add(new BasicInfo(1,"诊疗费"));
        invoiceItems.add(new BasicInfo(2,"检查费"));
        invoiceItems.add(new BasicInfo(3,"西药费"));
        //生产厂家
        Manufacturer.add(new BasicInfo(1,"昆明制药集团"));
        Manufacturer.add(new BasicInfo(2,"上海集团"));
        Manufacturer.add(new BasicInfo(3,"山东集团"));
        //包装单位
        packingUnit.add(new BasicInfo(1,"包"));
        packingUnit.add(new BasicInfo(2,"袋"));
        //基本系数
        basicUnit.add(new BasicInfo(1,"个"));
        basicUnit.add(new BasicInfo(2,"颗"));
        //剂量单位
        DosageUnit.add(new BasicInfo(1,"口服"));
        DosageUnit.add(new BasicInfo(2,"外敷"));
        //用法
        useMethod.add(new BasicInfo(1,"注射"));
        useMethod.add(new BasicInfo(2,"点滴"));
        //频度
        Frequency.add(new BasicInfo(1,"一天一次"));
        Frequency.add(new BasicInfo(2,"一天两次"));
        Frequency.add(new BasicInfo(3,"一天三次"));
        Frequency.add(new BasicInfo(4,"两天一次"));
        Frequency.add(new BasicInfo(5,"三天一次"));
        Frequency.add(new BasicInfo(6,"四天一次"));
        //天数
        Days.add(new BasicInfo(1,"1"));
        Days.add(new BasicInfo(2,"2"));
        Days.add(new BasicInfo(3,"3"));
        Days.add(new BasicInfo(4,"4"));
        Days.add(new BasicInfo(5,"5"));
        Days.add(new BasicInfo(6,"6"));
        Days.add(new BasicInfo(7,"7"));
        //单位
        unit.add(new BasicInfo(1,"瓶"));
        unit.add(new BasicInfo(2,"盒"));
        unit.add(new BasicInfo(3,"袋"));
        unit.add(new BasicInfo(4,"壶"));
    }

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
        System.out.println("drugTypeQuery");
        return ResultUtils.buildFail(200,"ok",2L,drugType);
    }

    //药品分类新增
    @PostMapping("/drugTypeAdd")
    @ApiOperation(value = "drugTypeAdd",notes = "药品分类下拉框的新增")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result drugTypeAdd(@ApiParam(value = "药品分类新增名字")String drugType){
        System.out.println(drugType);
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
        System.out.println("drugDosageQuery");
        return ResultUtils.buildFail(200,"ok",2L,drugDosage);
    }

    //药品剂型新增
    @PostMapping("/drugDosageAdd")
    @ApiOperation(value = "drugDosageAdd",notes = "药品剂型新增")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result drugDosageAdd(@ApiParam(value = "药品剂型新增名字")String drugType){
        return ResultUtils.buildFail(200,"ok",2L,null);
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
    public Result invoiceItemsAdd(@ApiParam(value = "新增发票名字")String invoiceItems){
        return ResultUtils.buildFail(200,"ok",2L,null);
    }

    //发票项目查询列表
    @GetMapping("/invoiceItemsQuery")
    @ApiOperation(value = "invoiceItemsQuery",notes = "发票项目查询列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result invoiceItemsQuery(){
        return ResultUtils.buildFail(200,"ok",2L,invoiceItems);
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
    public Result manufacturerAdd(@ApiParam(value = "生产厂家名字")String manufacturer){
        return ResultUtils.buildFail(200,"ok",2L,null);
    }

    //生产厂家查询列表
    @GetMapping("/ManufacturerQuery")
    @ApiOperation(value = "ManufacturerQuery",notes = "生产厂家查询列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result ManufacturerQuery(){
        return ResultUtils.buildFail(200,"ok",2L,Manufacturer);
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
    public Result packingUnitAdd(@ApiParam(value = "包装单位新增名字")String packingUnit){
        System.out.println(packingUnit);
        return ResultUtils.buildFail(200,"ok",2L,null);
    }

    //包装单位查询列表
    @GetMapping("/packingUnitQuery")
    @ApiOperation(value = "packingUnitQuery",notes = "包装单位查询列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result packingUnitQuery(){
        return ResultUtils.buildFail(200,"ok",2L,packingUnit);
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
    public Result basicUnitAdd(@ApiParam(value = "基本系数名字")String basicUnit){
        System.out.println(basicUnit);
        return ResultUtils.buildFail(200,"ok",2L,null);
    }

    //基本系数查询列表
    @GetMapping("/basicUnitQuery")
    @ApiOperation(value = "drugDosageQuery",notes = "基本系数查询列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "drugDosageQuery",response = BasicInfo.class)
    })
    public Result basicUnitQuery(){
        return ResultUtils.buildFail(200,"drugTypeQuery",2L,basicUnit);
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
    public Result dosageUnitAdd(@ApiParam(value = "新增剂量系数名字")String dosageUnit){
        System.out.println(dosageUnit);
        return ResultUtils.buildFail(200,"ok",2L,null);
    }
    //剂量单位查询列表
    @GetMapping("/dosageUnitQuery")
    @ApiOperation(value = "dosageUnitQuery",notes = "药品剂量单位查询列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result dosageUnitQuery(){
        return ResultUtils.buildFail(200,"ok",2L,DosageUnit);
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
    public Result useMethodAdd(@ApiParam(value = "使用方法名字")String useMethod){
        System.out.println(useMethod);
        return ResultUtils.buildFail(200,"ok",2L,null);
    }
    //剂量系数查询列表
    @GetMapping("/useMethodQuery")
    @ApiOperation(value = "useMethodQuery",notes = "药品使用方法")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class)
    })
    public Result useMethodQuery(){
        System.out.println("useMethodQuery");
        return ResultUtils.buildFail(200,"ok",2L,useMethod);
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
        return ResultUtils.buildFail(200,"ok",0L,Frequency);
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
        return ResultUtils.buildFail(200,"ok",0L,Days);
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
        return ResultUtils.buildFail(200,"ok",0L,unit);
    }
}
