package com.ruoyi.iot.mapper;

import com.ruoyi.iot.domain.JinQiao;
import  java.util.List;

/**
 * 金桥镇河流水位监测表
 *
 * @author 贾欣如
 * @date 2019-12-26
 */

public interface JinQiaoMapper {

    /**
     * 查询温度信息
     *
     * @param id 村镇ID
     * @return 温度信息
     */
    public JinQiao selsectJinQiaoById(Integer id);

    /**
     * 查询温度信息
     *
     * @param :查询金桥镇温度信息
     * @return 查询温度信息
     */
    public List<JinQiao> selectJinQiaoList(JinQiao jinqiao);
    public List<JinQiao> selectJinQiaoBytime();
}
