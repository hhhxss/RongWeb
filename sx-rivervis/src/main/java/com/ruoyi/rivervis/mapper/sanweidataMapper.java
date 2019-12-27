package com.ruoyi.rivervis.mapper;

import com.ruoyi.rivervis.domain.sanweidata;

import java.util.List;

public interface sanweidataMapper {
    public sanweidata selectsanweidataById(Integer id);
    public List<sanweidata> selectsanweidataList(sanweidata sanweidata);
    public List<sanweidata> selectsanweidataListflow();
}
