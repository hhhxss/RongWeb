package com.ruoyi.iot.mapper;

import com.ruoyi.iot.domain.FuLin;
import java.util.List;

/**
 * 福桥镇河流水位监测表
 *
 * @author 贾欣如
 * @date 2019-12-25
 */


public interface FuLinMapper {
    /**
     * 查询环境监测信息
     *
     * @param id 环境监测ID
     * @return 环境监测信息
     */
    public FuLin selectFuLinById(Integer id);

    /**
     * 查询环境监测列表
     *
     * @param : FuLin环境监测信息
     * @return 环境监测集合
     */
    public List<FuLin> selectFuLinList(FuLin fulin);

    public List<FuLin> selectFuLinBytime();
}