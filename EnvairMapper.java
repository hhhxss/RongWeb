package com.ruoyi.iot.mapper;

import com.ruoyi.iot.domain.Envair;

import java.util.List;

/**
 * 空气质量 数据层
 *
 * @author 谢陈亮
 * @date 2019-12-29
 */
public interface EnvairMapper {
    /**
     * 查询空气质量信息
     */
    public List<Envair> selectEnvairPm();
}
