package com.gxa.controller.drugmanagement.inventoryCountingManagement;

import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfoArray;
import com.gxa.result.Result;
import com.gxa.result.ResultUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :林溪
 * @date : 2022/10/12 20:03
 */
@RestController
@RequestMapping("/InventoryCountingOther")
@Api(value = "InventoryCountingOtherController",description = "库存盘点,查看功能中的搜索")
public class InventoryCountingOtherController {

    @Autowired
    private InventoryCountingVisualData inventoryCountingVisualData;

    @RequestMapping("/search")
    @ApiOperation(value = "search",notes = "新增功能中,的搜索功能")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = InventoryCountingInfoArray.class)//,
    })
    public Result search(){
        System.out.println("search");
        return ResultUtils.buildFail(200,"ok",0L,inventoryCountingVisualData.getInventoryCountingInfo().get(0).getInventoryCountingInfoArray());
    }


}
