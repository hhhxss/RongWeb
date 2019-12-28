package com.ruoyi.village.service;

import com.ruoyi.village.domain.Wlog;
import java.util.List;

/**
 * 村务消息已读类型统计
 *
 * @author 贾欣如
 * @date 2019-12-28
 */
public interface IWlogService {
    /**
     * 查询已读消息类型
     *
     * @param uid 类型UID
     * @return 已读消息类型
     */
    public Wlog selsectWlogByUid(Integer uid);

    /**
     * 查询已读消息类型
     *
     * @param :查询已读消息类型
     * @return 查询已读消息类型
     */
    public List<Wlog> selectWlogList(Wlog wlog);
    public List<Wlog> selectWlogBylogtype();
}
