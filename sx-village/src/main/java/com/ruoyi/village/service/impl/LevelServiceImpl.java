package com.ruoyi.village.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.village.domain.Level;
import com.ruoyi.village.mapper.LevelMapper;
import com.ruoyi.village.service.ILevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class LevelServiceImpl implements ILevelService {
    @Autowired
    public LevelMapper levelMapper;


    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public Level selectLevelByRid(Integer rid) {
        return levelMapper.selectLevelByRid(rid);
    }

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public List<Level> selectLevelList(Level level) {
        return levelMapper.selectLevelList(level);
    }

    @Override
    public List<Level> selectLevelListByroletype() {
        return levelMapper.selectLevelListByroletype();
    }
}