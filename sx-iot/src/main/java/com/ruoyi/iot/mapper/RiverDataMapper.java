package com.ruoyi.iot.mapper;

import com.ruoyi.iot.domain.RiverData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RiverDataMapper {
    public RiverData selectRiverDataById(Integer id);
    public List<RiverData> selectRiverDataList(RiverData RiverData);
    public List<RiverData> selectRiverDataByrid();
    public List<RiverData> select();
}
