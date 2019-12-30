package com.ruoyi.broad.service.impl;

import com.ruoyi.broad.domain.Tertraffic;
import com.ruoyi.broad.mapper.TertrafficMapper;
import com.ruoyi.broad.service.ITertrafficService;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 终端流量使用信息表 terminal_traffic 服务层实现
 *
 * @author 谢陈亮
 * @date 2019-12-29
 */
@Service
public class TertrafficServiceImpl implements ITertrafficService {
    @Autowired
    public TertrafficMapper tertrafficMapper;

    /**
     * 终端流量使用信息
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Tertraffic> selectTertrafficUsetraffic(){
        return tertrafficMapper.selectTertrafficUsetraffic();
    }
}
