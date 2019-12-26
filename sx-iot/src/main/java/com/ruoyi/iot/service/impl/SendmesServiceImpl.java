package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.iot.domain.Sendmes;
import com.ruoyi.iot.mapper.SendmesMapper;
import com.ruoyi.iot.service.ISendmesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SendmesServiceImpl implements ISendmesService{
    @Autowired
    private SendmesMapper sendmesMapper;

    /**
     * 查询发送信息表
     *
     * @param smid
     * @return 发送信息表
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public Sendmes selectSendmesById(Integer smid) {
        return sendmesMapper.selectSendmesById(smid);
    }

    /**
     * 查询发送信息表
     *
     * @param sendmes 发送信息表
     * @return 发送信息表集合
     */
    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<Sendmes> selectSendmesList(Sendmes sendmes) {
        return sendmesMapper.selectSendmesList(sendmes);
    }

    @Override
    @DataSource(value = DataSourceType.SXINFOM)
    public List<Sendmes> selectSendmesByremark() {
        return sendmesMapper.selectSendmesByremark();
    }
}
