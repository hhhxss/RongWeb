package com.ruoyi.iot.mapper;

import com.ruoyi.iot.domain.terminaltel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface terminaltelMapper {
    public List<terminaltel> select();
}
