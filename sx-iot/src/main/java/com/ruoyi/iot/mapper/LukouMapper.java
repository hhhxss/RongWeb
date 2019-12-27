package com.ruoyi.iot.mapper;

import com.ruoyi.iot.domain.Lukou;

import java.util.List;

/**
 * 路口镇温度走势监测表
 *
 * @author 彭子涵
 * @date 2019-12-22
 */

public interface LukouMapper {
    /**
     * 查询环境监测信息
     *
     * @param id 环境监测ID
     * @return 环境监测信息
     */
    public Lukou selectLukouById(Integer id);

    /**
     * 查询环境监测列表
     *
     * @param : Lukou环境监测信息
     * @return 环境监测集合
     */
    public List<Lukou> selectLukouList(Lukou lukou);

    public List<Lukou> selectLukouListBytime();
}
