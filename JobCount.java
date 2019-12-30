package com.ruoyi.api.controller.village;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.village.domain.Job;
import com.ruoyi.village.service.IJobService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jobdata")
@CrossOrigin
@Api(value = "村镇大学生专业类型统计 - 统计计数类接口")
public class JobCount {

    @Autowired
    private IJobService jobService;

    @CrossOrigin
    @GetMapping("/list")
    @ApiOperation(value = "查询村镇大学生专业类型列表")
    public RongApiRes list(Job job)
    {
        return RongApiService.get_list(jobService.selectJobList(job));
    }

    @CrossOrigin
    @GetMapping("/jtype")
    @ApiOperation(value = "查询村镇大学生专业类型列表")
    public RongApiRes list()
    {
        return RongApiService.get_list(jobService.selectJobListByjtype());
    }
}
