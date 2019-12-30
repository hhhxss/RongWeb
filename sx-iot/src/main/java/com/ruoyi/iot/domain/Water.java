package com.ruoyi.iot.domain;

import com.ruoyi.common.base.BaseEntity;


/**
 * 水库水位走势监测表
 *
 * @author 彭子涵
 * @date 2019-12-25
 */

public class Water extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 数据编号
     */
    private Integer id;
    /**
     * 类型
     */
    private String type;
    /**
     * 河流编号
     */
    private String rid;
    /**
     * 河流名称
     */
    private String rname;
    /**
     * 河流水量数据
     */
    private String data;
    /**
     * 时间
     */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Water{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", rid='" + rid + '\'' +
                ", rname='" + rname + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}