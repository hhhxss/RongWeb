package com.ruoyi.rivervis.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.rivervis.domain.TerminalsData;
import com.ruoyi.rivervis.service.ITerminalsDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.rivervis.mapper.TerminalsDataMapper;
import java.util.List;
@Service
public class TerminalsDataServiceImpl implements ITerminalsDataService {
    @Autowired
    private  TerminalsDataMapper TerminalsDataMapper;
    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public TerminalsData selectTerminalsDataById(Integer id) {
        return TerminalsDataMapper.selectTerminalsDataById(id);
    }

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public List<TerminalsData> selectTerminalsDataList(TerminalsData TerminalsData) {
        return TerminalsDataMapper.selectTerminalsDataList(TerminalsData);
    }

    @Override
    @DataSource(value = DataSourceType.SXRIVERVIS)
    public List<TerminalsData> selectTerminalsDataListhum() {
        return TerminalsDataMapper.selectTerminalsDataListhum();
    }
}
