package com.ruoyi.village.service;

import com.ruoyi.village.domain.Flandinfo;
import com.ruoyi.village.domain.pubObjApi;

import java.util.List;

/**
 * @program:
 * @description: 林地信息表 服务层
 * @author: xss
 * @create: 2019-12-17
 **/
public interface IFlandinfoService {
    /**
     * 查询林地信息
     *
     * @param fid
     * @return 林地信息
     */
    public Flandinfo selectFlandinfoByfId(Integer fid);
    /**
     * 查询林地信息列表
     *
     * @param flandinfo 林地信息
     * @return 林地信息集合
     */
    public List<Flandinfo> selectFlandinfoList(Flandinfo flandinfo);


    public List<Flandinfo> selectFlandinfoListByfId(pubObjApi flandinfo);
}
