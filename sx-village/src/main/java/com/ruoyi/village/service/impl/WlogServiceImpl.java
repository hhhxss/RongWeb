package com.ruoyi.village.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.village.domain.Wlog;
import com.ruoyi.village.mapper.WlogMapper;
import com.ruoyi.village.service.IWlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 村务消息已读类型统计
 *
 * @author 贾欣如
 * @date 2019-12-28
 */

@Service
public class WlogServiceImpl implements IWlogService {

    @Autowired
    private WlogMapper wlogMapper;

    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public Wlog selsectWlogByUid(Integer uid) {
        return wlogMapper.selsectWlogByUid(uid);
    }

    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<Wlog> selectWlogList(Wlog wlog) {
        return wlogMapper. selectWlogList(wlog);
    }

    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<Wlog> selectWlogBylogtype() {
        return wlogMapper.selectWlogBylogtype();
    }


}
