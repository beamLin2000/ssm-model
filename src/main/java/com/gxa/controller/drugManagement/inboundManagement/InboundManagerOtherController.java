package com.gxa.controller.drugManagement.inboundManagement;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.entity.drugManagement.inboundManagement.InboundInfo;
import com.gxa.entity.drugManagement.inboundManagement.InboundInfoAddArray;
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

import java.util.ArrayList;
import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/12 11:51
 */
@RestController
@RequestMapping("/inboundManagerOther")
@Api(tags = {"入库管理新增功能中的小功能"})
public class InboundManagerOtherController {
    //入库库人员
    private List<BasicInfo> lbPerson = new ArrayList<>();
    //入库库类型
    private List<BasicInfo> lbType = new ArrayList<>();
    //供应商
    private List<BasicInfo> lbmanufacture = new ArrayList<>();
    //创建data
    private Integer count=3;

    {
        //入库人员
        lbPerson.add(new BasicInfo(1,"lx"));
        lbPerson.add(new BasicInfo(2,"lm"));
        lbPerson.add(new BasicInfo(3,"chai"));

        //入库类型
        lbType.add(new BasicInfo(1,"采购入库"));
        lbType.add(new BasicInfo(2,"退货入库"));
        lbType.add(new BasicInfo(3,"其他入库"));

        //供应商
        lbmanufacture.add(new BasicInfo(1,"白云制药厂"));
        lbmanufacture.add(new BasicInfo(2,"黑云制药厂"));
    }

    @Autowired
    private InboundManagerVisualData inboundManagerVisualData;
    //入库类型
    @GetMapping("/inboundType")
    @ApiOperation(value = "inboundType",notes = "入库类型下拉框查询")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class )
    })
    public Result inboundType(){
        System.out.println("inboundType");
        return ResultUtils.buildFail(200,"inboundType",0L,lbType);
    }
    //添加药品
    @PostMapping("/add")
    @ApiOperation(value = "add",notes = "新增功能中的提交添加药品")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result add(){
        System.out.println("add");
        return ResultUtils.buildFail(200,"add",0L,null);
    }
    //添加药品pre
    @GetMapping("/addPre")
    @ApiOperation(value = "addPre",notes = "添加药品前的查询列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = InboundInfo.class )
    })
    public Result addPre(){
        System.out.println("addPre");
        return ResultUtils.buildFail(200,"addPre",0L,inboundManagerVisualData.getInboundInfos().get(1));
    }
    //搜索药品
    @GetMapping("/search")
    @ApiOperation(value = "search",notes = "添加药品中的查询列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = InboundInfoAddArray.class )
    })
    public Result search(){
        System.out.println("addPre");
        return ResultUtils.buildFail(200,"search",0L,inboundManagerVisualData.getInboundInfoAddArray());
    }

    //供应商
    @GetMapping("/manufacture")
    @ApiOperation(value = "manufacture",notes = "供应商下拉框")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = BasicInfo.class )
    })
    public Result manufacture(){
        System.out.println("manufacture");
        return ResultUtils.buildFail(200,"manufacture",0L,lbmanufacture);
    }
}
