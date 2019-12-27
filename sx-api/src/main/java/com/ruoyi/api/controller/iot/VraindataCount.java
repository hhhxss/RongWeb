package com.ruoyi.api.controller.iot;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.iot.domain.Vraindata;
import com.ruoyi.iot.service.IVraindataService;
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
 * @description： 村镇雨量表 控制层
 * @author：谢陈亮
 * @date：2019-12-22
 */

@RestController
@RequestMapping("/api/vraindata")
@CrossOrigin
@Api(value = "村镇雨量信息")
public class VraindataCount {
    @Autowired
    public IVraindataService vraindataService;

    @CrossOrigin
    @GetMapping("/list")
    @ApiOperation(value = "查询村镇雨量信息列表")
    public RongApiRes list(Vraindata vraindata){
        return RongApiService.get_list(vraindataService.selectVraindataList(vraindata));
    }

    @CrossOrigin
    @GetMapping("/rname")
    @ApiOperation(value = "根据地域名称对村镇雨量进行统计")
    public RongApiRes selectVraindataByrname(){
        List pre=vraindataService.selectVraindataByrname();
        RongApiRes test= RongApiService.get_list(pre);
        return test;

    }

}