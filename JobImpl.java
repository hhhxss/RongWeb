package com.ruoyi.village.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.village.domain.Job;
import com.ruoyi.village.domain.Level;
import com.ruoyi.village.mapper.JobMapper;
import com.ruoyi.village.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class JobImpl implements IJobService {
    @Autowired
    public JobMapper jobMapper;


    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public Job selectJobByJid(Integer jid) {
        return jobMapper.selectJobByJid(jid);
    }

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public List<Job> selectJobList(Job job) {
        return jobMapper.selectJobList(job);
    }

    @Override
    public List<Job> selectJobListByjtype() {
        return jobMapper.selectJobListByjtype();
    }
}