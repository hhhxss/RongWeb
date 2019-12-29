package com.ruoyi.iot.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.LangLiJieDao;
import com.ruoyi.iot.mapper.LangLiJieDaoMapper;
import com.ruoyi.iot.service.ILangLiJieDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * 环境监测 服务层实现
 *
 * @author:jxr
 * @date :2019-12-26
 */
@Service
public class LangLiJieDaoServiceImpl implements ILangLiJieDaoService
{
    @Autowired
    private LangLiJieDaoMapper langlijiedaoMapper;


    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public LangLiJieDao selsectLangLiJieDaoById(Integer id) {
        return langlijiedaoMapper.selsectLangLiJieDaoById(id);
    }

    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<LangLiJieDao> selectLangLiJieDaoList(LangLiJieDao langlijiedao) {
        return langlijiedaoMapper.selectLangLiJieDaoList(langlijiedao);
    }

    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<LangLiJieDao> selectLangLiJieDaoBytime() {
        return langlijiedaoMapper.selectLangLiJieDaoBytime();
    }
}
