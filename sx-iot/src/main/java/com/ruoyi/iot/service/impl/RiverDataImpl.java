package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.RiverData;
import com.ruoyi.iot.service.IRiverDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.iot.mapper.RiverDataMapper;
import java.util.List;
@Service
public class RiverDataImpl implements IRiverDataService {
    @Autowired
    private  RiverDataMapper RiverDataMapper;


    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public RiverData selectRiverDataById(Integer id) {
        return RiverDataMapper.selectRiverDataById(id);
    }

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public List<RiverData> selectRiverDataList(RiverData RiverData) {
        return RiverDataMapper.selectRiverDataList(RiverData);
    }

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public List<RiverData> selectRiverDataByrid() {
        return RiverDataMapper.selectRiverDataByrid();
    }

    @Override
    public List<RiverData> select() {
        return RiverDataMapper.select();
    }
}
