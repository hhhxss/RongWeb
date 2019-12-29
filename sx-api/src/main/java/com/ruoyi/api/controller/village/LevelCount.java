package com.ruoyi.api.controller.village;


import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.village.domain.Level;
import com.ruoyi.village.service.ILevelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/level")
@CrossOrigin
@Api(value = "村镇角色类型统计 - 统计计数类接口")
public class LevelCount {

    @Autowired
    private ILevelService levelService;

    @CrossOrigin
    @GetMapping("/list")
    @ApiOperation(value = "查询村镇角色类型列表")
    public RongApiRes list(Level level)
    {
        return RongApiService.get_list(levelService.selectLevelList(level));
    }

    @CrossOrigin
    @GetMapping("/roletype")
    @ApiOperation(value = "查询村镇角色类型列表")
    public RongApiRes list()
    {
        return RongApiService.get_list(levelService.selectLevelListByroletype());
    }
}