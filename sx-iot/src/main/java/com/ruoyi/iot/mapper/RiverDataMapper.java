package com.ruoyi.iot.mapper;

import com.ruoyi.iot.domain.RiverData;

import java.util.List;

public interface RiverDataMapper {
    public RiverData selectRiverDataById(Integer id);
    public List<RiverData> selectRiverDataList(RiverData RiverData);
    public List<RiverData> selectRiverDataByrid();
}
