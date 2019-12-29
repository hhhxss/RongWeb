package com.ruoyi.iot.mapper;


import com.ruoyi.iot.domain.Water;

import java.util.List;

/**
 * 水库水位走势监测表
 *
 * @author 彭子涵
 * @date 2019-12-22
 */

public interface WaterMapper {
    /**
     * 查询环境监测信息
     *
     * @param id 环境监测ID
     * @return 环境监测信息
     */
    public Water selectWaterById(Integer id);

    /**
     * 查询环境监测列表
     *
     * @param : Lukou环境监测信息
     * @return 环境监测集合
     */
    public List<Water> selectWaterList(Water water);

    public List<Water> selectWaterListByrname();
}

