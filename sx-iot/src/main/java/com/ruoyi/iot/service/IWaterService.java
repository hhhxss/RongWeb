package com.ruoyi.iot.service;

import com.ruoyi.iot.domain.Water;

import java.util.List;

public interface IWaterService {
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
     * @param : Water环境监测信息
     * @return 环境监测集合
     */
    public List<Water> selectWaterList(Water water);
    public List<Water> selectWaterListByrname();
}