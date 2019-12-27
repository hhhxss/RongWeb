package com.ruoyi.rivervis.mapper;

import com.ruoyi.rivervis.domain.RainData;
import com.ruoyi.village.domain.pubObjApi;

import java.util.List;
/**
 * 开慧村雨水检测数据层
 *
 * @author 彭子涵
 * @date 2019-12-17
 */
public interface RainDataMapper
{
    /**
     * 查询环境监测信息
     *
     * @param id 环境监测ID
     * @return 环境监测信息
     */
    public RainData selectRainDataById(Integer id);

    /**
     * 查询环境监测列表
     *
     * @param rainData 环境监测信息
     * @return 环境监测集合
     */
    public List<RainData> selectRainDataList(RainData rainData);

    public List<RainData> selectRainDataBytime();


}