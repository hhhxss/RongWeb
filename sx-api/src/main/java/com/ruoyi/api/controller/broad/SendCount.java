package com.ruoyi.api.controller.broad;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.broad.domain.Sendmessages;
import com.ruoyi.broad.service.ISendmessagesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*author:xss
**time:2019-12-26
 */
@RestController
@RequestMapping("/api/broad")
@CrossOrigin
@Api(value = "广播发送信息可视化")
public class SendCount {
    @Autowired
    private ISendmessagesService sendmessagesService;
    @CrossOrigin
    @GetMapping("/remark")
    @ApiOperation(value = "查询信息类型列表")
    public RongApiRes list(Sendmessages sendmessages)
    {
        return RongApiService.get_list(sendmessagesService.selectSendByremark());
    }
}
