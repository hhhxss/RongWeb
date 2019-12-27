package com.ruoyi.iot.mapper;

import com.ruoyi.iot.domain.Quantang;

import java.util.List;
/**
 * 泉塘街道河流水位监测表
 *
 * @author 彭子涵
 * @date 2019-12-17
 */

public interface QuantangMapper {
    /**
     * 查询环境监测信息
     *
     * @param id 环境监测ID
     * @return 环境监测信息
     */
    public Quantang selectQuantangById(Integer id);

    /**
     * 查询环境监测列表
     *
     * @param : Quantan环境监测信息
     * @return 环境监测集合
     */
    public List<Quantang> selectQuantangList(Quantang quantang);

    public List<Quantang> selectQuantangListBytime();
}




