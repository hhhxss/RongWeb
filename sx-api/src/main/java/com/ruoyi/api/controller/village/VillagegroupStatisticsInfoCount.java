package com.ruoyi.api.controller.village;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.village.domain.VillagegroupStatisticsInfo;
import com.ruoyi.village.domain.VillagerInfo;
import com.ruoyi.village.service.IVillagegroupStatisticsInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @param :$params$
 * @Description:
 * @Return: $returns$
 * @开发人员: 冯梦迪
 * @单位：湖南农业大学物联网工程专业
 * @Date: 2019-12-25
 * @开发版本：综合练习Vo.1
 */
@RestController
@RequestMapping("/api/vgsi")
@CrossOrigin
@Api(value = "村组统计")
public class VillagegroupStatisticsInfoCount {
    @Autowired
    public IVillagegroupStatisticsInfoService villagegroupStatisticsInfoService;

    @CrossOrigin
    @GetMapping("/list")
    @ApiOperation(value = "查询村组信息列表" )
    public RongApiRes list(VillagegroupStatisticsInfo villagegroupStatisticsInfo)
    {
        return RongApiService.get_list(villagegroupStatisticsInfoService.selectVillagegroupStatisticsInfoList(villagegroupStatisticsInfo));
    }

    @CrossOrigin
    @GetMapping("/type")
    @ApiOperation(value = "根据分组对村组面积的统计" )
    public RongApiRes selectVillagegroupStatisticsInfoGtype(){
        List pre=villagegroupStatisticsInfoService.selectVillagegroupGtype();
        RongApiRes test=RongApiService.get_list(pre);
        return test;
    }
    @CrossOrigin
    @GetMapping("/farmland")
    @ApiOperation(value = "查询村组农用地小计" )
    public RongApiRes selectVillagegroupStatisticsInfofarmland(){
        List pre=villagegroupStatisticsInfoService.selectVillagegroupfarmland();
        RongApiRes test=RongApiService.get_list(pre);
        return test;
    }
    @CrossOrigin
    @GetMapping("/otherland")
    @ApiOperation(value = "查询村组其他农用地" )
    public RongApiRes selectVillagegroupStatisticsInfootherland(){
        List pre=villagegroupStatisticsInfoService.selectVillagegroupotherland();
        RongApiRes test=RongApiService.get_list(pre);
        return test;
    }
    @CrossOrigin
    @GetMapping("/forest")
    @ApiOperation(value = "查询村组林地" )
    public RongApiRes selectVillagegroupStatisticsInfoforest(){
        List pre=villagegroupStatisticsInfoService.selectVillagegroupforest();
        RongApiRes test=RongApiService.get_list(pre);
        return test;
    }
    @CrossOrigin
    @GetMapping("/plowland")
    @ApiOperation(value = "查询村组耕地" )
    public RongApiRes selectVillagegroupStatisticsInfoplowland(){
        List pre=villagegroupStatisticsInfoService.selectVillagegroupplowland();
        RongApiRes test=RongApiService.get_list(pre);
        return test;
    }
    @CrossOrigin
    @GetMapping("/orchard")
    @ApiOperation(value = "查询村组园地" )
    public RongApiRes selectVillagegroupStatisticsInfoorchard(){
        List pre=villagegroupStatisticsInfoService.selectVillagegrouporchard();
        RongApiRes test=RongApiService.get_list(pre);
        return test;
    }
    @CrossOrigin
    @GetMapping("/fland")
    @ApiOperation(value = "各农用地集中展示" )
    public RongApiRes selectVillagegroupStatisticsInfofland(){
        List pre=villagegroupStatisticsInfoService.selectVillagegroupfland();
        RongApiRes test=RongApiService.get_list(pre);
        return test;
    }
    @CrossOrigin
    @GetMapping("/aqarea")
    @ApiOperation(value = "查询村组耕地" )
    public RongApiRes selectVillagegroupStatisticsInfoaqarea(){
        List pre=villagegroupStatisticsInfoService.selectVillagegroupaqarea();
        RongApiRes test=RongApiService.get_list(pre);
        return test;
    }
    @CrossOrigin
    @GetMapping("/fd")
    @ApiOperation(value = "查询村组耕地" )
    public RongApiRes selectVillagegroupStatisticsInfofd(){
        List pre=villagegroupStatisticsInfoService.selectVillagegroupfd();
        RongApiRes test=RongApiService.get_list(pre);
        return test;
    }
}
