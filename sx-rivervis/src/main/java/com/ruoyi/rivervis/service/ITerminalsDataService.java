package com.ruoyi.rivervis.service;

import com.ruoyi.rivervis.domain.TerminalsData;

import java.util.List;

public interface ITerminalsDataService {
    public TerminalsData selectTerminalsDataById(Integer id);
    public List<TerminalsData> selectTerminalsDataList(TerminalsData TerminalsData);
    public List<TerminalsData> selectTerminalsDataListhum();
}
