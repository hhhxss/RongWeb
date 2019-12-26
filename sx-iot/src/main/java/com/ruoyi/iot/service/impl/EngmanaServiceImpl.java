package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.Engmana;
import com.ruoyi.iot.mapper.EngmanaMapper;
import com.ruoyi.iot.service.IEngmanaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program
 * @description： 能源管理终端采集信息表 服务层实现
 * @author：谢陈亮
 * @date：2019-12-26
 */
@Service
public class EngmanaServiceImpl implements IEngmanaService {
    @Autowired
    public EngmanaMapper engmanaMapper;

    /**
     * 根据id查询能源管理终端信息
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Engmana> selectEngmanaById(){
        return engmanaMapper.selectEngmanaById();
    }
}
