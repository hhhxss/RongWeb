package com.ruoyi.village.domain;

import com.ruoyi.common.base.BaseEntity;

/**
 * 村务功能类型
 *
 * @author 贾欣如
 * @date 2019-12-29
 */

public class Wcmenu extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /**
     * 数据wmid
     */
    private Integer wmid;
    /**
     * 消息已读类型
     */
    private String mname;

    public Integer getWmid() {
        return wmid;
    }

    public void setWmid(Integer wmid) {
        this.wmid = wmid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    @Override
    public String toString() {
        return "Wcmenu{" +
                "wmid=" + wmid +
                ", mname='" + mname + '\'' +
                '}';
    }
}
