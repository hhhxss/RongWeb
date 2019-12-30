package com.ruoyi.iot.domain;

import com.ruoyi.common.base.BaseEntity;

/**
 * 空气质量 环境监测表 env_data
 *
 * @author xcl
 * @date 2019-12-29
 */
public class Envair extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 数据编号 */
    private Integer id;
    /** 雨量数据 */
    private String rain;
    /** 流量数据 */
    private String flow;
    /** 河流水位 */
    private String wlevel;
    /** 河流酸碱度 */
    private String ph;
    /** 空气质量数据 */
    private String pm;
    /** 温度数据 */
    private String temp;
    /** 湿度数据 */
    private String hum;
    /** 区域编号 */
    private String aid;
    /** 数据采集时间 */
    private String time;
    /** 是否有效 */
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow;
    }

    public String getWlevel() {
        return wlevel;
    }

    public void setWlevel(String wlevel) {
        this.wlevel = wlevel;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getHum() {
        return hum;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String getRemark() {
        return remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Envair{" +
                "id=" + id +
                ", rain='" + rain + '\'' +
                ", flow='" + flow + '\'' +
                ", wlevel='" + wlevel + '\'' +
                ", ph='" + ph + '\'' +
                ", pm='" + pm + '\'' +
                ", temp='" + temp + '\'' +
                ", hum='" + hum + '\'' +
                ", aid='" + aid + '\'' +
                ", time='" + time + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
