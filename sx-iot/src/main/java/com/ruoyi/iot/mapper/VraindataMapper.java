package com.ruoyi.iot.mapper;

import com.ruoyi.iot.domain.Vraindata;
import com.ruoyi.village.domain.pubObjApi;

import java.util.List;

/**
 * @program
 * @description： 村镇雨量表 数据层
 * @author： xcl
 * @date： 2019-12-22
 */
public interface VraindataMapper {
    /**
     * 查询村镇雨量信息
     *
     * @param id
     * @return 村镇雨量信息
     */
    //public Vraindata selectVraindataById(String id);
    /**
     * 查询村镇雨量信息列表
     *
     * @param vraindata 村镇雨量信息
     * @return 村镇雨量信息集合
     */
    public List<Vraindata> selectVraindataList(Vraindata vraindata);

    //public List<Vraindata> selectVraindataListById(pubObjApi vraindata);

    public List<Vraindata> selectVraindataByrname();

}
