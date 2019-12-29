package com.ruoyi.rivervis.mapper;

import com.ruoyi.rivervis.domain.logss;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface logssMapper {
    public List<logss> select();
}
