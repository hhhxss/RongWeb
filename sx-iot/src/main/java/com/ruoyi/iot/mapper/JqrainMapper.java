package com.ruoyi.iot.mapper;


import com.ruoyi.iot.domain.Jqrain;

import java.util.List;

/**
 * @program
 * @description： 村镇雨量表 数据层
 * @author： xcl
 * @date： 2019-12-25
 */
public interface JqrainMapper {
    /**
     * 查询村镇雨量信息
     *
     * @param id
     * @return 村镇雨量信息
     */
    //public Jqrain selectJqrainById(String id);
    /**
     * 查询村镇雨量信息列表
     *
     * @param jqrain 村镇雨量信息
     * @return 村镇雨量信息集合
     */
    public List<Jqrain> selectJqrainList(Jqrain jqrain);

    //public List<Jqrain> selectJqrainListById(pubObjApi Jqrain);

    public List<Jqrain> selectJqrainBytime();
}
