package com.ruoyi.rivervis.mapper;

import com.ruoyi.rivervis.domain.warnset;


import java.util.List;

public interface warnsetMapper {
    public warnset selectwarnsetById(Integer wid);
    public List<warnset> selectwarnsetList(warnset warnset);
    public List<warnset> selectwarnsetListaname();


}
