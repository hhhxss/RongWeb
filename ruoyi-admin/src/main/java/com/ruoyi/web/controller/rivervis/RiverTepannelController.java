package com.ruoyi.web.controller.rivervis;

import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.rivervis.domain.sanweidata;
import com.ruoyi.rivervis.service.IsanweidataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xss
 * @Description:
 * @ClassName RiverTepannelController
 * @date 2019/12/2
 **/
@Controller
@RequestMapping("/rivervis/tepannel")
public class RiverTepannelController extends BaseController{
    private String prefix = "rivervis/tepannel";
    @Autowired
    private IsanweidataService sanweidataService;

    @GetMapping()
    public String pannel() {
        return prefix + "/tepannel";
    }

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list() {
        startPage();
        List<sanweidata> list = sanweidataService.select();
        return getDataTable(list);
    }
}
