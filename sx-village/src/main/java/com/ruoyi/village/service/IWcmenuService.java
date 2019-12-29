package com.ruoyi.village.service;

import com.ruoyi.village.domain.Wcmenu;
import java.util.List;

/**
 * 村务功能类型
 *
 * @author 贾欣如
 * @date 2019-12-29
 */

public interface IWcmenuService {

    /**
     * 村务功能类型
     *
     * @param wmid 类型WID
     * @return 村务功能类型
     */
    public Wcmenu selsectWcmenuByWmid(Integer wmid);

    /**
     * 村务功能类型
     *
     * @param :村务功能类型
     * @return 村务功能类型
     */
    public List<Wcmenu> selectWcmenuList(Wcmenu wcmenu);
    public List<Wcmenu> selectWcmenuBymname();
}
