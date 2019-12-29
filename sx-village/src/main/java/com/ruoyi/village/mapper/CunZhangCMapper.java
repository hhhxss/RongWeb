package com.ruoyi.village.mapper;

import com.ruoyi.village.domain.CunZhangC;
import java.util.List;

/**
 * 村长竞选票数统计
 *
 * @author 贾欣如
 * @date 2019-12-27
 */

public interface CunZhangCMapper {

    /**
     * 查询竞选人信息
     *
     * @param id 竞选人ID
     * @return 竞选人信息
     */
    public CunZhangC selsectCunZhangCById(Integer id);
    /**
     * 查询竞选人信息
     *
     * @param :查询竞选人信息
     * @return 查询竞选信息
     */
    public List<CunZhangC> selectCunZhangCList(CunZhangC cunzhangc);
    public List<CunZhangC> selectCunZhangCByuname();
}


