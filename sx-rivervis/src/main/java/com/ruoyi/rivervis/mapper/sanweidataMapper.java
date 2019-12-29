package com.ruoyi.rivervis.mapper;

import com.ruoyi.rivervis.domain.sanweidata;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface sanweidataMapper {
    public sanweidata selectsanweidataById(Integer id);
    public List<sanweidata> selectsanweidataList(sanweidata sanweidata);
    public List<sanweidata> selectsanweidataListflow();
    public List<sanweidata> select();
}
