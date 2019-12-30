package com.ruoyi.api.controller.broad;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.broad.service.ITertrafficService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 终端流量使用信息表 terminal_traffic 服务层实现
 *
 * @author xcl
 * @date 2019-12-29
 */

@RestController
@RequestMapping("/api/tertraffic")
@CrossOrigin
@Api(value = "终端流量使用信息")
public class TertrafficCount {
    @Autowired
    public ITertrafficService tertrafficService;

    @CrossOrigin
    @GetMapping("/usetraffic")
    @ApiOperation(value = "终端流量使用信息")
    public RongApiRes selectTertrafficUsetraffic() {
        List pre = tertrafficService.selectTertrafficUsetraffic();
        RongApiRes test = RongApiService.get_list(pre);
        return test;
    }
}
