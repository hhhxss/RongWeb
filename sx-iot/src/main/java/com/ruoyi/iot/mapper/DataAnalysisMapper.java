package com.ruoyi.iot.mapper;

import com.ruoyi.iot.domain.DataAnalysis;

import java.util.List;

public interface DataAnalysisMapper {
    public DataAnalysis selectDataAnalysisById(Integer id);
    public List<DataAnalysis> selectDataAnalysisList(DataAnalysis DataAnalysis);
    public List<DataAnalysis> selectDataAnalysisBytime();
}
