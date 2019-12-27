package com.ruoyi.iot.service;

import com.ruoyi.iot.domain.Jqrain;

import java.util.List;

/**
 * @program
 * @description： 村镇雨量表 服务层
 * @author：谢陈亮
 * @date：2019-12-25
 */
public interface IJqrainService {

    /**
     * 查询金桥镇雨量信息列表
     *
     * @param jqrain 金桥镇雨量信息
     * @return 金桥镇雨量信息集合
     */
    public List<Jqrain> selectJqrainList(Jqrain jqrain);

    //public List<Jqrain> selectJqrainListById(pubObjApi jqrain);

    public List<Jqrain> selectJqrainBytime();
}
