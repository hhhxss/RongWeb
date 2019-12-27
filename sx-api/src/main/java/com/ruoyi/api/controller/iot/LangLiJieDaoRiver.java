package com.ruoyi.api.controller.iot;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.iot.domain.LangLiJieDao;
import com.ruoyi.iot.service.ILangLiJieDaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/langlijiedao")
@CrossOrigin
@Api(value = "榔梨街道河流水位走势 - 统计计数类接口")
public class LangLiJieDaoRiver {
    @Autowired
    private ILangLiJieDaoService langlijiedaoService;

    @CrossOrigin
    @GetMapping("/st")
    @ApiOperation(value = "查询榔梨街道河流水位列表")
    public RongApiRes list()
    {
        return RongApiService.get_list(langlijiedaoService.selectLangLiJieDaoBytime());
    }

}
