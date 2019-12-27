package com.ruoyi.api.controller.iot;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.iot.domain.Quantang;
import com.ruoyi.iot.service.IQuantangService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/qtdata")
@CrossOrigin
@Api(value = "泉塘街道河流水位走势 - 统计计数类接口")
public class RiversCount {

    @Autowired
    private IQuantangService quantangService;

    @CrossOrigin
    @GetMapping("/list")
    @ApiOperation(value = "查询泉塘水位走势列表")
    public RongApiRes list(Quantang quantang)
    {
        return RongApiService.get_list(quantangService.selectQuantangList(quantang));
    }

    @CrossOrigin
    @GetMapping("/time")
    @ApiOperation(value = "查询泉塘水位走势")
    public RongApiRes list()
    {
        return RongApiService.get_list(quantangService.selectQuantangListBytime());
    }

}
