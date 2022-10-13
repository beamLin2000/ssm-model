package com.gxa.controller.drugManagement.inventoryCountingManagement;

import com.gxa.entity.drugManagement.inventoryCountingManagement.InventoryCountingInfoArray;
import com.gxa.result.Result;
import com.gxa.result.ResultUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :林溪
 * @date : 2022/10/12 20:03
 */
@RestController
@RequestMapping("/InventoryCountingOther")
@Api(tags = {"库存盘点,查看功能那个中的搜索接口"})
public class InventoryCountingOtherController {

    @Autowired
    private InventoryCountingVisualData inventoryCountingVisualData;

    @GetMapping("/search")
    @ApiOperation(value = "search",notes = "新增功能中,的搜索功能")
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = InventoryCountingInfoArray.class)//,
    })
    public Result search(){
        System.out.println("search");
        return ResultUtils.buildFail(200,"ok",0L,inventoryCountingVisualData.getInventoryCountingInfo().get(0).getInventoryCountingInfoArray());
    }


}
