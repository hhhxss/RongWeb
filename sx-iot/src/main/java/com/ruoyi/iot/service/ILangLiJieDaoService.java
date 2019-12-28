package com.ruoyi.iot.service;

import com.ruoyi.iot.domain.LangLiJieDao;
import java.util.List;

/**
 * 榔梨街道河流水位监测表
 *
 * @author 贾欣如
 * @date 2019-12-27
 */

public interface ILangLiJieDaoService {
    /**
     * 查询河流信息
     *
     * @param id 村镇ID
     * @return 河流信息
     */
    public LangLiJieDao selsectLangLiJieDaoById(Integer id);

    /**
     * 查询温度信息
     *
     * @param :查询榔梨街道河流信息
     * @return 查询河流信息
     */
    public List<LangLiJieDao> selectLangLiJieDaoList(LangLiJieDao langlijiedao);
    public List<LangLiJieDao> selectLangLiJieDaoBytime();
}
