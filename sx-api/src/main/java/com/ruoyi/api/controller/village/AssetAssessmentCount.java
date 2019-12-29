package com.ruoyi.api.controller.village;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.village.domain.AssetAssessment;
import com.ruoyi.village.service.IAssetAssessmentService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @param $
 * @Description:
 * @Return: $
 * @开发人员：张婕
 * @单位：湖南农业大学物联网工程专业
 * @Date: $ $
 * 开发版本：综合练习v0.1
 */


@RestController
@RequestMapping("/api/asset")
@CrossOrigin
@Api(value = "资产清查表")

public class AssetAssessmentCount {
    @Autowired
    public IAssetAssessmentService assetAssessmentService;

    @CrossOrigin
    @GetMapping("/list")
    @ApiOperation(value="查询资产清查列表")
    public RongApiRes list(AssetAssessment assetAssessment)
    {
        return RongApiService.get_list(assetAssessmentService.selectAssetAssessmentList(assetAssessment));
    }

    @CrossOrigin
    @GetMapping("/cons")
    @ApiOperation(value="建设用地")
    public RongApiRes list()
    {
        return RongApiService.get_list(assetAssessmentService.selectAssetAssessmentBytype());
    }

    @CrossOrigin
    @GetMapping("/ims")
    @ApiOperation(value="ims土地")
    public RongApiRes ims ()
    {
        return RongApiService.get_list(assetAssessmentService.selectAssetAssessmentGtype());
    }

    @CrossOrigin
    @GetMapping("/bus")
    @ApiOperation(value="商服用地")
    public RongApiRes bus()
    {
        return RongApiService.get_list(assetAssessmentService.selectAssetAssessmentButype());
    }


    @CrossOrigin
    @GetMapping("/hom")
    @ApiOperation(value="农村宅基地")
    public RongApiRes hom ()
    {
        return RongApiService.get_list(assetAssessmentService.selectAssetAssessmentHotype());
    }

    @CrossOrigin
    @GetMapping("/pub")
    @ApiOperation(value="公共服务用地 ")
    public RongApiRes pub ()
    {
        return RongApiService.get_list(assetAssessmentService.selectAssetAssessmentPutype());
    }


    @CrossOrigin
    @GetMapping("/tw")
    @ApiOperation(value="交通水利用地 ")
    public RongApiRes tw ()
    {
        return RongApiService.get_list(assetAssessmentService.selectAssetAssessmentTwtype());
    }

    @CrossOrigin
    @GetMapping("/ot")
    @ApiOperation(value="其他建设用地 ")
    public RongApiRes ot ()
    {
        return RongApiService.get_list(assetAssessmentService.selectAssetAssessmentOttype());
    }
    @CrossOrigin
    @GetMapping("/sch")
    @ApiOperation(value="学校建设用地 ")
    public RongApiRes sch ()
    {
        return RongApiService.get_list(assetAssessmentService.selectAssetAssessmentSctype());
    }

    @CrossOrigin
    @GetMapping("/wc")
    @ApiOperation(value="公共卫生建设用地 ")
    public RongApiRes wc ()
    {
        return RongApiService.get_list(assetAssessmentService.selectAssetAssessmentWctype());
    }
}
