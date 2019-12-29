package com.ruoyi.iot.mapper;

import com.ruoyi.iot.domain.menus;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface menusMapper {

    public List<menus> select();
}
