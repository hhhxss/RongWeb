package com.ruoyi.iot.service;

import com.ruoyi.iot.domain.Anshan;

import java.util.List;

public interface IAnshanService {
    /**
     * 查询环境监测信息
     *
     * @param id 环境监测ID
     * @return 环境监测信息
     */
    public Anshan selectAnshanById(Integer id);
    /**
     * 查询环境监测列表
     *
     * @param : Anshan环境监测信息
     * @return 环境监测集合
     */
    public List<Anshan> selectAnshanList(Anshan anshan);
    public List<Anshan> selectAnshanListBytime();
}
