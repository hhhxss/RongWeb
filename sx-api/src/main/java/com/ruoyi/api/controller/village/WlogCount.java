package com.ruoyi.api.controller.village;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.village.domain.Wlog;
import com.ruoyi.village.service.IWlogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Wlog")
@CrossOrigin
@Api(value = "村务消息已读类型统计-- 统计计数类接口")
public class WlogCount {
    @Autowired
    private IWlogService wlogService;

    @CrossOrigin
    @GetMapping("/logtype")
    @ApiOperation(value = "村务消息已读类型统计")
    public RongApiRes list()
    {
        return RongApiService.get_list(wlogService.selectWlogBylogtype());
    }
}
