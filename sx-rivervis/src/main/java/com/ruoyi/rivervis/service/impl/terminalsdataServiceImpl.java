package com.ruoyi.rivervis.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.rivervis.domain.terminalsdata;
import com.ruoyi.rivervis.mapper.terminalsdataMapper;
import com.ruoyi.rivervis.service.IterminalsdataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 终端数据信息 服务层实现
 *
 * @author 薛莎莎
 * @date 2019-12-24
 */
@Service
public class terminalsdataServiceImpl implements IterminalsdataService{

    @Autowired
    public terminalsdataMapper terminalsdataMapper;
    /**
     * 查询终端数据信息
     *
     * @param id
     * @return 终端数据信息
     */
    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public terminalsdata selectterminalsdataById(Integer id) {
        return terminalsdataMapper.selectterminalsdataById(id);
    }

    /**
     * 查询终端数据信息列表
     *
     * @param terminalsdata 终端数据信息
     * @return 终端数据信息集合
     */
    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public List<terminalsdata> selectterminalsdataList(terminalsdata terminalsdata) {
        return terminalsdataMapper.selectterminalsdataList(terminalsdata);
    }

    @Override
    public List<terminalsdata> selectterminalsdataByhum() {
        return terminalsdataMapper.selectterminalsdataByhum();
    }

    @Override
    public List<terminalsdata> selectterminalsdataBytemp() {
        return terminalsdataMapper.selectterminalsdataBytemp();
    }
}
