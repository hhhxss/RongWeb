package com.ruoyi.village.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.village.domain.Wloglog;
import com.ruoyi.village.mapper.WloglogMapper;
import com.ruoyi.village.service.IWloglogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 村民上网网页访问类型统计
 *
 * @author 贾欣如
 * @date 2019-12-29
 */

@Service
public class WloglogServiceImpl implements IWloglogService{

    @Autowired
    private WloglogMapper wloglogMapper;

    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public Wloglog selsectWloglogByUid(Integer uid) {
        return wloglogMapper.selsectWloglogByUid(uid);
    }

    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<Wloglog> selectWloglogList(Wloglog wloglog) {
        return wloglogMapper. selectWloglogList(wloglog);
    }

    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<Wloglog> selectWloglogBylogname() {
        return wloglogMapper.selectWloglogBylogname();
    }

}
