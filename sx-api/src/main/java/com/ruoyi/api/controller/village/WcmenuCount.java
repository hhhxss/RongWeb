package com.ruoyi.api.controller.village;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.village.domain.Wcmenu;
import com.ruoyi.village.service.IWcmenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Wcmenu")
@CrossOrigin
@Api(value = "村务功能类型-- 统计计数类接口")
public class WcmenuCount {

    @Autowired
    private IWcmenuService wcmenuService;

    @CrossOrigin
    @GetMapping("/mname")
    @ApiOperation(value = "村务功能类型")
    public RongApiRes list()
    {
        return RongApiService.get_list(wcmenuService.selectWcmenuBymname());
    }
}
