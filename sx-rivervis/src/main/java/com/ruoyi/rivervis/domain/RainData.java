package com.ruoyi.rivervis.domain;


import com.ruoyi.common.base.BaseEntity;
/**
 * 开慧镇雨水监测表  RainData
 *
 * @author 彭子涵
 * @date 2019-12-17
 */
public class RainData extends BaseEntity{

    private static final long serialVersionUID = 1L;

    /** 数据编号 */
    private Integer id;
    /** 类型*/
    private String type;
    /** 河流编号 */
    private String rid;
    /** 河流名称 */
    private String rname;
    /** 河流水量数据 */
    private String data;
    /** 时间 */
    private String time;
    /**时间 M */
    private String timeM;
    /** 时间D */
    private String timeD;

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimeM() {
        return timeM;
    }

    public void setTimeM(String timeM) {
        this.timeM = timeM;
    }

    public String getTimeD() {
        return timeD;
    }

    public void setTimeD(String timeD) {
        this.timeD = timeD;
    }

    @Override
    public String toString() {
        return "RainData{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", rid='" + rid + '\'' +
                ", rname='" + rname + '\'' +
                ", data='" + data + '\'' +
                ", time='" + time + '\'' +
                ", timeM='" + timeM + '\'' +
                ", timeD='" + timeD + '\'' +
                '}';
    }
}
