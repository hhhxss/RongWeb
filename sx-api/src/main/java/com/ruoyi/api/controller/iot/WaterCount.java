package com.ruoyi.api.controller.iot;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.iot.domain.Water;
import com.ruoyi.iot.service.IWaterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/waterdata")
@CrossOrigin
@Api(value = "各水库水位走势 - 统计计数类接口")
public class WaterCount {

    @Autowired
    private IWaterService waterService;

    @CrossOrigin
    @GetMapping("/list")
    @ApiOperation(value = "查询各水库水位列表")
    public RongApiRes list(Water water)
    {
        return RongApiService.get_list(waterService.selectWaterList(water));
    }

    @CrossOrigin
    @GetMapping("/rname")
    @ApiOperation(value = "查询各水库水位走势")
    public RongApiRes list()
    {
        return RongApiService.get_list(waterService.selectWaterListByrname());
    }
}