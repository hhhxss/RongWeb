package com.ruoyi.iot.mapper;

import com.ruoyi.iot.domain.Engmana;

import java.util.List;

/**
 * @program
 * @description： 能源管理终端采集信息表 数据层
 * @author： xcl
 * @date： 2019-12-26
 */
public interface EngmanaMapper {
    /**
     * 根据id查询能源管理终端信息
     */
    public List<Engmana> selectEngmanaById();
}
