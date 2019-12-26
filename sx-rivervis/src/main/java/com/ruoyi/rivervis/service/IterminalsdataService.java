package com.ruoyi.rivervis.service;

import com.ruoyi.rivervis.domain.terminalsdata;

import java.util.List;

/**
 * 终端数据信息表 服务层
 *
 * @author 薛莎莎
 * @date 2019-12-24
 */
public interface IterminalsdataService {
    /**
     * 查询终端数据信息
     *
     * @param id
     * @return 终端数据信息
     */
    public terminalsdata selectterminalsdataById(Integer id);
    /**
     * 查询终端数据信息列表
     *
     * @param terminalsdata 终端数据信息
     * @return 终端数据信息集合
     */
    public List<terminalsdata> selectterminalsdataList(terminalsdata terminalsdata);

    public List<terminalsdata> selectterminalsdataByhum();

    public List<terminalsdata> selectterminalsdataBytemp();

    public List<terminalsdata> selectterminalsdataByele();
}
