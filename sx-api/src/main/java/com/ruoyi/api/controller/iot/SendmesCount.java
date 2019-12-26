package com.ruoyi.api.controller.iot;

import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.Sendmes;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.iot.service.ISendmesService;
/**
 * 发送信息表 控制层
 *
 * @author 薛莎莎
 * @date 2019-12-25
 */
@RestController
@RequestMapping("/api/sendmes")
@CrossOrigin
@Api(value = "发送信息表")
public class SendmesCount extends BaseController{
    @Autowired
    private ISendmesService sendmesService;

    @CrossOrigin
    @GetMapping("/list")
    @ApiOperation(value = "查询发送信息列表")
    public RongApiRes list(Sendmes sendmes)
    {
        return RongApiService.get_list(sendmesService.selectSendmesList(sendmes));
    }

    @CrossOrigin
    @GetMapping("/remark")
    @ApiOperation(value = "根据remark查询发送信息列表")
    public RongApiRes list()
    {
        return RongApiService.get_list(sendmesService.selectSendmesByremark());
    }
}
