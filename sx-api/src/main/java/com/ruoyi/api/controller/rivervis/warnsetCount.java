package com.ruoyi.api.controller.rivervis;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.rivervis.domain.warnset;
import com.ruoyi.rivervis.service.IwarnsetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rivervis")
@CrossOrigin
@Api(value = "山洪预警 - 预警值")
public class warnsetCount {
    @Autowired
    private IwarnsetService warnsetService;
    @CrossOrigin
    @GetMapping("/list")
    @ApiOperation(value = "查询所有预警值列表")
    public RongApiRes list(warnset warnset)
    {
        return RongApiService.get_list(warnsetService.selectwarnsetList(warnset));
    }
    @CrossOrigin
    @GetMapping("/area")
    @ApiOperation(value = "按地区查询预警值")
    public RongApiRes list()
    {
        return RongApiService.get_list(warnsetService.selectwarnsetListaname());
    }
}
