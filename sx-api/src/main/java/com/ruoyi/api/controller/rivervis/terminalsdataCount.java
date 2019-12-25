package com.ruoyi.api.controller.rivervis;

import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.rivervis.domain.terminalsdata;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.rivervis.service.IterminalsdataService;
/**
 * 终端数据信息 控制层
 *
 * @author 薛莎莎
 * @date 2019-12-24
 */
@RestController
@RequestMapping("/api/terminalsdata")
@CrossOrigin
@Api(value = "终端数据信息")
public class terminalsdataCount extends BaseController{
    @Autowired
    private IterminalsdataService iterminalsdataService;

    @CrossOrigin
    @GetMapping("/list")
    @ApiOperation(value = "查询终端数据信息列表")
    public RongApiRes list(terminalsdata terminalsdata)
    {
        return RongApiService.get_list(iterminalsdataService.selectterminalsdataList(terminalsdata));
    }

    @CrossOrigin
    @GetMapping("/hum")
    @ApiOperation(value = "根据湿度对终端数据的查询-")
    public RongApiRes list()
    {
        return RongApiService.get_list(iterminalsdataService.selectterminalsdataByhum());
    }

    @CrossOrigin
    @GetMapping("/temp")
    @ApiOperation(value = "根据温度对终端数据的查询-")
    public RongApiRes listtemp()
    {
        return RongApiService.get_list(iterminalsdataService.selectterminalsdataBytemp());
    }
}
