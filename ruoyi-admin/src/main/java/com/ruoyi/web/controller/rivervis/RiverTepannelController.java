package com.ruoyi.web.controller.rivervis;

import com.ruoyi.broad.domain.BroadCount;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.rivervis.domain.terminalsdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.rivervis.service.IterminalsdataService;

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
    private IterminalsdataService iterminalsdataService;
    @GetMapping()
    public String tepannel() {
        return prefix + "/tepannel";
    }

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list() {
        startPage();
        List<terminalsdata> list = iterminalsdataService.select();
        return getDataTable(list);
    }
}
