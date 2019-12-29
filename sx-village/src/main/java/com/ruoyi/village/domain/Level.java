package com.ruoyi.village.domain;

import com.ruoyi.common.base.BaseEntity;


/**
 * 村镇角色类型监测表
 *
 * @author 彭子涵
 * @date 2019-12-23
 */

public class Level extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 数据编号
     */
    private Integer rid;
    /**
     * 名称
     */
    private String rname;
    /**
     * 角色类型
     */
    private String roletype;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRoletype() {
        return roletype;
    }

    public void setRoletype(String roletype) {
        this.roletype = roletype;
    }


    @Override
    public String toString() {
        return "Level{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", roletype='" + roletype + '\'' +
                '}';
    }
}