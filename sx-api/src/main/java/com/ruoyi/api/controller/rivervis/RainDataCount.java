package com.ruoyi.api.controller.rivervis;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.rivervis.domain.RainData;
import com.ruoyi.rivervis.service.IRainDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/raindata")
@CrossOrigin
@Api(value = "开慧村雨量走势 - 统计计数类接口")
public class RainDataCount {

    @Autowired
    private IRainDataService rainDataService;

    @CrossOrigin
    @GetMapping("/st")
    @ApiOperation(value = "查询开慧村雨量列表")
    public RongApiRes list(RainData rainData)
    {
        return RongApiService.get_list(rainDataService.selectRainDataList(rainData));
    }

    @CrossOrigin
    @GetMapping("/time")
    @ApiOperation(value = "查询开慧村雨量走势列表")
    public RongApiRes list()
    {
        return RongApiService.get_list(rainDataService.selectRainDataBytime());
    }
}