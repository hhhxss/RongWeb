package com.ruoyi.iot.domain;

import com.ruoyi.common.base.BaseEntity;

/**
 * 榔梨街道河流水位监测表
 *
 * @author 贾欣如
 * @date 2019-12-27
 */
public class LangLiJieDao extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 数据id
     */
    private Integer id;
    /**
     * 村镇名字
     */
    private String rname;
    /**
     * 河流数据
     */
    private String data;
    /**
     * 时间
     */
    private String time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "LangLiJieDao{" +
                "id=" + id +
                ", rname='" + rname + '\'' +
                ", data='" + data + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}