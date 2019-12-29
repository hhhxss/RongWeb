package com.ruoyi.rivervis.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.rivervis.domain.logss;
import com.ruoyi.rivervis.mapper.logssMapper;
import com.ruoyi.rivervis.service.IlogssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LogssServiceImpl implements IlogssService {
    @Autowired
    private logssMapper logssMapper;

    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public List<logss> select() {
        return logssMapper.select();
    }
}
