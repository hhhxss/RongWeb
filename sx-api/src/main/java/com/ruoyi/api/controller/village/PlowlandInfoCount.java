package com.ruoyi.api.controller.village;


import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.village.domain.PlowlandInfo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.village.service.IPlowlandInfoService;

import java.util.List;

/**
 * 耕地信息 控制层
 *
 * @author pzh
 * @date 2019-11-24
 */
@RestController
@RequestMapping("/api/plinfo")
@CrossOrigin
@Api(value = "耕地信息")

public class PlowlandInfoCount extends BaseController {

    @Autowired
    public IPlowlandInfoService plowlandInfoService;

    @CrossOrigin
    @GetMapping("/type")
    @ApiOperation(value = "根据分组对耕地信息的统计")
    public RongApiRes selectPlowlandInfoByType() {
        List pre = plowlandInfoService.selectPlowlandInfoByType();
        RongApiRes test = RongApiService.get_list(pre);
        return test;
    }
}
