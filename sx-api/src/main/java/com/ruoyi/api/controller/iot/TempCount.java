package com.ruoyi.api.controller.iot;


import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.iot.domain.JinQiao;
import com.ruoyi.iot.service.IJinQiaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jinqiao")
@CrossOrigin
@Api(value = "金桥镇温度走势 - 统计计数类接口")
public class TempCount {

    @Autowired
    private IJinQiaoService jinqiaoService;

    @CrossOrigin
    @GetMapping("/st")
    @ApiOperation(value = "查询金桥温度列表")
    public RongApiRes list(JinQiao jinqiao)
    {
        return RongApiService.get_list(jinqiaoService.selectJinQiaoList(jinqiao));
    }

    @CrossOrigin
    @GetMapping("/time")
    @ApiOperation(value = "查询金桥温度列表")
    public RongApiRes list()
    {
        return RongApiService.get_list(jinqiaoService.selectJinQiaoBytime());
    }

}