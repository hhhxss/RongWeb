package com.ruoyi.village.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.village.domain.Flandinfo;
import com.ruoyi.village.domain.pubObjApi;
import com.ruoyi.village.mapper.FlandinfoMapper;
import com.ruoyi.village.service.IFlandinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:
 * @description: 林地信息表 服务层实现
 * @author: xss
 * @create: 2019-12-17
 **/
@Service
public class FlandinfoServiceImpl implements IFlandinfoService{
    @Autowired
    public FlandinfoMapper flandinfoMapper;
    /**
     * 查询林地信息
     *
     * @param fid
     * @return 林地信息
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public Flandinfo selectFlandinfoByfId(Integer fid) {
        return flandinfoMapper.selectFlandinfoByfId(fid);
    }

    /**
     * 查询林地信息列表
     *
     * @param flandinfo 林地信息
     * @return 林地信息集合
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Flandinfo> selectFlandinfoList(Flandinfo flandinfo) {
        return flandinfoMapper.selectFlandinfoList(flandinfo);
    }

    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Flandinfo> selectFlandinfoListByfId(pubObjApi flandinfo) {
        return flandinfoMapper.selectFlandinfoListByfId(flandinfo);
    }
}
