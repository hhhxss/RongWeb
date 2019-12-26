package com.ruoyi.iot.mapper;

import com.ruoyi.iot.domain.Sendmes;

import java.util.List;

/**
 * 发送信息表 数据层
 *
 * @author 薛莎莎
 * @date 2019-12-25
 */
public interface SendmesMapper {
    /**
     * 查询发送信息表
     *
     * @param smid
     * @return 发送信息表
     */
    public Sendmes selectSendmesById(Integer smid);
    /**
     * 查询发送信息表
     *
     * @param sendmes 发送信息表
     * @return 发送信息表集合
     */
    public List<Sendmes> selectSendmesList(Sendmes sendmes);

    public List<Sendmes> selectSendmesByremark();
}
