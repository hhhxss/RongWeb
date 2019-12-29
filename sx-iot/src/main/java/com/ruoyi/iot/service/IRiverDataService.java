package com.ruoyi.iot.service;

import com.ruoyi.iot.domain.RiverData;

import java.util.List;

public interface IRiverDataService {
    public RiverData selectRiverDataById(Integer id);
    public List<RiverData> selectRiverDataList(RiverData RiverData);
    public List<RiverData> selectRiverDataByrid();
    public List<RiverData> select();
}
