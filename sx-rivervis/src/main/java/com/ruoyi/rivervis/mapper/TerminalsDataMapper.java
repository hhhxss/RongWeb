package com.ruoyi.rivervis.mapper;

import com.ruoyi.rivervis.domain.TerminalsData;

import java.util.List;

public interface TerminalsDataMapper {
    public TerminalsData selectTerminalsDataById(Integer id);
    public List<TerminalsData> selectTerminalsDataList(TerminalsData TerminalsData);
    public List<TerminalsData> selectTerminalsDataListhum();
}
