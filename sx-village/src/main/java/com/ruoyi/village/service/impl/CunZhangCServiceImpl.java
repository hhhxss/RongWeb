package com.ruoyi.village.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.village.domain.CunZhangC;
import com.ruoyi.village.mapper.CunZhangCMapper;
import com.ruoyi.village.service.ICunZhangCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 村长竞选票数统计
 *
 * @author 贾欣如
 * @date 2019-12-27
 */

@Service
public class CunZhangCServiceImpl implements ICunZhangCService {

    @Autowired
    private CunZhangCMapper cunzhangcMapper;

    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public CunZhangC selsectCunZhangCById(Integer id) {
        return cunzhangcMapper.selsectCunZhangCById(id);
    }

    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<CunZhangC> selectCunZhangCList(CunZhangC cunzhangc) {
        return cunzhangcMapper. selectCunZhangCList(cunzhangc);
    }

    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<CunZhangC> selectCunZhangCByuname() {
        return cunzhangcMapper.selectCunZhangCByuname();
    }


}
