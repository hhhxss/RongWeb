package com.ruoyi.village.mapper;

import com.ruoyi.village.domain.Wloglog;
import java.util.List;

/**
 * 村民上网网页访问类型统计
 *
 * @author 贾欣如
 * @date 2019-12-29
 */

public interface WloglogMapper {

    /**
     * 村民上网网页访问类型统计
     *
     * @param uid 类型UID
     * @return 村民上网网页访问类型统计
     */
    public Wloglog selsectWloglogByUid(Integer uid);

    /**
     * 村民上网网页访问类型统计
     *
     * @param :网页访问类型统计
     * @return 网页访问类型统计
     */
    public List<Wloglog> selectWloglogList(Wloglog wloglog);
    public List<Wloglog> selectWloglogBylogname();
}
