package com.ruoyi.api.controller.iot;


import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.iot.domain.Lukou;
import com.ruoyi.iot.service.ILukouService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lukoudata")
@CrossOrigin
@Api(value = "路口镇温度走势 - 统计计数类接口")
public class LukouCount {

    @Autowired
    private ILukouService lukouService;

    @CrossOrigin
    @GetMapping("/list")
    @ApiOperation(value = "查询路口镇温度列表")
    public RongApiRes list(Lukou lukou)
    {
        return RongApiService.get_list(lukouService.selectLukouList(lukou));
    }

    @CrossOrigin
    @GetMapping("/time")
    @ApiOperation(value = "查询路口镇温度走势")
    public RongApiRes list()
    {
        return RongApiService.get_list(lukouService.selectLukouListBytime());
    }
}
