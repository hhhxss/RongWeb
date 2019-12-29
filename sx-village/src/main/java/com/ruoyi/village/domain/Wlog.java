package com.ruoyi.village.domain;

import com.ruoyi.common.base.BaseEntity;

/**
 * 村务消息已读类型统计
 *
 * @author 贾欣如
 * @date 2019-12-28
 */

public class Wlog extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 数据uid
     */
    private Integer uid;
    /**
     * 消息已读类型
     */
    private String logtype;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getLogtype() {
        return logtype;
    }

    public void setLogtype(String logtype) {
        this.logtype = logtype;
    }

    @Override
    public String toString() {
        return "Wlog{" +
                "uid=" + uid +
                ", logtype='" + logtype + '\'' +
                '}';
    }
}
