package com.ruoyi.iot.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.Lukou;
import com.ruoyi.iot.mapper.LukouMapper;
import com.ruoyi.iot.service.ILukouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LukouServiceImpl implements ILukouService {
    @Autowired
    public LukouMapper lukouMapper;

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public Lukou selectLukouById(Integer id) {
        return lukouMapper.selectLukouById(id);
    }

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public List<Lukou> selectLukouList(Lukou lukou) {
        return lukouMapper.selectLukouList(lukou);
    }

    @Override
    public List<Lukou> selectLukouListBytime() {
        return lukouMapper.selectLukouListBytime();
    }
}
