package com.ruoyi.iot.service.impl;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.menus;
import com.ruoyi.iot.mapper.menusMapper;
import com.ruoyi.iot.service.ImenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class menusImpl implements ImenusService {
    @Autowired
    private menusMapper menusMapper;

    @Override
    @DataSource(value = DataSourceType.SLAVE)
    public List<menus> select() {
        return menusMapper.select();
    }
}
