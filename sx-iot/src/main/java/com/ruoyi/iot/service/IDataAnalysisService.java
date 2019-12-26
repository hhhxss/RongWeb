package com.ruoyi.iot.service;

import com.ruoyi.iot.domain.DataAnalysis;

import java.util.List;

public interface IDataAnalysisService {
    public DataAnalysis selectDataAnalysisById(Integer id);
    public List<DataAnalysis> selectDataAnalysisList(DataAnalysis DataAnalysis);
    public List<DataAnalysis> selectDataAnalysisBytime();
}
