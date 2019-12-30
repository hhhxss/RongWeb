package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.Envair;
import com.ruoyi.iot.mapper.EnvairMapper;
import com.ruoyi.iot.service.IEnvairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 空气质量 服务层实现
 *
 * @author 谢陈亮
 * @date 2019-12-29
 */
@Service
public class EnvairServiceImpl implements IEnvairService{
    @Autowired
    public EnvairMapper envairMapper;

    /**
     * 根据id查询能源管理终端信息
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Envair> selectEnvairPm(){
        return envairMapper.selectEnvairPm();
    }
}
