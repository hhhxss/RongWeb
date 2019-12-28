package com.ruoyi.rivervis.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.rivervis.domain.RainData;
import com.ruoyi.rivervis.mapper.RainDataMapper;
import com.ruoyi.rivervis.service.IRainDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.village.domain.pubObjApi;


/**
 * 环境监测 服务层实现
 *
 * @author
 * @date 2019-03-05
 */
@Service
public class RainDataServiceImpl implements IRainDataService
{
    @Autowired
    private RainDataMapper rainDataMapper;


    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public RainData selectRainDataById(Integer id) {
        return rainDataMapper.selectRainDataById(id);
    }

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public List<RainData> selectRainDataList(RainData rainData) {
        return rainDataMapper.selectRainDataList(rainData);
    }

    @Override
    public List<RainData> selectRainDataBytime() {
        return rainDataMapper.selectRainDataBytime();
    }


}
