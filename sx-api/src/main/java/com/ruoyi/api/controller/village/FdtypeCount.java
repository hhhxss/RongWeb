package com.ruoyi.api.controller.village;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.village.service.IFdtypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program
 * @description： 反馈投诉表 控制层
 * @author：谢陈亮
 * @date：2019-12-27
 */

@RestController
@RequestMapping("/api/fdtype")
@CrossOrigin
@Api(value = "反馈信息")
public class FdtypeCount extends BaseController {
    @Autowired
    public IFdtypeService fdtypeService;

    @CrossOrigin
    @GetMapping("/type")
    @ApiOperation(value = "根据类型对反馈信息进行统计")
    public RongApiRes selectFdtypeFype(){
        List pre=fdtypeService.selectFdtypeFtype();
        RongApiRes test= RongApiService.get_list(pre);
        return test;

    }
}
