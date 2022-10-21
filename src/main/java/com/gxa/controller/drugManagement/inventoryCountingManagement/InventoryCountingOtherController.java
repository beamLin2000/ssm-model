package com.gxa.controller.drugManagement.inventoryCountingManagement;

import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfoArray;
import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfoArrayAll;
import com.gxa.result.Result;
import com.gxa.result.ResultUtils;
import com.gxa.service.drugManagement.inventoryCountingManagement.InventoryCountingInfoArrayAllService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author :林溪
 * @date : 2022/10/12 20:03
 */
@RestController
@RequestMapping("/InventoryCountingOther")
@Api(tags = {"库存盘点,查看功能那个中的搜索接口"})
public class InventoryCountingOtherController {

    @Autowired
    private InventoryCountingInfoArrayAllService inventoryCountingInfoArrayAllService;

    @GetMapping("/search01")
    @ApiOperation(value = "search",notes = "新增功能中,的搜索功能")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = InventoryCountingInfoArray.class)//,
    })
    public Result search(@ApiParam("处方类别/收费类别")String drugType,@ApiParam("药品名称")String rules){
        List<InventoryCountingInfoArrayAll> inventoryCountingInfoArrayAlls = this.inventoryCountingInfoArrayAllService.queryByruls(drugType,rules);
        return ResultUtils.buildFail(200,"ok",0L,inventoryCountingInfoArrayAlls);
    }


}
