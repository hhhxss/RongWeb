package com.ruoyi.api.controller.rivervis;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.rivervis.domain.TerminalsData;
import com.ruoyi.rivervis.service.ITerminalsDataService;
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
@Api(value = "终端设备温度湿度电压")
public class TerminalsDataCount {
    @Autowired
    private ITerminalsDataService TerminalsDataService;
    @CrossOrigin
    @GetMapping("/all")
    @ApiOperation(value = "查询所有终端设备温度湿度电压")
    public RongApiRes list(TerminalsData TerminalsData)
    {
        return RongApiService.get_list(TerminalsDataService.selectTerminalsDataList(TerminalsData));
    }
    @CrossOrigin
    @GetMapping("/hum")
    @ApiOperation(value = "按湿度查询温度电压")
    public RongApiRes list()
    {
        return RongApiService.get_list(TerminalsDataService.selectTerminalsDataListhum());
    }

}
