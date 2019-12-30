package com.ruoyi.village.domain;

import com.ruoyi.common.base.BaseEntity;

/**
 * 村民上网网页访问类型统计
 *
 * @author 贾欣如
 * @date 2019-12-29
 */
public class Wloglog extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 数据uid
     */
    private Integer uid;
    /**
     * 网页访问类型
     */
    private String logname;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getLogname() {
        return logname;
    }

    public void setLogname(String logname) {
        this.logname = logname;
    }

    @Override
    public String toString() {
        return "Wloglog{" +
                "uid=" + uid +
                ", logname='" + logname + '\'' +
                '}';
    }
}
