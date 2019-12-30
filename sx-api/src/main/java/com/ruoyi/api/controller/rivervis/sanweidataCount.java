package com.ruoyi.api.controller.rivervis;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.rivervis.domain.sanweidata;
import com.ruoyi.rivervis.service.IsanweidataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mountain")
@CrossOrigin
@Api(value = "山洪水位及流量")
public class sanweidataCount extends BaseController {
    @Autowired
    private IsanweidataService sanweidataService;

    @CrossOrigin
    @GetMapping("/list")
    @ApiOperation(value = "查询所有山洪水位及流量列表")
    public RongApiRes list(sanweidata sanweidata)
    {
        return RongApiService.get_list(sanweidataService.selectsanweidataList(sanweidata));
    }

    @CrossOrigin
    @GetMapping("/time")
    @ApiOperation(value = "根据时间查询")
    public RongApiRes list()
    {
        return RongApiService.get_list(sanweidataService.selectsanweidataListflow());
    }
}
