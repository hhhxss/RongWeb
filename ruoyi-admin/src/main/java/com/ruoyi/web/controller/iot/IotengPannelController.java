package com.ruoyi.web.controller.iot;

import com.ruoyi.broad.domain.BroadCount;
import com.ruoyi.broad.service.IBcountService;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.menus;
import com.ruoyi.iot.service.ImenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xss
 * @Description:TODO
 * @ClassName IotmetPlannelController
 * @date 2019/3/27 15:49
 **/
@Controller
@RequestMapping("/iot/engpannel")
public class IotengPannelController extends BaseController
{
    private String prefix = "iot/engpannel";
    @Autowired
    private ImenusService menusService;


    @GetMapping()
    public String engpannel() {
        return prefix + "/engpannel";
    }
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list() {
        startPage();
        List<menus> list = menusService.select();
        return getDataTable(list);
    }
}
