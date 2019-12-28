package com.ruoyi.village.mapper;

import com.ruoyi.village.domain.Fdtype;

import java.util.List;

/**
 * @program
 * @description： 反馈投诉表 数据层
 * @author： xcl
 * @date： 2019-12-27
 */
public interface FdtypeMapper {
    /**
     * 根据反馈类型查询反馈信息
     */
    public List<Fdtype> selectFdtypeFtype();
}
