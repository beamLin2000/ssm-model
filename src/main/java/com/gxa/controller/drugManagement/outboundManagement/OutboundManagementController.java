package com.gxa.controller.drugManagement.outboundManagement;

import com.gxa.entity.drugManagement.basicInfo.BasicInfo;
import com.gxa.entity.drugManagement.basicInfo.SearchCondition;
import com.gxa.entity.drugManagement.outboundManagement.OutboundInfo;
import com.gxa.result.Result;
import com.gxa.result.ResultUtils;
import com.gxa.service.drugManagement.outboundManagement.OutboundManagerService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/12 14:06
 */
@RestController
@RequestMapping("/outboundManagement")
@Api(tags = {"出库管理新增出库功能中的增删改查接口"})
public class OutboundManagementController {

    @Autowired
    private OutboundManagerService outboundManagerService;
    //新增出库/提交审核/直接出库(修改状态)
    @PostMapping("/add")
    @ApiOperation(value = "add",notes = "新增出库")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok"),
            @ApiResponse(code = 300,message = "no")
    })
    public Result add(@ApiParam(name = "outboundInfo",value = "新增出库的信息")@RequestBody OutboundInfo outboundInfo){
        System.out.println("获取到的出库信息=" + outboundInfo);
        try {
            outboundManagerService.saveAndEdit(outboundInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtils.buildFail(300,"库存数量不足以出库",0L,null);
        }
        return ResultUtils.buildFail(200,"add",0L,null);
    }
    //搜索功能
    @PostMapping("/search")
    @ApiOperation(value = "search",notes = "搜索功能")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = OutboundInfo.class)
    })
    public Result search(@RequestBody SearchCondition searchCondition){
        System.out.println("search");
        System.out.println("审核状态"+searchCondition.getStatus() + "出库类型" + searchCondition.getDrugType() + "出库单号" + searchCondition.getDeliveryOrderNo());
        List<OutboundInfo> search = outboundManagerService.search(searchCondition.getStatus(), searchCondition.getDrugType(), searchCondition.getDeliveryOrderNo());
        return ResultUtils.buildFail(200,"ok",Long.valueOf(search.size()),search);
    }

//    @GetMapping("/queryList")
//    @ApiOperation(value = "queryList",notes = "查询所有")
//    @ApiResponses({
//            @ApiResponse(code = 200,message = "ok",response = OutboundInfo.class)
//    })
//    public Result queryList(){
//        List<OutboundInfo> search = outboundManagerService.search(null, null, null);
//        return ResultUtils.buildFail(200,"ok",Long.valueOf(search.size()),search);
//    }
    //再次出库
    @PostMapping("/outboundAgain")
    @ApiOperation(value = "outboundAgain",notes = "再次入库")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result outboundAgain(@ApiParam(name = "id",value = "通过id去查询到数据") @RequestBody BasicInfo basicInfo){
        System.out.println("获取到的id="+basicInfo.getId());
        System.out.println("outboundAgain");
        OutboundInfo outboundInfo = outboundManagerService.queryById(basicInfo.getId());
        return ResultUtils.buildFail(200,"outboundAgain",1L,outboundInfo);
    }
    //删除
    @PostMapping("/deleteById")
    @ApiOperation(value = "deleteById",notes = "根据id删除")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result deleteById(@ApiParam (value = "id",name = "根据id删除") @RequestBody BasicInfo basicInfo){
        System.out.println("deleteById");
        System.out.println("获取到的id="+basicInfo.getId());
        outboundManagerService.deleteById(basicInfo.getId());
        return ResultUtils.buildFail(200,"deleteById",0L,null);
    }

}
