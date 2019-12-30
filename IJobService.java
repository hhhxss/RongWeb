package com.ruoyi.village.service;

import com.ruoyi.village.domain.Job;

import java.util.List;

/**
 * 村镇大学生专业类型监测表
 *
 * @author 彭子涵
 * @date 2019-12-27
 */
public interface IJobService{
    /**
     * 查询环境监测信息
     *
     * @param :jid 环境监测ID
     * @return 环境监测信息
     */
    public Job selectJobByJid(Integer jid);

    /**
     * 查询环境监测列表
     *
     * @param : 村镇角色类型监测信息
     * @return 环境监测集合
     */
    public List<Job> selectJobList(Job job);

    public List<Job> selectJobListByjtype();
}

