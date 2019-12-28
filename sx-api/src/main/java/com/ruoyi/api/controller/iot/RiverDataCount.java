package com.ruoyi.api.controller.iot;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.iot.domain.RiverData;
import com.ruoyi.iot.service.IRiverDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/iot")
@CrossOrigin
@Api(value = "各地区水量大小")
public class RiverDataCount {
    @Autowired
    private IRiverDataService RiverDataService;
    @CrossOrigin
    @GetMapping("/lis")
    @ApiOperation(value = "查询所有地区雨量列表")
    public RongApiRes list(RiverData RiverData)
    {
        return RongApiService.get_list(RiverDataService.selectRiverDataList(RiverData));
    }
    @CrossOrigin
    @GetMapping("/rid")
    @ApiOperation(value = "按地区编号查询雨量和水位")
    public RongApiRes list()
    {
        return RongApiService.get_list(RiverDataService.selectRiverDataByrid());
    }
}
