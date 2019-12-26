package com.ruoyi.api.controller.iot;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.iot.service.IEngmanaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program
 * @description： 能源管理终端采集信息表 控制层
 * @author：谢陈亮
 * @date：2019-12-26
 */

@RestController
@RequestMapping("/api/engmana")
@CrossOrigin
@Api(value = "金桥镇雨量信息")
public class EngmanaCount {
    @Autowired
    public IEngmanaService engmanaService;

    @CrossOrigin
    @GetMapping("/engid")
    @ApiOperation(value = "根据id查询能源管理终端信息")
    public RongApiRes selectEngmanaById() {
        List pre = engmanaService.selectEngmanaById();
        RongApiRes test = RongApiService.get_list(pre);
        return test;
    }
}