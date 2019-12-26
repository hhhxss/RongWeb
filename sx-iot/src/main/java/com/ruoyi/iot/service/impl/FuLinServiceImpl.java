package com.ruoyi.iot.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.FuLin;
import com.ruoyi.iot.mapper.FuLinMapper;
import com.ruoyi.iot.service.IFuLinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * 环境监测 服务层实现
 *
 * @author:jxr
 * @date :2019-12-25
 */
@Service
public class FuLinServiceImpl implements IFuLinService
{
    @Autowired
    private FuLinMapper fulinMapper;


    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public FuLin selectFuLinById(Integer id) {
        return fulinMapper.selectFuLinById(id);
    }

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public List<FuLin> selectFuLinList(FuLin fulin) {
        return fulinMapper.selectFuLinList(fulin);
    }

    @Override
    public List<FuLin> selectFuLinBytime() {
        return fulinMapper.selectFuLinBytime();
    }


}
