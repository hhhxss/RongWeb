package com.ruoyi.rivervis.service;

import com.ruoyi.rivervis.domain.sanweidata;

import java.util.List;

public interface IsanweidataService {
    public sanweidata selectsanweidataById(Integer id);
    public List<sanweidata> selectsanweidataList(sanweidata sanweidata);
    public List<sanweidata> selectsanweidataListflow();
    public List<sanweidata> select();
}
