package com.ruoyi.iot.service;

import com.ruoyi.iot.domain.Engmana;

import java.util.List;

/**
 * @program
 * @description： 能源管理终端采集信息表 服务层
 * @author：谢陈亮
 * @date：2019-12-26
 */
public interface IEngmanaService {
    /**
     * 根据id查询能源管理终端信息
     */
    public List<Engmana> selectEngmanaById();
}
