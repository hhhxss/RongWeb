package com.ruoyi.village.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.village.domain.Fdtype;
import com.ruoyi.village.mapper.FdtypeMapper;
import com.ruoyi.village.service.IFdtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program
 * @description： 反馈投诉表 服务层实现
 * @author：谢陈亮
 * @date：2019-12-27
 */
@Service
public class FdtypeServiceImpl implements IFdtypeService {
    @Autowired
    public FdtypeMapper fdtypeMapper;

    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Fdtype> selectFdtypeFtype(){
        return fdtypeMapper.selectFdtypeFtype();
    }
}
