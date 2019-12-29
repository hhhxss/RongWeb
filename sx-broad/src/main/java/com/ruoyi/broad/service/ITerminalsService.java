package com.ruoyi.broad.service;

import com.ruoyi.broad.domain.Terminals;

import java.util.List;

/**
 * 终端管理员 数据层
 *
 * @author xss
 * @date 2019-12-29
 */
public interface ITerminalsService {
    /**
     * 查询终端管理员信息
     *
     * @param tid 终端ID
     * @return 终端管理员信息
     */
    public Terminals selectTerminalsById(String tid);

    /**
     * 查询终端管理员列表
     *
     * @param terminals 终端管理员信息
     * @return 终端管理员集合
     */
    public List<Terminals> selectTerminalsList(Terminals terminals);

    /**
     * 修改终端管理员
     *
     * @param terminals 广播终端管理员
     * @return 结果
     */
    public int updateTerminals(Terminals terminals);

    /**
     * 删除终端管理员
     *
     * @param tid 终端ID
     * @return 结果
     */
    public int deleteTerminalsById(String tid);

    /**
     * 批量删除终端管理员
     *
     * @param tids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTerminalsByIds(String tids);

    /**
     * 新增广播用户
     *
     *
     * @return 结果
     */
    public void insertTerminals(Terminals terminals1);
}
