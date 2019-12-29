package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.terminaltel;
import com.ruoyi.iot.mapper.terminaltelMapper;
import com.ruoyi.iot.service.IterminaltelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TerminaltelImpl implements IterminaltelService {
    @Autowired
    private terminaltelMapper terminaltelMapper;
    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public List<terminaltel> select() {
        return terminaltelMapper.select();
    }
}
