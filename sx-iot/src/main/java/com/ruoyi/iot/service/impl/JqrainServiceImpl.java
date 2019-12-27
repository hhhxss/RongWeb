package com.ruoyi.iot.service.impl;


import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.Jqrain;
import com.ruoyi.iot.mapper.JqrainMapper;
import com.ruoyi.iot.service.IJqrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program
 * @description： 村镇雨量表 服务层实现
 * @author：谢陈亮
 * @date：2019-12-25
 */
@Service
public class JqrainServiceImpl implements IJqrainService {
    @Autowired
    public JqrainMapper jqrainMapper;

    /**
     * 查询村镇雨量信息列表
     *
     * @param jqrain 村镇雨量信息
     * @return 村镇雨量信息集合
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Jqrain> selectJqrainList(Jqrain jqrain){
        return jqrainMapper.selectJqrainList(jqrain);
    }

    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Jqrain> selectJqrainBytime(){
        return jqrainMapper.selectJqrainBytime();
    }

}
