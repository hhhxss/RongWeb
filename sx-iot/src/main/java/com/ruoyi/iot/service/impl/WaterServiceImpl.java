package com.ruoyi.iot.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.Water;
import com.ruoyi.iot.mapper.WaterMapper;
import com.ruoyi.iot.service.IWaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class WaterServiceImpl implements IWaterService {
    @Autowired
    public WaterMapper waterMapper;


    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public Water selectWaterById(Integer id) {
        return waterMapper.selectWaterById(id);
    }

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public List<Water> selectWaterList(Water water) {
        return waterMapper.selectWaterList(water);
    }

    @Override
    public List<Water> selectWaterListByrname() {
        return waterMapper.selectWaterListByrname();
    }
}