package com.ruoyi.iot.domain;

import com.ruoyi.common.base.BaseEntity;

/**
 * @program
 * @description：村镇雨量表
 * @author：xcl
 * @date：2019-12-22
 */
public class Vraindata extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /** 数据编号 */
    private String id;
    /** 数据类型 */
    private String type;
    /** 地域编号 */
    private String rid;
    /** 地域名称 */
    private String rname;
    /** 数据大小 */
    private String data;
    /** 采集日期时间 */
    private String time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "raindata{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", rid='" + rid + '\'' +
                ", rname='" + rname + '\'' +
                ", data='" + data + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
