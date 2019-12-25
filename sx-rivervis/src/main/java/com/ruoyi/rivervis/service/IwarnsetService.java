package com.ruoyi.rivervis.service;

import com.ruoyi.rivervis.domain.warnset;

import java.util.List;

public interface IwarnsetService {
    public warnset selectwarnsetById(Integer wid);
    public List<warnset> selectwarnsetList(warnset warnset);
    public List<warnset> selectwarnsetListaname();
}
