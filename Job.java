package com.ruoyi.village.domain;

import com.ruoyi.common.base.BaseEntity;


/**
 * 村镇大学生专业类型统计表
 *
 * @author 彭子涵
 * @date 2019-12-27
 */

public class Job extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 数据编号
     */
    private Integer jid;
    /**
     * 名称
     */
    private String jtype;
    /**
     * 工作类型
     */

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public String getJtype() {
        return jtype;
    }

    public void setJtype(String jtype) {
        this.jtype = jtype;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jid=" + jid +
                ", jtype='" + jtype + '\'' +
                '}';
    }
}
