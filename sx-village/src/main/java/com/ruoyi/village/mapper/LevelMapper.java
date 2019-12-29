package com.ruoyi.village.mapper;

import com.ruoyi.village.domain.Level;

import java.util.List;

/**
 * 村镇角色类型监测表
 *
 * @author 彭子涵
 * @date 2019-12-22
 */
public interface LevelMapper{
    /**
     * 查询环境监测信息
     *
     * @param :rid 环境监测ID
     * @return 环境监测信息
     */
    public Level selectLevelByRid(Integer rid);

    /**
     * 查询环境监测列表
     *
     * @param : 村镇角色类型监测信息
     * @return 环境监测集合
     */
    public List<Level> selectLevelList(Level level);

    public List<Level> selectLevelListByroletype();
}
