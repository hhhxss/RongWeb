package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.DataAnalysis;
import com.ruoyi.iot.service.IDataAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.iot.mapper.DataAnalysisMapper;
import java.util.List;

@Service
public class DataAnalysisImpl implements IDataAnalysisService {
    @Autowired
    private  DataAnalysisMapper DataAnalysisMapper;
    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public DataAnalysis selectDataAnalysisById(Integer id) {
        return DataAnalysisMapper.selectDataAnalysisById(id);
    }

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public List<DataAnalysis> selectDataAnalysisList(DataAnalysis DataAnalysis) {
        return DataAnalysisMapper.selectDataAnalysisList(DataAnalysis);
    }

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public List<DataAnalysis> selectDataAnalysisBytime() {
        return DataAnalysisMapper.selectDataAnalysisBytime();
    }
}
