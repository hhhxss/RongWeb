package com.ruoyi.broad.service;

import com.ruoyi.broad.domain.Tertraffic;

import java.util.List;

/**
 * 终端流量使用信息表 terminal_traffic 服务层
 *
 * @author 谢陈亮
 * @date 2019-12-29
 */
public interface ITertrafficService {
    /**
     * 查询空气质量信息
     */
    public List<Tertraffic> selectTertrafficUsetraffic();
}
