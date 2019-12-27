package com.ruoyi.rivervis.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.rivervis.domain.sanweidata;
import com.ruoyi.rivervis.service.IsanweidataService;
import org.springframework.beans.factory.annotation.Autowired;
import com.ruoyi.rivervis.mapper.sanweidataMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class sanweidataServiceImpl implements IsanweidataService {
    @Autowired
    private  sanweidataMapper sanweidataMapper;
    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public sanweidata selectsanweidataById(Integer id) {
        return sanweidataMapper.selectsanweidataById(id);
    }

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public List<sanweidata> selectsanweidataList(sanweidata sanweidata) {
        return sanweidataMapper.selectsanweidataList(sanweidata);
    }

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public List<sanweidata> selectsanweidataListflow() {
        return sanweidataMapper.selectsanweidataListflow();
    }
}
