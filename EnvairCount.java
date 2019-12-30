package com.ruoyi.api.controller.iot;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.iot.service.IEnvairService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 空气质量 控制层
 *
 * @author xcl
 * @date 2019-12-29
 */

@RestController
@RequestMapping("/api/envair")
@CrossOrigin
@Api(value = "空气质量信息")
public class EnvairCount {
    @Autowired
    public IEnvairService envairService;

    @CrossOrigin
    @GetMapping("/airpm")
    @ApiOperation(value = "空气质量信息")
    public RongApiRes selectEnvairPm() {
        List pre = envairService.selectEnvairPm();
        RongApiRes test = RongApiService.get_list(pre);
        return test;
    }
}
