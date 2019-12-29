package com.ruoyi.village.service;

import com.ruoyi.village.domain.Fdtype;

import java.util.List;

/**
 * @program
 * @description： 反馈投诉表 服务层
 * @author：谢陈亮
 * @date：2019-12-27
 */
public interface IFdtypeService {
    /**
     * 根据反馈类型查询反馈信息
     */
    public List<Fdtype> selectFdtypeFtype();
}
