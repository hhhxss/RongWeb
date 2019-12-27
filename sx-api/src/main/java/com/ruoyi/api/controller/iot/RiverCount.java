package com.ruoyi.api.controller.iot;


import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.iot.domain.FuLin;
import com.ruoyi.iot.service.IFuLinService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fulin")
@CrossOrigin
@Api(value = "福临街道河流水位走势 ")
public class RiverCount {

    @Autowired
    private IFuLinService fulinService;

    @CrossOrigin
    @GetMapping("/st")
    @ApiOperation(value = "查询水位走势列表")
    public RongApiRes list(FuLin fulin)
    {
        return RongApiService.get_list(fulinService.selectFuLinList(fulin));
    }

    @CrossOrigin
    @GetMapping("/time")
    @ApiOperation(value = "查询福临村雨量走势列表")
    public RongApiRes list()
    {
        return RongApiService.get_list(fulinService.selectFuLinBytime());
    }

}
