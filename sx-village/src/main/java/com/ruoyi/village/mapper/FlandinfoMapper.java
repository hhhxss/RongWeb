package com.ruoyi.village.mapper;

import com.ruoyi.village.domain.Flandinfo;
import com.ruoyi.village.domain.pubObjApi;

import java.util.List;
/**
 * @program:
 * @description: 林地信息表 数据层
 * @author: xss
 * @create: 2019-12-17
 **/
public interface FlandinfoMapper {
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

    public List<Flandinfo> selectFlandinfoGtype();

}
