package com.ruoyi.api.controller.broad;


import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.broad.domain.ProreApply;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.broad.service.IProreApplyService;

import java.util.List;

/**
 * 节目播出单管理页面的显示 控制层
 *
 * @author 薛莎莎
 * @date 2019-12-4
 */
@RestController
@RequestMapping("/api/proreapply")
@CrossOrigin
@Api(value = "节目申请列表")
public class ProreApplyCount extends BaseController{
    @Autowired
    private IProreApplyService proreApplyService;

    @CrossOrigin
    @GetMapping("/isemer")
    @ApiOperation(value ="节目申请是否紧急")
    public RongApiRes selectListByScategory() {
        List pre = proreApplyService.selectProreApplyIsEmer();
        RongApiRes test = RongApiService.get_list(pre);
        return test;
    }
    @CrossOrigin
    @GetMapping("/isreply")
    @ApiOperation(value ="节目申请是否回复")
    public RongApiRes selectListByIsreply() {
        List pre = proreApplyService.selectProreApplyIsrely();
        RongApiRes test = RongApiService.get_list(pre);
        return test;
    }

}
