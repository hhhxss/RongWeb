package com.ruoyi.api.controller.iot;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.iot.domain.DataAnalysis;
import com.ruoyi.iot.service.IDataAnalysisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/iot")
@CrossOrigin
@Api(value = "开慧镇数据分析")
public class DataAnalysisCount {
    @Autowired
    private IDataAnalysisService DataAnalysisService;
    @CrossOrigin
    @GetMapping("/list")
    @ApiOperation(value = "查询雨量，水位值列表")
    public RongApiRes list(DataAnalysis DataAnalysis)
    {
        return RongApiService.get_list(DataAnalysisService.selectDataAnalysisList(DataAnalysis));
    }
    @CrossOrigin
    @GetMapping("time")
    @ApiOperation(value = "按时间查询雨量和水位")
    public RongApiRes list()
    {
        return RongApiService.get_list(DataAnalysisService.selectDataAnalysisBytime());
    }
}
