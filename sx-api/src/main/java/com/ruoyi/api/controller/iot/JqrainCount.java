package com.ruoyi.api.controller.iot;
import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.iot.service.IJqrainService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program
 * @description： 金桥镇雨量信息 控制层
 * @author：谢陈亮
 * @date：2019-12-26
 */

@RestController
@RequestMapping("/api/jqrain")
@CrossOrigin
@Api(value = "金桥镇雨量信息")
public class JqrainCount
{
    @Autowired
    public IJqrainService jqrainService;

    @CrossOrigin
    @GetMapping("/time")
    @ApiOperation(value = "根据time查询雨量信息")
    public RongApiRes selectJqrainBytime() {
        List pre = jqrainService.selectJqrainBytime();
        RongApiRes test = RongApiService.get_list(pre);
        return test;
    }
}
