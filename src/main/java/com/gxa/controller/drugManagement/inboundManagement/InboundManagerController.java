package com.gxa.controller.drugManagement.inboundManagement;

import com.gxa.entity.drugManagement.inboundManagement.InboundInfo;
import com.gxa.result.Result;
import com.gxa.result.ResultUtils;
import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :林溪
 * @date : 2022/10/12 11:33
 */
@RestController
@RequestMapping("/inboundManager")
@Api(tags = {"入库管理接口"})
public class InboundManagerController {

    @Autowired
    private InboundManagerVisualData InboundManagerVisualData;

    //列表
    @GetMapping("/list")
    @ApiOperation(value = "list",notes = "入库管理列表")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = InboundInfo.class )
    })
    public Result list(){
        System.out.println("list");
        return ResultUtils.buildFail(200,"ok",30L,InboundManagerVisualData.getInboundInfos());
    }
    //根据id查询
    @GetMapping("/queryById")
    @ApiOperation(value = "queryById",notes = "修改功能,根据id查询数据")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = InboundInfo.class )
    })
    public Result queryById(@ApiParam("再次入库与查询功能所需id")Integer id){
        System.out.println(id);
        return ResultUtils.buildFail(200,"ok",30L,InboundManagerVisualData.getInboundInfos().get(2));
    }
    //删除
    @PostMapping("/delete")
    @ApiOperation(value = "delete",notes = "根据id删除数据")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok")
    })
    public Result delete(@ApiParam("删除数据所需id")Integer id){
        System.out.println(id);
        return ResultUtils.buildFail(200,"ok",30L,null);
    }
    //搜索
    @GetMapping("/search")
    @ApiOperation(value = "search",notes = "搜索功能")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = InboundInfo.class )
    })
    public Result search(@ApiParam("审核状态")String auditStatus,
                         @ApiParam("入库类型")String receiptType,
                         @ApiParam("入库单号/供应商")String rules){
        System.out.println(auditStatus+","+receiptType+","+rules);
        return ResultUtils.buildFail(200,"ok",3L,InboundManagerVisualData.getInboundInfos());
    }
    //提交审核
    @PostMapping("/save")
    @ApiOperation(value = "save",notes = "审核提交(审核通过与不通过)")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok" )
    })
    public Result save(@ApiParam("审核提交数据")InboundInfo inboundInfo){
        System.out.println(inboundInfo);
        return ResultUtils.buildFail(200,"ok",0L,null);
    }

}
