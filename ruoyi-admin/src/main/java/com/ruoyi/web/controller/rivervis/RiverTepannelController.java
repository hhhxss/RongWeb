package com.ruoyi.web.controller.rivervis;

import com.ruoyi.framework.web.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @GetMapping()
    public String tepannel() {
        return prefix + "/tepannel";
    }
}
