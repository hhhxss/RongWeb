package com.ruoyi.api.controller.iot;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.iot.domain.Anshan;
import com.ruoyi.iot.service.IAnshanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/anshandata")
@CrossOrigin
@Api(value = "安山镇温度走势 - 统计计数类接口")
public class AnshanCount {

    @Autowired
    private IAnshanService anshanService;

    @CrossOrigin
    @GetMapping("/list")
    @ApiOperation(value = "查询安山镇温度列表")
    public RongApiRes list(Anshan anshan)
    {
        return RongApiService.get_list(anshanService.selectAnshanList(anshan));
    }

    @CrossOrigin
    @GetMapping("/time")
    @ApiOperation(value = "查询安山镇温度走势")
    public RongApiRes list()
    {
        return RongApiService.get_list(anshanService.selectAnshanListBytime());
    }

}
