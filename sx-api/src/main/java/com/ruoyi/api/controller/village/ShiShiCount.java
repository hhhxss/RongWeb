package com.ruoyi.api.controller.village;

import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.village.domain.Shishi;
import com.ruoyi.village.mapper.ShishiMapper;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.village.service.IShishiService;

import java.util.List;

/**
 * 实时政事表信息 控制层
 *
 * @author 薛莎莎
 * @date 2019-12-21
 */

@RestController
@RequestMapping("/api/shishi")
@CrossOrigin
@Api(value = "实时政事表信息")
public class ShiShiCount extends BaseController {
    @Autowired
    public IShishiService shishiService;

    @CrossOrigin
    @GetMapping("/list")
    @ApiOperation(value = "查询实时政事信息列表")
    public RongApiRes list(Shishi shishi)
    {
        return RongApiService.get_list(shishiService.selectShishiList(shishi));
    }
    @GetMapping("type")
    @ApiOperation(value="根据实时政事类型对其的统计")
    public RongApiRes selectShishiBytype(){
        List pre =shishiService.selectShishiBytype();
        RongApiRes test = RongApiService.get_list(pre);
        return test;
    }

}
