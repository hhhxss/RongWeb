package com.ruoyi.village.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.village.domain.Wcmenu;
import com.ruoyi.village.mapper.WcmenuMapper;
import com.ruoyi.village.service.IWcmenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 村务功能类型
 *
 * @author 贾欣如
 * @date 2019-12-29
 */

@Service
public class WcmenuServiceImpl implements IWcmenuService {

    @Autowired
    private WcmenuMapper wcmenuMapper;

    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public Wcmenu selsectWcmenuByWmid(Integer wmid) {
        return wcmenuMapper.selsectWcmenuByWmid(wmid);
    }

    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<Wcmenu> selectWcmenuList(Wcmenu wcmenu) {
        return wcmenuMapper. selectWcmenuList(wcmenu);
    }

    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<Wcmenu> selectWcmenuBymname() {
        return wcmenuMapper.selectWcmenuBymname();
    }
}
