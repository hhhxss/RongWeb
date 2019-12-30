package com.ruoyi.broad.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.broad.mapper.TerminalsMapper;
import com.ruoyi.broad.domain.Terminals;
import com.ruoyi.broad.service.ITerminalsService;
import com.ruoyi.common.support.Convert;

/**
 * 终端管理员信息 服务层实现
 *
 * @author xss
 * @date 2019-12-29
 */
@Service
public class TerminalsServiceImpl implements ITerminalsService
{
    @Autowired
    private TerminalsMapper terminalsMapper;

    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public Terminals selectTerminalsById(String tid) {
        return terminalsMapper.selectTerminalsById(tid);
    }

    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public List<Terminals> selectTerminalsList(Terminals terminals) {
        return terminalsMapper.selectTerminalsList(terminals);
    }

    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public int updateTerminals(Terminals terminals) {
        return terminalsMapper.updateTerminals(terminals);
    }

    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public int deleteTerminalsById(String tid) {
        return terminalsMapper.deleteTerminalsById(tid);
    }

    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public int deleteTerminalsByIds(String tids) {
        return terminalsMapper.deleteTerminalsByIds(tids);
    }

    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public void insertTerminals(Terminals terminals1) {
        terminalsMapper.insertTerminals(terminals1);
    }
}
