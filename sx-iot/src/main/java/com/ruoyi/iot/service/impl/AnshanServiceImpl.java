package com.ruoyi.iot.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.Anshan;
import com.ruoyi.iot.mapper.AnshanMapper;
import com.ruoyi.iot.service.IAnshanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class AnshanServiceImpl implements IAnshanService {
    @Autowired
    public AnshanMapper anshanMapper;

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public Anshan selectAnshanById(Integer id) {
        return anshanMapper.selectAnshanById(id);
    }

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public List<Anshan> selectAnshanList(Anshan anshan) {
        return anshanMapper.selectAnshanList(anshan);
    }

    @Override
    public List<Anshan> selectAnshanListBytime() {
        return anshanMapper.selectAnshanListBytime();
    }
}
