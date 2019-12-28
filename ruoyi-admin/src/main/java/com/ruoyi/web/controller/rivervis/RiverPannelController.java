package com.ruoyi.web.controller.rivervis;

import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.rivervis.domain.logss;
import com.ruoyi.rivervis.service.IlogssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 张超 teavamc
 * @Description:TODO
 * @ClassName RiverPannelController
 * @date 2019/3/27 16:41
 **/
@Controller
@RequestMapping("/rivervis/pannel")
public class RiverPannelController extends BaseController {
    private String prefix = "rivervis/pannel";

    @Autowired
    private IlogssService logssService;

    @GetMapping()
    public String pannel() {
        return prefix + "/pannel";
    }

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list() {
        startPage();
        List<logss> list = logssService.select();
        return getDataTable(list);
    }
}
