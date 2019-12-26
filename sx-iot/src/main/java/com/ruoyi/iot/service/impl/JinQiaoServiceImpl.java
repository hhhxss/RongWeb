package com.ruoyi.iot.service.impl;
import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.JinQiao;
import com.ruoyi.iot.mapper.JinQiaoMapper;
import com.ruoyi.iot.service.IJinQiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * 环境监测 服务层实现
 *
 * @author:jxr
 * @date :2019-12-26
 */
@Service
public class JinQiaoServiceImpl implements IJinQiaoService
{
    @Autowired
    private JinQiaoMapper jinqiaoMapper;


    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public JinQiao selsectJinQiaoById(Integer id) {
        return jinqiaoMapper.selsectJinQiaoById(id);
    }

    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<JinQiao> selectJinQiaoList(JinQiao jinqiao) {
        return jinqiaoMapper.selectJinQiaoList(jinqiao);
    }

    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<JinQiao> selectJinQiaoBytime() {
        return jinqiaoMapper.selectJinQiaoBytime();
    }
}
