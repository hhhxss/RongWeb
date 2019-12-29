package com.ruoyi.rivervis.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.rivervis.domain.warnset;
import com.ruoyi.rivervis.service.IwarnsetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.rivervis.mapper.warnsetMapper;
import java.util.List;
@Service
public class warnsetServiceImpl implements IwarnsetService {
    @Autowired
    private  warnsetMapper warnsetMapper;
    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public warnset selectwarnsetById(Integer wid) {
        return warnsetMapper.selectwarnsetById(wid);
    }

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public List<warnset> selectwarnsetList(warnset warnset) {
        return warnsetMapper.selectwarnsetList(warnset);
    }

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public List<warnset> selectwarnsetListaname() {
        return warnsetMapper.selectwarnsetListaname();
    }
}
