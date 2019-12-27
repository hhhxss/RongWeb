package com.ruoyi.iot.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.Quantang;
import com.ruoyi.iot.mapper.QuantangMapper;
import com.ruoyi.iot.service.IQuantangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * 环境监测 服务层实现
 *
 * @author:pzh
 * @date :2019-12-20
 */
@Service
public class QuantangServiceImpl implements IQuantangService {

    @Autowired
    public QuantangMapper quantangMapper;

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public Quantang selectQuantangById(Integer id) {
        return quantangMapper.selectQuantangById(id);
    }

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public List<Quantang> selectQuantangList(Quantang quantang) {
        return quantangMapper.selectQuantangList(quantang);
    }

    @Override
    public List<Quantang> selectQuantangListBytime() {
        return quantangMapper.selectQuantangListBytime();
    }


}
