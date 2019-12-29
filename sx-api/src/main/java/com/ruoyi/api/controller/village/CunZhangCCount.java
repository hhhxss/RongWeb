package com.ruoyi.api.controller.village;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.village.domain.CunZhangC;
import com.ruoyi.village.service.ICunZhangCService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/CunZhangC")
@CrossOrigin
@Api(value = "村长竞选票数统计-- 统计计数类接口")
public class CunZhangCCount {
    @Autowired
    private ICunZhangCService cunzhangcService;

    @CrossOrigin
    @GetMapping("/st")
    @ApiOperation(value = "村长竞选票数统计列表")
    public RongApiRes list()
    {
        return RongApiService.get_list(cunzhangcService.selectCunZhangCByuname());
    }

}
